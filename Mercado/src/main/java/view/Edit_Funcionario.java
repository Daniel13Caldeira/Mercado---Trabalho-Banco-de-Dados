package view;

import DAO.ConexaoDAO;
import DAO.EntregadorDAO;
import DAO.FuncionarioDAO;
import Utilitarios.BuscaCep;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Endereco;
import model.Entregador;
import model.Funcionario;

public class Edit_Funcionario extends javax.swing.JFrame {

    private Funcionario func_alvo;
    private Entregador func_alvoen;
    private String func_log;

    public Edit_Funcionario(String func_alvo, String funcLog) throws SQLException {
        Connection conexao = new ConexaoDAO().getConection();
        this.func_alvo = new FuncionarioDAO(conexao).getFuncionario(Integer.parseInt(func_alvo));
        if (this.func_alvo.getCargo().equals("Entregador")) {
            this.func_alvoen = new EntregadorDAO(conexao).getEntregador(this.func_alvo);
        }
        this.func_log = funcLog;
        initComponents();
        preenchePerfil();
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
        ufBox = new javax.swing.JComboBox<>();
        cadastroButton = new javax.swing.JButton();
        senhaLabel = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        cargoLabel = new javax.swing.JLabel();
        cargoBox = new javax.swing.JComboBox<>();
        mostrarSenhaLabel = new javax.swing.JLabel();
        placaArea = new javax.swing.JPanel();
        placaVeiculoLabel = new javax.swing.JLabel();
        placaVeiculoInput = new javax.swing.JTextField();
        tittleArea = new javax.swing.JPanel();
        voltarbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Dados");
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
        nomeInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomeInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeInputKeyTyped(evt);
            }
        });

        cpfInput.setEditable(false);
        cpfInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cpfInput.setForeground(new java.awt.Color(9, 9, 91));
        cpfInput.setEnabled(false);
        cpfInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfInputActionPerformed(evt);
            }
        });
        cpfInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpfInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfInputKeyTyped(evt);
            }
        });

        tittleEndLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 22)); // NOI18N
        tittleEndLabel.setForeground(new java.awt.Color(9, 9, 91));
        tittleEndLabel.setText("Endere??o");

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

        cidadeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cidadeLabel.setForeground(new java.awt.Color(9, 9, 91));
        cidadeLabel.setText("Cidade");

        cidadeInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cidadeInput.setForeground(new java.awt.Color(9, 9, 91));

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
        cepInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cepInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepInputKeyTyped(evt);
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
        bairroInput.setForeground(new java.awt.Color(9, 9, 91));

        numeroLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        numeroLabel.setForeground(new java.awt.Color(9, 9, 91));
        numeroLabel.setText("N??mero");

        numeroInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        numeroInput.setForeground(new java.awt.Color(9, 9, 91));

        ufBox.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        ufBox.setForeground(new java.awt.Color(9, 9, 91));
        ufBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

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
                        .addComponent(ufBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
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
                    .addComponent(cidadeLabel)
                    .addComponent(cidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLabel)
                    .addComponent(cepInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        senhaInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                senhaInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senhaInputKeyTyped(evt);
            }
        });

        cargoLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        cargoLabel.setForeground(new java.awt.Color(9, 9, 91));
        cargoLabel.setText("Cargo");

        cargoBox.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cargoBox.setForeground(new java.awt.Color(9, 9, 91));
        cargoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione um Cargo>", "Entregador", "Gerente", "Funcion??rio" }));
        cargoBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cargoBoxItemStateChanged(evt);
            }
        });

        mostrarSenhaLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        mostrarSenhaLabel.setForeground(new java.awt.Color(9, 9, 91));
        mostrarSenhaLabel.setText("Mostrar senha");
        mostrarSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarSenhaLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarSenhaLabelMouseExited(evt);
            }
        });

        placaArea.setBackground(new java.awt.Color(169, 169, 169));

        placaVeiculoLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        placaVeiculoLabel.setForeground(new java.awt.Color(9, 9, 91));
        placaVeiculoLabel.setText("Placa do Ve??culo");

        placaVeiculoInput.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        placaVeiculoInput.setForeground(new java.awt.Color(9, 9, 91));

        javax.swing.GroupLayout placaAreaLayout = new javax.swing.GroupLayout(placaArea);
        placaArea.setLayout(placaAreaLayout);
        placaAreaLayout.setHorizontalGroup(
            placaAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placaAreaLayout.createSequentialGroup()
                .addComponent(placaVeiculoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(placaVeiculoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        placaAreaLayout.setVerticalGroup(
            placaAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placaVeiculoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(placaVeiculoInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout formAreaLayout = new javax.swing.GroupLayout(formArea);
        formArea.setLayout(formAreaLayout);
        formAreaLayout.setHorizontalGroup(
            formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formAreaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formAreaLayout.createSequentialGroup()
                        .addComponent(cargoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tittleEndLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formAreaLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadastroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22))
                        .addGroup(formAreaLayout.createSequentialGroup()
                            .addComponent(senhaLabel)
                            .addGap(18, 18, 18)
                            .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(mostrarSenhaLabel))
                        .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FormEndArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placaArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(22, 22, 22)
                .addGroup(formAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoLabel)
                    .addComponent(cargoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarSenhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(placaArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tittleEndLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(FormEndArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(cadastroButton)
                .addGap(33, 33, 33))
        );

        cargoBox.setSelectedItem("Entregador");
        cargoBox.setEnabled(false);
        placaArea.setVisible(false);

        tittleArea.setBackground(new java.awt.Color(0, 255, 255));
        tittleArea.setPreferredSize(new java.awt.Dimension(100, 90));

        voltarbutton.setBackground(new java.awt.Color(9, 9, 91));
        voltarbutton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        voltarbutton.setForeground(new java.awt.Color(255, 255, 255));
        voltarbutton.setText("Voltar");
        voltarbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tittleAreaLayout = new javax.swing.GroupLayout(tittleArea);
        tittleArea.setLayout(tittleAreaLayout);
        tittleAreaLayout.setHorizontalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarbutton)
                .addContainerGap())
        );
        tittleAreaLayout.setVerticalGroup(
            tittleAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tittleAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltarbutton)
                .addContainerGap(16, Short.MAX_VALUE))
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

        placaArea.setVisible(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeInputActionPerformed

    private void nomeInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeInputKeyReleased
        limita(nomeInput);
    }//GEN-LAST:event_nomeInputKeyReleased

    private void nomeInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeInputKeyTyped
        limita(nomeInput);
    }//GEN-LAST:event_nomeInputKeyTyped

    private void cpfInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfInputActionPerformed

    private void cpfInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfInputKeyReleased
        mascaraCPF(cpfInput);
    }//GEN-LAST:event_cpfInputKeyReleased

    private void cpfInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfInputKeyTyped
        mascaraCPF(cpfInput);
    }//GEN-LAST:event_cpfInputKeyTyped

    private void cepInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepInputActionPerformed

    private void cepInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepInputKeyReleased
        validaCep(cepInput);
    }//GEN-LAST:event_cepInputKeyReleased

    private void cepInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepInputKeyTyped
        validaCep(cepInput);
    }//GEN-LAST:event_cepInputKeyTyped

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        boolean flag = true;
        boolean end = false;
        if (nomeInput.getText().equals("") || senhaInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Apenas os campos do endere??o n??o s??o obrigat??rios!", "Aten????o", JOptionPane.INFORMATION_MESSAGE);
            flag = false;
        }
        String auxUf = ufBox.getSelectedItem().toString();
        if ((auxUf.equals(ufBox.getItemAt(0)) && ruaInput.getText().equals("")
                && cidadeInput.getText().equals("")
                && bairroInput.getText().equals("")
                && numeroInput.getText().equals(""))) {
            end = true;
        } else {
            if (!(auxUf.equals(ufBox.getItemAt(0)) || ruaInput.getText().equals("")
                    || cidadeInput.getText().equals("")
                    || bairroInput.getText().equals("")
                    || numeroInput.getText().equals(""))) {
                end = true;
            } else {
                JOptionPane.showMessageDialog(null, "O endere??o informado precisa estar completo", "Aten????o", JOptionPane.INFORMATION_MESSAGE);
                flag = false;

            }
        }
        if (flag) {
            if (func_alvo.getCargo().equals("Entregador")) {
                try {
                    Connection conexao = new ConexaoDAO().getConection();
                    func_alvoen.setPlacaVeiculo(placaVeiculoInput.getText());
                    func_alvoen.setNome(nomeInput.getText());
                    func_alvoen.setSenha(senhaInput.getText());
                    if (end) {
                        Endereco ende = new Endereco(cidadeInput.getText(), bairroInput.getText(), ruaInput.getText(), cepInput.getText(), auxUf, numeroInput.getText());
                        func_alvoen.setEndereco(ende);
                    }
                    new EntregadorDAO(conexao).updateEnt(func_alvoen);
                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!", "Aten????o", JOptionPane.INFORMATION_MESSAGE);
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tela_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    Connection conexao = new ConexaoDAO().getConection();
                    func_alvo.setNome(nomeInput.getText());
                    func_alvo.setSenha(senhaInput.getText());
                    if (end) {
                        Endereco ende = new Endereco(cidadeInput.getText(), bairroInput.getText(), ruaInput.getText(), cepInput.getText(), auxUf, numeroInput.getText());
                        func_alvo.setEndereco(ende);
                    }
                    new FuncionarioDAO(conexao).update(func_alvo);
                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!", "Aten????o", JOptionPane.INFORMATION_MESSAGE);
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tela_Funcionario.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }
    }//GEN-LAST:event_cadastroButtonActionPerformed

    private void senhaInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaInputKeyReleased
        limitaSenha(senhaInput);
    }//GEN-LAST:event_senhaInputKeyReleased

    private void senhaInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaInputKeyTyped
        limitaSenha(senhaInput);
    }//GEN-LAST:event_senhaInputKeyTyped

    private void cargoBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cargoBoxItemStateChanged
        String carg = (String) cargoBox.getSelectedItem();
        if (carg.equals("Entregador")) {
            placaArea.setVisible(true);
        } else {
            placaArea.setVisible(false);
        }
    }//GEN-LAST:event_cargoBoxItemStateChanged

    private void mostrarSenhaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSenhaLabelMouseEntered
        senhaInput.setEchoChar('\u0000');
    }//GEN-LAST:event_mostrarSenhaLabelMouseEntered

    private void mostrarSenhaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSenhaLabelMouseExited
        senhaInput.setEchoChar('\u25cf');
    }//GEN-LAST:event_mostrarSenhaLabelMouseExited

    private void voltarbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarbuttonActionPerformed
        this.setVisible(false);
        try {
            new Tela_Funcionario(func_log).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Edit_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_voltarbuttonActionPerformed

    private void limitaNum(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.length() > 10) {
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

    private void limitaSenha(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.length() > 20) {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }

    private void mascaraCPF(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.length() > 11 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }

    private void validaCep(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            //Verifica o tamanho da string excedeu 8 caracteres e se o ??ltimo caractere digitado ?? um n??mero
            if (texto.length() > 8 || texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                //Apaga o caractere digitado
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
        if (texto.length() == 8) {
            BuscaCep bus = new BuscaCep();
            String json = BuscaCep.buscarCep(texto);
            Map<String, String> mapa = new HashMap<>();
            if (json != null) {

                Matcher matcher = Pattern.compile("\"\\D.*?\": \".*?\"").matcher(json);
                while (matcher.find()) {
                    String[] group = matcher.group().split(":");
                    mapa.put(group[0].replaceAll("\"", "").trim(), group[1].replaceAll("\"", "").trim());
                }
                cidadeInput.setText(mapa.get("localidade"));
                ruaInput.setText(mapa.get("logradouro"));
                bairroInput.setText(mapa.get("bairro"));
                ufBox.setSelectedItem(mapa.get("uf"));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FormEndArea;
    private javax.swing.JTextField bairroInput;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JButton cadastroButton;
    private javax.swing.JComboBox<String> cargoBox;
    private javax.swing.JLabel cargoLabel;
    private javax.swing.JTextField cepInput;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeInput;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JPanel container;
    private javax.swing.JTextField cpfInput;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JPanel formArea;
    private javax.swing.JPanel line;
    private javax.swing.JLabel mostrarSenhaLabel;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JLabel nomeLable;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JPanel placaArea;
    private javax.swing.JTextField placaVeiculoInput;
    private javax.swing.JLabel placaVeiculoLabel;
    private javax.swing.JTextField ruaInput;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPanel tittleArea;
    private javax.swing.JLabel tittleEndLabel;
    private javax.swing.JComboBox<String> ufBox;
    private javax.swing.JLabel ufLabel;
    private javax.swing.JButton voltarbutton;
    // End of variables declaration//GEN-END:variables

    private void preenchePerfil() throws SQLException {

        nomeInput.setText(func_alvo.getNome());
        cpfInput.setText(func_alvo.getCpf());
        senhaInput.setText(func_alvo.getSenha());
        cargoBox.setSelectedItem(func_alvo.getCargo());
        if (func_alvo.getCargo().equals("Entregador")) {
            placaVeiculoInput.setText(func_alvoen.getPlacaVeiculo());
            placaArea.setVisible(false);
        }
        if (func_alvo.getEndereco() != null) {
            cepInput.setText(func_alvo.getEndereco().getCep());
            validaCep(cepInput);
            numeroInput.setText(func_alvo.getEndereco().getNumero());
        }
    }

}
