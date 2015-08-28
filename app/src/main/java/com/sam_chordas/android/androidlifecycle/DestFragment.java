package com.sam_chordas.android.androidlifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sam_chordas on 8/27/15.
 */
public class DestFragment extends Fragment {
    public static final String LOG_TAG = DestFragment.class.getSimpleName();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(LOG_TAG, "DestFragment onCreate");
    }

    public DestFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Log.i(LOG_TAG, "DestFragment onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_dest, container, false);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(LOG_TAG, "DestFragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(LOG_TAG, "DestFragment onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(LOG_TAG, "DestFragment onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(LOG_TAG, "DestFragment onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(LOG_TAG, "DestFragment onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(LOG_TAG, "DestFragment onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(LOG_TAG, "DestFragment onDetach");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(LOG_TAG, "DestFragment onAttach");
    }
}
