/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainternance;

import ITP.Home;

/**
 *
 * @author it16175358
 */

import inventory.dbCon;
//import inventory.viewGarments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author it16175280
 */
public class ViewService extends javax.swing.JPanel {

    /**
     * Creates new form ViewService
     */
    dbCon db = new dbCon();
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int row = -1;
    
    int tot;
    int maxPages;
    int pg=1;
    int lim=15;
    int offset=0;
    
    
    
    public ViewService() throws SQLException{
        initComponents();
        
        
        edit.setVisible(false);
        delete.setVisible(false);
        
       con= db.ConnectDB();
        
        updateMax("SELECT COUNT(*) AS count FROM service");
        addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabmachine = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        page = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        limit1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(940, 480));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Service");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 372, -1));

        jtabmachine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Service No", "Machine Ref no", "Type of service", "Equipment name", "Date Of  Service"
            }
        ));
        jtabmachine.setRowHeight(35);
        jtabmachine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabmachineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabmachine);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 910, 260));

        search.setText("search Service#");
        search.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchCaretUpdate(evt);
            }
        });
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 30));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 920, 13));

        jButton5.setBackground(new java.awt.Color(71, 71, 116));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-end-14 (2).png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 30, 30));

        jButton8.setBackground(new java.awt.Color(71, 71, 116));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-end-filled-14.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 30, 30));

        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 30, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("/");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 30, 30));

        page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageActionPerformed(evt);
            }
        });
        jPanel2.add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 30, 30));

        jButton7.setBackground(new java.awt.Color(71, 71, 116));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-skip-to-start-14.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 30, 30));

        jButton6.setBackground(new java.awt.Color(71, 71, 116));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-skip-to-start-14 (1).png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 30, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Showing");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 30));

        limit1.setEditable(true);
        limit1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15" }));
        limit1.setSelectedIndex(2);
        limit1.setAlignmentX(5.0F);
        limit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limit1ActionPerformed(evt);
            }
        });
        jPanel2.add(limit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 60, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("results per page");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, 30));

        jButton1.setBackground(new java.awt.Color(0, 179, 50));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setIconTextGap(10);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 120, 30));

        jButton2.setBackground(new java.awt.Color(0, 2, 240));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+  Add New Service");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 180, 30));

        jButton3.setBackground(new java.awt.Color(219, 76, 13));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ITP/Images/Back.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 100, -1));

        edit.setBackground(new java.awt.Color(0, 0, 255));
        edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, -1, 30));

        delete.setBackground(new java.awt.Color(255, 0, 0));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 100, 30));

        print.setBackground(new java.awt.Color(71, 71, 116));
        print.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ITP/Images/Print.png"))); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ITP/Images/IMG-20180315-WA0017.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 480));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    void addTable(String query) {
        try {
            ResultSet rs = con.createStatement().executeQuery(query);
            
            DefaultTableModel model = new DefaultTableModel(new Object[]{"serviceno","machinerefno","typeofservice","equipmentname","dateofservice"}, 0);
            while (rs.next()) {
                String serno = rs.getString("serviceno");
                String machrefno = rs.getString("machinerefno");
                String types = rs.getString("typeofservice");
                String equiname = rs.getString("equipmentname");
                String Date = rs.getString("dateofservice");
                
                Object[] row = {serno,machrefno,types,equiname,Date};                   
                model.addRow(row);                   
            }
            jtabmachine.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    void search() throws SQLException{
        String sh = search.getText();
        if(sh.equals("")){
            updateMax("SELECT COUNT(*) AS count FROM service");
            addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
        }
        else{
            String q = "SELECT * FROM service WHERE serviceno like '%"+sh+"%' or machinerefno like '%"+sh+"%'";
            addTable(q);
        }
    }
    
    void updateMax(String q) throws SQLException{
        ResultSet rs = con.createStatement().executeQuery(q);
        rs.next();
        tot = rs.getInt("count");
        
        int i = tot%lim;
        if(i>0){
            maxPages = tot/lim + 1;
        }
        else{
            maxPages = tot/lim;
        }
        total.setText(Integer.toString(maxPages));
        
        if(pg>maxPages){
            pg = maxPages;
            page.setText(Integer.toString(pg));
            offset = (pg-1)*lim;
        }
        if(maxPages==1){
            pg = 1;
            page.setText(Integer.toString(pg));
            offset = (pg-1)*lim;
        }
    }
    
    
    private void jtabmachineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabmachineMouseClicked
        // TODO add your handling code here:
        edit.setVisible(true);
        delete.setVisible(true);
    }//GEN-LAST:event_jtabmachineMouseClicked

    private void searchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchCaretUpdate

         try {
            // TODO add your handling code here:
            search();
        } catch (SQLException ex) {
            Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchCaretUpdate

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        search.setText(null);
    }//GEN-LAST:event_searchMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        pg = maxPages;
        page.setText(Integer.toString(pg));
        offset = (pg-1)*lim;
        try {
            updateMax("SELECT COUNT(*) AS count FROM service");
            addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
        } catch (SQLException ex) {
            Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

          if(pg<maxPages){
            pg++;
            page.setText(Integer.toString(pg));
        }
        offset = (pg-1)*lim;
        try {
            updateMax("SELECT COUNT(*) AS count FROM service");
            addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
        } catch (SQLException ex) {
            Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void pageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageActionPerformed
        // TODO add your handling code here:
          int p = Integer.parseInt((String)page.getText());
        if (p>maxPages || p<1){}
        else{
            try {
                pg = p;
                offset = (pg-1)*lim;
                updateMax("SELECT COUNT(*) AS count FROM service");
                addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
            } catch (SQLException ex) {
                Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_pageActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(pg>1){
            pg--;
            page.setText(Integer.toString(pg));
        }
        offset = (pg-1)*lim;
        try {
            updateMax("SELECT COUNT(*) AS count FROM service");
            addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
        } catch (SQLException ex) {
            Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

          pg = 1;
        page.setText(Integer.toString(pg));
        offset = (pg-1)*lim;
        try {
            updateMax("SELECT COUNT(*) AS count FROM service");
            addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
        } catch (SQLException ex) {
            Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void limit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limit1ActionPerformed
        // TODO add your handling code here:
         if(limit1.getSelectedItem().equals("")){
            lim = 15;
            limit1.setSelectedItem("15");
            pg = 1;
            page.setText(Integer.toString(pg));
            offset = (pg-1)*lim;
            try {
                updateMax("SELECT COUNT(*) AS count FROM service");
                addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
            } catch (SQLException ex) {
                Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            lim = Integer.parseInt((String) limit1.getSelectedItem());
            pg = 1;
            page.setText(Integer.toString(pg));
            offset = (pg-1)*lim;
            try {
                updateMax("SELECT COUNT(*) AS count FROM service");
                addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
            } catch (SQLException ex) {
                Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_limit1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AddService a = null;
        try {
            a = new AddService();
        } catch (SQLException ex) {
            Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Home.ViewService.setVisible(false);
        Home.Maintenance.setVisible(true); 

    }//GEN-LAST:event_jButton3ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        int r = jtabmachine.getSelectedRow();
        String serno = (String) jtabmachine.getValueAt(r, 0);
        String machrefno = (String) jtabmachine.getValueAt(r, 1);
        String types = (String) jtabmachine.getValueAt(r, 2);
        String equiname = (String) jtabmachine.getValueAt(r, 3);
        String Date = (String) jtabmachine.getValueAt(r, 4);
       // String status = (String) jtabmachine.getValueAt(r, 5);
        
        AddService a = null;
        try {
            a = new AddService(serno,machrefno,types,equiname,Date);
        } catch (SQLException ex) {
            Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int r = jtabmachine.getSelectedRow();
        String serno = (String) jtabmachine.getValueAt(r, 0);
        String machrefno = (String) jtabmachine.getValueAt(r, 1);
        String types = (String) jtabmachine.getValueAt(r, 2);
        String equiname = (String) jtabmachine.getValueAt(r, 3);
        String Date = (String) jtabmachine.getValueAt(r, 4);
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Service will be deleted","Warning",dialogButton);
        
        if(dialogResult==0){
            try {
                con.prepareStatement("DELETE FROM service WHERE serviceno = '"+serno+"' AND machinerefno ='"+machrefno+"' AND typeofservice = '"+types+"'AND equipmentname ='"+equiname+"' AND dateofservice = '"+Date+"'").execute();
                JOptionPane.showMessageDialog (null, "service deleted", "Done", JOptionPane.INFORMATION_MESSAGE);
                updateMax("SELECT COUNT(*) AS count FROM service");
                addTable("SELECT * FROM service LIMIT "+lim+" OFFSET "+offset+"");
            } catch (SQLException ex) {
                Logger.getLogger(ViewService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        Home.Report(jtabmachine, "Service List","E:\\Reports\\servicelist.pdf");
    }//GEN-LAST:event_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jtabmachine;
    private javax.swing.JComboBox<String> limit1;
    private javax.swing.JTextField page;
    private javax.swing.JButton print;
    private javax.swing.JTextField search;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

     public void loadData() {
       
   try {

            DefaultTableModel dtm = (DefaultTableModel) jtabmachine.getModel();

            dtm.setRowCount(0);

            String sql = "SELECT * FROM service ";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Vector v = new Vector();

                v.add(rs.getString("serviceno"));
                v.add(rs.getString("machinerefno"));
                v.add(rs.getString("typeofservice"));
                v.add(rs.getString("equipmentname"));
                v.add(rs.getString("dateofservice"));
                

                dtm.addRow(v);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

}