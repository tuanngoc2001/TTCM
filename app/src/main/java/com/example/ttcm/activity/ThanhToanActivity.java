package com.example.ttcm.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ttcm.R;

public class ThanhToanActivity extends AppCompatActivity {

    static TextView txtview_tongtien1;
    static EditText tenkhachhang, sdt, ghichu, email;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
        txtview_tongtien1 = findViewById(R.id.textview_tongtien);
        btn = findViewById(R.id.btn_xacnhanthanhtoan);
        tenkhachhang = findViewById(R.id.user_name);
        sdt = findViewById(R.id.user_phone);
//        username = findViewById(R.id.user_email);
        email = findViewById(R.id.user_email);
        ghichu = findViewById(R.id.user_note);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ThanhToanActivity.this, ThongbaoThanhToanActivity.class);
//                thanhtoanthoi.txtTenKhachHang.setText(username.getText());
                startActivity(intent1);
            }
        });
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("all");
        String ten = bundle.getString("1");
        txtview_tongtien1.setText(ten);
    }
}