package view;

import DAO.ConexaoDAO;
import DAO.FornecedorDAO;
import DAO.ProdutoOutroDAO;
import DAO.ProdutoPerecivelDAO;
import DAO.RemedioDAO;
import DAO.VestuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Fornecedor;
import model.ProdutoOutro;
import model.ProdutoPerecivel;
import model.Remedio;
import model.Vestuario;

public class Cadastro_Produto extends javax.swing.JFrame {

    private String tipo;
    private Remedio prod_rem;
    private ProdutoOutro prod_ou;
    private ProdutoPerecivel prod_pp;
    private Vestuario prod_ves;
    private String id_func;

    public Cadastro_Produto(String id_Func) throws SQLException {
        this.id_func = id_Func;
        initComponents();
        preencheFornecedorBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        container = new javax.swing.JPanel();
        formArea12 = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        tipoLabel = new javax.swing.JLabel();
        tipoBox = new javax.swing.JComboBox<>();
        precoLabel = new javax.swing.JLabel();
        precoInput = new javax.swing.JTextField();
        fornecedorLabel = new javax.swing.JLabel();
        fornecedorBox = new javax.swing.JComboBox<>();
        camp = new javax.swing.JPanel();
        validadeLabel = new javax.swing.JLabel();
        validadeInput = new javax.swing.JTextField();
        tamanhoLabel = new javax.swing.JLabel();
        tamanhoInput = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tittleArea = new javax.swing.JPanel();
        tittleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        container.setBackground(new java.awt.Color(0, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(720, 500));

        formArea12.setBackground(new java.awt.Color(169, 169, 169));
        formArea12.setBorder(javax.swing.BorderFactory.createTitledBorder("")
        );
        formArea12.setPreferredSize(new java.awt.Dimension(620, 360));

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

        tipoLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        tipoLabel.setForeground(new java.awt.Color(9, 9, 91));
        tipoLabel.setText("Tipo");

        tipoBox.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        tipoBox.setForeground(new java.awt.Color(9, 9, 91));
        tipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Tipo do Produto>", "Perecível", "Remédio", "Vestuário", "Outros" }));
        tipoBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoBoxItemStateChanged(evt);
            }
        });

        precoLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        precoLabel.setForeground(new java.awt.Color(9, 9, 91));
        precoLabel.setText("Preço");

        precoInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        precoInput.setForeground(new java.awt.Color(9, 9, 91));
        precoInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precoInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precoInputKeyTyped(evt);
            }
        });

        fornecedorLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        fornecedorLabel.setForeground(new java.awt.Color(9, 9, 91));
        fornecedorLabel.setText("Fornecedor");

        fornecedorBox.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        fornecedorBox.setForeground(new java.awt.Color(9, 9, 91));
        fornecedorBox.setMaximumRowCount(200);
        fornecedorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Fornecedor>" }));

        camp.setBackground(new java.awt.Color(169, 169, 169));

        validadeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        validadeLabel.setForeground(new java.awt.Color(9, 9, 91));
        validadeLabel.setText("Validade");

        validadeInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        validadeInput.setForeground(new java.awt.Color(9, 9, 91));
        validadeInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                validadeInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                validadeInputKeyTyped(evt);
            }
        });

        tamanhoLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        tamanhoLabel.setForeground(new java.awt.Color(9, 9, 91));
        tamanhoLabel.setText("Tamanho");

        tamanhoInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        tamanhoInput.setForeground(new java.awt.Color(9, 9, 91));

        javax.swing.GroupLayout campLayout = new javax.swing.GroupLayout(camp);
        camp.setLayout(campLayout);
        campLayout.setHorizontalGroup(
            campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tamanhoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tamanhoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(validadeLabel)
                .addGap(18, 18, 18)
                .addComponent(validadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        campLayout.setVerticalGroup(
            campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tamanhoLabel)
                        .addComponent(tamanhoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(validadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(validadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        cadastrarButton.setBackground(new java.awt.Color(9, 9, 91));
        cadastrarButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cadastrarButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        quantidadeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        quantidadeLabel.setForeground(new java.awt.Color(9, 9, 91));
        quantidadeLabel.setText("Quantidade");

        quantidadeInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        quantidadeInput.setForeground(new java.awt.Color(9, 9, 91));

        jButton1.setBackground(new java.awt.Color(9, 9, 91));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formArea12Layout = new javax.swing.GroupLayout(formArea12);
        formArea12.setLayout(formArea12Layout);
        formArea12Layout.setHorizontalGroup(
            formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formArea12Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formArea12Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarButton))
                    .addGroup(formArea12Layout.createSequentialGroup()
                        .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formArea12Layout.createSequentialGroup()
                                .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(precoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formArea12Layout.createSequentialGroup()
                                .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fornecedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantidadeLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(formArea12Layout.createSequentialGroup()
                                        .addComponent(fornecedorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(quantidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)))
                .addGap(60, 60, 60))
            .addGroup(formArea12Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(camp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formArea12Layout.setVerticalGroup(
            formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formArea12Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornecedorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLabel)
                    .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeLabel))
                .addGap(16, 16, 16)
                .addComponent(camp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarButton)
                    .addComponent(jButton1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        camp.setVisible(false);

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
            .addGroup(tittleAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tittleAreaLayout.setVerticalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(formArea12, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                    .addComponent(tittleArea, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addComponent(tittleArea, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formArea12, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeInputKeyReleased
        limita(nomeInput);
    }//GEN-LAST:event_nomeInputKeyReleased

    private void nomeInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeInputKeyTyped
        limita(nomeInput);
    }//GEN-LAST:event_nomeInputKeyTyped

    private void precoInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoInputKeyReleased
        mascaraDouble(precoInput);
    }//GEN-LAST:event_precoInputKeyReleased

    private void precoInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoInputKeyTyped
        mascaraDouble(precoInput);
    }//GEN-LAST:event_precoInputKeyTyped

    private void validadeInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validadeInputKeyReleased
        mascaraData(validadeInput);
    }//GEN-LAST:event_validadeInputKeyReleased

    private void validadeInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_validadeInputKeyTyped
        mascaraData(validadeInput);
    }//GEN-LAST:event_validadeInputKeyTyped

    private void tipoBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoBoxItemStateChanged
        String tip = (String) tipoBox.getSelectedItem();
        if (!(tip.equals("Outros"))) {
            camp.setVisible(true);
            if (tip.equals("Vestuário")) {
                tamanhoLabel.setVisible(true);
                tamanhoInput.setVisible(true);
                validadeInput.setVisible(false);
                validadeLabel.setVisible(false);
            } else {
                if (tip.equals("Remédio")) {
                    tamanhoLabel.setVisible(false);
                    tamanhoInput.setVisible(false);
                    validadeInput.setVisible(true);
                    validadeLabel.setVisible(true);
                } else {
                    tamanhoLabel.setVisible(false);
                    tamanhoInput.setVisible(false);
                    validadeInput.setVisible(true);
                    validadeLabel.setVisible(true);
                }
            }
        } else {
            camp.setVisible(false);
        }
    }//GEN-LAST:event_tipoBoxItemStateChanged

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        boolean flag = true;
        if (!validadeInput.getText().equals("")) {
            if (!verificaDataValida(validadeInput.getText())) {
                JOptionPane.showMessageDialog(null, "Não é permitido cadastro de produtos que ja estejam vencidos ou que vão vencer hoje!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                flag = false;
            }
        }
        if (nomeInput.getText().equals("") || precoInput.getText().equals("")
                || quantidadeInput.getText().equals("") || tipoBox.getSelectedItem().toString().equals(tipoBox.getItemAt(0)) || fornecedorBox.getSelectedItem().toString().equals(fornecedorBox.getItemAt(0))) {
            tipo = tipoBox.getSelectedItem().toString();
            switch (tipo) {
                case "Remédio":
                    if (validadeInput.getText().equals("")) {
                        flag = false;
                    }
                    break;
                case "Vestuário":
                    if (tamanhoInput.getText().equals("")) {
                        flag = false;
                    }
                case "Perecível":
                    if (validadeInput.getText().equals("")) {
                        flag = false;
                    }
                    break;
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            flag = false;
        }
        if (flag) {
            Connection conexao;
            try {
                conexao = new ConexaoDAO().getConection();
                switch (tipo) {
                    case "Remédio":
                        prod_rem = new Remedio(Double.parseDouble(precoInput.getText()), nomeInput.getText(), fornecedorBox.getSelectedItem().toString(), validadeInput.getText(), Double.parseDouble(quantidadeInput.getText()));
                        new RemedioDAO(conexao).insert(prod_rem);
                        break;
                    case "Vestuário":
                        prod_ves = new Vestuario(Double.parseDouble(precoInput.getText()), nomeInput.getText(), fornecedorBox.getSelectedItem().toString(), validadeInput.getText(), Double.parseDouble(quantidadeInput.getText()));
                        new VestuarioDAO(conexao).insert(prod_ves);
                        break;
                    case "Perecível":
                        prod_pp = new ProdutoPerecivel(validadeInput.getText(), Double.parseDouble(precoInput.getText()), nomeInput.getText(), fornecedorBox.getSelectedItem().toString(), Double.parseDouble(quantidadeInput.getText()));
                        new ProdutoPerecivelDAO(conexao).insert(prod_pp);
                        break;
                    case "Outros":
                        prod_ou = new ProdutoOutro(Double.parseDouble(precoInput.getText()), nomeInput.getText(), fornecedorBox.getSelectedItem().toString(), Double.parseDouble(quantidadeInput.getText()));
                        new ProdutoOutroDAO(conexao).insert(prod_ou);
                        break;
                    default:
                        break;
                }
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(Edit_Produto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        try {
            new Tela_Funcionario(id_func).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mascaraData(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.length() > 10 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
            if (texto.length() == 2 || texto.length() == 5) {
                texto += "/";
            }
        }
        textField.setText(texto);
    }

    private void mascaraDouble(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (!(texto.charAt(texto.length() - 1) == '.' || texto.charAt(texto.length() - 1) == ',' || (texto.charAt(texto.length() - 1) >= '0' && texto.charAt(texto.length() - 1) <= '9'))) {
                texto = texto.substring(0, texto.length() - 1);
            }

            String aux = "";
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == ',') {
                    aux += '.';
                } else {
                    aux += texto.charAt(i);
                }
            }
            texto = aux;
        }
        textField.setText(texto);
    }

    private void mascaraInt(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }

    private void limita(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.length() > 50) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JPanel camp;
    private javax.swing.JPanel container;
    private javax.swing.JPanel formArea12;
    private javax.swing.JComboBox<String> fornecedorBox;
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField precoInput;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JTextField quantidadeInput;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JTextField tamanhoInput;
    private javax.swing.JLabel tamanhoLabel;
    private javax.swing.JComboBox<String> tipoBox;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JPanel tittleArea;
    private javax.swing.JLabel tittleLabel;
    private javax.swing.JTextField validadeInput;
    private javax.swing.JLabel validadeLabel;
    // End of variables declaration//GEN-END:variables

    private void preencheFornecedorBox() throws SQLException {
        Connection conexao = new ConexaoDAO().getConection();
        List<Fornecedor> strList = new FornecedorDAO(conexao).getAllList();
        conexao.close();
        for (int i = 0; i < strList.size(); i++) {
            fornecedorBox.addItem(strList.get(i).getCNPJ());
        }
    }

    private boolean verificaDataAnteriorAtual(int dia, int mes, int ano) {
        Date data = new Date();
        String atual = data + "";

        int anoAtual = Integer.parseInt(atual.charAt(24) + "") * 1000 + Integer.parseInt(atual.charAt(25) + "") * 100 + Integer.parseInt(atual.charAt(26) + "") * 10 + Integer.parseInt(atual.charAt(27) + "");

        if (anoAtual > ano) {
            return false;
        }
        if (anoAtual < ano) {
            return true;
        }

        String mesAtualAux = atual.substring(4, 7);
        int mesAtual = 0;
        if (mesAtualAux.equalsIgnoreCase("jan")) {
            mesAtual = 1;
        } else {
            if (mesAtualAux.equalsIgnoreCase("feb")) {
                mesAtual = 2;
            } else {
                if (mesAtualAux.equalsIgnoreCase("mar")) {
                    mesAtual = 3;
                } else {
                    if (mesAtualAux.equalsIgnoreCase("apr")) {
                        mesAtual = 4;
                    } else {
                        if (mesAtualAux.equalsIgnoreCase("may")) {
                            mesAtual = 5;
                        } else {
                            if (mesAtualAux.equalsIgnoreCase("jun")) {
                                mesAtual = 6;
                            } else {
                                if (mesAtualAux.equalsIgnoreCase("jul")) {
                                    mesAtual = 7;
                                } else {
                                    if (mesAtualAux.equalsIgnoreCase("aug")) {
                                        mesAtual = 8;
                                    } else {
                                        if (mesAtualAux.equalsIgnoreCase("sep")) {
                                            mesAtual = 9;
                                        } else {
                                            if (mesAtualAux.equalsIgnoreCase("oct")) {
                                                mesAtual = 10;
                                            } else {
                                                if (mesAtualAux.equalsIgnoreCase("nov")) {
                                                    mesAtual = 11;
                                                } else {
                                                    if (mesAtualAux.equalsIgnoreCase("dec")) {
                                                        mesAtual = 12;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (mesAtual > mes) {
            return false;
        }
        if (mesAtual < mes) {
            return true;
        }

        //Declara o valor númerico do dia atual
        int diaAtual = Integer.parseInt(atual.charAt(8) + "") * 10 + Integer.parseInt(atual.charAt(9) + "");

        //Verifica se o dia atual é maior ou igual ao passado por parâmetro
        if (diaAtual >= dia) {
            return false;
        }
        return true;
    }

    private boolean verificaDataValida(String data) {

        if (data.length() != 10) {
            return false;
        }
        int dia = Integer.parseInt(data.charAt(0) + "") * 10 + Integer.parseInt(data.charAt(1) + "");
        if (dia < 1 || dia > 31) {
            return false;
        }
        int mes = Integer.parseInt(data.charAt(3) + "") * 10 + Integer.parseInt(data.charAt(4) + "");
        if (mes < 0 || mes > 12) {
            return false;
        }
        int ano = Integer.parseInt(data.charAt(6) + "") * 1000 + Integer.parseInt(data.charAt(7) + "") * 100 + Integer.parseInt(data.charAt(8) + "") * 10 + Integer.parseInt(data.charAt(9) + "");

        int maxDias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                maxDias = 31;
            }
            break;
            case 4:
            case 6:
            case 9:
            case 11: {
                maxDias = 30;
            }
            default: {
                if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    maxDias = 29;
                } else {
                    maxDias = 28;
                }
            }
        }
        if (dia > maxDias || maxDias == 0) {
            return false;
        }
        return verificaDataAnteriorAtual(dia, mes, ano);
    }
}
