package com.example.user.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017/4/26.
 */

public class NbaRecordAdaptor extends BaseAdapter{

    ArrayList<Picture> arrayList;
    Context context;
    public NbaRecordAdaptor(Context context, ArrayList<Picture> items) {
        arrayList = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View itemlayout, ViewGroup parent) {
        itemlayout=LayoutInflater.from(context).inflate(R.layout.listitem,parent,false);
        Picture item = (Picture)getItem(position);

        ImageView iv1 = (ImageView)itemlayout.findViewById(R.id.iv1);
        iv1.setImageResource(item.imgid1);
        TextView name1 = (TextView)itemlayout.findViewById(R.id.tv1);
        name1.setText(item.name1);
        TextView num1 = (TextView)itemlayout.findViewById(R.id.tv2);
        num1.setText(item.num1);

        ImageView iv2 = (ImageView)itemlayout.findViewById(R.id.iv2);
        iv2.setImageResource(item.imgid2);
        TextView name2 = (TextView)itemlayout.findViewById(R.id.tv3);
        name2.setText(item.name2);
        TextView num2 = (TextView)itemlayout.findViewById(R.id.tv4);
        num2.setText(item.num2);

        if (item.num1>item.num2){
            num1.setTextColor(Color.parseColor("#ffcc0000"));
        }else{
            num2.setTextColor(Color.parseColor("#ffcc0000"));
        }

        return itemlayout;
    }
}
