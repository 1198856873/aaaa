package com.example.lenovo.h1705a_qizhongtest;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.lenovo.h1705a_qizhongtest.adapter.TwoAdapter;
import com.example.lenovo.h1705a_qizhongtest.app.App;
import com.example.lenovo.h1705a_qizhongtest.base.BaseActivity;
import com.example.lenovo.h1705a_qizhongtest.bean.SQL;
import com.example.lenovo.h1705a_qizhongtest.bean.TwoBean;
import com.example.lenovo.h1705a_qizhongtest.net.NetContract;
import com.example.lenovo.h1705a_qizhongtest.net.NetModel;
import com.example.lenovo.h1705a_qizhongtest.net.NetPresenter;
import com.example.lenovo.h1705a_qizhongtest.utils.MySqlitUnit;
import com.google.gson.Gson;

import java.util.List;

public class Main2Activity extends BaseActivity<NetPresenter,NetModel> implements NetContract.View {
    private String url="http://172.16.35.42:8080/xiaoshixun/second_page.json";
    private RecyclerView recycler;
    private TwoAdapter twoAdapter;
    private SQLDao sqlDao;
    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        App.context=this;
        sqlDao= MySqlitUnit.getInfo().getUsenDao();
        recycler= (RecyclerView) findViewById(R.id.recycler);
        LinearLayoutManager llm=new LinearLayoutManager(Main2Activity.this);
        recycler.setLayoutManager(llm);

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    public void Show(String ss) {
        Gson gson=new Gson();
        TwoBean twoBean = gson.fromJson(ss, TwoBean.class);
        final List<TwoBean.ResultBean.DataBean> data = twoBean.getResult().getData();
        twoAdapter=new TwoAdapter(data,Main2Activity.this);
        recycler.setAdapter(twoAdapter);
        twoAdapter.setListener(new TwoAdapter.onClick() {
            @Override
            public void setItem(View v, int possiton) {
                TwoBean.ResultBean.DataBean dataBean = data.get(possiton);
                String content = dataBean.getContent();
                SQL sql=new SQL();
                sql.setString(content);
                sqlDao.insert(sql);
            }
        });
    }
}
