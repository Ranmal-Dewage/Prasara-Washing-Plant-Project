/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventory;


import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ITP.Home;
import static ITP.Home.ViewMachine;
import Mainternance.AddMachine;
import shanuka.addChemical;
import shanuka.addMaterial;



/**
 *
 * @author it16170162
 */
public class inventory extends javax.swing.JPanel {

    /** Creates new form inventory */
    public inventory() {
        initComponents();

        style.setBackground(new Color(0,0,0,0));
        recipe.setBackground(new Color(0,0,0,0));
        chem.setBackground(new Color(0,0,0,0));
        material.setBackground(new Color(0,0,0,0));
        machine.setBackground(new Color(0,0,0,0));
        
        recipe.setVisible(false);
        chem.setVisible(false);
        material.setVisible(false);
        machine.setVisible(false);
        style.setVisible(true);
        

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        recipe = new javax.swing.JPanel();
        FBButton8 = new javax.swing.JButton();
        FBButton9 = new javax.swing.JButton();
        style = new javax.swing.JPanel();
        FBButton = new javax.swing.JButton();
        FBButton1 = new javax.swing.JButton();
        FBButton2 = new javax.swing.JButton();
        FBButton3 = new javax.swing.JButton();
        FBButton4 = new javax.swing.JButton();
        FBButton5 = new javax.swing.JButton();
        FBButton6 = new javax.swing.JButton();
        FBButton7 = new javax.swing.JButton();
        machine = new javax.swing.JPanel();
        FBButton14 = new javax.swing.JButton();
        FBButton15 = new javax.swing.JButton();
        chem = new javax.swing.JPanel();
        FBButton10 = new javax.swing.JButton();
        FBButton11 = new javax.swing.JButton();
        material = new javax.swing.JPanel();
        FBButton12 = new javax.swing.JButton();
        FBButton13 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(940, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recipes");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Style Data");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 120, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Machines");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Materials");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 110, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Chemicals");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 120, 30));

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(940, 480));
        jLayeredPane1.setName(""); // NOI18N
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        recipe.setBackground(new java.awt.Color(0, 0, 100));
        recipe.setPreferredSize(new java.awt.Dimension(500, 256));
        recipe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FBButton8.setBackground(new java.awt.Color(48, 48, 240));
        FBButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton8.setForeground(new java.awt.Color(255, 255, 255));
        FBButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/addrecipe.png"))); // NOI18N
        FBButton8.setText("Add Recipes");
        FBButton8.setToolTipText("");
        FBButton8.setBorder(null);
        FBButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton8.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton8.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton8ActionPerformed(evt);
            }
        });
        recipe.add(FBButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 120, 120));

        FBButton9.setBackground(new java.awt.Color(48, 48, 240));
        FBButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton9.setForeground(new java.awt.Color(255, 255, 255));
        FBButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/viewrecipe.png"))); // NOI18N
        FBButton9.setText("List Recipes");
        FBButton9.setToolTipText("");
        FBButton9.setBorder(null);
        FBButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton9.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton9.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton9ActionPerformed(evt);
            }
        });
        recipe.add(FBButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 120, 120));

        jLayeredPane1.add(recipe, "card6");

        style.setBackground(new java.awt.Color(0, 0, 100));
        style.setMinimumSize(new java.awt.Dimension(500, 256));
        style.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FBButton.setBackground(new java.awt.Color(48, 48, 240));
        FBButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton.setForeground(new java.awt.Color(255, 255, 255));
        FBButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/viewsize.png"))); // NOI18N
        FBButton.setText("List Sizes");
        FBButton.setToolTipText("");
        FBButton.setBorder(null);
        FBButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButtonActionPerformed(evt);
            }
        });
        style.add(FBButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 120, 120));

        FBButton1.setBackground(new java.awt.Color(48, 48, 240));
        FBButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton1.setForeground(new java.awt.Color(255, 255, 255));
        FBButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/addgarment.png"))); // NOI18N
        FBButton1.setText("Add Garment");
        FBButton1.setToolTipText("");
        FBButton1.setBorder(null);
        FBButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton1.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton1.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton1ActionPerformed(evt);
            }
        });
        style.add(FBButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 120, 120));

        FBButton2.setBackground(new java.awt.Color(48, 48, 240));
        FBButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton2.setForeground(new java.awt.Color(255, 255, 255));
        FBButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/viewstyle.png"))); // NOI18N
        FBButton2.setText("List Styles");
        FBButton2.setToolTipText("");
        FBButton2.setBorder(null);
        FBButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton2.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton2.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton2ActionPerformed(evt);
            }
        });
        style.add(FBButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 120, 120));

        FBButton3.setBackground(new java.awt.Color(48, 48, 240));
        FBButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton3.setForeground(new java.awt.Color(255, 255, 255));
        FBButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/addstyle.png"))); // NOI18N
        FBButton3.setText("Add Style");
        FBButton3.setToolTipText("");
        FBButton3.setBorder(null);
        FBButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton3.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton3.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton3ActionPerformed(evt);
            }
        });
        style.add(FBButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 120, 120));

        FBButton4.setBackground(new java.awt.Color(48, 48, 240));
        FBButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton4.setForeground(new java.awt.Color(255, 255, 255));
        FBButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/addsize.png"))); // NOI18N
        FBButton4.setText("Add Size");
        FBButton4.setToolTipText("");
        FBButton4.setBorder(null);
        FBButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton4.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton4.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton4ActionPerformed(evt);
            }
        });
        style.add(FBButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 120, 120));

        FBButton5.setBackground(new java.awt.Color(48, 48, 240));
        FBButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton5.setForeground(new java.awt.Color(255, 255, 255));
        FBButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/viewcolors.png"))); // NOI18N
        FBButton5.setText("List Colors");
        FBButton5.setToolTipText("");
        FBButton5.setBorder(null);
        FBButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton5.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton5.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton5ActionPerformed(evt);
            }
        });
        style.add(FBButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 120, 120));

        FBButton6.setBackground(new java.awt.Color(48, 48, 240));
        FBButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton6.setForeground(new java.awt.Color(255, 255, 255));
        FBButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/viewgarment.png"))); // NOI18N
        FBButton6.setText("List Garments");
        FBButton6.setToolTipText("");
        FBButton6.setBorder(null);
        FBButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton6.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton6.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton6ActionPerformed(evt);
            }
        });
        style.add(FBButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 120, 120));

        FBButton7.setBackground(new java.awt.Color(48, 48, 240));
        FBButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton7.setForeground(new java.awt.Color(255, 255, 255));
        FBButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/addcolors.png"))); // NOI18N
        FBButton7.setText("Add Color");
        FBButton7.setToolTipText("");
        FBButton7.setBorder(null);
        FBButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton7.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton7.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton7ActionPerformed(evt);
            }
        });
        style.add(FBButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 120, 120));

        jLayeredPane1.add(style, "card5");

        machine.setBackground(new java.awt.Color(0, 0, 100));
        machine.setPreferredSize(new java.awt.Dimension(500, 256));
        machine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FBButton14.setBackground(new java.awt.Color(48, 48, 240));
        FBButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton14.setForeground(new java.awt.Color(255, 255, 255));
        FBButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/viewmachine.png"))); // NOI18N
        FBButton14.setText("List Machines");
        FBButton14.setToolTipText("");
        FBButton14.setBorder(null);
        FBButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton14.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton14.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton14ActionPerformed(evt);
            }
        });
        machine.add(FBButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 120, 120));

        FBButton15.setBackground(new java.awt.Color(48, 48, 240));
        FBButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton15.setForeground(new java.awt.Color(255, 255, 255));
        FBButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/addmachine.png"))); // NOI18N
        FBButton15.setText("Add Machine");
        FBButton15.setToolTipText("");
        FBButton15.setBorder(null);
        FBButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton15.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton15.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton15ActionPerformed(evt);
            }
        });
        machine.add(FBButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 120, 120));

        jLayeredPane1.add(machine, "card4");

        chem.setBackground(new java.awt.Color(0, 0, 100));
        chem.setPreferredSize(new java.awt.Dimension(500, 256));
        chem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FBButton10.setBackground(new java.awt.Color(48, 48, 240));
        FBButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton10.setForeground(new java.awt.Color(255, 255, 255));
        FBButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/viewchemicals.png"))); // NOI18N
        FBButton10.setText("List Chemicals");
        FBButton10.setToolTipText("");
        FBButton10.setBorder(null);
        FBButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton10.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton10.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton10ActionPerformed(evt);
            }
        });
        chem.add(FBButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 120, 120));

        FBButton11.setBackground(new java.awt.Color(48, 48, 240));
        FBButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton11.setForeground(new java.awt.Color(255, 255, 255));
        FBButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/addchemicals.png"))); // NOI18N
        FBButton11.setText("Add Chemical");
        FBButton11.setToolTipText("");
        FBButton11.setBorder(null);
        FBButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton11.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton11.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton11ActionPerformed(evt);
            }
        });
        chem.add(FBButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 120, 120));

        jLayeredPane1.add(chem, "card2");

        material.setBackground(new java.awt.Color(0, 0, 100));
        material.setMinimumSize(new java.awt.Dimension(500, 256));
        material.setPreferredSize(new java.awt.Dimension(500, 256));
        material.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FBButton12.setBackground(new java.awt.Color(48, 48, 240));
        FBButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton12.setForeground(new java.awt.Color(255, 255, 255));
        FBButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/addmaterials.png"))); // NOI18N
        FBButton12.setText("Add Material");
        FBButton12.setToolTipText("");
        FBButton12.setBorder(null);
        FBButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton12.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton12.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton12ActionPerformed(evt);
            }
        });
        material.add(FBButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 120, 120));

        FBButton13.setBackground(new java.awt.Color(48, 48, 240));
        FBButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FBButton13.setForeground(new java.awt.Color(255, 255, 255));
        FBButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventoryImages/viewmaterials.png"))); // NOI18N
        FBButton13.setText("List Materials");
        FBButton13.setToolTipText("");
        FBButton13.setBorder(null);
        FBButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FBButton13.setMinimumSize(new java.awt.Dimension(100, 100));
        FBButton13.setPreferredSize(new java.awt.Dimension(100, 100));
        FBButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FBButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBButton13ActionPerformed(evt);
            }
        });
        material.add(FBButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 120, 120));

        jLayeredPane1.add(material, "card3");

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 480));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 10, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 10, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 10, 30));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 10, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ITP/Images/IMG-20180315-WA0017.jpg"))); // NOI18N
        jLabel7.setText("jLabel1");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 480));
    }// </editor-fold>//GEN-END:initComponents
    void mouseEntered(JLabel lable) {
        lable.setForeground(new Color(200, 200, 150));
    }
    
    void mouseExited(JLabel lable) {
        lable.setForeground(new Color(255, 255, 255));
    }
    
    void mouseClicked(JPanel panel) {
        recipe.setVisible(false);
        chem.setVisible(false);
        material.setVisible(false);
        machine.setVisible(false);
        style.setVisible(false);
        
        panel.setVisible(true);
    }
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        mouseClicked(style);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        mouseClicked(machine);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        mouseClicked(material);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    mouseClicked(chem);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    mouseClicked(recipe);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        mouseEntered(jLabel3);
        
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        mouseEntered(jLabel4);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        mouseEntered(jLabel5);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        mouseEntered(jLabel6);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        mouseEntered(jLabel2);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        mouseExited(jLabel3);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        mouseExited(jLabel4);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        mouseExited(jLabel5);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        mouseExited(jLabel6);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        mouseExited(jLabel2);
    }//GEN-LAST:event_jLabel2MouseExited

    private void FBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButtonActionPerformed
        // TODO add your handling code here:
        Home.i.setVisible(false);
        Home.viewStyle.setVisible(false);
        Home.viewColor.setVisible(false);
        Home.vGarments.setVisible(false);
        Home.viewRecipe.setVisible(false);
        Home.vSize.setVisible(true);
    }//GEN-LAST:event_FBButtonActionPerformed

    private void FBButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            addGarments a = new addGarments();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(viewGarments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FBButton1ActionPerformed

    private void FBButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton2ActionPerformed
        // TODO add your handling code here:
        Home.i.setVisible(false);
        Home.viewRecipe.setVisible(false);
        Home.viewColor.setVisible(false); 
        Home.vGarments.setVisible(false);
        Home.vSize.setVisible(false);
        Home.viewStyle.setVisible(true);
    }//GEN-LAST:event_FBButton2ActionPerformed

    private void FBButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton3ActionPerformed
        // TODO add your handling code here:
        addStyle a = new addStyle();
        a.setVisible(true);
    }//GEN-LAST:event_FBButton3ActionPerformed

    private void FBButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton4ActionPerformed
        try {
            // TODO add your handling code here:
            addSize a = new addSize();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FBButton4ActionPerformed

    private void FBButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton5ActionPerformed
        // TODO add your handling code here:
        Home.i.setVisible(false);
        Home.viewStyle.setVisible(false);
        Home.viewRecipe.setVisible(false);
        Home.vSize.setVisible(false);
        Home.vGarments.setVisible(false); 
        Home.viewColor.setVisible(true);
          
    }//GEN-LAST:event_FBButton5ActionPerformed

    private void FBButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton6ActionPerformed
        // TODO add your handling code here:
        Home.i.setVisible(false);
        Home.viewStyle.setVisible(false);
        Home.viewRecipe.setVisible(false);
        Home.vSize.setVisible(false);
        Home.viewColor.setVisible(false);
        Home.vGarments.setVisible(true);
    }//GEN-LAST:event_FBButton6ActionPerformed

    private void FBButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton7ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            addColor a = new addColor();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FBButton7ActionPerformed

    private void FBButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton8ActionPerformed
        // TODO add your handling code here:
        addRecipe a = new addRecipe();
        a.setVisible(true);
    }//GEN-LAST:event_FBButton8ActionPerformed

    private void FBButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton9ActionPerformed
        // TODO add your handling code here:
        Home.i.setVisible(false);
        Home.viewStyle.setVisible(false);
        Home.viewColor.setVisible(false);
        Home.vGarments.setVisible(false);
        Home.vSize.setVisible(false);
        Home.viewRecipe.setVisible(true);
    }//GEN-LAST:event_FBButton9ActionPerformed

    private void FBButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton10ActionPerformed
        Home.i.setVisible(false);
        Home.chemical.setVisible(true);
    }//GEN-LAST:event_FBButton10ActionPerformed

    private void FBButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton11ActionPerformed
        try {
            addChemical a = new addChemical();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_FBButton11ActionPerformed

    private void FBButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton12ActionPerformed
        addMaterial a = new addMaterial();
        a.setVisible(true);
    }//GEN-LAST:event_FBButton12ActionPerformed

    private void FBButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton13ActionPerformed
        Home.i.setVisible(false);
        Home.material.setVisible(true);
    }//GEN-LAST:event_FBButton13ActionPerformed

    private void FBButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton14ActionPerformed
        Home.i.setVisible(false);
        Home.ViewMachine.setVisible(true);
    }//GEN-LAST:event_FBButton14ActionPerformed

    private void FBButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBButton15ActionPerformed
        AddMachine a = new AddMachine();
        a.setVisible(true);
    }//GEN-LAST:event_FBButton15ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FBButton;
    private javax.swing.JButton FBButton1;
    private javax.swing.JButton FBButton10;
    private javax.swing.JButton FBButton11;
    private javax.swing.JButton FBButton12;
    private javax.swing.JButton FBButton13;
    private javax.swing.JButton FBButton14;
    private javax.swing.JButton FBButton15;
    private javax.swing.JButton FBButton2;
    private javax.swing.JButton FBButton3;
    private javax.swing.JButton FBButton4;
    private javax.swing.JButton FBButton5;
    private javax.swing.JButton FBButton6;
    private javax.swing.JButton FBButton7;
    private javax.swing.JButton FBButton8;
    private javax.swing.JButton FBButton9;
    private javax.swing.JPanel chem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel machine;
    private javax.swing.JPanel material;
    private javax.swing.JPanel recipe;
    private javax.swing.JPanel style;
    // End of variables declaration//GEN-END:variables

}
