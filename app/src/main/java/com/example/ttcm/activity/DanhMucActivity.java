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
import com.example.ttcm.model.Category;
import com.example.ttcm.model.Product;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DanhMucActivity extends AppCompatActivity {

    Toolbar toolbar_Danhmuc;
    TextView thongbao_soluong;

    GridView gridview_danhmuc;
    ArrayList<Category> list_DanhMuc = new ArrayList<>();
    DanhMucAdapter adapter;

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



        adapter = new DanhMucAdapter(DanhMucActivity.this, list_DanhMuc);
        gridview_danhmuc.setAdapter(adapter);


        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("Category").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                if(!queryDocumentSnapshots.isEmpty())
                {
                    List<DocumentSnapshot> lst=queryDocumentSnapshots.getDocuments();
                    for(DocumentSnapshot item:lst)
                    {
                        list_DanhMuc.add(new Category(Objects.requireNonNull(item.get("Id")).toString(), Objects.requireNonNull(item.get("Name")).toString(), Objects.requireNonNull(item.get("Image")).toString()));
                        adapter.notifyDataSetChanged();
                    }
                }
            }
        });

        adapter.notifyDataSetChanged();

    }

    public void openCart(View view) {
    }

    public void ToHome(View view) {
        Intent intent = new Intent(DanhMucActivity.this,MainActivity.class);
        startActivity(intent);
    }
}