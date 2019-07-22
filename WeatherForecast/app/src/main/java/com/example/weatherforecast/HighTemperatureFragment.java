package com.example.weatherforecast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HighTemperatureFragment extends Fragment {

    TextView tv;
    String highTemperature;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_high_temperature, container, false);
        tv = (TextView)inf.findViewById(R.id.fragment_high_temperature);
        return inf;
    }

    public void setHighTemperature(String highTemperature) {
        this.highTemperature = highTemperature;
        tv.setText(highTemperature);
    }

}
