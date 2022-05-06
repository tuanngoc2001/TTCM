package com.example.ttcm.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ttcm.R;

public class ThongtinKhachHangActivity extends AppCompatActivity {
    static EditText tenkhachang,sdt,email,diachi,ghichu;
    Button btndathang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtin_khach_hang);
        tenkhachang = findViewById(R.id.user_name);
        sdt = findViewById(R.id.user_phone);
        email = findViewById(R.id.user_email);
        diachi = findViewById(R.id.user_address);
        ghichu = findViewById(R.id.user_note);
        btndathang = findViewById(R.id.btn_xacnhandathang);
        btndathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThongtinKhachHangActivity.this,ThanhToanActivity.class);
                startActivity(intent);
            }
        });
    }
}