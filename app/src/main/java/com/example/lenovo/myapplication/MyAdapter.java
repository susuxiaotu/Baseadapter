package com.example.lenovo.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2019/5/7.
 */

public class MyAdapter extends BaseAdapter {
    List<Map<String,Object>> datalist;
    Context context;
    public MyAdapter(List<Map<String,Object>> datalist,Context context){
        this.datalist=datalist;
        this.context=context;
    }
    @Override
    public int getCount() {
        return datalist.size() ;
    }

    @Override
    public Object getItem(int position) {
        return datalist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
            holder.image = (ImageView) convertView.findViewById(R.id.images);
            holder.price = (TextView) convertView.findViewById(R.id.tv_price);
            holder.content=(TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(holder);
        }else {
            holder=(Holder) convertView.getTag();
        }

        holder.price.setText((String) datalist.get(position).get("price"));
        holder.content.setText((String) datalist.get(position).get("content"));
        holder.image.setImageResource((int) datalist.get(position).get("image"));
        return convertView;
    }
    private class Holder{
        ImageView image;
        TextView price;
        TextView content;
    }
}
