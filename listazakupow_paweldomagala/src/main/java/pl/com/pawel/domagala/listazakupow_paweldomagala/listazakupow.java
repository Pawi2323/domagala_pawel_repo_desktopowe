/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.pawel.domagala.listazakupow_paweldomagala;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 *
 * @author domag
 */
public class listazakupow extends javax.swing.JFrame {

    /**
     * Creates new form listazakupow
     */
    public listazakupow() {
        initComponents();
        addKeyListenerToTFcoKupiles();
        addKeyListenerTojTFWpiszWartosc();
        addKeyListenerTojTFdata();
        addTooltipToElements();
        filljComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelWprowadzZakupy = new javax.swing.JPanel();
        jLabelCoKupiles = new javax.swing.JLabel();
        jLabelWpiszWartosc = new javax.swing.JLabel();
        jLabelTypProduktu = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jTFCoKupiles = new javax.swing.JTextField();
        jTFWpiszWartosc = new javax.swing.JTextField();
        jComboBoxTypProduktu = new javax.swing.JComboBox<>();
        jTFData = new javax.swing.JTextField();
        jLabelDzisiejszeZakupy = new javax.swing.JLabel();
        jButtonZapisz = new javax.swing.JButton();
        jLabelWydatkiDzis = new javax.swing.JLabel();
        jLabelWydatkiTydzien = new javax.swing.JLabel();
        jTextFieldWydatkiDzien = new javax.swing.JTextField();
        jTextFieldWydatkiTydzien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jPanelListaZakupow = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCoKupiles.setText("Wpisz co kupiłeś");

        jLabelWpiszWartosc.setText("Wpisz wartość");

        jLabelTypProduktu.setText("Typ zakupionego produktu");

        jLabelData.setText("Data zakupu");

        jTFCoKupiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCoKupilesActionPerformed(evt);
            }
        });

        jComboBoxTypProduktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDzisiejszeZakupy.setText("Dzisiejsze zakupy");

        jButtonZapisz.setText("Zapisz");
        jButtonZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZapiszActionPerformed(evt);
            }
        });

        jLabelWydatkiDzis.setText("Wydatki z dzisiaj:");

        jLabelWydatkiTydzien.setText("Wydatki z tygodnia:");

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        javax.swing.GroupLayout jPanelWprowadzZakupyLayout = new javax.swing.GroupLayout(jPanelWprowadzZakupy);
        jPanelWprowadzZakupy.setLayout(jPanelWprowadzZakupyLayout);
        jPanelWprowadzZakupyLayout.setHorizontalGroup(
            jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCoKupiles)
                            .addComponent(jTFCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFWpiszWartosc)
                            .addComponent(jLabelWpiszWartosc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDzisiejszeZakupy)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelWydatkiDzis)
                            .addComponent(jLabelWydatkiTydzien))
                        .addGap(15, 15, 15)
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldWydatkiTydzien)
                            .addComponent(jTextFieldWydatkiDzien)))
                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTypProduktu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTypProduktu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonZapisz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jTFData)
                            .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanelWprowadzZakupyLayout.setVerticalGroup(
            jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoKupiles)
                    .addComponent(jLabelWpiszWartosc)
                    .addComponent(jLabelTypProduktu)
                    .addComponent(jLabelData))
                .addGap(3, 3, 3)
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFWpiszWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTypProduktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonZapisz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelWydatkiDzis)
                            .addComponent(jTextFieldWydatkiDzien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelWydatkiTydzien)
                            .addComponent(jTextFieldWydatkiTydzien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(271, 271, 271))
                    .addGroup(jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelDzisiejszeZakupy, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Wprowadź zakupy", jPanelWprowadzZakupy);

        javax.swing.GroupLayout jPanelListaZakupowLayout = new javax.swing.GroupLayout(jPanelListaZakupow);
        jPanelListaZakupow.setLayout(jPanelListaZakupowLayout);
        jPanelListaZakupowLayout.setHorizontalGroup(
            jPanelListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );
        jPanelListaZakupowLayout.setVerticalGroup(
            jPanelListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista zakupów", jPanelListaZakupow);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCoKupilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCoKupilesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCoKupilesActionPerformed

    private void jButtonZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapiszActionPerformed
        SaveToFile stf = new SaveToFile();
        String text = jTFCoKupiles.getText()+";"+jTFWpiszWartosc.getText()
                +";"+jComboBoxTypProduktu.getSelectedItem()+";"+jTFData.getText();
        stf.saveToFile(text);
    }//GEN-LAST:event_jButtonZapiszActionPerformed

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
            java.util.logging.Logger.getLogger(listazakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listazakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listazakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listazakupow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listazakupow().setVisible(true);
            }
        });
    }
    
    private void addKeyListenerToTFcoKupiles(){
        jTFCoKupiles.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                if((ch >= 'A' && ch <= 'z') || ch == KeyEvent.VK_BACK_SPACE || ch == KeyEvent.VK_SPACE){
                    jTFCoKupiles.setEditable(true);
                    System.out.println("Nacisnieto: "+ch);
                }else{
                    jTFCoKupiles.setEditable(false);
           
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
        
    private void addKeyListenerTojTFWpiszWartosc(){
        jTFWpiszWartosc.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char ch = e.getKeyChar();
                String temp = jTFWpiszWartosc.getText();
              
                if(temp.contains(",") ){
                    String [] splitted = temp.split(",");
                    if(splitted[1].length() < 2){
                        if(ch >= '0'  && ch <= '9'  || ch == KeyEvent.VK_BACK_SPACE){  
                            jTFWpiszWartosc.setEditable(true);
                        } else {
                            jTFWpiszWartosc.setEditable(false);
                        }
                    } //TODO jeśli będzie po przecinku za długo tekst to co zrobimy????
                    
                } else {
                    if(ch >= '0'  && ch <= '9'  || ch == KeyEvent.VK_BACK_SPACE || ch == ','){  
                        jTFWpiszWartosc.setEditable(true);
    //                    System.out.println("NACIŚNIĘTO CYFRĘ: "+ch);
                    } else {
                        jTFWpiszWartosc.setEditable(false);
                    }
                }
                
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
    private void addKeyListenerTojTFdata(){
        jTFData.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String temp = jTFData.getText();
                char ch = e.getKeyChar();
                if((ch >= '0' && ch <= '9' || ch==KeyEvent.VK_BACK_SPACE) &&
                        (temp.length() < 10 || ch==KeyEvent.VK_BACK_SPACE)){
                    jTFData.setEditable(true);
                    if((temp.length() == 4 || temp.length() == 7) && ch != KeyEvent.VK_BACK_SPACE){
                        jTFData.setText(temp+"-");
                    }
                }else{
                    jTFData.setEditable(false);
                }
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
            
            }
        });
    }
    
    private void addTooltipToElements(){
        jTFCoKupiles.setToolTipText("<html>"
            +"<h3>Wprowadz tekst</h3>"
            +"<p>Nie uzywaj polskich znakow</p>"
            +"</html>");
        jTFWpiszWartosc.setToolTipText("<html>"
            +"<h3>Wprowadz liczby</h3>"
            +"<p>Uzyj tylko liczb 0-9 i przecinkow</p>"
            +"</html>");
        jTFData.setToolTipText("<html>"
            +"<h3>Wprowadz date</h3>"
            +"<p>Format daty rrrr-mm-dd</p>"
            +"</html>");
        jComboBoxTypProduktu.setToolTipText("<html>"
            +"<h3>Wybierz produkt</h3>"
            +"</html>");
        jTextFieldWydatkiDzien.setToolTipText("<html>"
            +"<h3>Wydatki z dzisiaj</h3>"
            +"</html>");
        jTextFieldWydatkiTydzien.setToolTipText("<html>"
            +"<h3>Wydatki z tygodnia</h3>"
            +"</html>");
        
    }
    private void filljComboBox(){
        Article atu = new Article();
        
        jComboBoxTypProduktu.removeAllItems();
        jComboBoxTypProduktu.addItem("");
        jComboBoxTypProduktu.addItem("Żywność");
        jComboBoxTypProduktu.addItem("Napoje");
        jComboBoxTypProduktu.addItem("Owoce");
        jComboBoxTypProduktu.addItem("Warzywa");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonZapisz;
    private javax.swing.JComboBox<String> jComboBoxTypProduktu;
    private javax.swing.JLabel jLabelCoKupiles;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDzisiejszeZakupy;
    private javax.swing.JLabel jLabelTypProduktu;
    private javax.swing.JLabel jLabelWpiszWartosc;
    private javax.swing.JLabel jLabelWydatkiDzis;
    private javax.swing.JLabel jLabelWydatkiTydzien;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelListaZakupow;
    private javax.swing.JPanel jPanelWprowadzZakupy;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCoKupiles;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFWpiszWartosc;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldWydatkiDzien;
    private javax.swing.JTextField jTextFieldWydatkiTydzien;
    // End of variables declaration//GEN-END:variables
}
