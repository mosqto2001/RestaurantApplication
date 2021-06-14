
package goods;

import java.math.BigDecimal;

public class Menu {
    
    private int menu_id;
    private String name;
    private double price;
    private String imagePath;
    private String menuType;

    public Menu(int menu_id,String name, double price, String type, String imagePath) {
        this.name = name;
        this.price = price;
        this.menuType = type;
        this.imagePath = imagePath;
        this.menu_id = menu_id;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public int getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(int menu_id) {
        this.menu_id = menu_id;
    }


    @Override
    public String toString() {
        return "Menu{" + "name=" + name + ", price=" + price + ", imagePath=" + imagePath + ", menuType=" + menuType + '}';
    }
    
    
    
}
