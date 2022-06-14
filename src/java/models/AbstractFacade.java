/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public abstract class AbstractFacade<T> {
    //AbstractFacade là lớp có tham số, <T> là tên tham số

    static String url = "jdbc:sqlserver://localhost;databaseName=Toyz;user=sa;password=proladat102";

    public AbstractFacade() {
        try {
            //Loading a driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbstractFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //CRUD = create + read + update + delete
    protected abstract List<T> readAll(Connection con) throws SQLException;
    protected abstract void create(Connection con, T t) throws SQLException;
    protected abstract T read(Connection con, Object id) throws SQLException;
    protected abstract void update(Connection con, T t) throws SQLException;
    protected abstract void delete(Connection con, Object id) throws SQLException;
    //khi chúng ta lập trình không được
    //vì không đủ thông tin thì chúng ta khai báo phương thức đó là Trừu tượng

    public List<T> readAll() {
        List<T> list = new ArrayList<>();
        try {
            //Loading a driver
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Connecting to a database
            Connection con = DriverManager.getConnection(url);
            //Executing the stm
            list = readAll(con);
            //Closing the connection
            con.close();
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return list;
    }

    public void create(T t) {

        try {
            //Loading a driver
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Connecting to a database
            Connection con = DriverManager.getConnection(url);
            //Executing the stm
            create(con, t);
            //Closing the connection
            con.close();
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

    }
    //doc 1 mau tin cua table T
    public T read(Object id) {
        T t = null;
        try {
            //Connecting to a database
            Connection con = DriverManager.getConnection(url);
            //Executing the stm
            t = read(con, id);
            //Closing the connection
            con.close();
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        return t;
    }

    public void update(T t) {
        try {
            //Connecting to a database
            Connection con = DriverManager.getConnection(url);
            //Executing the stm
            update(con, t);
            //Closing the connection
            con.close();
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void delete(Object id) {
        try {
            //Connecting to a database
            Connection con = DriverManager.getConnection(url);
            //Executing the stm
            delete(con, id);
            //Closing the connection
            con.close();
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

}
