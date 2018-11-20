package thailand.soumbundit.jirawat.funnyquestion.fragment;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.zip.Inflater;

import thailand.soumbundit.jirawat.funnyquestion.R;
import thailand.soumbundit.jirawat.funnyquestion.ServiceActivity;
import thailand.soumbundit.jirawat.funnyquestion.utility.MyConstant;

public class Unit1Fragment extends Fragment {
    //    Explicit
    private MyConstant myConstant = new MyConstant();
    private MediaPlayer mediaPlayer1;


    private String uidString, nameUnitString, timeTestString, warmUpString,
            presentString = "non", practiceString;

    private String tag = "11Nov1";
    private String tag2 = "11Nov2";
    private int[] scoreWarmUpInts = new int[]{0, 0, 0};
    private int[] scorePractice3Ints = new int[]{0,0,0,0,0,0};


    public static Unit1Fragment unit1Instance(String uidString) {
        Unit1Fragment unit1Fragment = new Unit1Fragment();
        Bundle bundle = new Bundle();
        bundle.putString("Uid", uidString);
        unit1Fragment.setArguments(bundle);
        return unit1Fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //Find UID, Name Unit of user
        findUidNameUnit();


//        First Spinner
        //About worm up
        firstSpinner();

        secondSpinner();

        thirdSpinner();
//        Answer Controller
        answer4Controller();

//practice3

        item1Spinner();
        item2Spinner();
        item3Spinner();
        item4Spinner();
        item5Spinner();
        item6Spinner();

//      Practice :listening
        playMedia1();

        Listening1spinner();
        Listening2spinner();
        Listening3spinner();
        Listening4spinner();
        Listening5spinner();
        Listening6spinner();
        Listening7spinner();
        Listening8spinner();


        Languagework1spinner();
        //  Languagework2spinner();
        //  Languagework3spinner();
        //  Languagework4spinner();
        //  Languagework5spinner();
        //  Languagework6spinner();
        //  Languagework7spinner();
        //  Languagework8spinner();
        //  Languagework9spinner();

        Reading1spinner();
        Reading2spinner();
        Reading3spinner();
        Reading4spinner();
        Reading5spinner();


//        Check Floating
        checkFloating();


    } //Main Method

    private void checkFloating() {
        FloatingActionButton floatingActionButton = getView().findViewById(R.id.floatingCheck123);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(tag, "You Click Floating");
                myAlertDialog();


            }
        });
    }

    private void myAlertDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setTitle("Warning");
        builder.setMessage("Need to Exit");
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                processCheckScore();
            }
        });
        builder.show();


    }

    private void processCheckScore() {

        findTimeTest();
        calculateWarmUp();
        calculatePractice1();
        calculatePractice2();
        calculatePractice3();

    }

    private void calculatePractice3() {

        int scorePractice3 = 0;
        for (int i = 0; i<scorePractice3Ints.length; i += 1) {
            scorePractice3 = scorePractice3 + scorePractice3Ints[i];

        }
        Log.d(tag2, "scorePractice3 ==> " + scorePractice3);
    }

    private void calculatePractice2() {
        final int trueInt = R.id.radC; //choice C is True
        final int[] ints = {0};

        RadioGroup radioGroup = getView().findViewById(R.id.ragCpuStand);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if (i == trueInt) {
                    ints[0] = 1;

                }

            }
        });
        int scorePractice2 = ints[0];



    }

    private void calculatePractice1() {

        int scorePractic1Int = 0;
        String[] trueAnswerString = myConstant.getPratice1TrueStrings();

        EditText practice1EditText = getView().findViewById(R.id.edtPratice1);
        EditText practice2EditText = getView().findViewById(R.id.edtPratice2);
        EditText practice3EditText = getView().findViewById(R.id.edtPratice3);
        EditText practice4EditText = getView().findViewById(R.id.edtPratice4);
        EditText practice5EditText = getView().findViewById(R.id.edtPratice5);

        String[] strings = new String[5];
        strings[0] = practice1EditText.getText().toString().trim();
        strings[1] = practice2EditText.getText().toString().trim();
        strings[2] = practice3EditText.getText().toString().trim();
        strings[3] = practice4EditText.getText().toString().trim();
        strings[4] = practice5EditText.getText().toString().trim();

        for (int i=0; i<strings.length; i += 1){
            for (int i1=0; i1< trueAnswerString.length; i1 += 1) {
                if (strings[i].equals(trueAnswerString[i1])) {
                    scorePractic1Int += 1;

                }

            }//for2
        }

        Log.d(tag2, "scorePracetice1 ==> " + scorePractic1Int);
    } // calculate practice

    private void calculateWarmUp() {
        int sumScoreInt = 0;

        for (int i = 0; i < scoreWarmUpInts.length; i += 1) {
            sumScoreInt = sumScoreInt + scoreWarmUpInts[i];


        }
        warmUpString = Integer.toString(sumScoreInt);
        Log.d(tag, "WarnUpString ==> " + warmUpString);

    }

    private void findTimeTest() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        timeTestString = dateFormat.format(calendar.getTime());
        Log.d(tag, "timeTestString ==>" + timeTestString);
    }

    private void findUidNameUnit() {
        uidString = getArguments().getString("Uid");
        Log.d(tag, "uidString ==> " + uidString);

        String[] strings = myConstant.getUnitTitleStrings();
        nameUnitString = strings[0];
        Log.d(tag, "nameUnitString ==>" + nameUnitString);
    }

    private void Reading1spinner() {
        Spinner spinner = getView().findViewById(R.id.readingspinner1);
        String[] strings = myConstant.getChioceSpinner7Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Reading2spinner() {
        Spinner spinner = getView().findViewById(R.id.readingspinner2);
        String[] strings = myConstant.getChioceSpinner7Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Reading3spinner() {
        Spinner spinner = getView().findViewById(R.id.readingspinner3);
        String[] strings = myConstant.getChioceSpinner7Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Reading4spinner() {
        Spinner spinner = getView().findViewById(R.id.readingspinner4);
        String[] strings = myConstant.getChioceSpinner7Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Reading5spinner() {
        Spinner spinner = getView().findViewById(R.id.readingspinner5);
        String[] strings = myConstant.getChioceSpinner7Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework1spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework1spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework2spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework2spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework3spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework3spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework4spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework4spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework5spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework5spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework6spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework6spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework7spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework7spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework8spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework8spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Languagework9spinner() {
        Spinner spinner = getView().findViewById(R.id.languagework9spinner);
        String[] strings = myConstant.getChioceSpinner6Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }


    private void Listening1spinner() {
        Spinner spinner = getView().findViewById(R.id.listening1spinner);
        String[] strings = myConstant.getChioceSpinner5Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Listening2spinner() {
        Spinner spinner = getView().findViewById(R.id.listening2spinner);
        String[] strings = myConstant.getChioceSpinner5Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Listening3spinner() {
        Spinner spinner = getView().findViewById(R.id.listening3spinner);
        String[] strings = myConstant.getChioceSpinner5Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Listening4spinner() {
        Spinner spinner = getView().findViewById(R.id.listening4spinner);
        String[] strings = myConstant.getChioceSpinner5Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Listening5spinner() {
        Spinner spinner = getView().findViewById(R.id.listening5spinner);
        String[] strings = myConstant.getChioceSpinner5Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Listening6spinner() {
        Spinner spinner = getView().findViewById(R.id.listening6spinner);
        String[] strings = myConstant.getChioceSpinner5Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Listening7spinner() {
        Spinner spinner = getView().findViewById(R.id.listening7spinner);
        String[] strings = myConstant.getChioceSpinner5Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void Listening8spinner() {
        Spinner spinner = getView().findViewById(R.id.listening8spinner);
        String[] strings = myConstant.getChioceSpinner5Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }


    private void playMedia1() {
        mediaPlayer1 = MediaPlayer.create(Unit1Fragment.this.getActivity(), R.raw.unit1);

        final Button button1 = getView().findViewById(R.id.playMedia1);///*****
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer1.isPlaying()) {
                    mediaPlayer1.pause();
                    button1.setText("Resume");
                } else {
                    mediaPlayer1.start();
                    button1.setText("Pause");
                }
            }
        });
    }//Play Media Clip1


    private void item1Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem1);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScorePractice3(0, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void checkScorePractice3(int indexSpinner, int position) {
        int[] answerTrueInts = myConstant.getPractice3Ints();

        if (position == answerTrueInts[indexSpinner]) {
            scorePractice3Ints[indexSpinner] = 1;
        } else {
            scorePractice3Ints[indexSpinner] = 0;
        }
    }

    private void item2Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem2);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScorePractice3(1, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void item3Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem3);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScorePractice3(2, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void item4Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem4);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScorePractice3(3, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void item5Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem5);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScorePractice3(4, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void item6Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem6);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScorePractice3(5, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    private void answer4Controller() {
        EditText editText = getView().findViewById(R.id.edtAnswer);

    }

    private void firstSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner1);
        String[] strings = myConstant.getChioceSpinner1Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScore(0, position, myConstant.getAnswer1TrueInts());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void checkScore(int indexSpinner, int position, int[] answerTrueInts) {

        for (int i1 = 0; i1 < answerTrueInts.length; i1 += 1) {

            if (position == answerTrueInts[i1]) {
                scoreWarmUpInts[indexSpinner] = 1;
                break;
            } else {
                scoreWarmUpInts[indexSpinner] = 0;
            }

        }  //for

    } //checkscore

    private void secondSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner2);
        String[] strings = myConstant.getChioceSpinner2Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScore(1, position, myConstant.getAnswer2TrueInts());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void thirdSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner3);
        String[] strings = myConstant.getChioceSpinner3Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScorePractice3(0, position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                checkScore(2, position, myConstant.getAnswer3TrueInts());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_unit1, container, false);
        return view;
    }
}
