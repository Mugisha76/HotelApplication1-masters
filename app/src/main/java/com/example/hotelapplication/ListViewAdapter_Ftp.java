package com.example.hotelapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListViewAdapter_Ftp extends BaseAdapter {
    Context context;
    String[] item;
    int[] image;
    LayoutInflater inflater;

    public ListViewAdapter_Ftp(Context context, int[] image, String[] item){
        this.context = context;
        this.image = image;
        this.item = item;
    }

    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView txtemp;
        ImageView imgflag;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.listviewlayout_ftp,parent,false);

        txtemp = itemView.findViewById(R.id.text);
        imgflag = itemView.findViewById(R.id.image);
        txtemp.setText(item[position]);
        imgflag.setImageResource(image[position]);

        return itemView;
    }
}
