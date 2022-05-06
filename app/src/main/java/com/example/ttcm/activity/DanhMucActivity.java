package com.example.ttcm.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.example.ttcm.R;
import com.example.ttcm.adapter.DanhMucAdapter;
import com.example.ttcm.data.DatHangDB;

import java.util.ArrayList;

public class DanhMucActivity extends AppCompatActivity {

    Toolbar toolbar_Danhmuc;
    TextView thongbao_soluong;

    GridView gridview_danhmuc;
    ArrayList<DanhMuc> list_DanhMuc = new ArrayList<>();
    DanhMucAdapter adapter;
    public static DatHangDB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_muc);
        addControls();
        addEvents();
    }

    private void addEvents() {
        gridview_danhmuc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    String idDanhMuc = list_DanhMuc.get(position).getId();
                Intent intent = new Intent(DanhMucActivity.this, ChiTietDanhMucActivity.class);
                //intent.putExtra("idDanhmuc", list_DanhMuc.get(position).getId());
                ChiTietDanhMucActivity.getIdDanhMuc=list_DanhMuc.get(position).getId();
                startActivity(intent);
            }
        });
        toolbar_Danhmuc.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void addControls() {
        toolbar_Danhmuc = findViewById(R.id.toolbar_Danhmuc);
        thongbao_soluong = findViewById(R.id.thongbao_soluong);
        gridview_danhmuc = findViewById(R.id.gridView_DanhMuc);

        db = new DatHangDB(this,"DatHangDB.sqlite",null,2);
        Cursor cursor = DanhMucActivity.db.getData("Select * from DanhMuc");
        while(cursor.moveToNext()){
            String idDanhMuc = cursor.getString(0);
            String tenDanhMuc = cursor.getString(1);
            int imgDanhMuc = cursor.getInt(2);
            list_DanhMuc.add(new DanhMuc(idDanhMuc, tenDanhMuc, imgDanhMuc));
        }
        adapter = new DanhMucAdapter(this, list_DanhMuc);
        gridview_danhmuc.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    public void openCart(View view) {
    }

    public void ToHome(View view) {
        Intent intent = new Intent(DanhMucActivity.this,MainActivity.class);
        startActivity(intent);
    }
}