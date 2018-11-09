package thailand.soumbundit.jirawat.funnyquestion.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import thailand.soumbundit.jirawat.funnyquestion.R;
import thailand.soumbundit.jirawat.funnyquestion.utility.MyConstantUnit4;

public class Unit4Fragment extends Fragment {

    private MyConstantUnit4 myConstantUnit4 = new MyConstantUnit4();

    public static Unit4Fragment unit4Instance(String uidString) {
        Unit4Fragment unit4Fragment = new Unit4Fragment();
        Bundle bundle = new Bundle();
        bundle.putString("Uid", uidString);
        unit4Fragment.setArguments(bundle);
        return unit4Fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Choice1spinner();
        Choice2spinner();
        Choice3spinner();
        Choice4spinner();
        Choice5spinner();
        Choice6spinner();
        Choice7spinner();
        Choice8spinner();
        Choice9spinner();
        Choice10spinner();
        Choice11spinner();
        Choice12spinner();
        Choice13spinner();
        Choice14spinner();
        Choice15spinner();

    }//Main Method


    public void Choice1spinner() {
        Spinner spinner = getView().findViewById(R.id.choice1spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice2spinner() {
        Spinner spinner = getView().findViewById(R.id.choice2spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice3spinner() {
        Spinner spinner = getView().findViewById(R.id.choice3spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice4spinner() {
        Spinner spinner = getView().findViewById(R.id.choice4spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice5spinner() {
        Spinner spinner = getView().findViewById(R.id.choice5spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice6spinner() {
        Spinner spinner = getView().findViewById(R.id.choice6spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice7spinner() {
        Spinner spinner = getView().findViewById(R.id.choice7spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice8spinner() {
        Spinner spinner = getView().findViewById(R.id.choice8spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice9spinner() {
        Spinner spinner = getView().findViewById(R.id.choice9spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice10spinner() {
        Spinner spinner = getView().findViewById(R.id.choice10spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice11spinner() {
        Spinner spinner = getView().findViewById(R.id.choice11spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice12spinner() {
        Spinner spinner = getView().findViewById(R.id.choice12spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice13spinner() {
        Spinner spinner = getView().findViewById(R.id.choice13spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice14spinner() {
        Spinner spinner = getView().findViewById(R.id.choice14spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void Choice15spinner() {
        Spinner spinner = getView().findViewById(R.id.choice15spinner);
        String[] strings = myConstantUnit4.getChoiceSpinnerItemStrings();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, strings);
        spinner.setAdapter(stringArrayAdapter);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_unit4, container, false);
        return view;
    }
}
