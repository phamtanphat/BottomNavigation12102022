package com.example.bottomnavigation12102022;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SettingFragment extends Fragment {

    EditText edt;
    Button btnSendText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        edt = view.findViewById(R.id.edit_text_setting);
        btnSendText = view.findViewById(R.id.button_send_text);
        return view;
    }
}
