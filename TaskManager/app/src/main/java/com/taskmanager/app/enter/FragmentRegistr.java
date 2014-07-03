package com.taskmanager.app.enter;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.taskmanager.app.R;

/**
 * Created by Monstr on 17.06.2014.
 */
public class FragmentRegistr extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_registr,null);

        return view;
    }
}
