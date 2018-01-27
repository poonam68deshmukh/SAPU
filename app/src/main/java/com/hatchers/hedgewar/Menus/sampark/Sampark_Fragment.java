package com.hatchers.hedgewar.Menus.sampark;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import com.hatchers.hedgewar.R;


public class Sampark_Fragment extends Fragment {

    private Toolbar samparkToolbar;

    public Sampark_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_sampark, container, false);

        initializations(view);
        initToolbar(view);
        onclicklisteners();


        return view;
    }

    private void initToolbar(View view)
    {
        samparkToolbar = (Toolbar)view.findViewById(R.id.sampark_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(samparkToolbar);
    }

    private void initializations(View view)
    {

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = getActivity().getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.all_status_color));
        }



    }

    private void  onclicklisteners()
    {

        samparkToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });


    }
}
