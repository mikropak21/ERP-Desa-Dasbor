package com.example.win10.nyobaaa.Db;

import com.example.win10.nyobaaa.DaoSession;
import com.example.win10.nyobaaa.GreenDaoApp.DaoApp;
import com.example.win10.nyobaaa.Padi;
import com.example.win10.nyobaaa.PadiDao;

import java.util.List;

public class Repository {

    PadiDao padiDao;
    List<Padi> list;

    public Repository(){
        DaoSession daoSession =  DaoApp.getInstance().getDaoSession();
        padiDao=daoSession.getPadiDao();
    }



    public List<Padi> getAllData() {
        list=padiDao.loadAll();

        return list;
    }

    public void updateData( Padi padi) {
        padiDao.update(padi);
    }


    public void deleteData( long id)
    {
        padiDao.deleteByKey(id);
    }


    public void addData( Padi padi)
    {
        padiDao.insert(padi);
    }

}