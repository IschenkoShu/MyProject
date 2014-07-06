/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.Form;
import java.awt.Color;
import javax.swing.ImageIcon;
import my.Directory.*;
/**
 *
 * @author Shu
 */
public class CalculationFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculationFrame
     */
    public CalculationFrame() {
        this.setIconImage(new ImageIcon(getClass().getResource("onto.png")).getImage());
        this.setTitle("Цена книги");
        this.size = new Size();
        this.page = new Page();
        this.cover = new Cover();
        this.lamination = new Lamination();
        this.binding = new Binding();
        this.coast = new Coast();
        initComponents();
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
        jLabel14 = new javax.swing.JLabel();
        CoastOne_Frame = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        CoastAll_Frame = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Weight_Frame = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Back_Frame = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Printing_Frame = new javax.swing.JTextField();
        Size_Frame = new javax.swing.JComboBox();
        Color_Frame = new javax.swing.JTextField();
        Black_Frame = new javax.swing.JTextField();
        Page_Frame = new javax.swing.JComboBox();
        Cover_Frame = new javax.swing.JComboBox();
        Lamination_Frame = new javax.swing.JComboBox();
        Binding_Frame = new javax.swing.JComboBox();
        Discount_Frame = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel14.setText("Цена за 1экз/руб");

        CoastOne_Frame.setEditable(false);
        CoastOne_Frame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CoastOne_Frame.setFocusable(false);
        CoastOne_Frame.setPreferredSize(new java.awt.Dimension(60, 20));
        CoastOne_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoastOne_FrameActionPerformed(evt);
            }
        });

        jLabel15.setText("Сумма руб");

        CoastAll_Frame.setEditable(false);
        CoastAll_Frame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CoastAll_Frame.setFocusable(false);
        CoastAll_Frame.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel16.setText("Вес тиража кг");

        Weight_Frame.setEditable(false);
        Weight_Frame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Weight_Frame.setFocusable(false);
        Weight_Frame.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel17.setText("Корешок мм");

        Back_Frame.setEditable(false);
        Back_Frame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Back_Frame.setFocusable(false);
        Back_Frame.setPreferredSize(new java.awt.Dimension(60, 20));

        jButton1.setText("Расчитать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CoastOne_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CoastAll_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Weight_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CoastOne_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CoastAll_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Weight_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        Printing_Frame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Printing_Frame.setToolTipText("");
        Printing_Frame.setPreferredSize(new java.awt.Dimension(60, 20));
        Printing_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Printing_FrameActionPerformed(evt);
            }
        });

        Size_Frame.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "140х200", "200х290" }));
        Size_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Size_FrameActionPerformed(evt);
            }
        });

        Color_Frame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Color_Frame.setPreferredSize(new java.awt.Dimension(60, 20));
        Color_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Color_FrameActionPerformed(evt);
            }
        });

        Black_Frame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Black_Frame.setMinimumSize(new java.awt.Dimension(6, 19));
        Black_Frame.setPreferredSize(new java.awt.Dimension(60, 20));

        Page_Frame.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Офсетная 60", "Офсетная 80", "Мелованная 130", "Мелованная 150", "Каландрированная 90", "Каландрированная 120", "Каландрированная 160" }));
        Page_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Page_FrameActionPerformed(evt);
            }
        });

        Cover_Frame.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Мелованная", "Каландрированная" }));
        Cover_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cover_FrameActionPerformed(evt);
            }
        });

        Lamination_Frame.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Нет", "Матовая", "Глянцевая" }));
        Lamination_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lamination_FrameActionPerformed(evt);
            }
        });

        Binding_Frame.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "КБС", "Скоба" }));
        Binding_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Binding_FrameActionPerformed(evt);
            }
        });

        Discount_Frame.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Discount_Frame.setPreferredSize(new java.awt.Dimension(60, 20));
        Discount_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Discount_FrameActionPerformed(evt);
            }
        });

        jLabel1.setText("Тираж*");

        jLabel2.setText("Формат*");

        jLabel3.setText("Цветных страниц*");

        jLabel4.setText("Ч/б страниц*");

        jLabel5.setText("Бумага страниц*");

        jLabel6.setText("Материал обложки*");

        jLabel7.setText("Ламинация*");

        jLabel8.setText("Переплет*");

        jLabel13.setText("Скидка (%)");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 50, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Printing_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Size_Frame, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Color_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Black_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Page_Frame, 0, 175, Short.MAX_VALUE)
                    .addComponent(Cover_Frame, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lamination_Frame, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Binding_Frame, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Discount_Frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Printing_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(Size_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Color_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Black_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Page_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cover_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(Lamination_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(Binding_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(Discount_Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jLayeredPane1.setLayer(Printing_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Size_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Color_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Black_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Page_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Cover_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Lamination_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Binding_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Discount_Frame, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Size_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Size_FrameActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_Size_FrameActionPerformed

    private void CoastOne_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoastOne_FrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoastOne_FrameActionPerformed

    private void Page_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Page_FrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Page_FrameActionPerformed

    private void Cover_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cover_FrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cover_FrameActionPerformed

    private void Lamination_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lamination_FrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lamination_FrameActionPerformed

    private void Binding_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Binding_FrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Binding_FrameActionPerformed

    private void Printing_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Printing_FrameActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_Printing_FrameActionPerformed

    private void Color_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Color_FrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Color_FrameActionPerformed

    private void Discount_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Discount_FrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Discount_FrameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String print = Printing_Frame.getText();
        String color = Color_Frame.getText();
        String black = Black_Frame.getText();
        String disc = Discount_Frame.getText(); 
        if (print.length() == 0){Printing_Frame.setBackground(Color.RED);}
        else  {
            printing = Integer.parseInt(print);
            if (printing<1){Printing_Frame.setBackground(Color.RED);}
            else Printing_Frame.setBackground(Color.white);
        }
        if (color.length() == 0){Color_Frame.setBackground(Color.RED);}
        else {
            color_page = Integer.parseInt(color);
            Color_Frame.setBackground(Color.white);
        }
        if (black.length() == 0){Black_Frame.setBackground(Color.RED);}
        else{
            black_page = Integer.parseInt(black);
            Black_Frame.setBackground(Color.white);
        }
        if (disc.length() != 0) discount = Integer.parseInt(disc);
        if (((color_page!=0)||(black_page!=0))&&(printing!=0)){
            Color_Frame.setBackground(Color.white);
            Black_Frame.setBackground(Color.white);
            s=size.ChoiceSize( Size_Frame.getSelectedIndex());
            coast_p1=page.ChoicePage( Page_Frame.getSelectedIndex());
            coast_c=cover.ChoiceCover( Cover_Frame.getSelectedIndex());
            coast_l=lamination.ChoiceLamination( Lamination_Frame.getSelectedIndex());
            coast_b=binding.ChoiceBinding( Binding_Frame.getSelectedIndex());             
            thickness=page.ChoicePageT( Page_Frame.getSelectedIndex());
            density =page.ChoicePageD( Page_Frame.getSelectedIndex());        
            back = coast.ThicknessBack(color_page, black_page, thickness);
            weight =coast.Weight(color_page, black_page, s, printing, density);
            sum_color = coast.ColorPage(color_page, printing, s);
            sum_black = coast.BlackPage(black_page, printing, s);
            coast_print = coast.CoastPrint(sum_color, sum_black, printing, coast_c, s);
            coast_paper = coast.CoastPage(sum_color, sum_black, coast_p1, coast_c, printing, s);
            coast_cut = coast.CoastCut(printing);
            coast_lamination = coast.CoastLamination(s, coast_l);
            coef = coast.Coef();
            coastB = coast.CoastBook(coast_print, coast_paper, coast_cut, coast_lamination, coef, printing, coast_b,discount);
            coastT = coast.CoastPrinting(coastB, printing);
            CoastOne_Frame.setText(String.valueOf(coastB));
            CoastAll_Frame.setText(String.valueOf(coastT));
            Weight_Frame.setText(String.valueOf(weight));
            Back_Frame.setText(String.valueOf(back));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Back_Frame;
    private javax.swing.JComboBox Binding_Frame;
    private javax.swing.JTextField Black_Frame;
    private javax.swing.JTextField CoastAll_Frame;
    private javax.swing.JTextField CoastOne_Frame;
    private javax.swing.JTextField Color_Frame;
    private javax.swing.JComboBox Cover_Frame;
    private javax.swing.JTextField Discount_Frame;
    private javax.swing.JComboBox Lamination_Frame;
    private javax.swing.JComboBox Page_Frame;
    private javax.swing.JTextField Printing_Frame;
    public javax.swing.JComboBox Size_Frame;
    private javax.swing.JTextField Weight_Frame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

int s;
double coast_p1;
double coast_p2;
double coast_c;
double coast_l;
double coast_b;
double thickness;
double density;
double weight;
double back;
double coast_print;
double coast_paper;
double coast_cut;
double coast_lamination;
double coef;
double coastB;
double coastT;
int printing=0;
int color_page=0;
int black_page=0;
int color_inset;
int inset_page;
int discount=0;
int sum_color;
int sum_black;
Binding binding;
Lamination lamination;
Cover cover;
Page page;
Size size;
Coast coast;
}
