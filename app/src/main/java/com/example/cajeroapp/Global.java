package com.example.cajeroapp;

import android.app.Application;

public class Global extends Application {
    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    private Integer saldo = 1000;
}
