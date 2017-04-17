package com.lisn.test1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public class fragment3 extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        Log.e("------", "onCreateView: fragment3" );
        return textView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("------", "onCreate: fragment3" );
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("------", "onResume: fragment3" );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("------", "onDestroy: fragment3" );
    }
}
