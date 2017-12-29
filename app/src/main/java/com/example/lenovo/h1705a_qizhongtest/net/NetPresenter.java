package com.example.lenovo.h1705a_qizhongtest.net;


public class NetPresenter extends NetContract.Presenter{

    @Override
    public void getDataFromModel(String url) {
        baseModel.getDataFromNet(url, new CallBacks() {
            @Override
            public void succ(String result) {
                baseView.Show(result);
            }
        });
    }
}