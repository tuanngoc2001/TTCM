package com.example.ttcm.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

import androidx.annotation.Nullable;

public class DatHangDB extends SQLiteOpenHelper {
    public DatHangDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void queryData(String sql){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(sql);
    }
    public Cursor getData(String sql) {
        SQLiteDatabase db = getReadableDatabase();
        return db.rawQuery(sql, null);
    }


    public void insertDanhMuc(String idDanhMuc, String tenDanhMuc, int imgDanhMuc){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "Insert into DanhMuc Values(?, ?, ?)";

        SQLiteStatement statement = db.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1, idDanhMuc);
        statement.bindString(2, tenDanhMuc);
        statement.bindString(3,String.valueOf(imgDanhMuc));
        statement.executeInsert();
    }
    public void inserGioHang(String TenMon, int gia, int soluong,int imgmon){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "Insert into GioHang Values(?, ?, ?, ?)";

        SQLiteStatement statement = db.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1, TenMon);
        statement.bindString(2, String.valueOf(gia));
        statement.bindString(3,String.valueOf(soluong));
        statement.bindString(4,String.valueOf(imgmon));
        statement.executeInsert();
    }


    public void insertMonAn(String idMon, String idDanhMuc, String tenMon, int imgMon, String moTa, int gia){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "Insert into MonAn Values(?, ?, ?, ?, ?, ?)";

        SQLiteStatement statement = db.compileStatement(sql);
        statement.clearBindings();
        statement.bindString(1, idMon);
        statement.bindString(2, idDanhMuc);
        statement.bindString(3, tenMon);
        statement.bindString(4, String.valueOf(imgMon));
        statement.bindString(5, moTa);
        statement.bindString(6, String.valueOf(gia));
        statement.executeInsert();
    }
    public void insertMonAnTrangChu( String tenMon, int imgMon, String moTa, int gia){
        SQLiteDatabase db = getWritableDatabase();
        String sql = "Insert into MonAnTrangChu Values(?, ?, ?, ?)";

        SQLiteStatement statement = db.compileStatement(sql);
        statement.clearBindings();

        statement.bindString(1, tenMon);
        statement.bindString(3,moTa);
        statement.bindString(2, String.valueOf(imgMon));
        statement.bindString(4, String.valueOf(gia));
        statement.executeInsert();
    }
//    public void deleteDanhMuc(String idDelete){
//        SQLiteDatabase db = getWritableDatabase();
//        String sql = "Delete from DanhMuc where idDanhMuc = idDelete";
//
//        SQLiteStatement statement = db.compileStatement(sql);
//        statement.clearBindings();
//        statement.executeUpdateDelete();
//    }
}
