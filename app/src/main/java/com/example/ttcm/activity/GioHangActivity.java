package com.example.ttcm.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ttcm.R;
import com.example.ttcm.adapter.MonAnAdapter;
import com.example.ttcm.data.MonAnThanhToan;
import com.example.ttcm.model.Product;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GioHangActivity extends AppCompatActivity {

    //    Toolbar toolbarGiohang;
    ListView listView;
    public static ArrayList<Product> arrayMonAn;
    MonAnAdapter adapter;
    ImageView imgMonAn,imgXoa;
    ImageButton imgCong,imgTru;
    Button btnThanhtoan,btnTiepTuc;
    int b = 1;
    TextView txtSLmon, txtTenMon;
    static TextView txtTongTien;
    TextView txtThanhTien;
    static String getTenMonThanhToan;
    static String getMoTaThanhToan;
    static String getImgMonThanhToan;
    static Float getGiaThanhToan;
    static int getSLThanhToan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio_hang);
        imgMonAn = (ImageView) findViewById(R.id.hinhmonan) ;
        imgCong = (ImageButton) findViewById(R.id.hinhdaucong);
        imgTru = (ImageButton) findViewById(R.id.hinhdautru);
        imgXoa = (ImageView) findViewById(R.id.hinhdauxoa);
        txtSLmon = (TextView) findViewById(R.id.txtSoLuongMon) ;
        txtTongTien = (TextView) findViewById(R.id.txtTongTien) ;
        txtThanhTien = (TextView) findViewById(R.id.txtThanhTien) ;
        txtTenMon = (TextView) findViewById(R.id.txtTenMon) ;
        listView = (ListView) findViewById(R.id.listviewGioHang);
        btnThanhtoan = (Button) findViewById(R.id.btnThanhToan) ;
        btnTiepTuc = (Button) findViewById(R.id.btnTiepTuc) ;
//        toolbarGiohang =(Toolbar) findViewById(R.id.toolbarGiohang);
//
        btnThanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GioHangActivity.this,ThanhToanActivity.class);
                startActivity(intent);
            }
        });
        arrayMonAn = new ArrayList<>();
        EvenUltil();





//        arrayMonAn.add(new MonAn(getTenMonThanhToan,String.valueOf(getGiaThanhToan),"test",String.valueOf(getSLThanhToan),getImgMonThanhToan,R.drawable.daucong1,R.drawable.daucong1,R.drawable.daucong1));
//        adapter = new MonAnAdapter(this,
//                R.layout.layout_giohang,
//                arrayMonAn);

        listView.setAdapter(adapter);
        EvenUltil();
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Xacnhanxoa(i);
                return false;
            }
        });
//        btnThanhtoan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                db.queryData(
//                        "DELETE FROM GioHang"
//                );
//                arrayMonAn.clear();
//                adapter.notifyDataSetChanged();
//                EvenUltil();
//            }
//        });
//        (btnTiepTuc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                 int giahientai = Integer.parseInt(txtThanhTien.getText().toString());
//                    txtTongTien.setText(giahientai+"");
//                  int a =  arrayMonAn.getClass(MonAn).getGiaThanhTien();
//                 txtTongTien.setText(MonAn[2].getGiaThanhTien());
//            }
//        });
        // EvenUltil();
//        toolbarGiohang.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
    }
    private void Xacnhanxoa(int posittion){
        //AlertDialog.Builder dùng để hiện thông báo
        AlertDialog.Builder alalerdialog = new AlertDialog.Builder(this);
        alalerdialog.setTitle("Thong Bao");
        alalerdialog.setIcon(R.mipmap.ic_launcher);
        // alalerdialog.show();

        alalerdialog.setMessage("Ban co muon xoa noi dung nay khong");
        alalerdialog.setPositiveButton("Co", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrayMonAn.remove(posittion);
                adapter.notifyDataSetChanged();
//                String name=arrayMonAn.get(posittion).getTenMon();

                EvenUltil();
            }
        });
        alalerdialog.setNegativeButton("Khong", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alalerdialog.show();
    }
    public static void EvenUltil()
    {
        long tongtien = 0;
//        for (int i=0;i<GioHangActivity.arrayMonAn.size();i++)
//        {
//            tongtien +=GioHangActivity.arrayMonAn.get(i).getGiaThanhTien()*GioHangActivity.arrayMonAn.get(i).getSoLuong();
//        }
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        txtTongTien.setText(decimalFormat.format(tongtien)+"đ");
    }

    public void ToHome(View view) {
        Intent intent = new Intent(GioHangActivity.this,MainActivity.class);
        startActivity(intent);
    }
}