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

public class fragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        TextView textView=new TextView(getContext());
        textView.setText("fragment1");
        Log.e("------", "onCreateView: fragment1" );
        return textView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("------", "onCreate: fragment1" );
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("------", "onResume: fragment1" );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("------", "onDestroy: fragment1" );
    }
    /*    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_query, null);
        initView(view);
        if (savedInstanceState != null) {
            oilType = savedInstanceState.getString("oilType");
            isOffMode = savedInstanceState.getBoolean("isOffMode");
            vehicleName = savedInstanceState.getString("vehicleName");
            vehicle_sn = savedInstanceState.getString("vehicle_sn");
            queryMsg = savedInstanceState.getString("queryMsg");
            imageUrl = savedInstanceState.getString("imageUrl");
            switchFragment(queryMsg);
            setCameraBackground(imageUrl);
        }
        return view;
    }*/
}
