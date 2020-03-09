package com.example.master_slave_micro;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MasterRemoteControlFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MasterRemoteControlFragment extends Fragment {


    public MasterRemoteControlFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment RemoteControlFragment.
     */
    public static MasterRemoteControlFragment newInstance() {
        MasterRemoteControlFragment fragment = new MasterRemoteControlFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_master_remote_control, container, false);
    }
}
