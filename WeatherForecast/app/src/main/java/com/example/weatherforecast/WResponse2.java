package com.example.weatherforecast;

import java.util.ArrayList;

public class WResponse2 {

    private String cod;
    private float message;
    private float cnt;
    ArrayList<Object> list = new ArrayList<Object>();


    // Getter Methods

    public String getCod() {
        return cod;
    }

    public float getMessage() {
        return message;
    }

    public float getCnt() {
        return cnt;
    }

    public ArrayList<Object> getList() {
        return list;
    }
    // Setter Methods

    public void setCod( String cod ) {
        this.cod = cod;
    }

    public void setMessage( float message ) {
        this.message = message;
    }

    public void setCnt( float cnt ) {
        this.cnt = cnt;
    }

}

