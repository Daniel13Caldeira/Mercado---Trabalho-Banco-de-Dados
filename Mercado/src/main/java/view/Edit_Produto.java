package view;

import javax.swing.JTextField;

public class Edit_Produto extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Produto
     */
    public Edit_Produto() {
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
        cReceitaRadioButton = new javax.swing.JRadioButton();
        scReceitaRadioButton = new javax.swing.JRadioButton();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeInput = new javax.swing.JTextField();
        tamanhoLabel = new javax.swing.JLabel();
        tamanhoInput = new javax.swing.JTextField();
        editarButton = new javax.swing.JButton();
        tittleArea = new javax.swing.JPanel();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Dados");

        container.setBackground(new java.awt.Color(0, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(720, 500));

        formArea12.setBackground(new java.awt.Color(169, 169, 169));
        formArea12.setBorder(javax.swing.BorderFactory.createTitledBorder("")
        );
        formArea12.setPreferredSize(new java.awt.Dimension(620, 360));

        nomeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(9, 9, 91));
        nomeLabel.setText("Nome");

        nomeInput.setEditable(false);
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
        fornecedorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Fornecedor>", "Item 1", "Item 2", "Item 3", "Item 4" }));

        camp.setBackground(new java.awt.Color(169, 169, 169));

        validadeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        validadeLabel.setForeground(new java.awt.Color(9, 9, 91));
        validadeLabel.setText("Validade");

        validadeInput.setEditable(false);
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

        cReceitaRadioButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cReceitaRadioButton.setForeground(new java.awt.Color(9, 9, 91));
        cReceitaRadioButton.setText("Com receita");

        scReceitaRadioButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        scReceitaRadioButton.setForeground(new java.awt.Color(9, 9, 91));
        scReceitaRadioButton.setText("Sem Receita");

        quantidadeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        quantidadeLabel.setForeground(new java.awt.Color(9, 9, 91));
        quantidadeLabel.setText("Quantidade");

        quantidadeInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        quantidadeInput.setForeground(new java.awt.Color(9, 9, 91));
        quantidadeInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantidadeInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantidadeInputKeyTyped(evt);
            }
        });

        tamanhoLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        tamanhoLabel.setForeground(new java.awt.Color(9, 9, 91));
        tamanhoLabel.setText("Tamanho");

        tamanhoInput.setEditable(false);
        tamanhoInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        tamanhoInput.setForeground(new java.awt.Color(9, 9, 91));

        javax.swing.GroupLayout campLayout = new javax.swing.GroupLayout(camp);
        camp.setLayout(campLayout);
        campLayout.setHorizontalGroup(
            campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(cReceitaRadioButton)
                .addGap(18, 18, 18)
                .addComponent(scReceitaRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(campLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(campLayout.createSequentialGroup()
                        .addComponent(tamanhoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tamanhoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(campLayout.createSequentialGroup()
                        .addComponent(quantidadeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(validadeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(validadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        campLayout.setVerticalGroup(
            campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(campLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(validadeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantidadeLabel))
                    .addComponent(validadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanhoLabel)
                    .addComponent(tamanhoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(campLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cReceitaRadioButton)
                    .addComponent(scReceitaRadioButton))
                .addContainerGap())
        );

        editarButton.setBackground(new java.awt.Color(9, 9, 91));
        editarButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        editarButton.setForeground(new java.awt.Color(255, 255, 255));
        editarButton.setText("Editar");

        javax.swing.GroupLayout formArea12Layout = new javax.swing.GroupLayout(formArea12);
        formArea12.setLayout(formArea12Layout);
        formArea12Layout.setHorizontalGroup(
            formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formArea12Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editarButton)
                    .addGroup(formArea12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formArea12Layout.createSequentialGroup()
                            .addComponent(fornecedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fornecedorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formArea12Layout.createSequentialGroup()
                            .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(precoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(precoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(camp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
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
                .addGap(18, 18, 18)
                .addComponent(camp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarButton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        camp.setVisible(false);

        tittleArea.setBackground(new java.awt.Color(0, 255, 255));
        tittleArea.setPreferredSize(new java.awt.Dimension(100, 90));

        voltarButton.setBackground(new java.awt.Color(9, 9, 91));
        voltarButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(255, 255, 255));
        voltarButton.setText("Voltar");

        javax.swing.GroupLayout tittleAreaLayout = new javax.swing.GroupLayout(tittleArea);
        tittleArea.setLayout(tittleAreaLayout);
        tittleAreaLayout.setHorizontalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarButton)
                .addContainerGap())
        );
        tittleAreaLayout.setVerticalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tittleAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(voltarButton)
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void tipoBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoBoxItemStateChanged
        String tip = (String) tipoBox.getSelectedItem();
        if (!(tip.equals("Outros"))) {
            camp.setVisible(true);
            if (tip.equals("Vestuário")) {
                quantidadeLabel.setVisible(true);
                quantidadeInput.setVisible(true);
                tamanhoLabel.setVisible(true);
                tamanhoInput.setVisible(true);
                validadeInput.setVisible(false);
                validadeLabel.setVisible(false);
                cReceitaRadioButton.setVisible(false);
                scReceitaRadioButton.setVisible(false);
            } else {
                if (tip.equals("Remédio")) {
                    quantidadeLabel.setVisible(true);
                    quantidadeInput.setVisible(true);
                    tamanhoLabel.setVisible(false);
                    tamanhoInput.setVisible(false);
                    validadeInput.setVisible(false);
                    validadeLabel.setVisible(false);
                    cReceitaRadioButton.setVisible(true);
                    scReceitaRadioButton.setVisible(true);
                } else {
                    quantidadeLabel.setVisible(false);
                    quantidadeInput.setVisible(false);
                    tamanhoLabel.setVisible(false);
                    tamanhoInput.setVisible(false);
                    validadeInput.setVisible(true);
                    validadeLabel.setVisible(true);
                    cReceitaRadioButton.setVisible(false);
                    scReceitaRadioButton.setVisible(false);
                }
            }
        } else {
            camp.setVisible(false);
        }
    }//GEN-LAST:event_tipoBoxItemStateChanged

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

    private void quantidadeInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeInputKeyReleased
        mascaraInt(quantidadeInput);
    }//GEN-LAST:event_quantidadeInputKeyReleased

    private void quantidadeInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeInputKeyTyped
        mascaraInt(quantidadeInput);
    }//GEN-LAST:event_quantidadeInputKeyTyped

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
    private javax.swing.JRadioButton cReceitaRadioButton;
    private javax.swing.JPanel camp;
    private javax.swing.JPanel container;
    private javax.swing.JButton editarButton;
    private javax.swing.JPanel formArea12;
    private javax.swing.JComboBox<String> fornecedorBox;
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField precoInput;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JTextField quantidadeInput;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JRadioButton scReceitaRadioButton;
    private javax.swing.JTextField tamanhoInput;
    private javax.swing.JLabel tamanhoLabel;
    private javax.swing.JComboBox<String> tipoBox;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JPanel tittleArea;
    private javax.swing.JTextField validadeInput;
    private javax.swing.JLabel validadeLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
