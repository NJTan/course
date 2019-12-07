package com.example.mycourse;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.fragment.app.Fragment;

/**
 * Created by ZJTL9050 on 2019/10/14.
 */

public class setContentFragment extends Fragment {
    private View view;
    private TextView text1,text2;
    public void onAttach(Activity activity){
        super.onAttach(activity);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.course_layout,container,false);
        if(view!=null){
            init();
        }
        setText(((MainActivity)getActivity()).getSettingText()[0]);
        return view;
    }
    private void init(){
        text1 = (TextView)view.findViewById(R.id.show_title);
        text2 = (TextView)view.findViewById(R.id.show_content);
    }
    public void setText(String[] text){
        text1.setText(text[0]);
        text2.setText(text[1]);
    }
}
