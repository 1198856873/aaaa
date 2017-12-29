package com.example.lenovo.h1705a_qizhongtest.app;

import android.app.Application;
import android.content.Context;

import com.example.lenovo.h1705a_qizhongtest.base.BaseActivity;
import com.example.lenovo.h1705a_qizhongtest.base.BaseFragment;




public class App extends Application {
    public static BaseActivity mActivity;
    public static BaseFragment mLastFragment;
    public static Context context;
}
