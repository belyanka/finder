package com.birb.finder.TabFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.birb.finder.BodyDataChangeListener;
import com.birb.finder.R;

public class BodyFragment extends Fragment{

    private BodyDataChangeListener activityListener;
    private String[] cats = { "Не знаю","Васька", "Мурзик", "Барсик", "Рыжик" };

    public void setContext(BodyDataChangeListener listener){
        this.activityListener = listener;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.body_fragment, container, false);
        Spinner spinner = (Spinner) view.findViewById(R.id.spinnerBodyType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_item, cats);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {

                activityListener.setBodyType(pos);
            }
        });
        return view;
    }
}
