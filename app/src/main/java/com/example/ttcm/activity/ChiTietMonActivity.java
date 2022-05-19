package com.example.ttcm.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.ttcm.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ChiTietMonActivity extends AppCompatActivity {
    Toolbar toolbar_Chitietmon;
    ImageView hinhmon_chitiet;
    public TextView tenmon_chitiet, gia_chitiet, mota_chitiet;
    Button btn_mua;
    TextView thongbao_soluong;
    Spinner spinner_soluong;
    ArrayList<Integer> list_soluong = new ArrayList<Integer>();
    ArrayAdapter<Integer> adapterSoLuong;


    static String getIdMon;
    static String getTenMon;
    static String getMoTa;
    static String getImgMon;
    static float getGia;

    //    public String getIdMon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_mon);
        addControls();
        addEvents();
    }

    private void addEvents() {
        toolbar_Chitietmon.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_mua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChiTietMonActivity.this, GioHangActivity.class);
                GioHangActivity.getImgMonThanhToan = getImgMon;
                GioHangActivity.getTenMonThanhToan = getTenMon;
                GioHangActivity.getMoTaThanhToan = getMoTa;
                GioHangActivity.getGiaThanhToan = getGia;
                GioHangActivity.getSLThanhToan = Integer.parseInt(spinner_soluong.getSelectedItem().toString());
                startActivity(intent);
            }
        });
    }

    private void addControls() {
        toolbar_Chitietmon = findViewById(R.id.toolbar_Chitietmon);
        hinhmon_chitiet = findViewById(R.id.hinhmon_chitiet);
        tenmon_chitiet = findViewById(R.id.tenmon_chitiet);
        gia_chitiet = findViewById(R.id.gia_chitiet);
        mota_chitiet = findViewById(R.id.mota_chitiet);
        btn_mua = findViewById(R.id.btn_mua);
        thongbao_soluong = findViewById(R.id.thongbao_soluong);
        spinner_soluong = findViewById(R.id.spinner_soluong);
        adapterSoLuong = new ArrayAdapter<Integer>(ChiTietMonActivity.this, android.R.layout.simple_spinner_item, list_soluong);
        adapterSoLuong.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_soluong.setSelected(list_soluong.add(1));
        spinner_soluong.setAdapter(adapterSoLuong);
        for(int i=2;i<=10;i++)
        {
            list_soluong.add(i);
        }



        Picasso.get().load(getImgMon).into(hinhmon_chitiet);

        tenmon_chitiet.setText(getTenMon);
        gia_chitiet.setText(String.valueOf(getGia));
        mota_chitiet.setText(getMoTa);

    }

    public void openCart(View view) {
        Intent intent = new Intent(ChiTietMonActivity.this,GioHangActivity.class);
        startActivity(intent);
    }

    public void ToHome(View view) {
        Intent intent = new Intent(ChiTietMonActivity.this,MainActivity.class);
        startActivity(intent);
    }

}