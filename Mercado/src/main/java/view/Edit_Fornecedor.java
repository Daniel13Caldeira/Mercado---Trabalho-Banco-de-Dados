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

public class Edit_Fornecedor extends javax.swing.JFrame {

    private Fornecedor forn;
    private String id;

    public Edit_Fornecedor(String Cnpj, String id) throws SQLException {
        Connection conexao = new ConexaoDAO().getConection();
        forn = new FornecedorDAO(conexao).getFornecedor(Cnpj);
        conexao.close();
        initComponents();
        cnpjInput.setText(forn.getCNPJ());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cointainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        cnpjLabel = new javax.swing.JLabel();
        cnpjInput = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Dados");

        cointainer.setBackground(new java.awt.Color(0, 255, 255));

        jPanel1.setBackground(new java.awt.Color(169, 169, 169));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("")
        );

        nomeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(9, 9, 91));
        nomeLabel.setText("Nome");

        nomeInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        nomeInput.setForeground(new java.awt.Color(9, 9, 91));

        cnpjLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cnpjLabel.setForeground(new java.awt.Color(9, 9, 91));
        cnpjLabel.setText("CNPJ");

        cnpjInput.setEditable(false);
        cnpjInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cnpjInput.setForeground(new java.awt.Color(9, 9, 91));
        cnpjInput.setEnabled(false);

        editButton.setBackground(new java.awt.Color(9, 9, 91));
        editButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editButton)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cnpjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnpjLabel)
                    .addComponent(cnpjInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(jButton1))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout cointainerLayout = new javax.swing.GroupLayout(cointainer);
        cointainer.setLayout(cointainerLayout);
        cointainerLayout.setHorizontalGroup(
            cointainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cointainerLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        cointainerLayout.setVerticalGroup(
            cointainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cointainerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cointainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cointainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        boolean flag = true;
        if (nomeInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            flag = false;
        }
        if (flag) {
            Fornecedor newForn = new Fornecedor(cnpjInput.getText(), nomeInput.getText());
            Connection conexao;
            try {
                conexao = new ConexaoDAO().getConection();
                FornecedorDAO fornecedoDAO = new FornecedorDAO(conexao);
                forn.setNome(nomeInput.getText());
                fornecedoDAO.setNome(forn);
                JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                new Tela_Funcionario(id).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Edit_Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_editButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        try {
            new Tela_Funcionario(id).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Fornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnpjInput;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JPanel cointainer;
    private javax.swing.JButton editButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    // End of variables declaration//GEN-END:variables
}
