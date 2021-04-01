package com.example.sdk;

public interface GyroDataCallback {

    void onConnected(String name);

    void onConnecting();

    void onDisconnect();

    void onData( BluetoothData bluetoothData);

    void onSelectedButton(int iCurrentGroup);
}
