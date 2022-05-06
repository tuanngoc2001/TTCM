package com.example.ttcm.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.ttcm.R;
import com.example.ttcm.adapter.DrawerAdapter;
import com.example.ttcm.adapter.MonAnTrangChuAdapter;
import com.example.ttcm.data.DatHangDB;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    TextView txtsl;

    MonAnTrangChuAdapter adaptertrangchu;
    ArrayList<MonAnTrangChu> arrayListmonan=new ArrayList<>();

    //public static DatHangDB db;

    //add du lieu vao recycle
    ListView listview;
    DrawerAdapter adapter;
    ArrayList<Drawer>lst=new ArrayList<>();


    //viewfliper
    ViewFlipper viewFlipper;

    //main
    GridView grmonantrangchu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControll();
        adddrawer();
        addEven();


    }

    private void addEven() {
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent=new Intent(MainActivity.this,DanhMucActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent gtchung = new Intent(MainActivity.this,GioiThieuChungActivity.class);
                        startActivity(gtchung);
                        break;
                    case 2:
                        Intent intent2 =new Intent(MainActivity.this,LienHeActivity.class);
                        startActivity(intent2);
                        break;
                }
            }
        });
//        grmonantrangchu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(MainActivity.this,ChiTietMonActivity.class);
//                ChiTietMonActivity.getTenMon = arrayListmonan.get(i).getName();
//                ChiTietMonActivity.getImgMon = arrayListmonan.get(i).getImage();
//                ChiTietMonActivity.getGia = arrayListmonan.get(i).getPrice();
//                ChiTietMonActivity.getMoTa = arrayListmonan.get(i).getDecription();
//                startActivity(intent);
//            }
//        });
    }

    private void adddrawer() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void addControll() {
        txtsl=findViewById(R.id.thongbao_soluong);

        toolbar=findViewById(R.id.toolbar_Home);
        drawerLayout=findViewById(R.id.drawerLayout);
        navigationView=findViewById(R.id.navigationView);

        listview=findViewById(R.id.listView_NavHome);
        lst.add(new Drawer(R.drawable.ic_menu_res,"Danh Mục",1));
        lst.add(new Drawer(R.drawable.ic_info,"Giới thiệu chung",1));
        lst.add(new Drawer(R.drawable.ic_contact,"Liên hệ",1));
        adapter=new DrawerAdapter(R.layout.drawermenu,MainActivity.this,lst);
        listview.setAdapter(adapter);


//        db.insertMonAn("MA001", "DM001","Cơm tấm sườn",R.drawable.comtamsuon,"Cơm tấm sườn siêu ngon có cơm và miếng sườn",25000);
//        db.insertMonAn("MA002", "DM001","Cơm tấm sườn trứng",R.drawable.comtamsuontrung,"Cơm tấm sườn siêu ngon có cơm, miếng sườn và miếng trứng",27000);
//        db.insertMonAn("MA003", "DM001","Cơm gà xối mỡ",R.drawable.comgaxoimo,;."Đĩa cơm gà bắt mắt với phần cơm vừa đủ ăn, thịt gà trộn bày lên trên",30000);





        viewFlipper=findViewById(R.id.viewFlipper);
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);



        //monan trang chu
//          grmonantrangchu=findViewById(R.id.lstmonan);
//
//          db = new DatHangDB(this,"DatHangDB.sqlite",null,2);
//
//          db.queryData("Create table if not exists MonAn (idMon Text Primary Key, idDanhMuc Text, tenMon Text, imgMonAn int, moTa String, gia int)");
//        db.insertMonAn("MA001", "DM001","Cơm tấm sườn",R.drawable.comtamsuon,"Cơm tấm sườn siêu ngon có cơm và miếng sườn",25000);
//        db.insertMonAn("MA002", "DM001","Cơm tấm sườn trứng",R.drawable.comtamsuontrung,"Cơm tấm sườn siêu ngon có cơm, miếng sườn và miếng trứng",27000);
//        db.insertMonAn("MA003", "DM001","Cơm gà xối mỡ",R.drawable.comgaxoimo,"Đĩa cơm gà bắt mắt với phần cơm vừa đủ ăn, thịt gà trộn bày lên trên",30000);
//
//
//        Cursor cursor = MainActivity.db.getData("Select * from MonAn");
//        while(cursor.moveToNext()){
//            String idMon = cursor.getString(0);
//            String idDanhMuc = cursor.getString(1);
//            String tenMon = cursor.getString(2);
//            int imgMon = cursor.getInt(3);
//            String moTa = cursor.getString(4);
//            int gia = cursor.getInt(5);
//            arrayListmonan.add(new MonAnTrangChu(tenMon, moTa,imgMon,gia));
//        }
//        adaptertrangchu=new MonAnTrangChuAdapter(R.layout.monantrangchu,MainActivity.this,arrayListmonan);
//        adapter.notifyDataSetChanged();
//        grmonantrangchu.setAdapter(adaptertrangchu);



    }

    public void openCart(View view) {
        Intent intent=new Intent(MainActivity.this,GioHangActivity.class);
        startActivity(intent);
    }
}