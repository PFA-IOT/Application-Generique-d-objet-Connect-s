package com.example.emsi_notif_sujet4.Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static  final String DATABASE_NAME="EMSI.db";
    public static  final String TABLE_NAME="Personne_table";
    public static  final String COL_ID="ID";
    public static  final String COL_USERNAME="USERNAME";
    public static  final String DATABASE_PASSWORD="PASSWORD";
    public static  final String DATABASE_EMAIL="EMAIL";
    public static  final String DATABASE_AGE="AGE";
    public static  final String DATABASE_fullname="FULLNAME";




    public DatabaseHelper(@Nullable Context context) {
        super(context,DATABASE_NAME, null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       // db.execSQL("create table ");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
