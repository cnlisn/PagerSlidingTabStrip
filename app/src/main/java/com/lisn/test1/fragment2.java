package com.lisn.test1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 2016/11/7.
 */

public class fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        TextView textView=new TextView(getContext());
        textView.setText("fragment2");
        Log.e("------", "onCreateView: fragment2" );
        return textView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("------", "onCreate: fragment2" );
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("------", "onResume: fragment2" );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("------", "onDestroy: fragment2" );
    }
}
