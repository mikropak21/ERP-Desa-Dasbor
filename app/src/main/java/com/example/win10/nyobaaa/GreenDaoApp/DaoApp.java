package com.example.win10.nyobaaa.GreenDaoApp;

import android.app.Application;
import android.content.Context;

import com.example.win10.nyobaaa.DaoMaster;
import com.example.win10.nyobaaa.DaoSession;
import com.example.win10.nyobaaa.Db.DataBaseOpenHelper;

public class DaoApp extends Application {

    DaoSession daosesion;

    private static DaoApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
      daosesion   =   new DaoMaster(new DataBaseOpenHelper(this,"greendaodb.db").getWritableDb()).newSession();
    }

    public DaoSession getDaoSesion()
    {
        return daosesion;
    }

    public static synchronized DaoApp getInstance() {
        return mInstance;
    }

    public DaoSession getDaoSession() {
        return daosesion;
    }
}
