package com.example.weatherforecast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class TemperatureFragment extends Fragment {
    TextView tv;
    String temperature;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_temperature, container, false);
        tv = (TextView)inf.findViewById(R.id.fragment_temperature);
        return inf;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        tv.setText(temperature);
    }
}
