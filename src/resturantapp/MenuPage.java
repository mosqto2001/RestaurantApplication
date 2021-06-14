/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturantapp;

import Bill.Bill;
import com.mysql.cj.util.StringUtils;
import database.MenuDB;
import goods.Menu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
public class MenuPage extends javax.swing.JFrame implements MenuShow {

    private DefaultTableModel model;
    private DefaultTableModel orderedModel;
    private String pathImage;
    private MenuDB menuDB;
    private List<Menu> menus;
    private List<Menu> orderedMenu;
    DecimalFormat decimalFormat;

    public MenuPage() {

        orderedMenu = new ArrayList<>();
        int[] columnsWidth = {
            100, 300, 100, 100
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

        int[] columnsWidth2 = {
            300, 150, 150
        };

        getContentPane().setBackground(new Color(250, 250, 250));
        i = 0;
        for (int width : columnsWidth2) {
            TableColumn column = table_ordered.getColumnModel().getColumn(i++);
            column.setMinWidth(width);
            column.setMaxWidth(width);
            column.setPreferredWidth(width);
        }

        ((DefaultTableCellRenderer) table_ordered.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        table_ordered.getTableHeader().setFont(new Font("Mitr", Font.PLAIN, 12));
        table_ordered.getTableHeader().setOpaque(false);
        table_ordered.getTableHeader().setBackground(new Color(255, 223, 82));
        table_ordered.getTableHeader().setForeground(new Color(60, 60, 60));
        table_ordered.setBackground(Color.white);

        DefaultTableCellRenderer columnCenter = new DefaultTableCellRenderer();
        columnCenter.setHorizontalAlignment(jLabel1.CENTER);
        table.getColumnModel().getColumn(3).setCellRenderer(columnCenter);
        table_ordered.getColumnModel().getColumn(1).setCellRenderer(columnCenter);
        table_ordered.getColumnModel().getColumn(2).setCellRenderer(columnCenter);

        model = (DefaultTableModel) table.getModel();
        orderedModel = (DefaultTableModel) table_ordered.getModel();

        setTableTextAlign();
        updateData();

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
        order_add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        order_amount = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        order_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_ordered = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        order_totalprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        order_button1 = new javax.swing.JButton();
        order_del = new javax.swing.JButton();
        order_button2 = new javax.swing.JButton();

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
        setTitle("MHEE SHABU MENU");
        setBackground(new java.awt.Color(255, 255, 153));

        order_add.setBackground(new java.awt.Color(60, 223, 157));
        order_add.setFont(new java.awt.Font("Mitr Medium", 0, 14)); // NOI18N
        order_add.setForeground(new java.awt.Color(255, 255, 255));
        order_add.setText("ADD");
        order_add.setBorder(null);
        order_add.setBorderPainted(false);
        order_add.setIconTextGap(1);
        order_add.setMargin(new java.awt.Insets(2, 2, 2, 2));
        order_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_addActionPerformed(evt);
            }
        });

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
        table.setRowHeight(100);
        table.setSelectionBackground(new java.awt.Color(255, 223, 82));
        table.setSelectionForeground(new java.awt.Color(60, 60, 60));
        table.setShowGrid(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel2.setBackground(new java.awt.Color(255, 223, 82));

        jLabel7.setFont(new java.awt.Font("Mitr Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 60, 60));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MENU");

        jLabel8.setFont(new java.awt.Font("Mitr Medium", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 60, 60));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MHEE SHABU");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturantapp/user (3).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        order_amount.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        order_amount.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 99.0d, 1.0d));
        order_amount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                order_amountStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        jLabel2.setText("Amount :");

        jLabel3.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        jLabel3.setText("Price :");

        order_price.setEditable(false);
        order_price.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        order_price.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        order_price.setText("0.0");

        jLabel6.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        jLabel6.setText("baht");

        jLabel9.setFont(new java.awt.Font("Mitr Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 60, 60));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("ORDER LIST");

        table_ordered.setBackground(new java.awt.Color(204, 0, 51));
        table_ordered.setFont(new java.awt.Font("Mitr Light", 0, 18)); // NOI18N
        table_ordered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "amount", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_ordered.setGridColor(new java.awt.Color(204, 204, 204));
        table_ordered.setRowHeight(50);
        table_ordered.setSelectionBackground(new java.awt.Color(255, 223, 82));
        table_ordered.setSelectionForeground(new java.awt.Color(60, 60, 60));
        table_ordered.setShowGrid(true);
        jScrollPane3.setViewportView(table_ordered);

        jLabel4.setFont(new java.awt.Font("Mitr Medium", 0, 12)); // NOI18N
        jLabel4.setText("Total Price :");

        order_totalprice.setEditable(false);
        order_totalprice.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        order_totalprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        order_totalprice.setText("0.0");

        jLabel10.setFont(new java.awt.Font("Mitr Light", 0, 12)); // NOI18N
        jLabel10.setText("baht");

        order_button1.setBackground(new java.awt.Color(60, 223, 157));
        order_button1.setFont(new java.awt.Font("Mitr Medium", 0, 14)); // NOI18N
        order_button1.setForeground(new java.awt.Color(255, 255, 255));
        order_button1.setText("ORDER");
        order_button1.setBorder(null);
        order_button1.setBorderPainted(false);
        order_button1.setIconTextGap(1);
        order_button1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        order_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_button1ActionPerformed(evt);
            }
        });

        order_del.setBackground(new java.awt.Color(255, 97, 126));
        order_del.setFont(new java.awt.Font("Mitr Medium", 0, 14)); // NOI18N
        order_del.setForeground(new java.awt.Color(255, 255, 255));
        order_del.setText("DEL");
        order_del.setBorder(null);
        order_del.setBorderPainted(false);
        order_del.setIconTextGap(1);
        order_del.setMargin(new java.awt.Insets(2, 2, 2, 2));
        order_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_delActionPerformed(evt);
            }
        });

        order_button2.setBackground(new java.awt.Color(255, 97, 126));
        order_button2.setFont(new java.awt.Font("Mitr Medium", 0, 14)); // NOI18N
        order_button2.setForeground(new java.awt.Color(255, 255, 255));
        order_button2.setText("CANCEL");
        order_button2.setBorder(null);
        order_button2.setBorderPainted(false);
        order_button2.setIconTextGap(1);
        order_button2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        order_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(order_totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(order_add, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(order_price, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(order_del, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(order_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(order_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(order_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(order_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(order_add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(order_del, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(order_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(order_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(order_totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void order_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_addActionPerformed
        Menu menu = menus.get(table.getSelectedRow());
        orderedMenu.add(menu);

        updateOrderedData(Double.valueOf(order_amount.getValue().toString()));
        order_totalprice.setText(getOrderTotalPrice());
    }//GEN-LAST:event_order_addActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        order_price.setText(getOrderPrice());
    }//GEN-LAST:event_tableMouseClicked

    private void order_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_button1ActionPerformed
        if (orderedModel.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "Don't have any order.");
            return;
        }
        BillWriter bw = new BillWriter();
        try {
            bw.BillWriter();
        } catch (IOException ex) {
            Logger.getLogger(MenuPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        resetData(orderedModel);
        orderedMenu = new ArrayList<>();
        order_totalprice.setText(getOrderTotalPrice());
        JOptionPane.showMessageDialog(null, "Order successfully");

    }//GEN-LAST:event_order_button1ActionPerformed

    private void order_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_delActionPerformed
        orderedMenu.remove(table_ordered.getSelectedRow());
        orderedModel.removeRow(table_ordered.getSelectedRow());
        order_totalprice.setText(getOrderTotalPrice());
    }//GEN-LAST:event_order_delActionPerformed

    private void order_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_button2ActionPerformed
        resetData(orderedModel);
        orderedMenu = new ArrayList<>();
        order_totalprice.setText(getOrderTotalPrice());
    }//GEN-LAST:event_order_button2ActionPerformed

    private void order_amountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_order_amountStateChanged
        order_price.setText(getOrderPrice());

    }//GEN-LAST:event_order_amountStateChanged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        AdminLogin admin = new AdminLogin();
        admin.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    public void updateData() {
        resetData(model);

        menuDB = new MenuDB();
        menus = menuDB.getAllMenu();

        for (Menu item : menus) {
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

    public void updateOrderedData(double amount) {
        Menu item = orderedMenu.get(orderedModel.getRowCount());
        Vector menu = new Vector();
        menu.add(item.getName());
        menu.add((int) amount);
        menu.add(item.getPrice() * amount);
        orderedModel.addRow(menu);

    }

    public void resetData(DefaultTableModel model) {
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

    public String getOrderPrice() {
        return String.valueOf((menus.get(table.getSelectedRow()).getPrice() * (double) order_amount.getValue()));
    }

    public String getOrderTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < table_ordered.getRowCount(); i++) {
            totalPrice += Double.valueOf(table_ordered.getValueAt(i, 2).toString());
        }

        return String.valueOf(totalPrice);

    }

    private class BillWriter {

        public void BillWriter() throws IOException {
            FileWriter bill = new FileWriter("Bill.txt");
            BufferedWriter bw = new BufferedWriter(bill);

            bw.write("******************************************************\n");
            bw.write("|                                    Mhee Shabu                                  |\n");
            bw.write("******************************************************\n\n");

            for (int i = 0; i < table_ordered.getRowCount(); i++) {
                String name = (String) table_ordered.getValueAt(i, 0).toString();
                String amount = table_ordered.getValueAt(i, 1).toString();
                String price = (String) table_ordered.getValueAt(i, 2).toString();

                bw.write(name + " x " + amount + "  :  ");
                bw.write(price + "   baht\n");
            }

            bw.write("\n******************************************************\n");
            bw.write("Total Price :\t\t" + order_totalprice.getText() + "   baht");

            bw.close();
            bill.close();

        }
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
                new MenuPage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton order_add;
    private javax.swing.JSpinner order_amount;
    private javax.swing.JButton order_button1;
    private javax.swing.JButton order_button2;
    private javax.swing.JButton order_del;
    private javax.swing.JTextField order_price;
    private javax.swing.JTextField order_totalprice;
    private javax.swing.JTable table;
    private javax.swing.JTable table_ordered;
    // End of variables declaration//GEN-END:variables

}
