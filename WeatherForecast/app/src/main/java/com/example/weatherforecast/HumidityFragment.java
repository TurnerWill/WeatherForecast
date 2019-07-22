package com.example.weatherforecast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class HumidityFragment extends Fragment {

    TextView tv;
    String humidity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View inf = inflater.inflate(R.layout.fragment_humidity, container, false);
       tv = (TextView)inf.findViewById(R.id.fragment_humidity);
        return inf;
    }

    public void setHumidity(String humidity){
        this.humidity = humidity;
        tv.setText(humidity);
    }
}
