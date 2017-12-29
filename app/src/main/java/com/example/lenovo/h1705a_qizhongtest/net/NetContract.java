package com.example.lenovo.h1705a_qizhongtest.net;


import com.example.lenovo.h1705a_qizhongtest.base.BaseModel;
import com.example.lenovo.h1705a_qizhongtest.base.BasePresenter;
import com.example.lenovo.h1705a_qizhongtest.base.BaseView;


public class NetContract  {

    public interface View extends BaseView {
      void Show(String ss);


    }

    interface Model extends BaseModel {
        void getDataFromNet(String url, CallBacks callBacks);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        @Override
        public void onStart() {

        }
        public abstract void getDataFromModel(String url);
    }
}