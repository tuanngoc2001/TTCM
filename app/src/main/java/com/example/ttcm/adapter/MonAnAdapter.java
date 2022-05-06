package com.example.ttcm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ttcm.R;

import com.example.ttcm.activity.GioHangActivity;
import com.example.ttcm.data.MonAnThanhToan;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
//   private Context context;//màn hình của item
//    private int layout;//mỗi dòng item của listview bạn muốn truyền cái layout nào
//    private ArrayList<MonAnThanhToan> monAnList = new ArrayList<>();
//
//    public MonAnAdapter(Context context, int layout, ArrayList<MonAnThanhToan> monAnList) {
//        this.context = context;
//        this.layout = layout;
//        this.monAnList = monAnList;
//    }
//
//    @Override
//    public int getCount() {
//        return monAnList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        //View để chứa layout, layout nào sẽ hiện thị mỗi dòng
//        //ánh xạ view
//
//        view = layoutInflater.inflate(layout,null);
//        //khởi tạo  lại ánh xạ
//        TextView txtTenMon = (TextView) view.findViewById(R.id.txtTenMon);
//        TextView txtGiaMon = (TextView) view.findViewById(R.id.txtGiaMon);
//        TextView txtSoLuong = (TextView) view.findViewById(R.id.txtSoLuongMon);
//        TextView txtThanhTien = (TextView) view.findViewById(R.id.txtThanhTien);
//        ImageView imgMonAn = (ImageView) view.findViewById(R.id.hinhmonan);
//        ImageButton imgCong = (ImageButton) view.findViewById(R.id.hinhdaucong);
//        ImageButton imgTru = (ImageButton) view.findViewById(R.id.hinhdautru);
//        ImageView imgXoa = (ImageView) view.findViewById(R.id.hinhdauxoa);
////
////        imgCong.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                int a= Integer.parseInt(txtSoLuong.getText().toString())+1;
////                txtSoLuong.setText(a);
////            }
////        });
//
////        imgCong.setOnLongClickListener(new View.OnLongClickListener() {
////            @Override
////            public boolean onLongClick(View view) {
////                int a=Integer.parseInt(txtSoLuong.getText().toString())+1;
////                txtSoLuong.setText(a);
////                return false;
////            }
////        });
//
//        MonAnThanhToan monAn = monAnList.get(i);
//        txtTenMon.setText(monAn.getTenMon());
//        txtGiaMon.setText(monAn.getGiaMon());
//        txtSoLuong.setText(monAn.getSoLuong());
//        txtThanhTien.setText(monAn.getGiaThanhTien());
//        imgMonAn.setImageResource(monAn.getHinhMonAn());
//        imgCong.setImageResource(monAn.getHinhCong());
//        imgXoa.setImageResource(monAn.getHinhXoa());
//        imgTru.setImageResource(monAn.getHinhTru());
//
//
//
//
//
//
//        imgCong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int slmoinhat = Integer.parseInt(String.valueOf(txtSoLuong.getText()))+1;
////                int soluong = Integer.parseInt(String.valueOf(txtThanhTien.getText()));
//                int giahientai = Integer.parseInt(String.valueOf(txtGiaMon.getText()));
//                int doNgiamoi = slmoinhat * giahientai;
//                txtSoLuong.setText(String.valueOf(slmoinhat ));
//                txtThanhTien.setText(String.valueOf(doNgiamoi )+"đ");
//
//                if(slmoinhat>9)
//                {
//                    imgCong.setVisibility(View.INVISIBLE);
//                    imgTru.setVisibility(View.VISIBLE);
//
//                    txtSoLuong.setText(String.valueOf(slmoinhat));
//                }
//                else
//                {
//                    imgCong.setVisibility(View.VISIBLE);
//                    imgTru.setVisibility(View.VISIBLE);
//                    txtSoLuong.setText(String.valueOf(slmoinhat));
//                }
//                GioHangActivity.arrayMonAn.get(i).setSoLuong(String.valueOf(slmoinhat));
//                GioHangActivity.EvenUltil();
//
//
////                if (soluongmon>=10)
////                {
////                    imgCong.setVisibility(View.INVISIBLE);
////                    imgTru.setVisibility(View.VISIBLE);
////                }
////                else if (soluongmon<=1)
////                {
////                    imgTru.setVisibility(View.INVISIBLE);
////                }
////                if (soluongmon>=1)
////                {
////                    imgCong.setVisibility(View.VISIBLE);
////                    imgTru.setVisibility(View.VISIBLE);
////                }
//
//            }
//        });
//
//
//        imgTru.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int slmoinhat = Integer.parseInt(String.valueOf(txtSoLuong.getText()))-1;
////                int soluong = Integer.parseInt(String.valueOf(txtThanhTien.getText()));
//                int giahientai = Integer.parseInt(String.valueOf(txtGiaMon.getText()));
//                int doNgiamoi = slmoinhat * giahientai;
//                txtSoLuong.setText(String.valueOf(slmoinhat ));
//                txtThanhTien.setText(String.valueOf(doNgiamoi )+"đ");
//                if(slmoinhat<2)
//                {
//                    imgCong.setVisibility(View.VISIBLE);
//                    imgTru.setVisibility(View.INVISIBLE);
//                    txtSoLuong.setText(String.valueOf(slmoinhat));
//
//                }
//                else
//                {
//                    imgCong.setVisibility(View.VISIBLE);
//                    imgTru.setVisibility(View.VISIBLE);
//                    txtSoLuong.setText(String.valueOf(slmoinhat));
//                }
//                GioHangActivity.arrayMonAn.get(i).setSoLuong(String.valueOf(slmoinhat ));
//                GioHangActivity.EvenUltil();
//
//
//
//
//
//
////                int soluongmon = Integer.parseInt(String.valueOf(txtSoLuong.getText()))-1;
////                int soluong = Integer.parseInt(String.valueOf(txtThanhTien.getText()))-30000;
////                txtThanhTien.setText(String.valueOf(soluong ));
////                txtSoLuong.setText(String.valueOf(soluongmon ));
//            }
//        });
////        MainActivity.EvenUltil();
//        return view;
//    }
private Context context;//màn hình của item
    private int layout;//mỗi dòng item của listview bạn muốn truyền cái layout nào
    private ArrayList<MonAnThanhToan> monAnList;

    public MonAnAdapter(Context context, int layout, ArrayList<MonAnThanhToan> monAnList) {
        this.context = context;
        this.layout = layout;
        this.monAnList = monAnList;
    }

    @Override
    public int getCount() {
        return monAnList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //View để chứa layout, layout nào sẽ hiện thị mỗi dòng
        //ánh xạ view

        view = layoutInflater.inflate(layout,null);
        //khởi tạo  lại ánh xạ
        TextView txtTenMon = (TextView) view.findViewById(R.id.txtTenMon);
        TextView txtGiaMon = (TextView) view.findViewById(R.id.txtGiaMon);
        TextView txtSoLuong = (TextView) view.findViewById(R.id.txtSoLuongMon);
        TextView txtThanhTien = (TextView) view.findViewById(R.id.txtThanhTien);
        ImageView imgMonAn = (ImageView) view.findViewById(R.id.hinhmonan);
        ImageButton imgCong = (ImageButton) view.findViewById(R.id.hinhdaucong);
        ImageButton imgTru = (ImageButton) view.findViewById(R.id.hinhdautru);
        ImageView imgXoa = (ImageView) view.findViewById(R.id.hinhdauxoa);
//
//        imgCong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int a= Integer.parseInt(txtSoLuong.getText().toString())+1;
//                txtSoLuong.setText(a);
//            }
//        });

//        imgCong.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                int a=Integer.parseInt(txtSoLuong.getText().toString())+1;
//                txtSoLuong.setText(a);
//                return false;
//            }
//        });

        MonAnThanhToan monAn = monAnList.get(i);
        txtTenMon.setText(monAn.getTenMon());
        txtGiaMon.setText(String.valueOf(monAn.getGiaMon()));
        txtSoLuong.setText(String.valueOf(monAn.getSoLuong()));
        txtThanhTien.setText(String.valueOf(monAn.getGiaThanhTien()));
        imgMonAn.setImageResource(monAn.getHinhMonAn());
        imgCong.setImageResource(monAn.getHinhCong());
        imgXoa.setImageResource(monAn.getHinhXoa());
        imgTru.setImageResource(monAn.getHinhTru());






        imgCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int slmoinhat = Integer.parseInt(txtSoLuong.getText().toString())+1;
//                int soluong = Integer.parseInt(String.valueOf(txtThanhTien.getText()));
                int giahientai = Integer.parseInt(txtGiaMon.getText().toString());
                int doNgiamoi = slmoinhat * giahientai;
                txtSoLuong.setText(String.valueOf(slmoinhat ));
                txtThanhTien.setText(String.valueOf(doNgiamoi )+"đ");

                if(slmoinhat>9)
                {
                    imgCong.setVisibility(View.INVISIBLE);
                    imgTru.setVisibility(View.VISIBLE);

                    txtSoLuong.setText(String.valueOf(slmoinhat));
                }
                else
                {
                    imgCong.setVisibility(View.VISIBLE);
                    imgTru.setVisibility(View.VISIBLE);
                    txtSoLuong.setText(String.valueOf(slmoinhat));
                }
                GioHangActivity.arrayMonAn.get(i).setSoLuong(slmoinhat );
                GioHangActivity.EvenUltil();


//                if (soluongmon>=10)
//                {
//                    imgCong.setVisibility(View.INVISIBLE);
//                    imgTru.setVisibility(View.VISIBLE);
//                }
//                else if (soluongmon<=1)
//                {
//                    imgTru.setVisibility(View.INVISIBLE);
//                }
//                if (soluongmon>=1)
//                {
//                    imgCong.setVisibility(View.VISIBLE);
//                    imgTru.setVisibility(View.VISIBLE);
//                }

            }
        });


        imgTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int slmoinhat = Integer.parseInt(String.valueOf(txtSoLuong.getText()))-1;
//                int soluong = Integer.parseInt(String.valueOf(txtThanhTien.getText()));
                int giahientai = Integer.parseInt(String.valueOf(txtGiaMon.getText()));
                int doNgiamoi = slmoinhat * giahientai;
                txtSoLuong.setText(String.valueOf(slmoinhat ));
                txtThanhTien.setText(String.valueOf(doNgiamoi )+"đ");
                if(slmoinhat<2)
                {
                    imgCong.setVisibility(View.VISIBLE);
                    imgTru.setVisibility(View.INVISIBLE);
                    txtSoLuong.setText(String.valueOf(slmoinhat));

                }
                else
                {
                    imgCong.setVisibility(View.VISIBLE);
                    imgTru.setVisibility(View.VISIBLE);
                    txtSoLuong.setText(String.valueOf(slmoinhat));
                }
                GioHangActivity.arrayMonAn.get(i).setSoLuong(slmoinhat );
                GioHangActivity.EvenUltil();






//                int soluongmon = Integer.parseInt(String.valueOf(txtSoLuong.getText()))-1;
//                int soluong = Integer.parseInt(String.valueOf(txtThanhTien.getText()))-30000;
//                txtThanhTien.setText(String.valueOf(soluong ));
//                txtSoLuong.setText(String.valueOf(soluongmon ));
            }
        });
//        MainActivity.EvenUltil();
        return view;
    }
}
