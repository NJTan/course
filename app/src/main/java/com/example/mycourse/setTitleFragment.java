package com.example.mycourse;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * Created by ZJTL9050 on 2019/10/14.
 */

public class setTitleFragment extends Fragment {
    private View view;
    private String[] title;
    private String[][] contents;
    private ListView listView;
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState){
        view=inflater.inflate(R.layout.day_layout,container,false);
        MainActivity activity=(MainActivity)getActivity();
        title=activity.getTilte();
        contents=activity.getSettingText();
        if (view!=null) init();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 setContentFragment content = (setContentFragment)((MainActivity)getActivity()).getSupportFragmentManager().findFragmentById(R.id.setcourse);
                content.setText(contents[i]);
            }
        });
        return view;
    }
    private void init(){
        listView=(ListView)view.findViewById(R.id.daylist);
        if (title!=null) listView.setAdapter(new MyAdapter());
    }
    class MyAdapter extends BaseAdapter {
        public int getCount(){
            return title.length;
        }
        public Object getItem(int i){
            return title[i];
        }
        public long getItemId(int i){
            return i;
        }
        public View getView(int i,View view,ViewGroup viewGroup){
            view=View.inflate(getActivity(),R.layout.day_item_layout,null);
            TextView titletext=(TextView)view.findViewById(R.id.days);
            titletext.setText(title[i]);
            return view;
        }
    }
}

