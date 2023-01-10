package view;

import DAO.CarrinhoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Carrinho;
import model.Cliente;
import model.Produto;

public class Tela_Cliente extends javax.swing.JFrame {

    public Tela_Cliente() {
        initComponents();
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
        quantidadeLabel = new javax.swing.JLabel();
        quantidadeInput = new javax.swing.JTextField();
        adicionarButton = new javax.swing.JButton();
        carrinhoPainel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        carrinho = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        removerButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        pedidosPainel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pedidos = new javax.swing.JTable();
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
                "Nome", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
                .addContainerGap(20, Short.MAX_VALUE))
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

        carrinhoPainel.setBackground(new java.awt.Color(0, 255, 255));
        carrinhoPainel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N

        carrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(carrinho);
        if (carrinho.getColumnModel().getColumnCount() > 0) {
            carrinho.getColumnModel().getColumn(0).setResizable(false);
            carrinho.getColumnModel().getColumn(1).setResizable(false);
            carrinho.getColumnModel().getColumn(2).setResizable(false);
        }

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(removerButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(finishButton)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(removerButton)
                .addGap(18, 18, 18)
                .addComponent(finishButton)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout carrinhoPainelLayout = new javax.swing.GroupLayout(carrinhoPainel);
        carrinhoPainel.setLayout(carrinhoPainelLayout);
        carrinhoPainelLayout.setHorizontalGroup(
            carrinhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carrinhoPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        carrinhoPainelLayout.setVerticalGroup(
            carrinhoPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carrinhoPainelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(carrinhoPainelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Carrinho", carrinhoPainel);

        pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número do pedido", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
                .addGap(0, 10, Short.MAX_VALUE)
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

    private void quantidadeInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeInputKeyReleased
        mascaraInt(quantidadeInput);
    }//GEN-LAST:event_quantidadeInputKeyReleased

    private void quantidadeInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeInputKeyTyped
        mascaraInt(quantidadeInput);
    }//GEN-LAST:event_quantidadeInputKeyTyped

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        Carrinho carrinhoModel = new Carrinho(new Cliente(Login.getUser()));
        try {
            DefaultTableModel modelList = (DefaultTableModel) carrinho.getModel();
            int id = (int) modelList.getValueAt(list_Prods.getSelectedRow(), 0);
            double quantidade = Double.parseDouble(quantidadeInput.getText());
            boolean adicionou = carrinhoModel.addProduto(id, quantidade);
            if (adicionou) {
                Produto produto = new Produto(id);
                String nome = produto.getNome();
                double preco = produto.getId() * quantidade;
                DefaultTableModel modelCarrinho = (DefaultTableModel) carrinho.getModel();
                modelCarrinho.addRow(new Object[]{nome, quantidade, preco});
                list_Prods.clearSelection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adicionarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        Carrinho carrinhoModel = new Carrinho(new Cliente(Login.getUser()));
        DefaultTableModel modelCarrinho = (DefaultTableModel) carrinho.getModel();
        int id = (int) modelCarrinho.getValueAt(carrinho.getSelectedRow(), 0);
        double quantidade = (double) modelCarrinho.getValueAt(carrinho.getSelectedRow(), 0);
        try {
            carrinhoModel.removerProduto(id, quantidade);
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private void mascaraInt(JTextField textField) {
        String texto = textField.getText();
        if (texto.length() > 0) {
            if (texto.charAt(texto.length() - 1) < '0' || texto.charAt(texto.length() - 1) > '9') {
                texto = texto.substring(0, texto.length() - 1);
            }
        }
        textField.setText(texto);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JTable carrinho;
    private javax.swing.JPanel carrinhoPainel;
    private javax.swing.JPanel container;
    private javax.swing.JButton finishButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable list_Prods;
    private javax.swing.JPanel list_ProdsPainel;
    private javax.swing.JTable pedidos;
    private javax.swing.JPanel pedidosPainel;
    private javax.swing.JTextField quantidadeInput;
    private javax.swing.JLabel quantidadeLabel;
    private javax.swing.JButton removerButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
