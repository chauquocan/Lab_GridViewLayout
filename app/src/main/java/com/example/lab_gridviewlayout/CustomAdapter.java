package com.example.lab_gridviewlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<ElectricThing> arrayList;

    public CustomAdapter(Context context, int layout, ArrayList<ElectricThing> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null) {
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.tvName = convertView.findViewById(R.id.tvName);
            viewHolder.tvReducePer = convertView.findViewById(R.id.tvReducePer);
            viewHolder.tvPeopleRate = convertView.findViewById(R.id.tvPeopleRate);
            viewHolder.tvNewPrice = convertView.findViewById(R.id.tvNewPrice);
            viewHolder.imgProduct = convertView.findViewById(R.id.imgProduct);
            viewHolder.rateBar = convertView.findViewById(R.id.rateBar);

            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvName.setText(arrayList.get(i).getName());
        viewHolder.tvNewPrice.setText(String.valueOf(arrayList.get(i).getNewPrice()));
        viewHolder.tvPeopleRate.setText(String.valueOf(arrayList.get(i).getPeopleRate()));
        viewHolder.tvReducePer.setText(String.valueOf(arrayList.get(i).getReducePercent()));
        viewHolder.imgProduct.setImageResource(arrayList.get(i).getImage());
        viewHolder.rateBar.setRating(arrayList.get(i).getRate());

        return convertView;
    }
    private class ViewHolder{
        TextView tvName;
        TextView tvNewPrice;
        TextView tvPeopleRate;
        TextView tvReducePer;
        ImageView imgProduct;
        RatingBar rateBar;
    }
}
