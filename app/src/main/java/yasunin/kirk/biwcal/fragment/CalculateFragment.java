package yasunin.kirk.biwcal.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import yasunin.kirk.biwcal.MainActivity;
import yasunin.kirk.biwcal.R;

/**
 * Created by fany on 2/13/2018.
 */

public class CalculateFragment extends Fragment {


    private String displayString = "";

    private String tag = "23JanV1";
    private  boolean addABoolean = false, minusAboolean = false;



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar

        createToolbar();


    } // Main Method


    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.Toolbar);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar()
                .setTitle("Calculate USD To THB");

        ((MainActivity) getActivity()).getSupportActionBar()
                .setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar()
                .setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).getSupportFragmentManager().popBackStack();
            }
        });


    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_biwcal, container, false);
        return view;
    }



}  //Main class

