package com.example.ttcm.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ttcm.R;
import com.example.ttcm.adapter.ChiTietDanhMucAdapter;
import com.example.ttcm.data.DatHangDB;

import java.util.ArrayList;

public class ChiTietDanhMucActivity extends AppCompatActivity {

    Toolbar toolbar_Danhmuc;
    TextView thongbao_soluong;

    ListView lst_chitietdanhmuc;
    ArrayList<Mon> list_Mon = new ArrayList<>();
    ChiTietDanhMucAdapter adapter;

    public static DatHangDB db;

    static String getIdDanhMuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_danh_muc);
        addControls();
        addEvents();
    }

    private void addEvents() {
        lst_chitietdanhmuc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ChiTietDanhMucActivity.this,ChiTietMonActivity.class);
//                intent.putExtra("idMon",list_Mon.get(position).getId());
//                intent.putExtra("idDanhMuc",list_Mon.get(position).getMadanhmuc());
//                intent.putExtra("tenMon",list_Mon.get(position).getTenmon());
//                intent.putExtra("imgMon",list_Mon.get(position).getHinhmon());
//                intent.putExtra("moTa",list_Mon.get(position).getMota());
//                intent.putExtra("gia",list_Mon.get(position).getGia());

                ChiTietMonActivity.getTenMon = list_Mon.get(position).getTenmon();
                ChiTietMonActivity.getImgMon = list_Mon.get(position).getHinhmon();
                ChiTietMonActivity.getGia = list_Mon.get(position).getGia();
                ChiTietMonActivity.getMoTa = list_Mon.get(position).getMota();
                startActivity(intent);

            }
        });
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        Intent intent = getIntent();
//        getIdDanhMuc = intent.getStringExtra("idDanhmuc");
//    }

    private void addControls() {
        toolbar_Danhmuc = findViewById(R.id.toolbar_Danhmuc);
        thongbao_soluong = findViewById(R.id.thongbao_soluong);
        lst_chitietdanhmuc = findViewById(R.id.lst_ChiTietDanhMuc);

//        list_Mon.add(new Mon(001,001,"Test",R.drawable.custom_input,"mota","15000"));
//        list_Mon.add(new Mon(001,001,"Test",R.drawable.custom_input,"mota","15000"));
//        list_Mon.add(new Mon(001,001,"Test",R.drawable.custom_input,"mota","15000"));
//        list_Mon.add(new Mon(001,001,"Test",R.drawable.custom_input,"mota","15000"));
//        list_Mon.add(new Mon(001,001,"Test",R.drawable.custom_input,"mota","15000"));
//        list_Mon.add(new Mon(001,001,"Test",R.drawable.custom_input,"mota","15000"));
//        list_Mon.add(new Mon(001,001,"Test",R.drawable.custom_input,"mota","15000"));

        db = new DatHangDB(this,"DatHangDB.sqlite",null,2);
        //db.queryData("Create table if not exists MonAn (idMon Text Primary Key, idDanhMuc Text, tenMon Text, imgMonAn int, moTa String, gia int)");
//        db.insertMonAn("MA001", "DM001","Cơm tấm sườn",R.drawable.comtamsuon,"Cơm tấm sườn siêu ngon có cơm và miếng sườn",25000);
//        db.insertMonAn("MA002", "DM001","Cơm tấm sườn trứng",R.drawable.comtamsuontrung,"Cơm tấm sườn siêu ngon có cơm, miếng sườn và miếng trứng",27000);
//        db.insertMonAn("MA003", "DM001","Cơm gà xối mỡ",R.drawable.comgaxoimo,"Đĩa cơm gà bắt mắt với phần cơm vừa đủ ăn, thịt gà trộn bày lên trên",30000);


        Cursor cursor = ChiTietDanhMucActivity.db.getData("Select * from MonAn where idDanhMuc = '"+getIdDanhMuc+"'")  ;
        while(cursor.moveToNext()){
            String idMon = cursor.getString(0);
            String idDanhMuc = cursor.getString(1);
            String tenMon = cursor.getString(2);
            int imgMon = cursor.getInt(3);
            String moTa = cursor.getString(4);
            int gia = cursor.getInt(5);
            list_Mon.add(new Mon(idMon, idDanhMuc, tenMon, imgMon, moTa, gia));
        }
        adapter = new ChiTietDanhMucAdapter(this,list_Mon);
        lst_chitietdanhmuc.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    public void openCart(View view) {
    }

    public void ToHome(View view) {
        Intent intent = new Intent(ChiTietDanhMucActivity.this,MainActivity.class);
        startActivity(intent);
    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        //lấy dữ liệu từ NewContact gửi về
//        Intent intent = getIntent();
//        getIdDanhMuc = intent.getStringExtra("idDanhmuc");
////        if(requestCode==100&&resultCode==200){
//            //đặt vào listData
////            Cursor cursor = ChiTietDanhMucActivity.db.getData("Select * from MonAn");
////            while(cursor.moveToNext()){
////                String idMon = cursor.getString(0);
////                String idDanhMuc = cursor.getString(1);
////                String tenDanhMuc = cursor.getString(2);
////                int imgMon = cursor.getInt(3);
////                String moTa = cursor.getString(4);
////                int gia = cursor.getInt(5);
////                list_Mon.add(new Mon(idMon, idDanhMuc, tenDanhMuc, imgMon, moTa, gia));
////            }
////            adapter.notifyDataSetChanged();
////        }
//        //cập nhật adapter
////        lstContactAdapter.notifyDataSetChanged();
////        lstContact.setAdapter(lstContactAdapter);
//    }
}