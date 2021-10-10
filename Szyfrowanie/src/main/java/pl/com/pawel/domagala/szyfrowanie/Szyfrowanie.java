/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.pawel.domagala.szyfrowanie;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author domag
 */
public class Szyfrowanie extends javax.swing.JFrame {

    /**
     * Creates new form Szyfrowanie
     */
    public Szyfrowanie() {
        initComponents();
    }

    boolean Kodowanie = true;
    char [] alfabet = {'Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A'};
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonKoduj = new javax.swing.JRadioButton();
        jRadioButtonDekoduj = new javax.swing.JRadioButton();
        jButtonLeft = new javax.swing.JButton();
        jButtonCenter = new javax.swing.JButton();
        jButtonRight = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLeft = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaRight = new javax.swing.JTextArea();
        jLabelUp = new javax.swing.JLabel();
        jLabelRight = new javax.swing.JLabel();
        jLabelLeft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButtonKoduj);
        jRadioButtonKoduj.setText("Kodowanie");
        jRadioButtonKoduj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonKodujActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonDekoduj);
        jRadioButtonDekoduj.setText("Dekodowanie");
        jRadioButtonDekoduj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDekodujActionPerformed(evt);
            }
        });

        jButtonLeft.setText("Zakoduj");
        jButtonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeftActionPerformed(evt);
            }
        });

        jButtonCenter.setText("Wczyść");
        jButtonCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCenterActionPerformed(evt);
            }
        });

        jButtonRight.setText("Zapisz");
        jButtonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRightActionPerformed(evt);
            }
        });

        jTextAreaLeft.setEditable(false);
        jTextAreaLeft.setColumns(20);
        jTextAreaLeft.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLeft);

        jTextAreaRight.setEditable(false);
        jTextAreaRight.setColumns(20);
        jTextAreaRight.setRows(5);
        jScrollPane3.setViewportView(jTextAreaRight);

        jLabelUp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUp.setText("Szyfrowanie");

        jLabelRight.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelLeft.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonKoduj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonDekoduj)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane1))
                    .addComponent(jLabelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jLabelUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonKoduj)
                            .addComponent(jRadioButtonDekoduj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLeft)
                            .addComponent(jButtonRight)
                            .addComponent(jButtonCenter))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRight, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonKodujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonKodujActionPerformed
        Kodowanie = true;
        Main();
    }//GEN-LAST:event_jRadioButtonKodujActionPerformed

    private void jRadioButtonDekodujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDekodujActionPerformed
        Kodowanie = false;
        Main();
    }//GEN-LAST:event_jRadioButtonDekodujActionPerformed

    private void jButtonCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCenterActionPerformed
        Clear();
    }//GEN-LAST:event_jButtonCenterActionPerformed

    private void jButtonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRightActionPerformed
        if(Kodowanie)Zapis();
        else Wczyt();
    }//GEN-LAST:event_jButtonRightActionPerformed

    private void jButtonLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeftActionPerformed
        Koduj();
    }//GEN-LAST:event_jButtonLeftActionPerformed

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
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szyfrowanie().setVisible(true);
            }
        });
    }
    private void Main(){
        if(Kodowanie){
            jButtonLeft.setText("Zakoduj");
            jButtonRight.setText("Zapisz");
            Clear();
            jLabelLeft.setText("Wpisz tekst");
            jLabelRight.setText("Zakodowany tekst");
            jTextAreaLeft.setEditable(true);
        }else{
            jButtonLeft.setText("Odkoduj");
            jButtonRight.setText("Wczytaj");
            Clear();
            jLabelLeft.setText("Zakodowany tekst");
            jLabelRight.setText("Odkodowany tekst");
        }
    }
    
    private void Clear(){
        jTextAreaLeft.setText("");
        jTextAreaRight.setText("");
    }
    
    private void Zapis(){
        File f = new File("zapis.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(f,false);
            fw.append(jTextAreaRight.getText());
            fw.close();
        } catch (Exception e) {
        }
    }
    
    private void Wczyt(){
        File f = new File("zapis.txt");
        try {
            String Tekst = "";
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                Tekst += Tekst+sc.nextLine();
            }
            jTextAreaLeft.setText(Tekst);
        } catch (Exception e) {
        }
    }
    
    private void Koduj(){
        String getText = jTextAreaLeft.getText();
        String Text = "";
        int a = 0;
            for(int i=0; i<getText.length(); i++){
                for(int j=0; j<alfabet.length; j++) if(alfabet[j]==getText.charAt(i))a=j;
                    if(Kodowanie)Text+=alfabet[a+1];
                    else Text+=alfabet[a-1];
            }
            jTextAreaRight.setText(Text.toLowerCase());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCenter;
    private javax.swing.JButton jButtonLeft;
    private javax.swing.JButton jButtonRight;
    private javax.swing.JLabel jLabelLeft;
    private javax.swing.JLabel jLabelRight;
    private javax.swing.JLabel jLabelUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonDekoduj;
    private javax.swing.JRadioButton jRadioButtonKoduj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextAreaLeft;
    private javax.swing.JTextArea jTextAreaRight;
    // End of variables declaration//GEN-END:variables
}
