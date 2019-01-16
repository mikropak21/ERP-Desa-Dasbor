package com.example.win10.nyobaaa.Db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.win10.nyobaaa.DaoMaster;
import com.example.win10.nyobaaa.PadiDao;

public class DataBaseOpenHelper extends DaoMaster.DevOpenHelper {

    public DataBaseOpenHelper(Context context,String name)
    {
        super(context,name);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion)
        {
            case   1    :
            case   2    :
        }
    }
}
