/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
//    private static final String DRIVER="org.apache.derby.jdbc.ClientDriver";
//    private static final String URI="jdbc:derby://localhost:1527/wishList2";
//    private static final String USERNAME="APP";
//    private static final String PASSWORD="app";
    private static final String DRIVER="org.apache.derby.jdbc.ClientDriver";
    private static final String USERNAME="app";
   private static final String PASSWORD="app";
   private static final String URI="jdbc:derby://localhost:1527/restuarantDB";
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URI, USERNAME, PASSWORD);
        } catch (ClassNotFoundException ex) {
            System.out.println("ไม่พบ Database driver! หากใช้ Derby ให้ทำอย่างใดอย่างหนึ่งต่อไปนี้");
            System.out.println(" (A) คลิกขวาที่ Libraries แล้วเลือก Add Library.. แล้วเลือก Java DB Driver");
            System.out.println("หรือ\n (B) เพิ่มไฟล์ derby.jar และ derbyclient.jar ไว้ที่ Libraries");
            System.out.println("\nหากใช้ database อื่นให้ dowload JDBC driver จากเว็บไซต์ของ database นั้น แล้ว");
            System.out.println(" \n คลิกขวาที่ Libraries แล้วเลือก Add Jar/Folder แล้วเลือก Driver นั้น");
        } catch (SQLException ex) {
            System.out.println("\n---------");
            System.out.println("ไม่สามารถเชื่อมต่อ databses ได้");
            System.out.println("ให้ตรวจสอบ database ให้คลิกที่หน้าต่าง Services ดูที่หัวข้อ Databases");
            System.out.println("1. ตรวจสอบการ start database server");
            System.out.println("\t1.1 คลิกขวาที่ Java DB หรือ Database ที่ใช้ เลือก Start Server");
            System.out.println("2. หากทำตามข้อ 1 แล้วไม่ได้ผล \n   ให้สร้าง database ชื่อ wishlist ใหม่");
            System.out.println("\t2.1 ถ้ามีแล้วให้ลบออกโดยคลิกขวาที่ database ชื่อ wishlist เลือก Delete");
            System.out.println("\t2.2 การสร้างใหม่คลิกขวาที่ Java DB หรือ Database ที่ใช้ เลือก Create Database..");
            System.out.println("\t\tระบุชื่อเป็น wishlist และ username เป็น app ตั้ง password เป็น app");
            System.out.println("---------\n");
        }
        return conn;
    }
    
}
