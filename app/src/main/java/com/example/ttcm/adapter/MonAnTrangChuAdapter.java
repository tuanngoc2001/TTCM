package com.example.ttcm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ttcm.R;
import com.example.ttcm.activity.MonAnTrangChu;

import java.util.List;

public class MonAnTrangChuAdapter extends BaseAdapter {
    private int layout;
    private Context context;
    private List<MonAnTrangChu> lst;

    public MonAnTrangChuAdapter(int layout, Context context, List<MonAnTrangChu> lst) {
        this.layout = layout;
        this.context = context;
        this.lst = lst;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(layout,null);

        ImageView img=view.findViewById(R.id.hinhmon);
        TextView txtgia=view.findViewById(R.id.gia);
        TextView txtten=view.findViewById(R.id.tenmon);
        TextView txtmota=view.findViewById(R.id.mota);


        img.setImageResource(lst.get(i).getImage());
        txtgia.setText(String.valueOf(lst.get(i).getPrice()));
        txtten.setText(lst.get(i).getName());
        txtmota.setText(lst.get(i).getDecription());

        return view;
    }
}
