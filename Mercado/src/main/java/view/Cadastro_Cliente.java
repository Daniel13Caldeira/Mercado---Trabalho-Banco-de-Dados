
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
        nomeInput = new javax.swing.JTextField();
        cpfInput = new javax.swing.JTextField();
        tittleEndLabel = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        FormEndArea = new javax.swing.JPanel();
        ufLabel = new javax.swing.JLabel();
        ufInput = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        cidadeInput = new javax.swing.JTextField();
        cepLabel = new javax.swing.JLabel();
        cepInput = new javax.swing.JTextField();
        ruaLabel = new javax.swing.JLabel();
        ruaInput = new javax.swing.JTextField();
        bairroLabel = new javax.swing.JLabel();
        bairroInput = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        numeroInput = new javax.swing.JTextField();
        cadastroButton = new javax.swing.JButton();
        senhaLabel = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        tittleArea = new javax.swing.JPanel();
        tittleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setIconImages(null);
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

        ufLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        ufLabel.setForeground(new java.awt.Color(9, 9, 91));
        ufLabel.setText("UF");

        ufInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        cidadeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cidadeLabel.setForeground(new java.awt.Color(9, 9, 91));
        cidadeLabel.setText("Cidade");

        cidadeInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        cepLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cepLabel.setForeground(new java.awt.Color(9, 9, 91));
        cepLabel.setText("CEP");

        cepInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cepInput.setForeground(new java.awt.Color(9, 9, 91));
        cepInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepInputActionPerformed(evt);
            }
        });

        ruaLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        ruaLabel.setForeground(new java.awt.Color(9, 9, 91));
        ruaLabel.setText("Rua");

        ruaInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        ruaInput.setForeground(new java.awt.Color(9, 9, 91));

        bairroLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        bairroLabel.setForeground(new java.awt.Color(9, 9, 91));
        bairroLabel.setText("Bairro");

        bairroInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N

        numeroLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(9, 9, 91));
        numeroLabel.setText("Número");

        numeroInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        numeroInput.setForeground(new java.awt.Color(9, 9, 91));

        javax.swing.GroupLayout FormEndAreaLayout = new javax.swing.GroupLayout(FormEndArea);
        FormEndArea.setLayout(FormEndAreaLayout);
        FormEndAreaLayout.setHorizontalGroup(
            FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormEndAreaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormEndAreaLayout.createSequentialGroup()
                        .addComponent(ufLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ufInput, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cidadeLabel))
                    .addGroup(FormEndAreaLayout.createSequentialGroup()
                        .addComponent(ruaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(ruaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormEndAreaLayout.createSequentialGroup()
                        .addComponent(bairroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numeroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FormEndAreaLayout.createSequentialGroup()
                        .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(cepLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cepInput)))
                .addGap(45, 45, 45))
        );
        FormEndAreaLayout.setVerticalGroup(
            FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormEndAreaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ufLabel)
                    .addComponent(ufInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLabel)
                    .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLabel)
                    .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(FormEndAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaLabel)
                    .addComponent(ruaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroLabel)
                    .addComponent(bairroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel)
                    .addComponent(numeroInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        cadastroButton.setBackground(new java.awt.Color(9, 9, 91));
        cadastroButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cadastroButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastroButton.setText("Cadastrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        senhaLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(9, 9, 91));
        senhaLabel.setText("Senha");

        senhaInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        senhaInput.setForeground(new java.awt.Color(9, 9, 91));

        javax.swing.GroupLayout formAreaLayout = new javax.swing.GroupLayout(formArea);
        formArea.setLayout(formAreaLayout);
        formAreaLayout.setHorizontalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAreaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formAreaLayout.createSequentialGroup()
                        .addComponent(senhaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formAreaLayout.createSequentialGroup()
                        .addComponent(nomeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAreaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FormEndArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tittleEndLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        formAreaLayout.setVerticalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAreaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(tittleEndLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(FormEndArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(cadastroButton)
                .addContainerGap(64, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(tittleArea, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formArea, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void nomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInputActionPerformed

    private void cpfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfInputActionPerformed

    private void cepInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepInputActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FormEndArea;
    private javax.swing.JTextField bairroInput;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JTextField cepInput;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeInput;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JPanel container;
    private javax.swing.JTextField cpfInput;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JPanel formArea;
    private javax.swing.JPanel line;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLable;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField ruaInput;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPanel tittleArea;
    private javax.swing.JLabel tittleEndLabel;
    private javax.swing.JLabel tittleLabel;
    private javax.swing.JTextField ufInput;
    private javax.swing.JLabel ufLabel;
    // End of variables declaration//GEN-END:variables
}
