/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class BrandFacade extends AbstractFacade<Brand> {

    @Override
    protected List<Brand> readAll(Connection con) throws SQLException {
        List<Brand> list = new ArrayList<>();
        //Creating and executing JDBC statements
        String sql = "select * from Brand";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        //Loading data into the list            
        while (rs.next()) {
            Brand brand = new Brand();
            brand.setId(rs.getString("id"));
            brand.setName(rs.getString("name"));

            list.add(brand);
        }
        return list;
    }

    @Override
    protected void create(Connection con, Brand brand) throws SQLException {
        try {
            //để insert
            String sql = "insert into Brand values(?, ?)";
            //tạo đối tượng của interface
            PreparedStatement stm = con.prepareStatement(sql);
            //gán giá trị cho tham số từ 1 => n
            stm.setString(1, brand.getId());
            stm.setString(2, brand.getName());
            stm.executeUpdate();
        } catch (SQLException ex) {
            //throw không có "s": ném ra 1 ngoại lệ
            throw ex;
        }
    }

    @Override
    protected Brand read(Connection con, Object id) throws SQLException {
        Brand brand = null;
        String sql = "select * from Brand where id = ?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, id.toString());
        ResultSet rs = stm.executeQuery();

        if (rs.next()) {
            brand = new Brand();
            brand.setId(rs.getString("id"));
            brand.setName(rs.getString("name"));
        }
        return brand;
    }

    @Override
    protected void update(Connection con, Brand brand) throws SQLException {
        String sql = "update Brand set name=? where id=?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, brand.getName());
        stm.setString(2, brand.getId());
        stm.executeUpdate();
    }

    @Override
    protected void delete(Connection con, Object id) throws SQLException {
        String sql = "delete from Brand where id=?";
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setString(1, id.toString());
        stm.executeUpdate();
    }

}
