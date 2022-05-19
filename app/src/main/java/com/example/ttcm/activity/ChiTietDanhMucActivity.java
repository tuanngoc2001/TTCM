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
import com.example.ttcm.data.Mon;
import com.example.ttcm.model.Category;
import com.example.ttcm.model.Product;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChiTietDanhMucActivity extends AppCompatActivity {

    Toolbar toolbar_Danhmuc;
    TextView thongbao_soluong;

    ListView lst_chitietdanhmuc;
    ArrayList<Product> list_Mon = new ArrayList<>();
    ChiTietDanhMucAdapter adapter;


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
                ChiTietMonActivity.getTenMon = list_Mon.get(position).getName();
                ChiTietMonActivity.getImgMon = list_Mon.get(position).getUrlImage();
                ChiTietMonActivity.getGia = list_Mon.get(position).getPrice();
                ChiTietMonActivity.getMoTa = list_Mon.get(position).getTitle();
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


//        db = new DatHangDB(this,"DatHangDB.sqlite",null,2);
//        Cursor cursor = ChiTietDanhMucActivity.db.getData("Select * from MonAn where idDanhMuc = '"+getIdDanhMuc+"'")  ;
//        while(cursor.moveToNext()){
//            String idMon = cursor.getString(0);
//            String idDanhMuc = cursor.getString(1);
//            String tenMon = cursor.getString(2);
//            int imgMon = cursor.getInt(3);
//            String moTa = cursor.getString(4);
//            int gia = cursor.getInt(5);
//            list_Mon.add(new Mon(idMon, idDanhMuc, tenMon, imgMon, moTa, gia));
//        }
        adapter = new ChiTietDanhMucAdapter(this,list_Mon);
        lst_chitietdanhmuc.setAdapter(adapter);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("Product").whereEqualTo("IdCate",getIdDanhMuc).get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                if(!queryDocumentSnapshots.isEmpty())
                {
                    List<DocumentSnapshot> lst=queryDocumentSnapshots.getDocuments();
                    for(DocumentSnapshot item:lst)
                    {
                        list_Mon.add(new Product( Objects.requireNonNull(item.get("name")).toString(), Objects.requireNonNull(item.get("urlImage")).toString(),Float.parseFloat(Objects.requireNonNull(item.get("price")).toString()), Objects.requireNonNull(item.get("productType")).toString(),Integer.parseInt(Objects.requireNonNull(item.get("quality")).toString()), Objects.requireNonNull(item.get("title")).toString(),Integer.parseInt(Objects.requireNonNull(item.get("id")).toString()),Objects.requireNonNull(item.get("IdCate")).toString()));
                        adapter.notifyDataSetChanged();
                    }
                }
            }
        });


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