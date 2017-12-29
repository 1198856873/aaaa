package com.example.lenovo.h1705a_qizhongtest;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.lenovo.h1705a_qizhongtest.adapter.RecyclerAdapter;
import com.example.lenovo.h1705a_qizhongtest.base.BaseActivity;
import com.example.lenovo.h1705a_qizhongtest.bean.MyBean;
import com.example.lenovo.h1705a_qizhongtest.net.NetContract;
import com.example.lenovo.h1705a_qizhongtest.net.NetModel;
import com.example.lenovo.h1705a_qizhongtest.net.NetPresenter;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<NetPresenter,NetModel> implements NetContract.View {
    private RecyclerView mRecycler;
    private String url="http://172.16.35.42:8080/xiaoshixun/first_page.json";
    private RecyclerAdapter mAdapter;
    private  List<MyBean.ResultBean.DataBean> data = new ArrayList<>();
    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mPresenter.getDataFromModel(url);
        mRecycler= (RecyclerView) findViewById(R.id.Recycler);
        LinearLayoutManager llm=new LinearLayoutManager(MainActivity.this);
        mRecycler.setLayoutManager(llm);
        mAdapter=new RecyclerAdapter(data,MainActivity.this);
        mRecycler.setAdapter(mAdapter);

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void Show(String ss) {
        Gson gson=new Gson();
        data = gson.fromJson(ss, MyBean.class).getResult().getData();
        Log.e("aaaaaaaaaa",data.toString());

        mAdapter.notifyDataSetChanged();
    }
}
