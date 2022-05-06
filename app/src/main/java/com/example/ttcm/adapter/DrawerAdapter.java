package com.example.ttcm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ttcm.activity.Drawer;
import com.example.ttcm.R;

import java.util.ArrayList;
import java.util.List;

public class DrawerAdapter extends BaseAdapter {

    private int layout;
    private Context context;
    private List<Drawer> lst = new ArrayList<>();

    public DrawerAdapter(int layout, Context context, List<Drawer> lst) {
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
        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view =inflater.inflate(layout,null);



        ImageView img=view.findViewById(R.id.imgdrawer);
        TextView txtti=view.findViewById(R.id.txtdrawer);


        img.setImageResource(lst.get(i).getImage());
        txtti.setText(lst.get(i).getTitle());
        return view;
    }
}
