package view;

import javax.swing.JOptionPane;

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
        entrarButton = new javax.swing.JButton();
        cadastroNavigate = new javax.swing.JLabel();
        tittleArea = new javax.swing.JPanel();
        tittleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        container.setBackground(new java.awt.Color(0, 255, 255));
        container.setForeground(new java.awt.Color(51, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(720, 500));

        formArea.setBackground(new java.awt.Color(169, 169, 169));
        formArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        formArea.setPreferredSize(new java.awt.Dimension(680, 345));

        inputArea.setBackground(new java.awt.Color(169, 169, 169));

        userText.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(9, 9, 91));
        userText.setText("Usuário");

        senhaText.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        senhaText.setForeground(new java.awt.Color(9, 9, 91));
        senhaText.setText("Senha");

        userInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        userInput.setForeground(new java.awt.Color(9, 9, 91));
        userInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInputActionPerformed(evt);
            }
        });

        senhaInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        senhaInput.setForeground(new java.awt.Color(9, 9, 91));
        senhaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaInputActionPerformed(evt);
            }
        });

        entrarButton.setBackground(new java.awt.Color(9, 9, 91));
        entrarButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        entrarButton.setForeground(new java.awt.Color(255, 255, 255));
        entrarButton.setText("Entrar");
        entrarButton.setPreferredSize(new java.awt.Dimension(60, 28));
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        cadastroNavigate.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cadastroNavigate.setForeground(new java.awt.Color(9, 9, 91));
        cadastroNavigate.setText("Não Possui uma conta?");
        cadastroNavigate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroNavigateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastroNavigateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastroNavigateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout inputAreaLayout = new javax.swing.GroupLayout(inputArea);
        inputArea.setLayout(inputAreaLayout);
        inputAreaLayout.setHorizontalGroup(
            inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputAreaLayout.createSequentialGroup()
                        .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputAreaLayout.createSequentialGroup()
                        .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputAreaLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(cadastroNavigate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(entrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        inputAreaLayout.setVerticalGroup(
            inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputAreaLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(inputAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entrarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroNavigate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formAreaLayout = new javax.swing.GroupLayout(formArea);
        formArea.setLayout(formAreaLayout);
        formAreaLayout.setHorizontalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAreaLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(inputArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        formAreaLayout.setVerticalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAreaLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(inputArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tittleArea.setBackground(new java.awt.Color(0, 255, 255));

        tittleLabel.setBackground(new java.awt.Color(9, 9, 91));
        tittleLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        tittleLabel.setForeground(new java.awt.Color(9, 9, 91));
        tittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleLabel.setText("Mercado");

        javax.swing.GroupLayout tittleAreaLayout = new javax.swing.GroupLayout(tittleArea);
        tittleArea.setLayout(tittleAreaLayout);
        tittleAreaLayout.setHorizontalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tittleAreaLayout.setVerticalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(formArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tittleArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittleArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void senhaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaInputActionPerformed

    private void userInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInputActionPerformed

    private void cadastroNavigateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroNavigateMouseClicked
        setVisible(false);
        new Cadastro_Cliente().setVisible(true);
    }//GEN-LAST:event_cadastroNavigateMouseClicked

    private void cadastroNavigateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroNavigateMouseEntered
        cadastroNavigate.setText("<html><u>Não Possui uma conta?<u>");
    }//GEN-LAST:event_cadastroNavigateMouseEntered

    private void cadastroNavigateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroNavigateMouseExited
        cadastroNavigate.setText("Não Possui uma conta?");
    }//GEN-LAST:event_cadastroNavigateMouseExited

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        new Edit_Fornecedor().setVisible(true);
    }//GEN-LAST:event_entrarButtonActionPerformed

    public static void main(String args[]) {

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
    private javax.swing.JLabel cadastroNavigate;
    private javax.swing.JPanel container;
    private javax.swing.JButton entrarButton;
    private javax.swing.JPanel formArea;
    private javax.swing.JPanel inputArea;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaText;
    private javax.swing.JPanel tittleArea;
    private javax.swing.JLabel tittleLabel;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
}
