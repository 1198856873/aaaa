package com.example.lenovo.h1705a_qizhongtest.net;


import com.example.lenovo.h1705a_qizhongtest.app.App;

import java.io.IOException;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



public class NetModel implements NetContract.Model {
    public static NetModel netModel;
    private OkHttpClient okHttpClient;

    public static NetModel getInstance() {
        if (netModel == null) {
            synchronized (NetModel.class) {
                netModel = new NetModel();
            }
        }
        return netModel;
    }

    public NetModel() {
        okHttpClient = new OkHttpClient();
    }

    @Override
    public void getDataFromNet(String url, final CallBacks callBacks) {
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {

            }

            @Override
            public void onResponse(okhttp3.Call call, Response response) throws IOException {
                final String ss = response.body().string();

                App.mActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callBacks.succ(ss);
                    }
                });
            }
        });

    }
}