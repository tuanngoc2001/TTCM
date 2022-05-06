package com.example.ttcm.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ttcm.R;

public class ThongbaoThanhToanActivity extends AppCompatActivity {

    TextView txt_TenKhachHang,txt_TongTien,txt_email,txt_sdt,txt_ghichu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
        addControls();
        addEvent();
    }

    private void addEvent() {
//        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
//        txt_TongTien.setText(decimalFormat.format(thanhtoan.txtview_tongtien1.getText().toString())+"đ");
        txt_TongTien.setText(ThanhToanActivity.txtview_tongtien1.getText().toString());
        txt_TenKhachHang.setText(ThanhToanActivity.tenkhachhang.getText().toString());
        txt_email.setText(ThanhToanActivity.email.getText().toString());
        txt_sdt.setText(ThanhToanActivity.sdt.getText().toString());
        txt_ghichu.setText(ThanhToanActivity.ghichu.getText().toString());
    }

    private void addControls() {
        txt_TenKhachHang = findViewById(R.id.txt_tenkhachhang);
        txt_TongTien = findViewById(R.id.txt_tongtien);
        txt_email = findViewById(R.id.txt_email);
        txt_sdt = findViewById(R.id.txt_sodienthoai);
        txt_ghichu = findViewById(R.id.txt_ghichu);

    }
}