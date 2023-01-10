package view;

import DAO.ConexaoDAO;
import DAO.FornecedorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Fornecedor;

public class Cadastro_Fornecedor extends javax.swing.JFrame {

    private String id;

    public Cadastro_Fornecedor(String id) {
        this.id = id;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cointainer = new javax.swing.JPanel();
        formArea = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        cnpjLabel = new javax.swing.JLabel();
        cnpjInput = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tittleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        cointainer.setBackground(new java.awt.Color(0, 255, 255));

        formArea.setBackground(new java.awt.Color(169, 169, 169));
        formArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        nomeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(9, 9, 91));
        nomeLabel.setText("Nome");

        nomeInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        nomeInput.setForeground(new java.awt.Color(9, 9, 91));
        nomeInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeInputKeyTyped(evt);
            }
        });

        cnpjLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cnpjLabel.setForeground(new java.awt.Color(9, 9, 91));
        cnpjLabel.setText("CNPJ");

        cnpjInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cnpjInput.setForeground(new java.awt.Color(9, 9, 91));
        cnpjInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnpjInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnpjInputKeyTyped(evt);
            }
        });

        cadastrarButton.setBackground(new java.awt.Color(9, 9, 91));
        cadastrarButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(9, 9, 91));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formAreaLayout = new javax.swing.GroupLayout(formArea);
        formArea.setLayout(formAreaLayout);
        formAreaLayout.setHorizontalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(cadastrarButton)
                .addGap(46, 46, 46))
            .addGroup(formAreaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cnpjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeLabel))
                .addGap(18, 18, 18)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeInput)
                    .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        formAreaLayout.setVerticalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAreaLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cnpjInput)
                    .addComponent(cnpjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton)
                    .addComponent(jButton1))
                .addGap(29, 29, 29))
        );

        tittleLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 25)); // NOI18N
        tittleLabel.setForeground(new java.awt.Color(9, 9, 91));
        tittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleLabel.setText("Novo Fornecedor");

        javax.swing.GroupLayout cointainerLayout = new javax.swing.GroupLayout(cointainer);
        cointainer.setLayout(cointainerLayout);
        cointainerLayout.setHorizontalGroup(
            cointainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cointainerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(formArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cointainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittleLabel)
                .addGap(103, 103, 103))
        );
        cointainerLayout.setVerticalGroup(
            cointainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cointainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cointainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cointainer, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeInputKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInputKeyReleased

    private void nomeInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeInputKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInputKeyTyped

    private void cnpjInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpjInputKeyReleased
        mascaraCnpj(cnpjInput);
    }//GEN-LAST:event_cnpjInputKeyReleased

    private void cnpjInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpjInputKeyTyped
        mascaraCnpj(cnpjInput);
    }//GEN-LAST:event_cnpjInputKeyTyped

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        if (nomeInput.getText().equals("") || cnpjInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos precisam ser preenchidos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                Connection conexao = new ConexaoDAO().getConection();
                new FornecedorDAO(conexao).insert(new Fornecedor(cnpjInput.getText(), nomeInput.getText()));
                JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                new Tela_Funcionario(id).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Cadastro_Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        try {
            new Tela_Funcionario(id).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mascaraCnpj(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.length() > 14 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JTextField cnpjInput;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JPanel cointainer;
    private javax.swing.JPanel formArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel tittleLabel;
    // End of variables declaration//GEN-END:variables
}
