/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Márcio
 */
public class Cadastro_Produto extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_Produto
     */
    public Cadastro_Produto() {
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

        containe = new javax.swing.JPanel();
        formArea12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tittleArea = new javax.swing.JPanel();
        tittleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        containe.setBackground(new java.awt.Color(0, 255, 255));
        containe.setPreferredSize(new java.awt.Dimension(720, 500));

        formArea12.setBackground(new java.awt.Color(169, 169, 169));
        formArea12.setBorder(javax.swing.BorderFactory.createTitledBorder("")
        );
        formArea12.setPreferredSize(new java.awt.Dimension(620, 360));

        jPanel1.setBackground(new java.awt.Color(169, 169, 169));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout formArea12Layout = new javax.swing.GroupLayout(formArea12);
        formArea12.setLayout(formArea12Layout);
        formArea12Layout.setHorizontalGroup(
            formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formArea12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formArea12Layout.setVerticalGroup(
            formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formArea12Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        tittleArea.setBackground(new java.awt.Color(0, 255, 255));
        tittleArea.setPreferredSize(new java.awt.Dimension(100, 90));

        tittleLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 25)); // NOI18N
        tittleLabel.setForeground(new java.awt.Color(9, 9, 91));
        tittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleLabel.setText("Novo Produto");

        javax.swing.GroupLayout tittleAreaLayout = new javax.swing.GroupLayout(tittleArea);
        tittleArea.setLayout(tittleAreaLayout);
        tittleAreaLayout.setHorizontalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        tittleAreaLayout.setVerticalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containeLayout = new javax.swing.GroupLayout(containe);
        containe.setLayout(containeLayout);
        containeLayout.setHorizontalGroup(
            containeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containeLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(containeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(formArea12, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addComponent(tittleArea, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        containeLayout.setVerticalGroup(
            containeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containeLayout.createSequentialGroup()
                .addComponent(tittleArea, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formArea12, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containe;
    private javax.swing.JPanel container;
    private javax.swing.JPanel container1;
    private javax.swing.JPanel container10;
    private javax.swing.JPanel container11;
    private javax.swing.JPanel container2;
    private javax.swing.JPanel container3;
    private javax.swing.JPanel container4;
    private javax.swing.JPanel container5;
    private javax.swing.JPanel container6;
    private javax.swing.JPanel container7;
    private javax.swing.JPanel container8;
    private javax.swing.JPanel container9;
    private javax.swing.JTextField cpfInput;
    private javax.swing.JTextField cpfInput1;
    private javax.swing.JTextField cpfInput2;
    private javax.swing.JTextField cpfInput3;
    private javax.swing.JTextField cpfInput4;
    private javax.swing.JTextField cpfInput5;
    private javax.swing.JTextField cpfInput6;
    private javax.swing.JTextField cpfInput7;
    private javax.swing.JTextField cpfInput8;
    private javax.swing.JTextField cpfInput9;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel cpfLabel1;
    private javax.swing.JLabel cpfLabel10;
    private javax.swing.JLabel cpfLabel11;
    private javax.swing.JLabel cpfLabel2;
    private javax.swing.JLabel cpfLabel3;
    private javax.swing.JLabel cpfLabel4;
    private javax.swing.JLabel cpfLabel5;
    private javax.swing.JLabel cpfLabel6;
    private javax.swing.JLabel cpfLabel7;
    private javax.swing.JLabel cpfLabel8;
    private javax.swing.JLabel cpfLabel9;
    private javax.swing.JLabel dataDeNascLabel;
    private javax.swing.JLabel dataDeNascLabel1;
    private javax.swing.JLabel dataDeNascLabel10;
    private javax.swing.JLabel dataDeNascLabel11;
    private javax.swing.JLabel dataDeNascLabel2;
    private javax.swing.JLabel dataDeNascLabel3;
    private javax.swing.JLabel dataDeNascLabel4;
    private javax.swing.JLabel dataDeNascLabel5;
    private javax.swing.JLabel dataDeNascLabel6;
    private javax.swing.JLabel dataDeNascLabel7;
    private javax.swing.JLabel dataDeNascLabel8;
    private javax.swing.JLabel dataDeNascLabel9;
    private javax.swing.JTextField dataInput;
    private javax.swing.JTextField dataInput1;
    private javax.swing.JTextField dataInput2;
    private javax.swing.JTextField dataInput3;
    private javax.swing.JTextField dataInput4;
    private javax.swing.JTextField dataInput5;
    private javax.swing.JTextField dataInput6;
    private javax.swing.JTextField dataInput7;
    private javax.swing.JTextField dataInput8;
    private javax.swing.JTextField dataInput9;
    private javax.swing.JPanel formArea;
    private javax.swing.JPanel formArea1;
    private javax.swing.JPanel formArea10;
    private javax.swing.JPanel formArea11;
    private javax.swing.JPanel formArea12;
    private javax.swing.JPanel formArea2;
    private javax.swing.JPanel formArea3;
    private javax.swing.JPanel formArea4;
    private javax.swing.JPanel formArea5;
    private javax.swing.JPanel formArea6;
    private javax.swing.JPanel formArea7;
    private javax.swing.JPanel formArea8;
    private javax.swing.JPanel formArea9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel line;
    private javax.swing.JPanel line1;
    private javax.swing.JPanel line2;
    private javax.swing.JPanel line3;
    private javax.swing.JPanel line4;
    private javax.swing.JPanel line5;
    private javax.swing.JPanel line6;
    private javax.swing.JPanel line7;
    private javax.swing.JPanel line8;
    private javax.swing.JPanel line9;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JTextField nomeInput1;
    private javax.swing.JTextField nomeInput10;
    private javax.swing.JTextField nomeInput11;
    private javax.swing.JTextField nomeInput2;
    private javax.swing.JTextField nomeInput3;
    private javax.swing.JTextField nomeInput4;
    private javax.swing.JTextField nomeInput5;
    private javax.swing.JTextField nomeInput6;
    private javax.swing.JTextField nomeInput7;
    private javax.swing.JTextField nomeInput8;
    private javax.swing.JTextField nomeInput9;
    private javax.swing.JLabel nomeLable;
    private javax.swing.JLabel nomeLable1;
    private javax.swing.JLabel nomeLable10;
    private javax.swing.JLabel nomeLable11;
    private javax.swing.JLabel nomeLable2;
    private javax.swing.JLabel nomeLable3;
    private javax.swing.JLabel nomeLable4;
    private javax.swing.JLabel nomeLable5;
    private javax.swing.JLabel nomeLable6;
    private javax.swing.JLabel nomeLable7;
    private javax.swing.JLabel nomeLable8;
    private javax.swing.JLabel nomeLable9;
    private javax.swing.JTextField telefoneInput;
    private javax.swing.JTextField telefoneInput1;
    private javax.swing.JTextField telefoneInput2;
    private javax.swing.JTextField telefoneInput3;
    private javax.swing.JTextField telefoneInput4;
    private javax.swing.JTextField telefoneInput5;
    private javax.swing.JTextField telefoneInput6;
    private javax.swing.JTextField telefoneInput7;
    private javax.swing.JTextField telefoneInput8;
    private javax.swing.JTextField telefoneInput9;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JLabel telefoneLabel1;
    private javax.swing.JLabel telefoneLabel10;
    private javax.swing.JLabel telefoneLabel11;
    private javax.swing.JLabel telefoneLabel2;
    private javax.swing.JLabel telefoneLabel3;
    private javax.swing.JLabel telefoneLabel4;
    private javax.swing.JLabel telefoneLabel5;
    private javax.swing.JLabel telefoneLabel6;
    private javax.swing.JLabel telefoneLabel7;
    private javax.swing.JLabel telefoneLabel8;
    private javax.swing.JLabel telefoneLabel9;
    private javax.swing.JPanel tittleArea;
    private javax.swing.JLabel tittleEndLabel;
    private javax.swing.JLabel tittleEndLabel1;
    private javax.swing.JLabel tittleEndLabel2;
    private javax.swing.JLabel tittleEndLabel3;
    private javax.swing.JLabel tittleEndLabel4;
    private javax.swing.JLabel tittleEndLabel5;
    private javax.swing.JLabel tittleEndLabel6;
    private javax.swing.JLabel tittleEndLabel7;
    private javax.swing.JLabel tittleEndLabel8;
    private javax.swing.JLabel tittleEndLabel9;
    private javax.swing.JLabel tittleLabel;
    // End of variables declaration//GEN-END:variables
}
