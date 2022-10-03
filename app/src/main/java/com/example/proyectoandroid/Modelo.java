package com.example.proyectoandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class  Modelo {

    public SQLiteDatabase getConn (Context context){
        ConexionDB conn = new ConexionDB(context,"dbempleados",null,1);
        SQLiteDatabase db= conn.getWritableDatabase();
        return db;
    }

    int insertarEmpleado(Context context, Empleado emp) {
        int res=0;
        String sql = "INSERT INTO empleados (id, nombre, email, password) VALUES ('"+emp.getId()+"','"+emp.getNombre()+"','"+emp.getEmail()+"','"+emp.getPassword()+"' )";
        SQLiteDatabase db= this.getConn(context);
        try {
            db.execSQL(sql);
            res = 1;
        }catch (Exception e) {
        }
            return res;

    }
}
