package com.herovitamin.ciclodevida;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewFragment extends Fragment {

    public static final String TAG = NewFragment.class.getSimpleName();

    public NewFragment() {
        // Required empty public constructor
    }

    public static NewFragment newInstance() {
        
        Bundle args = new Bundle();
        
        NewFragment fragment = new NewFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "Estoy en el metodo onAttach()");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Estoy en el metodo onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "Estoy en el metodo onCreateView()");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "Estoy en el metodo onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "Estoy en el metodo onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "Estoy en el metodo onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "Estoy en el metodo onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "Estoy en el metodo onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "Estoy en el metodo onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Estoy en el metodo onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "Estoy en el metodo onDetach()");
    }
}
