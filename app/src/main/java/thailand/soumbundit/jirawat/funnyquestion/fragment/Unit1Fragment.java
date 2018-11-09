package thailand.soumbundit.jirawat.funnyquestion.fragment;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.zip.Inflater;

import thailand.soumbundit.jirawat.funnyquestion.R;
import thailand.soumbundit.jirawat.funnyquestion.ServiceActivity;
import thailand.soumbundit.jirawat.funnyquestion.utility.MyConstant;

public class Unit1Fragment extends Fragment {
    //    Explicit
    private MyConstant myConstant = new MyConstant();
    private MediaPlayer mediaPlayer1;

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
//        First Spinner
        firstSpinner();

        secondSpinner();

        thirdSpinner();
//        Answer Controller
        answer4Controller();


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






    } //Main Method

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
        mediaPlayer1 = MediaPlayer.create(Unit1Fragment.this.getActivity(),R.raw.unit1);

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
    }

    private void item2Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem2);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void item3Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem3);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void item4Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem4);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void item5Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem5);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void item6Spinner() {
        Spinner spinner = getView().findViewById(R.id.spinnerItem6);
        String[] strings = myConstant.getChioceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
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
    }

    private void secondSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner2);
        String[] strings = myConstant.getChioceSpinner2Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    private void thirdSpinner() {
        Spinner spinner = getView().findViewById(R.id.spinner3);
        String[] strings = myConstant.getChioceSpinner3Strings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_unit1, container, false);
        return view;
    }
}
