/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantapp;

import database.MenuDB;
import goods.Menu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import restuarantInterface.MenuShow;

/**
 *
 * @author windows
 */
public class AdminMenu extends javax.swing.JFrame implements MenuShow {

    private int countData;
    private DefaultTableModel model;
    private String pathImage;
    private MenuDB menuDB;

    public AdminMenu() {

        int[] columnsWidth = {
            150, 250, 100, 100
        };
        initComponents();

        getContentPane().setBackground(new Color(250, 250, 250));
        int i = 0;
        for (int width : columnsWidth) {
            TableColumn column = table.getColumnModel().getColumn(i++);
            column.setMinWidth(width);
            column.setMaxWidth(width);
            column.setPreferredWidth(width);
        }

        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        table.getTableHeader().setFont(new Font("Mitr", Font.PLAIN, 12));
        table.getTableHeader().setOpaque(false);
        table.getTableHeader().setBackground(new Color(255, 223, 82));
        table.getTableHeader().setForeground(new Color(60, 60, 60));
        table.setBackground(Color.white);

        table.getColumn("Picture").setCellRenderer(new myRenderCell());

        model = (DefaultTableModel) table.getModel();
        DefaultTableCellRenderer columnCenter = new DefaultTableCellRenderer();
        columnCenter.setHorizontalAlignment(jLabel1.CENTER);
        table.getColumnModel().getColumn(2).setCellRenderer(columnCenter);
        table.getColumnModel().getColumn(3).setCellRenderer(columnCenter);

        setTableTextAlign();
        updateData();

        countData = table.getRowCount();
    }

    class myRenderCell implements TableCellRenderer {

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return (Component) value;
        }
    ;

    }
    
    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon myImage = new ImageIcon(ImagePath);
        Image img = myImage.getImage();
        Image newImg = img.getScaledInstance(150, 150, 150);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        button1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        foodName1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        foodPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        foodType = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminMenu");
        setBackground(new java.awt.Color(255, 255, 153));

        table.setBackground(new java.awt.Color(204, 0, 51));
        table.setFont(new java.awt.Font("Mitr Light", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Picture", "Name", "Type", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(204, 204, 204));
        table.setOpaque(false);
        table.setRowHeight(150);
        table.setSelectionBackground(new java.awt.Color(255, 223, 82));
        table.setSelectionForeground(new java.awt.Color(60, 60, 60));
        jScrollPane2.setViewportView(table);

        button1.setBackground(new java.awt.Color(255, 223, 82));
        button1.setFont(new java.awt.Font("Mitr Medium", 0, 11)); // NOI18N
        button1.setForeground(new java.awt.Color(60, 60, 60));
        button1.setText("Browse");
        button1.setToolTipText("");
        button1.setBorderPainted(false);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        jLabel1.setText("Image :");

        jLabel2.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        jLabel2.setText("Name :");

        foodName1.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        jLabel5.setText("Price :");

        foodPrice.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        jLabel6.setText("baht");

        jPanel2.setBackground(new java.awt.Color(255, 223, 82));

        jLabel7.setFont(new java.awt.Font("Mitr Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 60, 60));
        jLabel7.setText("MENU MANAGEMENT");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturantapp/home (2).png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_add.setBackground(new java.awt.Color(60, 223, 157));
        btn_add.setFont(new java.awt.Font("Mitr Medium", 0, 14)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("ADD");
        btn_add.setBorderPainted(false);
        btn_add.setIconTextGap(1);
        btn_add.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_del.setBackground(new java.awt.Color(255, 97, 126));
        btn_del.setFont(new java.awt.Font("Mitr Medium", 0, 14)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setText("DEL");
        btn_del.setBorderPainted(false);
        btn_del.setIconTextGap(1);
        btn_del.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        jLabel8.setText("Type :");

        foodType.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        foodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Drink", "Dessert" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1)
                                .addGap(153, 153, 153))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(foodName1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodPrice)
                            .addComponent(foodType, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(foodName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(button1)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btn_del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "png", "gif");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            pathImage = selectedFile.getAbsolutePath();

        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Selected");

    }//GEN-LAST:event_button1ActionPerformed
    }
    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        menuDB.addMenu(new Menu(countData++, foodName1.getText(), Double.valueOf(foodPrice.getText()), (String) foodType.getSelectedItem(), pathImage));
        updateData();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        int selectedRow = table.getSelectedRow();
        menuDB.removeMenu(String.valueOf(table.getValueAt(selectedRow, 1)), String.valueOf(table.getValueAt(selectedRow, 2)), String.valueOf((table.getValueAt(selectedRow, 3))));

        model.removeRow(table.getSelectedRow());
        countData--;
    }//GEN-LAST:event_btn_delActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        this.dispose();
        MenuPage menu = new MenuPage();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    public void updateData() {

        refreshData();

        menuDB = new MenuDB();
        List<Menu> menus = menuDB.getAllMenu();

        for (Menu item : menus) {
            System.out.println(item);
            Vector menu = new Vector();
            JLabel imgLabel = new JLabel();
            menu.add(imgLabel);
            menu.add(item.getName());
            menu.add(item.getMenuType());
            menu.add(item.getPrice());
            model.addRow(menu);
            imgLabel.setIcon(ResizeImage(item.getImagePath()));

        }
    }

    public void refreshData() {
        int row = model.getRowCount() - 1;
        for (int i = row; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    public void setTableTextAlign() {
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(2).setCellRenderer(center);
    }

    public int getCountData() {
        return countData;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton button1;
    private javax.swing.JTextField foodName1;
    private javax.swing.JTextField foodPrice;
    private javax.swing.JComboBox<String> foodType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
