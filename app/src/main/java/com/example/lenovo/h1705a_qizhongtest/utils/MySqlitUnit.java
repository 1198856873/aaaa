package com.example.lenovo.h1705a_qizhongtest.utils;


import com.example.lenovo.h1705a_qizhongtest.DaoMaster;
import com.example.lenovo.h1705a_qizhongtest.DaoSession;
import com.example.lenovo.h1705a_qizhongtest.SQLDao;
import com.example.lenovo.h1705a_qizhongtest.app.App;


/**
 * Created by lvxinxin on 2017/10/25.
 */

public class MySqlitUnit {

    private static MySqlitUnit mySqlitUnit = new MySqlitUnit();
    private DaoSession daoSession;

    public MySqlitUnit() {
        DaoMaster.DevOpenHelper openHelper = new DaoMaster.DevOpenHelper(App.context, "data.db");
        DaoMaster daoMaster = new DaoMaster(openHelper.getWritableDatabase());
        daoSession = daoMaster.newSession();
    }

    public static MySqlitUnit getInfo() {
        return mySqlitUnit;
    }

    public SQLDao getUsenDao() {
        return daoSession.getSQLDao();
    }
}
