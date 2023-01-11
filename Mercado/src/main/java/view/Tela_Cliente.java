package view;

import DAO.CarrinhoDAO;
import DAO.ConexaoDAO;
import DAO.PedidoDAO;
import DAO.ProdutoDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carrinho;
import model.Cliente;
import model.Pedido;
import model.PedidoDelivery;
import model.PedidoRetirar;
import model.Produto;
import model.Entregador;

public class Tela_Cliente extends javax.swing.JFrame {

    private Cliente clienteLogado = new Cliente(Login.getUser());

    public Tela_Cliente() throws SQLException {
        initComponents();
        getProds();
        getCarrinho();
        getPedidos();
        contaLabel.setText("Conta: R$ " + clienteLogado.getConta());
        this.totalLabel.setText("Total no Carrinho: R$ " + new Carrinho(clienteLogado).getPrecoTotal());
        if (Entregador.contEntregador() <= 0) {
            this.pedidoDelivery.setVisible(false);
        }
    }

    private void getProds() throws SQLException {
        Connection conexao = new ConexaoDAO().getConection();
        ArrayList<Produto> produtos = new ProdutoDAO(conexao).getAll();
        if (produtos != null) {
            DefaultTableModel model = (DefaultTableModel) list_Prods.getModel();
            model.setRowCount(0);
            for (int i = 0; i < produtos.size(); i++) {
                String[] linha = {produtos.get(i).getId() + "", produtos.get(i).getNome(), produtos.get(i).getPreco() + ""};
                model.addRow(linha);
            }
        }
        conexao.close();
    }

    private void getCarrinho() throws SQLException {

        Connection conexao = new ConexaoDAO().getConection();
        CarrinhoDAO carrinhoDAO = new CarrinhoDAO(conexao);
        ProdutoDAO produtDAO = new ProdutoDAO(conexao);
        ArrayList<Produto> produtos = carrinhoDAO.getProdutos(clienteLogado);
        for (int i = 0; i < produtos.size(); i++) {
            produtos.get(i).setPreco(produtDAO.getPreco(produtos.get(i)));
            produtos.get(i).setNome(produtDAO.getNome(produtos.get(i)));
        }
        DefaultTableModel model = (DefaultTableModel) carrinho.getModel();
        model.setRowCount(0);
        for (int i = 0; i < produtos.size(); i++) {
            String[] linha = {produtos.get(i).getId() + "", produtos.get(i).getNome(), produtos.get(i).getQuantidade() + "", (produtos.get(i).getPreco() * produtos.get(i).getQuantidade()) + ""};
            model.addRow(linha);
        }
        conexao.close();
    }

    private void getPedidos() throws SQLException {
        Connection conexao = new ConexaoDAO().getConection();
        ArrayList<Pedido> pedido = null;
        pedido = new PedidoDAO(conexao).getPedidosALL();
        if (pedido != null) {
            DefaultTableModel model = (DefaultTableModel) pedidos.getModel();
            model.setRowCount(0);
            for (int i = 0; i < pedido.size(); i++) {
                String[] linha = {pedido.get(i).getId() + "", pedido.get(i).getStatus()};
                model.addRow(linha);
            }
        }
        conexao.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPagamento = new javax.swing.ButtonGroup();
        buttonGroupTipo = new javax.swing.ButtonGroup();
        container = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        list_ProdsPainel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_Prods = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeInput = new javax.swing.JTextField();
        adicionarButton = new javax.swing.JButton();
        pedidosPainel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pedidos = new javax.swing.JTable();
        carrinhoPainel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        carrinho = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        removerButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pagamentoAVista = new javax.swing.JRadioButton();
        pagamentoAPrazo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        pedidoRetirada = new javax.swing.JRadioButton();
        pedidoDelivery = new javax.swing.JRadioButton();
        totalLabel = new javax.swing.JLabel();
        sairButton = new javax.swing.JButton();
        pagarBTN = new javax.swing.JButton();
        contaLabel = new javax.swing.JLabel();

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
                false, false, true
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
        }

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

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

        adicionarButton.setBackground(new java.awt.Color(9, 9, 91));
        adicionarButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        adicionarButton.setForeground(new java.awt.Color(255, 255, 255));
        adicionarButton.setText("Adicionar");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(quantidadeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(adicionarButton)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantidadeLabel)
                    .addComponent(quantidadeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(adicionarButton)
                .addContainerGap(23, Short.MAX_VALUE))
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

        tabbedPane.addTab("Lista de Produtos", list_ProdsPainel);

        pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número do pedido", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(pedidos);

        javax.swing.GroupLayout pedidosPainelLayout = new javax.swing.GroupLayout(pedidosPainel);
        pedidosPainel.setLayout(pedidosPainelLayout);
        pedidosPainelLayout.setHorizontalGroup(
            pedidosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        pedidosPainelLayout.setVerticalGroup(
            pedidosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pedidosPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Pedidos", pedidosPainel);

        carrinhoPainel.setBackground(new java.awt.Color(0, 255, 255));
        carrinhoPainel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N

        carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Quantidade", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(carrinho);

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        removerButton.setBackground(new java.awt.Color(9, 9, 91));
        removerButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        removerButton.setForeground(new java.awt.Color(255, 255, 255));
        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        finishButton.setBackground(new java.awt.Color(9, 9, 91));
        finishButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        finishButton.setForeground(new java.awt.Color(255, 255, 255));
        finishButton.setText("Fazer Pedido");
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 9, 91));
        jLabel1.setText("Pagamento");
        jLabel1.setToolTipText("");

        buttonGroupPagamento.add(pagamentoAVista);
        pagamentoAVista.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pagamentoAVista.setForeground(new java.awt.Color(9, 9, 91));
        pagamentoAVista.setSelected(true);
        pagamentoAVista.setText("À Vista");
        pagamentoAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoAVistaActionPerformed(evt);
            }
        });

        buttonGroupPagamento.add(pagamentoAPrazo);
        pagamentoAPrazo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pagamentoAPrazo.setForeground(new java.awt.Color(9, 9, 91));
        pagamentoAPrazo.setText("À Prazo");
        pagamentoAPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagamentoAPrazoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(9, 9, 91));
        jLabel2.setText("Tipo do Pedido");
        jLabel2.setToolTipText("");

        buttonGroupTipo.add(pedidoRetirada);
        pedidoRetirada.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pedidoRetirada.setForeground(new java.awt.Color(9, 9, 91));
        pedidoRetirada.setSelected(true);
        pedidoRetirada.setText("Retirar na Loja");
        pedidoRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoRetiradaActionPerformed(evt);
            }
        });

        buttonGroupTipo.add(pedidoDelivery);
        pedidoDelivery.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        pedidoDelivery.setForeground(new java.awt.Color(9, 9, 91));
        pedidoDelivery.setText("Delivery");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pedidoRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pagamentoAPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pagamentoAVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finishButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pedidoDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finishButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagamentoAVista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagamentoAPrazo)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(pedidoRetirada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pedidoDelivery)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        totalLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(9, 9, 91));
        totalLabel.setText("Total no Carrinho: R$ 500,00");

        javax.swing.GroupLayout carrinhoPainelLayout = new javax.swing.GroupLayout(carrinhoPainel);
        carrinhoPainel.setLayout(carrinhoPainelLayout);
        carrinhoPainelLayout.setHorizontalGroup(
            carrinhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carrinhoPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(carrinhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLabel))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        carrinhoPainelLayout.setVerticalGroup(
            carrinhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carrinhoPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carrinhoPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        tabbedPane.addTab("Carrinho", carrinhoPainel);

        sairButton.setBackground(new java.awt.Color(9, 9, 91));
        sairButton.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        sairButton.setForeground(new java.awt.Color(255, 255, 255));
        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        pagarBTN.setBackground(new java.awt.Color(9, 9, 91));
        pagarBTN.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        pagarBTN.setForeground(new java.awt.Color(255, 255, 255));
        pagarBTN.setText("Pagar");
        pagarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarBTNActionPerformed(evt);
            }
        });

        contaLabel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        contaLabel.setForeground(new java.awt.Color(9, 9, 91));
        contaLabel.setText("Conta: R$ 500,00");

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pagarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairButton)
                    .addComponent(pagarBTN)
                    .addComponent(contaLabel))
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

    private void pedidoRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoRetiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pedidoRetiradaActionPerformed

    private void pagamentoAPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoAPrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoAPrazoActionPerformed

    private void pagamentoAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagamentoAVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagamentoAVistaActionPerformed

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        if (carrinho.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "O carrinho está vazio", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Carrinho carrinhoModel = new Carrinho(clienteLogado);
        try {
            carrinhoModel.getProdutos();
            String pagamento = "";
            if (pagamentoAVista.isSelected()) {
                pagamento = "a vista";
            } else {
                if (pagamentoAPrazo.isSelected()) {
                    if (carrinhoModel.getPrecoTotal() > 500) {
                        JOptionPane.showMessageDialog(null, "O valor de sua compra ultrapassou 500 reais. Não será possível comprar à prazo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    if (clienteLogado.getConta() > 0) {
                        JOptionPane.showMessageDialog(null, "Você tem uma conta sem pagamento. Não será possível comprar à prazo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    pagamento = "a prazo";
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione o tipo de pagamento", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if (pedidoRetirada.isSelected()) {
                if (pagamento.equals("a prazo")) {
                    clienteLogado.setConta(carrinhoModel.getPrecoTotal());
                    contaLabel.setText("Conta: R$ " + clienteLogado.getConta());
                    System.out.println(clienteLogado.getConta());
                }
                new PedidoRetirar(carrinhoModel, pagamento);
                esvaziaCarrinho();
            } else {
                if (pedidoDelivery.isSelected()) {
                    if (pagamento.equals("a prazo")) {
                        clienteLogado.setConta(carrinhoModel.getPrecoTotal());
                        contaLabel.setText("Conta: R$ " + clienteLogado.getConta());
                        System.out.println(clienteLogado.getConta());
                    }
                    new PedidoDelivery(carrinhoModel, pagamento);
                    esvaziaCarrinho();
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione o tipo de pedido", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            getCarrinho();
            getPedidos();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_finishButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        if (carrinho.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Um produto deve ser selecionado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Carrinho carrinhoModel = new Carrinho(clienteLogado);
        DefaultTableModel modelCarrinho = (DefaultTableModel) carrinho.getModel();
        int id = Integer.parseInt(modelCarrinho.getValueAt(carrinho.getSelectedRow(), 0).toString());
        double quantidade = Double.parseDouble(modelCarrinho.getValueAt(carrinho.getSelectedRow(), 2).toString());
        try {
            carrinhoModel.removerProduto(id, quantidade);
            getProds();
            getCarrinho();
            this.totalLabel.setText("Total no Carrinho: R$ " + carrinhoModel.getPrecoTotal());
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        if (list_Prods.getSelectedRow() != -1) {
            if (quantidadeInput.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Uma quantidade deve ser informada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Carrinho carrinhoModel = new Carrinho(clienteLogado);
            try {
                DefaultTableModel modelList = (DefaultTableModel) list_Prods.getModel();
                int id = Integer.parseInt(modelList.getValueAt(list_Prods.getSelectedRow(), 0).toString());
                double quantidade = Double.parseDouble(quantidadeInput.getText());
                boolean adicionou = carrinhoModel.addProduto(id, quantidade);
                if (adicionou) {
                    Produto produto = new Produto(id);
                    String nome = produto.getNome();
                    double preco = produto.getId() * quantidade;
                    DefaultTableModel modelCarrinho = (DefaultTableModel) carrinho.getModel();
                    modelCarrinho.addRow(new Object[]{nome, quantidade, preco});
                    list_Prods.clearSelection();
                    this.totalLabel.setText("Total no Carrinho: R$ " + carrinhoModel.getPrecoTotal());
                }
                getProds();
                getCarrinho();
            } catch (SQLException ex) {
                Logger.getLogger(Tela_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Um produto deve ser selecionado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void quantidadeInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeInputKeyTyped
    }//GEN-LAST:event_quantidadeInputKeyTyped

    private void quantidadeInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeInputKeyReleased
    }//GEN-LAST:event_quantidadeInputKeyReleased

    private void pagarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarBTNActionPerformed
        contaLabel.setText("Conta: R$ 0,00");
        clienteLogado.setConta(0);
    }//GEN-LAST:event_pagarBTNActionPerformed

    private void esvaziaCarrinho() throws SQLException {
        Carrinho carrinhoModel = new Carrinho(clienteLogado);
        carrinhoModel.esvazia();
        this.totalLabel.setText("Total no Carrinho: R$ 0,00");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.ButtonGroup buttonGroupPagamento;
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JTable carrinho;
    private javax.swing.JPanel carrinhoPainel;
    private javax.swing.JLabel contaLabel;
    private javax.swing.JPanel container;
    private javax.swing.JButton finishButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable list_Prods;
    private javax.swing.JPanel list_ProdsPainel;
    private javax.swing.JRadioButton pagamentoAPrazo;
    private javax.swing.JRadioButton pagamentoAVista;
    private javax.swing.JButton pagarBTN;
    private javax.swing.JRadioButton pedidoDelivery;
    private javax.swing.JRadioButton pedidoRetirada;
    private javax.swing.JTable pedidos;
    private javax.swing.JPanel pedidosPainel;
    private javax.swing.JTextField quantidadeInput;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
