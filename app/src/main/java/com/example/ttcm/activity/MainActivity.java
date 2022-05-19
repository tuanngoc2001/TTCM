package com.example.ttcm.activity;
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
import android.widget.ViewFlipper;

import com.example.ttcm.R;
import com.example.ttcm.adapter.DrawerAdapter;
import com.example.ttcm.adapter.MonAnTrangChuAdapter;
import com.example.ttcm.model.Product;
import com.google.android.gms.tasks.OnSuccessListener;

import com.google.android.material.navigation.NavigationView;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    public static int id;
    TextView txtsl;

    MonAnTrangChuAdapter adaptertrangchu;
    ArrayList<Product> arrayListmonan=new ArrayList<>();

    //public static DatHangDB db;

    //add du lieu vao recycle
    ListView listview;
    DrawerAdapter adapter;
    ArrayList<Drawer>lst=new ArrayList<>();


    //viewfliper
    ViewFlipper viewFlipper;

    //main
    GridView grmonantrangchu;

    //firebase
    List<Product>lstpro=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this, id, Toast.LENGTH_SHORT).show();

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
        grmonantrangchu=findViewById(R.id.lstmonan);

        listview=findViewById(R.id.listView_NavHome);
        lst.add(new Drawer(R.drawable.ic_menu_res,"Danh Mục",1));
        lst.add(new Drawer(R.drawable.ic_info,"Giới thiệu chung",1));
        lst.add(new Drawer(R.drawable.ic_contact,"Liên hệ",1));
        adapter=new DrawerAdapter(R.layout.drawermenu,MainActivity.this,lst);
        listview.setAdapter(adapter);


        viewFlipper=findViewById(R.id.viewFlipper);
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);


//        arrayListmonan.add(new MonAnTrangChu("cơm tấm","akjsd","https://firebasestorage.googleapis.com/v0/b/appfood-59d76.appspot.com/o/MyXaoChuaCay.jpg?alt=media&token=98d96428-0b86-497e-925e-7d742eda5b88",39000f));
//        arrayListmonan.add(new MonAnTrangChu("cơm tấm","akjsd","https://firebasestorage.googleapis.com/v0/b/appfood-59d76.appspot.com/o/com-rang-thap-cam-5.jpg?alt=media&token=c45da245-9ba3-4117-97c7-12322c58280c",45000f));
//        arrayListmonan.add(new MonAnTrangChu("cơm tấm","akjsd","https://firebasestorage.googleapis.com/v0/b/appfood-59d76.appspot.com/o/comtamsuontrung.png?alt=media&token=5f6414f1-73c7-418a-9b29-211d7022a5f9",49000f));
//        arrayListmonan.add(new MonAnTrangChu("cơm tấm","akjsd","https://firebasestorage.googleapis.com/v0/b/appfood-59d76.appspot.com/o/com-rang-thap-cam-5.jpg?alt=media&token=c45da245-9ba3-4117-97c7-12322c58280c",49000f));
//        arrayListmonan.add(new MonAnTrangChu("cơm tấm","akjsd","https://firebasestorage.googleapis.com/v0/b/appfood-59d76.appspot.com/o/comrangcaibo.jpg?alt=media&token=91d131e0-afec-4ed8-905f-d64226749f0f",49000f));
//        arrayListmonan.add(new MonAnTrangChu("cơm tấm","akjsd","https://firebasestorage.googleapis.com/v0/b/appfood-59d76.appspot.com/o/phoga.jpg?alt=media&token=95d6b44e-b617-4bcc-ba9a-657d89494012",49000f));
//        arrayListmonan.add(new MonAnTrangChu("cơm tấm","akjsd","https://firebasestorage.googleapis.com/v0/b/appfood-59d76.appspot.com/o/comgaxoimo.png?alt=media&token=dacbc585-b048-4ed3-a5f0-490edddfdede",49000f));
//        arrayListmonan.add(new MonAnTrangChu("cơm tấm","akjsd","https://firebasestorage.googleapis.com/v0/b/appfood-59d76.appspot.com/o/phobo.jpg?alt=media&token=dda64f79-e30a-410a-b443-8ac239c48c09",49000f));
        adaptertrangchu=new MonAnTrangChuAdapter(R.layout.monantrangchu,MainActivity.this,arrayListmonan);
        grmonantrangchu.setAdapter(adaptertrangchu);

        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("Product").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                @Override
                public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                    if(!queryDocumentSnapshots.isEmpty())
                    {
                        List<DocumentSnapshot>lst=queryDocumentSnapshots.getDocuments();
                        for(DocumentSnapshot item:lst)
                        {
                              arrayListmonan.add(new Product( Objects.requireNonNull(item.get("name")).toString(), Objects.requireNonNull(item.get("urlImage")).toString(),Float.parseFloat(Objects.requireNonNull(item.get("price")).toString()), Objects.requireNonNull(item.get("productType")).toString(),Integer.parseInt(Objects.requireNonNull(item.get("quality")).toString()), Objects.requireNonNull(item.get("title")).toString(),Integer.parseInt(Objects.requireNonNull(item.get("id")).toString()),Objects.requireNonNull(item.get("IdCate")).toString()));
                              adaptertrangchu.notifyDataSetChanged();
                        }
                    }
                }
        });

    }
        public void openCart(View view) {
        Intent intent=new Intent(MainActivity.this,GioHangActivity.class);
        startActivity(intent);
    }
}