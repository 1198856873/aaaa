package com.example.lenovo.h1705a_qizhongtest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lenovo.h1705a_qizhongtest.R;
import com.example.lenovo.h1705a_qizhongtest.bean.TwoBean;

import java.util.List;

/**
 * Created by lenovo on 2017/12/29.
 */
public class TwoAdapter extends RecyclerView.Adapter<TwoAdapter.ViewHolder> implements View.OnClickListener{
    private List<TwoBean.ResultBean.DataBean> mList;
    private Context context;

    public TwoAdapter(List<TwoBean.ResultBean.DataBean> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.three, parent, false);
        ViewHolder holder=new ViewHolder(inflate);
        inflate.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mText.setText(mList.get(position).getContent()+"");
        Glide.with(context).load(mList.get(position).getUrl()).into(holder.mImage);
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mText;
        private ImageView mImage;
        public ViewHolder(View itemView) {
            super(itemView);
            mText= (TextView) itemView.findViewById(R.id.three_text);
            mImage= (ImageView) itemView.findViewById(R.id.three_image);
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
