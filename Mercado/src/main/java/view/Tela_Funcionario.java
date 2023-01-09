/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ConexaoDAO;
import DAO.EntregadorDAO;
import DAO.FuncionarioDAO;
import DAO.PedidoDAO;
import DAO.ProdutoDAO;
import DAO.ProdutoOutroDAO;
import DAO.ProdutoPerecivelDAO;
import DAO.RemedioDAO;
import DAO.VestuarioDAO;
import Utilitarios.BuscaCep;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Endereco;
import model.Entregador;
import model.Funcionario;
import model.Pedido;
import model.Produto;

public class Tela_Funcionario extends javax.swing.JFrame {

    private String id_func;
    private Funcionario func;
    private Entregador func_en;

    public Tela_Funcionario(String id) throws SQLException {
        Connection conexao = new ConexaoDAO().getConection();
        func = new FuncionarioDAO(conexao).getFuncionario(Integer.parseInt(Login.getUser()));
        if (func.getCargo().equals("Entregador")) {
            func_en = new EntregadorDAO(conexao).getEntregador(func);
        }
        initComponents();
        getPedidos();
        getProds();
        preenchePerfil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        list_ProdsPainel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_Prods = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        adicionarButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        pedidosPainel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_pedidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        finishButton = new javax.swing.JButton();
        perfilPainel = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cpfInputs = new javax.swing.JTextField();
        mostrarSenhaLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        senhaInput = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cargoBox = new javax.swing.JComboBox<>();
        placaArea = new javax.swing.JPanel();
        placaVeiculoLabel = new javax.swing.JLabel();
        placaVeiculoInput = new javax.swing.JTextField();
        editarButton = new javax.swing.JButton();
        tittleEndLabel = new javax.swing.JLabel();
        line1 = new javax.swing.JPanel();
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
        sairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Início");
        setResizable(false);

        container.setBackground(new java.awt.Color(0, 255, 255));

        tabbedPane.setBackground(new java.awt.Color(0, 255, 255));
        tabbedPane.setForeground(new java.awt.Color(9, 9, 91));
        tabbedPane.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N

        list_ProdsPainel.setBackground(new java.awt.Color(0, 255, 255));

        list_Prods.setBackground(new java.awt.Color(0, 255, 255));
        list_Prods.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        list_Prods.setForeground(new java.awt.Color(9, 9, 91));
        list_Prods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        list_Prods.setSelectionBackground(new java.awt.Color(0, 255, 255));
        list_Prods.setSelectionForeground(new java.awt.Color(9, 9, 91));
        jScrollPane1.setViewportView(list_Prods);
        if (list_Prods.getColumnModel().getColumnCount() > 0) {
            list_Prods.getColumnModel().getColumn(0).setResizable(false);
            list_Prods.getColumnModel().getColumn(1).setResizable(false);
            list_Prods.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        adicionarButton.setBackground(new java.awt.Color(9, 9, 91));
        adicionarButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        adicionarButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarButton.setText("Adicionar");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(9, 9, 91));
        removeButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remover");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(9, 9, 91));
        editButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout list_ProdsPainelLayout = new javax.swing.GroupLayout(list_ProdsPainel);
        list_ProdsPainel.setLayout(list_ProdsPainelLayout);
        list_ProdsPainelLayout.setHorizontalGroup(
            list_ProdsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_ProdsPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        list_ProdsPainelLayout.setVerticalGroup(
            list_ProdsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
            .addGroup(list_ProdsPainelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Produtos", list_ProdsPainel);

        pedidosPainel.setBackground(new java.awt.Color(0, 255, 255));
        pedidosPainel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N

        list_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(list_pedidos);
        if (list_pedidos.getColumnModel().getColumnCount() > 0) {
            list_pedidos.getColumnModel().getColumn(0).setResizable(false);
            list_pedidos.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        finishButton.setBackground(new java.awt.Color(9, 9, 91));
        finishButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        finishButton.setForeground(new java.awt.Color(255, 255, 255));
        finishButton.setText("Finalizar Pedido");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(finishButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(finishButton)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pedidosPainelLayout = new javax.swing.GroupLayout(pedidosPainel);
        pedidosPainel.setLayout(pedidosPainelLayout);
        pedidosPainelLayout.setHorizontalGroup(
            pedidosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pedidosPainelLayout.setVerticalGroup(
            pedidosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(pedidosPainelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Pedidos", pedidosPainel);

        perfilPainel.setBackground(new java.awt.Color(0, 255, 255));

        nomeLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        nomeLabel.setForeground(new java.awt.Color(9, 9, 91));
        nomeLabel.setText("Nome");

        name.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(9, 9, 91));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 9, 91));
        jLabel1.setText("CPF");

        cpfInputs.setEditable(false);
        cpfInputs.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cpfInputs.setForeground(new java.awt.Color(9, 9, 91));

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

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 9, 91));
        jLabel2.setText("Cargo");

        cargoBox.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        cargoBox.setForeground(new java.awt.Color(9, 9, 91));
        cargoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione um Cargo>", "Entregador", "Gerente", "Funcionário" }));
        cargoBox.setEnabled(false);
        cargoBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cargoBoxItemStateChanged(evt);
            }
        });

        placaArea.setBackground(new java.awt.Color(0, 255, 255));

        placaVeiculoLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        placaVeiculoLabel.setForeground(new java.awt.Color(9, 9, 91));
        placaVeiculoLabel.setText("Placa do Veículo");

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
                .addGap(0, 370, Short.MAX_VALUE))
        );
        placaAreaLayout.setVerticalGroup(
            placaAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(placaAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(placaAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placaVeiculoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(placaVeiculoInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        editarButton.setBackground(new java.awt.Color(9, 9, 91));
        editarButton.setForeground(new java.awt.Color(255, 255, 255));
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        tittleEndLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 22)); // NOI18N
        tittleEndLabel.setForeground(new java.awt.Color(9, 9, 91));
        tittleEndLabel.setText("Endereço");

        line1.setBackground(new java.awt.Color(0, 0, 0));
        line1.setPreferredSize(new java.awt.Dimension(620, 1));

        javax.swing.GroupLayout line1Layout = new javax.swing.GroupLayout(line1);
        line1.setLayout(line1Layout);
        line1Layout.setHorizontalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        line1Layout.setVerticalGroup(
            line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        FormEndArea.setBackground(new java.awt.Color(0, 255, 255));

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
        numeroLabel.setText("Número");

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

        javax.swing.GroupLayout perfilPainelLayout = new javax.swing.GroupLayout(perfilPainel);
        perfilPainel.setLayout(perfilPainelLayout);
        perfilPainelLayout.setHorizontalGroup(
            perfilPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, perfilPainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editarButton)
                .addGap(68, 68, 68))
            .addGroup(perfilPainelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(perfilPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tittleEndLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perfilPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FormEndArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(placaArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(perfilPainelLayout.createSequentialGroup()
                        .addComponent(senhaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarSenhaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cargoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(perfilPainelLayout.createSequentialGroup()
                        .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfInputs, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        perfilPainelLayout.setVerticalGroup(
            perfilPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfilPainelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(perfilPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cpfInputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(perfilPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarSenhaLabel)
                    .addComponent(jLabel2)
                    .addComponent(cargoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(placaArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(tittleEndLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(FormEndArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editarButton)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Perfil", perfilPainel);

        sairButton.setBackground(new java.awt.Color(9, 9, 91));
        sairButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        sairButton.setForeground(new java.awt.Color(255, 255, 255));
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sairButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbedPane.setBackgroundAt(1, new java.awt.Color(0, 255, 255));

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

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        new Cadastro_Produto().setVisible(true);
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (list_Prods.getSelectedRow() != -1) {
            try {
                this.setVisible(false);
                new Edit_Produto((String) list_Prods.getValueAt(list_Prods.getSelectedRow(), 0)).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Tela_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Um produto deve ser selecionado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        if (list_Prods.getSelectedRow() != -1) {
            DefaultTableModel defaultTablemodel = (DefaultTableModel) list_Prods.getModel();
            defaultTablemodel.removeRow(list_Prods.getSelectedRow());
            Connection conexao;
            try {
                conexao = new ConexaoDAO().getConection();
                new ProdutoDAO(conexao).delete((String) list_Prods.getValueAt(list_Prods.getSelectedRow(), 0));
                JOptionPane.showMessageDialog(null, "Produto removido com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                getProds();
                conexao.close();
            } catch (SQLException ex) {
                Logger.getLogger(Tela_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Um produto deve ser selecionado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finishButtonActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        limita(name);
    }//GEN-LAST:event_nameKeyReleased

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        limita(name);
    }//GEN-LAST:event_nameKeyTyped

    private void mostrarSenhaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSenhaLabelMouseEntered
        senhaInput.setEchoChar('\u0000');
    }//GEN-LAST:event_mostrarSenhaLabelMouseEntered

    private void mostrarSenhaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSenhaLabelMouseExited
        senhaInput.setEchoChar('\u25cf');
    }//GEN-LAST:event_mostrarSenhaLabelMouseExited

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

    private void cepInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepInputActionPerformed

    private void cepInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepInputKeyReleased
        validaCep(cepInput);
    }//GEN-LAST:event_cepInputKeyReleased

    private void cepInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepInputKeyTyped
        validaCep(cepInput);
    }//GEN-LAST:event_cepInputKeyTyped

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        boolean flag = true;
        boolean end = false;
        if (name.getText().equals("") || senhaInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Apenas os campos do endereço não são obrigatórios!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "O endereço informado precisa estar completo", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                flag = false;

            }
        }
        if (flag) {
            if (func.getCargo().equals("Entregador")) {
                try {
                    Connection conexao = new ConexaoDAO().getConection();
                    func_en.setPlacaVeiculo(placaVeiculoInput.getText());
                    func_en.setNome(name.getText());
                    func_en.setSenha(senhaInput.getText());
                    if (end) {
                        Endereco ende = new Endereco(cidadeInput.getText(), bairroInput.getText(), ruaInput.getText(), cepInput.getText(), auxUf, numeroInput.getText());
                        func_en.setEndereco(ende);
                    }
                    new EntregadorDAO(conexao).updateEnt(func_en);
                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tela_Funcionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    Connection conexao = new ConexaoDAO().getConection();
                    func.setNome(name.getText());
                    func.setSenha(senhaInput.getText());
                    if (end) {
                        Endereco ende = new Endereco(cidadeInput.getText(), bairroInput.getText(), ruaInput.getText(), cepInput.getText(), auxUf, numeroInput.getText());
                        func.setEndereco(ende);
                    }
                    new FuncionarioDAO(conexao).update(func);
                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Tela_Funcionario.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        }
    }//GEN-LAST:event_editarButtonActionPerformed

    private void mascaraInt(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }

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
            //Verifica o tamanho da string excedeu 8 caracteres e se o último caractere digitado é um número
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
    private javax.swing.JButton adicionarButton;
    private javax.swing.JTextField bairroInput;
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JComboBox<String> cargoBox;
    private javax.swing.JTextField cepInput;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cidadeInput;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JPanel container;
    private javax.swing.JTextField cpfInputs;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel cpfLabel1;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton finishButton;
    private javax.swing.JPanel formArea;
    private javax.swing.JPanel formArea1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel line;
    private javax.swing.JPanel line1;
    private javax.swing.JTable list_Prods;
    private javax.swing.JPanel list_ProdsPainel;
    private javax.swing.JTable list_pedidos;
    private javax.swing.JLabel mostrarSenhaLabel;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nomeInput;
    private javax.swing.JTextField nomeInput1;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeLable;
    private javax.swing.JLabel nomeLable1;
    private javax.swing.JTextField numeroInput;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JPanel pedidosPainel;
    private javax.swing.JPanel perfilPainel;
    private javax.swing.JPanel placaArea;
    private javax.swing.JTextField placaVeiculoInput;
    private javax.swing.JLabel placaVeiculoLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField ruaInput;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JButton sairButton;
    private javax.swing.JPasswordField senhaInput;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel tittleEndLabel;
    private javax.swing.JComboBox<String> ufBox;
    private javax.swing.JLabel ufLabel;
    // End of variables declaration//GEN-END:variables

    private void getProds() throws SQLException {
        Connection conexao = new ConexaoDAO().getConection();
        ArrayList<Produto> produtos = new ProdutoDAO(conexao).getAll();
        DefaultTableModel model = (DefaultTableModel) list_Prods.getModel();
        model.setRowCount(0);
        for (int i = 0; i < produtos.size(); i++) {
            String[] linha = {produtos.get(i).getId() + "", produtos.get(i).getNome(), produtos.get(i).getPreco() + ""};
            model.addRow(linha);
        }
        conexao.close();
    }

    private void getPedidos() throws SQLException {
        Connection conexao = new ConexaoDAO().getConection();
        ArrayList<Pedido> pedidos = new PedidoDAO(conexao).getPedidosALL();
        DefaultTableModel model = (DefaultTableModel) list_Prods.getModel();
        model.setRowCount(0);
        for (int i = 0; i < pedidos.size(); i++) {
            String[] linha = {pedidos.get(i).getId() + "", pedidos.get(i).getCliente().getNome(), pedidos.get(i).getStatus()};
            model.addRow(linha);
        }
        conexao.close();
    }

    private void preenchePerfil() throws SQLException {

        name.setText(func.getNome());
        cpfInputs.setText(func.getCpf());
        senhaInput.setText(func.getSenha());
        cargoBox.setSelectedItem(func.getCargo());
        if (func.getCargo().equals("Entregador")) {
            placaVeiculoInput.setText(func_en.getPlacaVeiculo());
            list_ProdsPainel.setVisible(false);
        }
        if (func.getEndereco() != null) {
            cepInput.setText(func.getEndereco().getCep());
            validaCep(cepInput);
            numeroInput.setText(func.getEndereco().getNumero());
        }
    }
}
