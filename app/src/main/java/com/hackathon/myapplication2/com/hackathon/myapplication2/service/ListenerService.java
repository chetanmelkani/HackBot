package com.hackathon.myapplication2.com.hackathon.myapplication2.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import com.hackathon.myapplication2.db.DBHelper;

/**
 * Created by SwatiSh on 4/8/2015.
 */
public class ListenerService extends Service
{
    private DBHelper dbHelper;
    @Override
    public void onCreate()
    {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Let it continue running until it is stopped.
        //dbHelper = new DBHelper(intent.)
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return true;
    }

     @Override
    public void onRebind(Intent intent) {

    }
}
