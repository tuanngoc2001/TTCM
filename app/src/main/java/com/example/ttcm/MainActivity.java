package com.example.ttcm;

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

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    public static ArrayList<MonAn> arrayMonAn;
    MonAnAdapter adapter;
    ImageView imgMonAn, imgXoa;
    ImageButton imgCong, imgTru;
    Button btnThanhtoan, btnTiepTuc;
    int b = 1;
    TextView txtSLmon;
    static TextView txtTongTien;
    TextView txtThanhTien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgMonAn = (ImageView) findViewById(R.id.hinhmonan) ;
        imgCong = (ImageButton) findViewById(R.id.hinhdaucong);
        imgTru = (ImageButton) findViewById(R.id.hinhdautru);
        imgXoa = (ImageView) findViewById(R.id.hinhdauxoa);
        txtSLmon = (TextView) findViewById(R.id.txtSoLuongMon) ;
        txtTongTien = (TextView) findViewById(R.id.txtTongTien) ;
        txtThanhTien = (TextView) findViewById(R.id.txtThanhTien) ;
        listView = (ListView) findViewById(R.id.listviewGioHang);
        btnThanhtoan = (Button) findViewById(R.id.btnThanhToan) ;
        btnTiepTuc = (Button) findViewById(R.id.btnTiepTuc) ;

        arrayMonAn = new ArrayList<>();

        arrayMonAn.add(new MonAn("Cơm tấm sà bì chưởng","10000","10000","1",R.drawable.anhmon,R.drawable.ic_xoa,R.drawable.ic_daucong,R.drawable.ic_dautru));
        arrayMonAn.add(new MonAn("Cơm tấm sà bì chưởng","20000","20000","2",R.drawable.anhmon,R.drawable.ic_xoa,R.drawable.ic_daucong,R.drawable.ic_dautru));
        // arrayMonAn.add(new MonAn("Cơm tấm sà bì chưởng","10000đ","40000đ","2",R.drawable.anhmon,R.drawable.daucong1,R.drawable.daucong1,R.drawable.daucong1));

        adapter = new MonAnAdapter(this,
                R.layout.layout_giohang,
                arrayMonAn);

        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Xacnhanxoa(i);
                return false;
            }
        });
        btnThanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,thanhtoan.class);
//                Bundle bundle = new Bundle();
//                bundle.putString("1", String.valueOf(txtTongTien.getText().toString()));
//                intent.putExtra("all",bundle);
//                startActivity(intent);
            }
        });
        btnTiepTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // int giahientai = Integer.parseInt(txtThanhTien.getText().toString());
                //    txtTongTien.setText(giahientai+"");
                //  int a =  arrayMonAn.getClass(MonAn).getGiaThanhTien();
                // txtTongTien.setText(MonAn[2].getGiaThanhTien());
            }
        });
        EvenUltil();

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
        for (int i=0;i<MainActivity.arrayMonAn.size();i++)
        {
            tongtien +=Integer.parseInt(MainActivity.arrayMonAn.get(i).getGiaThanhTien())*Integer.parseInt(MainActivity.arrayMonAn.get(i).getSoLuong());
        }
        DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
        txtTongTien.setText(decimalFormat.format(tongtien)+"đ");
    }
}