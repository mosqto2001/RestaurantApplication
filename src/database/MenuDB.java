
package database;


import goods.Menu;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.impl.sql.catalog.SYSSEQUENCESRowFactory;
import restuarantInterface.MenuShow;

public class MenuDB implements MenuShow{
    
    
    public List<Menu> getAllMenu(){
        List<Menu> menus = new ArrayList<>();
        try(Connection conn = DatabaseConnection.getConnection(); Statement stm = conn.createStatement()){
            ResultSet rs = stm.executeQuery("SELECT * FROM APP.MENU");
            while(rs.next()){
                menus.add(menuRS(rs));
            }
        } catch (SQLException ex) {
            System.out.println("error");
        }
        return menus;
    }
    
    public Menu menuRS(ResultSet rs) throws SQLException{
        return new Menu(rs.getInt("menu_id"),rs.getString("menu_name"),rs.getDouble("menu_price"),rs.getString("menu_type"),rs.getString("menu_image"));
    }
    
    public int addMenu(Menu menu){
        String sql = "INSERT INTO APP.MENU VALUES (?,?,?,?,?)";
        int row=0;

        try(Connection conn = DatabaseConnection.getConnection(); PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setString(1, String.valueOf(menu.getMenu_id()));
            stm.setString(2, menu.getName());
            stm.setString(3, menu.getMenuType());
            stm.setString(4, String.valueOf(menu.getPrice()));
            stm.setString(5, menu.getImagePath());
            row = stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return row;
    }
    
    public int removeMenu(String name,String type,String price){
        System.out.println(name + type+price);
String sql = "DELETE FROM APP.MENU WHERE MENU_NAME = ? AND MENU_TYPE = ? AND MENU_PRICE = ?";
        int row=0;

        try(Connection conn = DatabaseConnection.getConnection(); PreparedStatement stm = conn.prepareStatement(sql)){
            stm.setString(1, name);
            stm.setString(2, type);
            stm.setString(3, price);
            row = stm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return row;
    }

    @Override
    public void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
