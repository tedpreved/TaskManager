package com.taskmanager.app.enter;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.taskmanager.app.R;

/**
 * Created by Monstr on 17.06.2014.
 */
public class FragmentLogin  extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_login,null);
                Holder holder=new Holder();
                holder.editLogin=(EditText)view.findViewById(R.id.editText1);
                holder.editPass=(EditText)view.findViewById(R.id.editText2);
                holder.btnEnter=(Button)view.findViewById(R.id.button);

        return view;
    }

    private static class Holder{
        public EditText editLogin;
        public EditText editPass;
        public Button   btnEnter;
    }



}
