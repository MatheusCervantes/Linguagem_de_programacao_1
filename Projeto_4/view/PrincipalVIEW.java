package br.com.projeto_4.view;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import br.com.projeto_4.dto.FuncionarioDTO;

public class PrincipalVIEW extends javax.swing.JFrame {

    public PrincipalVIEW(FuncionarioDTO funcionarioDTO) {
        initComponents();
        this.setLocationRelativeTo(null);
        if (funcionarioDTO.getTipo_fun().equalsIgnoreCase("COMUM")) {
            itemMenuFuncionario.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ImageIcon imageicon = new ImageIcon(getClass().getResource("imagens/tela_inicial.jpg"));
        Image image = imageicon.getImage();

        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics graphics){
                graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        }

        ;
        menuBar = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        itemMenuCliente = new javax.swing.JMenuItem();
        itemMenuFornecedor = new javax.swing.JMenuItem();
        itemMenuProduto = new javax.swing.JMenuItem();
        itemMenuFuncionario = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        itemMenuVenda = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setMnemonic('c');
        menuCadastro.setText("Cadastro");

        itemMenuCliente.setText("Cliente");
        itemMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(itemMenuCliente);

        itemMenuFornecedor.setMnemonic('f');
        itemMenuFornecedor.setText("Fornecedor");
        itemMenuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFornecedorActionPerformed(evt);
            }
        });
        menuCadastro.add(itemMenuFornecedor);

        itemMenuProduto.setMnemonic('p');
        itemMenuProduto.setText("Produto");
        itemMenuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(itemMenuProduto);

        itemMenuFuncionario.setText("Funcionário");
        itemMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFuncionarioActionPerformed(evt);
            }
        });
        menuCadastro.add(itemMenuFuncionario);

        menuBar.add(menuCadastro);

        menuVenda.setText("Venda");

        itemMenuVenda.setText("Realizar Venda");
        itemMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVendaActionPerformed(evt);
            }
        });
        menuVenda.add(itemMenuVenda);

        menuBar.add(menuVenda);

        menuSair.setMnemonic('s');
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        sair();
    }//GEN-LAST:event_menuSairMouseClicked

    private void itemMenuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFornecedorActionPerformed
        abreFornecedorVIEW();
    }//GEN-LAST:event_itemMenuFornecedorActionPerformed

    private void itemMenuProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuProdutoActionPerformed
        abreProdutoVIEW();
    }//GEN-LAST:event_itemMenuProdutoActionPerformed

    private void itemMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuClienteActionPerformed
        abreClienteVIEW();
    }//GEN-LAST:event_itemMenuClienteActionPerformed

    private void itemMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVendaActionPerformed
        abreVendaVIEW();
    }//GEN-LAST:event_itemMenuVendaActionPerformed

    private void itemMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFuncionarioActionPerformed
        abreFuncionarioVIEW();
    }//GEN-LAST:event_itemMenuFuncionarioActionPerformed

    private void sair() {
        Object[] options = {"Sair", "Cancelar"};
        if (JOptionPane.showOptionDialog(null, "Deseja Sair do Sistema", "Informação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0) {
            System.exit(0);
        }
    }

    private void abreClienteVIEW() {
        ClienteVIEW clienteVIEW = new ClienteVIEW();
        this.desktopPane.add(clienteVIEW);
        clienteVIEW.setVisible(true);
        clienteVIEW.setPosicao();
    }

    private void abreFornecedorVIEW() {
        FornecedorVIEW fornecedorVIEW = new FornecedorVIEW();
        this.desktopPane.add(fornecedorVIEW);
        fornecedorVIEW.setVisible(true);
        fornecedorVIEW.setPosicao();
    }

    private void abreProdutoVIEW() {
        ProdutoVIEW produtoVIEW = new ProdutoVIEW();
        this.desktopPane.add(produtoVIEW);
        produtoVIEW.setVisible(true);
        produtoVIEW.setPosicao();
    }

    private void abreVendaVIEW() {
        VendaVIEW vendaVIEW = new VendaVIEW();
        this.desktopPane.add(vendaVIEW);
        vendaVIEW.setVisible(true);
        vendaVIEW.setPosicao();
    }

    private void abreFuncionarioVIEW() {
        FuncionarioVIEW funcionarioVIEW = new FuncionarioVIEW();
        this.desktopPane.add(funcionarioVIEW);
        funcionarioVIEW.setVisible(true);
        funcionarioVIEW.setPosicao();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemMenuCliente;
    private javax.swing.JMenuItem itemMenuFornecedor;
    private javax.swing.JMenuItem itemMenuFuncionario;
    private javax.swing.JMenuItem itemMenuProduto;
    private javax.swing.JMenuItem itemMenuVenda;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuVenda;
    // End of variables declaration//GEN-END:variables

}