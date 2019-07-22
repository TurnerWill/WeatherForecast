package com.example.weatherforecast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

class CityNameFragment extends Fragment {
    TextView tv;
    String city;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment_city_name, container, false);
        tv = (TextView)inf.findViewById(R.id.fragment_city_name);
        return inf;
    }

    public void setCity(String city) {
        this.city = city;
        tv.setText(city);
    }
}
