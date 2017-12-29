package com.example.lenovo.h1705a_qizhongtest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.lenovo.h1705a_qizhongtest.R;
import com.example.lenovo.h1705a_qizhongtest.bean.MyBean;

import java.util.List;

/**
 * Created by lenovo on 2017/12/29.
 *
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener{
    private List<MyBean.ResultBean.DataBean> mList;
    private Context context;
    public static final int ONE_ITEM = 1;
    public static final int TWO_ITEM = 2;
    public RecyclerAdapter(List<MyBean.ResultBean.DataBean> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflat = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder holder;
        if (ONE_ITEM == viewType) {
            View inflate = inflat.inflate(R.layout.one, parent, false);
            holder = new ViewHolderOne(inflate);
            inflate.setOnClickListener(this);
        } else {
            View inflate = inflat.inflate(R.layout.two, parent, false);
            holder = new ViewHolderTwo(inflate);
            inflate.setOnClickListener(this);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        MyBean.ResultBean.DataBean dataBean = mList.get(position);
        String url1 = dataBean.getUrl1();
        Log.e("qqqqqqqqqqqqqqqqqqqqqq",url1);

        if(holder instanceof ViewHolderOne){
                Glide.with(context).load(mList.get(position).getUrl1()).into(((ViewHolderOne) holder).one_image);
                holder.itemView.setTag(position);
            }else if(holder instanceof ViewHolderTwo){
                Glide.with(context).load(mList.get(position).getUrl1()).into(((ViewHolderTwo) holder).two_image);
                Glide.with(context).load(mList.get(position).getUrl2()).into(((ViewHolderTwo) holder).two_image2);
                holder.itemView.setTag(position);
            }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(position<5){
            return ONE_ITEM;
        }else{
            return TWO_ITEM;
        }
    }
    class ViewHolderOne extends RecyclerView.ViewHolder {
        private ImageView one_image;
        public ViewHolderOne(View itemView) {
            super(itemView);
            one_image= (ImageView) itemView.findViewById(R.id.one_image);
        }
    }
    class ViewHolderTwo extends RecyclerView.ViewHolder {
        private ImageView two_image,two_image2;
        public ViewHolderTwo(View itemView) {
            super(itemView);
            two_image= (ImageView) itemView.findViewById(R.id.two_image);
            two_image2= (ImageView) itemView.findViewById(R.id.two_image2);
        }
    }
    public interface onClick{
        void setItem(View v, int possiton);

    }
    private onClick item =null;

    @Override
    public void onClick(View view) {
        if(item!=null){
            item.setItem(view,(int)view.getTag());

        }
    }
    public void setListener(onClick item){
        this.item=item;
    }
}
