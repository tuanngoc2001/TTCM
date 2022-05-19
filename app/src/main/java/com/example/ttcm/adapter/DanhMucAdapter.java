package com.example.ttcm.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ttcm.activity.DanhMucActivity;
import com.example.ttcm.activity.DanhMuc;
import com.example.ttcm.R;
import com.example.ttcm.model.Category;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DanhMucAdapter extends BaseAdapter {
    //1. ngữ cảnh của ứng dụng
    Activity activity;
    //2. nguồn dữ liệu
    ArrayList<Category> data;
    //3. bộ phân tích layout
    LayoutInflater inflater;

    public DanhMucAdapter(Activity activity, ArrayList<Category> data) {
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
        View v =convertView;
        if(v==null){
            //Phân tích layout
            v = inflater.inflate(R.layout.item_grid_danh_muc, null);
            //tham chiếu tới từng view để hiển thị dữ liệu
            ImageView imgHinh = v.findViewById(R.id.imgDanhMuc);
            TextView txtDanhMuc = v.findViewById(R.id.txtDanhMuc);
            Picasso.get().load(data.get(position).getImage()).into(imgHinh);
            txtDanhMuc.setText(data.get(position).getName());
        }
        return v;
    }
}
