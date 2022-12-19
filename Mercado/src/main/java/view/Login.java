
package view;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        formArea = new javax.swing.JPanel();
        inputArea = new javax.swing.JPanel();
        userText = new javax.swing.JLabel();
        senhaText = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        senhaInput = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        container.setBackground(new java.awt.Color(0, 255, 255));
        container.setForeground(new java.awt.Color(51, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(720, 500));

        formArea.setBackground(new java.awt.Color(255, 255, 255));
        formArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        formArea.setPreferredSize(new java.awt.Dimension(680, 345));

        inputArea.setBackground(new java.awt.Color(255, 255, 255));

        userText.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        userText.setForeground(new java.awt.Color(9, 9, 91));
        userText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userText.setText("Usuário");

        senhaText.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        senhaText.setForeground(new java.awt.Color(9, 9, 91));
        senhaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaText.setText("Senha");

        userInput.setEditable(false);
        userInput.setBackground(new java.awt.Color(129, 126, 137));
        userInput.setForeground(new java.awt.Color(9, 9, 91));
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });

        senhaInput.setBackground(new java.awt.Color(129, 126, 137));
        senhaInput.setForeground(new java.awt.Color(9, 9, 91));
        senhaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaInputActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(9, 9, 91));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.setPreferredSize(new java.awt.Dimension(60, 28));

        javax.swing.GroupLayout inputAreaLayout = new javax.swing.GroupLayout(inputArea);
        inputArea.setLayout(inputAreaLayout);
        inputAreaLayout.setHorizontalGroup(
            inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputAreaLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputAreaLayout.createSequentialGroup()
                        .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputAreaLayout.createSequentialGroup()
                        .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        inputAreaLayout.setVerticalGroup(
            inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputAreaLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formAreaLayout = new javax.swing.GroupLayout(formArea);
        formArea.setLayout(formAreaLayout);
        formAreaLayout.setHorizontalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAreaLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(inputArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        formAreaLayout.setVerticalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAreaLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(inputArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        title.setBackground(new java.awt.Color(23, 24, 59));
        title.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 30)); // NOI18N
        title.setForeground(new java.awt.Color(9, 9, 91));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Mercado");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(formArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(formArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaInputActionPerformed

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed


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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JPanel formArea;
    private javax.swing.JPanel inputArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaText;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
}
