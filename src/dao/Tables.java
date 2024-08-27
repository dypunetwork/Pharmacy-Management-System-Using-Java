/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 *
 * @author nagaw
 */
public class Tables {

    public static void main(String args[]) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("CREATE TABLE IF NOT EXISTS appuser("
                    + "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, "
                    + "userRole VARCHAR(200), "
                    + "name VARCHAR(200), "
                    + "dob VARCHAR(50), "
                    + "mobileNumber VARCHAR(50), "
                    + "email VARCHAR(200), "
                    + "username VARCHAR(200), "
                    + "password VARCHAR(50), "
                    + "address VARCHAR(200))"
            );
            st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','21-03-2003','7397987460','nagawadetanmay67@gmail.com','admin','admin','India' ) ");
            st.executeUpdate("create table IF NOT EXISTS medicine(medicine_pk int AUTO_INCREMENT primary key, uniqueId varchar(200),name varchar(200),companyName varchar(200),quantity bigint,price bigint)");
            st.executeUpdate("create table IF NOT EXISTS bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
