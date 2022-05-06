package com.example.ttcm.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ttcm.R;
import com.example.ttcm.activity.Mon;

import java.util.ArrayList;


public class ChiTietDanhMucAdapter extends BaseAdapter {

    //1. ngữ cảnh của ứng dụng
    Activity activity;
    //2. nguồn dữ liệu
    ArrayList<Mon> data;
    //3. bộ phân tích layout
    LayoutInflater inflater;

    public ChiTietDanhMucAdapter(Activity activity, ArrayList<Mon> data) {
        this.activity = activity;
        this.data = data;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null){
            //Phân tích layout
            v = inflater.inflate(R.layout.item_chi_tiet_danh_muc, null);
            //tham chiếu tới từng view để hiển thị dữ liệu
            ImageView hinhmon_danhmuc = v.findViewById(R.id.hinhmon_danhmuc);
            TextView tenmon_danhmuc = v.findViewById(R.id.tenmon_danhmuc);
            TextView gia_danhmuc = v.findViewById(R.id.gia_danhmuc);
            TextView mota_danhmuc = v.findViewById(R.id.mota_danhmuc);

            hinhmon_danhmuc.setImageResource(data.get(position).getHinhmon());
            tenmon_danhmuc.setText(data.get(position).getTenmon());
            gia_danhmuc.setText(String.valueOf(data.get(position).getGia()));
            mota_danhmuc.setText(data.get(position).getMota());
        }
        return v;
    }
}
