
package view;


public class Cadastro_Cliente extends javax.swing.JFrame {

    public Cadastro_Cliente() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        formArea = new javax.swing.JPanel();
        nomeLable = new javax.swing.JLabel();
        cpfLabel = new javax.swing.JLabel();
        dataDeNascLabel = new javax.swing.JLabel();
        telefoneLabel = new javax.swing.JLabel();
        nomeInput = new javax.swing.JTextField();
        cpfInput = new javax.swing.JTextField();
        dataInput = new javax.swing.JTextField();
        telefoneInput = new javax.swing.JTextField();
        tittleEndLabel = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        FormEndArea = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        tittleArea = new javax.swing.JPanel();
        tittleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        container.setBackground(new java.awt.Color(0, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(720, 500));

        formArea.setBackground(new java.awt.Color(169, 169, 169));
        formArea.setBorder(javax.swing.BorderFactory.createTitledBorder("")
        );
        formArea.setPreferredSize(new java.awt.Dimension(620, 360));

        nomeLable.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        nomeLable.setForeground(new java.awt.Color(9, 9, 91));
        nomeLable.setText("Nome");

        cpfLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cpfLabel.setForeground(new java.awt.Color(9, 9, 91));
        cpfLabel.setText("CPF");
        cpfLabel.setPreferredSize(new java.awt.Dimension(57, 16));

        dataDeNascLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        dataDeNascLabel.setForeground(new java.awt.Color(9, 9, 91));
        dataDeNascLabel.setText("Data de Nascimento");

        telefoneLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        telefoneLabel.setForeground(new java.awt.Color(9, 9, 91));
        telefoneLabel.setText("Telefone");

        nomeInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        nomeInput.setForeground(new java.awt.Color(9, 9, 91));
        nomeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeInputActionPerformed(evt);
            }
        });

        cpfInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cpfInput.setForeground(new java.awt.Color(9, 9, 91));
        cpfInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfInputActionPerformed(evt);
            }
        });

        dataInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        dataInput.setForeground(new java.awt.Color(9, 9, 91));
        dataInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInputActionPerformed(evt);
            }
        });

        telefoneInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        telefoneInput.setForeground(new java.awt.Color(9, 9, 91));
        telefoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneInputActionPerformed(evt);
            }
        });

        tittleEndLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 22)); // NOI18N
        tittleEndLabel.setForeground(new java.awt.Color(9, 9, 91));
        tittleEndLabel.setText("Endereço");

        line.setBackground(new java.awt.Color(0, 0, 0));
        line.setPreferredSize(new java.awt.Dimension(620, 1));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        FormEndArea.setBackground(new java.awt.Color(169, 169, 169));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 9, 91));
        jLabel1.setText("UF");

        jTextField1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 9, 91));
        jLabel2.setText("Cidade");

        jTextField2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(9, 9, 91));
        jLabel3.setText("CEP");

        jTextField3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(9, 9, 91));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(9, 9, 91));
        jLabel4.setText("Rua");

        jTextField4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(9, 9, 91));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(9, 9, 91));
        jLabel5.setText("Bairro");

        jTextField5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(9, 9, 91));
        jLabel6.setText("Número");

        jTextField6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(9, 9, 91));

        javax.swing.GroupLayout FormEndAreaLayout = new javax.swing.GroupLayout(FormEndArea);
        FormEndArea.setLayout(FormEndAreaLayout);
        FormEndAreaLayout.setHorizontalGroup(
            FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormEndAreaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormEndAreaLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(FormEndAreaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormEndAreaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FormEndAreaLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addGap(39, 39, 39))))
        );
        FormEndAreaLayout.setVerticalGroup(
            FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormEndAreaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formAreaLayout = new javax.swing.GroupLayout(formArea);
        formArea.setLayout(formAreaLayout);
        formAreaLayout.setHorizontalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAreaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FormEndArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tittleEndLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formAreaLayout.createSequentialGroup()
                        .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(formAreaLayout.createSequentialGroup()
                                .addComponent(dataDeNascLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataInput, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(telefoneLabel))
                            .addGroup(formAreaLayout.createSequentialGroup()
                                .addComponent(nomeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nomeInput)))
                        .addGap(18, 18, 18)
                        .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formAreaLayout.createSequentialGroup()
                                .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formAreaLayout.setVerticalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAreaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataDeNascLabel)
                    .addComponent(dataInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(tittleEndLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FormEndArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tittleArea.setBackground(new java.awt.Color(0, 255, 255));
        tittleArea.setPreferredSize(new java.awt.Dimension(100, 90));

        tittleLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 25)); // NOI18N
        tittleLabel.setForeground(new java.awt.Color(9, 9, 91));
        tittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleLabel.setText("Novo Usuário");

        javax.swing.GroupLayout tittleAreaLayout = new javax.swing.GroupLayout(tittleArea);
        tittleArea.setLayout(tittleAreaLayout);
        tittleAreaLayout.setHorizontalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tittleAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tittleAreaLayout.setVerticalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(formArea, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addComponent(tittleArea, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addComponent(tittleArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(formArea, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void telefoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneInputActionPerformed

    private void nomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInputActionPerformed

    private void dataInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInputActionPerformed

    private void cpfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfInputActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FormEndArea;
    private javax.swing.JPanel container;
    private javax.swing.JTextField cpfInput;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel dataDeNascLabel;
    private javax.swing.JTextField dataInput;
    private javax.swing.JPanel formArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel line;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLable;
    private javax.swing.JTextField telefoneInput;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JPanel tittleArea;
    private javax.swing.JLabel tittleEndLabel;
    private javax.swing.JLabel tittleLabel;
    // End of variables declaration//GEN-END:variables
}
