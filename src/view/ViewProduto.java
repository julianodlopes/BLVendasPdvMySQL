/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import controller.ControllerFornecedor;
import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelFornecedor;
import model.ModelProdutos;
import util.VerificarCampo;

public class ViewProduto extends javax.swing.JFrame {

    ModelProdutos modelProdutos = new ModelProdutos();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerFornecedor controllerFornecedor = new ControllerFornecedor();
    ArrayList<ModelProdutos> listamModelProdutos = new ArrayList<ModelProdutos>();
    ArrayList<ModelFornecedor> listaFornecedor = new ArrayList<ModelFornecedor>();
    String tipoCadastro;

    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        setLocationRelativeTo(null);
        this.carregarProdutos();
        this.listarFornecedor();
        novoProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btPesquisaProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        tfCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfNome = new util.VerificarCampo("Numeros/Letras",50);
        cbFornecedores = new componentes.UJComboBox();
        tfCodigoBarras = new util.VerificarCampo("Numeros",50);
        jLabel6 = new javax.swing.JLabel();
        tfValor = new util.VerificarCampo("Numeros/Ponto",10);
        jLabel7 = new javax.swing.JLabel();
        tfPesquisaProduto = new util.VerificarCampo("Numeros/Letras",50);
        tfEstoque = new util.VerificarCampo("Numeros",10);
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setAlwaysOnTop(true);
        setMaximumSize(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btPesquisaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Search.png"))); // NOI18N
        btPesquisaProduto.setText("Pesquisar");
        btPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 127, -1, -1));

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setText("Valor (R$):");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel3.setText("Fornecedor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 69, 140, -1));

        jLabel4.setText("Quant. Estoque:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 19, -1, -1));

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        jPanel1.add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Modify.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Save.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(false);
        jPanel1.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 39, 82, -1));

        jLabel5.setText("Código:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, -1, -1));
        jPanel1.add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 40, 259, -1));
        jPanel1.add(cbFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 89, 380, -1));

        tfCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCodigoBarrasKeyReleased(evt);
            }
        });
        jPanel1.add(tfCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 89, 190, -1));

        jLabel6.setText("Código de barras:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 69, -1, -1));
        jPanel1.add(tfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 40, 103, -1));

        jLabel7.setText("Buscar:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel1.add(tfPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 390, -1));
        jPanel1.add(tfEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 110, -1));

        tbProdutos.setAutoCreateRowSorter(true);
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbProdutos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 165, 580, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaProdutoActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) this.tbProdutos.getModel();
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tabela);
        this.tbProdutos.setRowSorter(sorter);
        String text = tfPesquisaProduto.getText();
        sorter.setRowFilter(RowFilter.regexFilter(text, 1));
    }//GEN-LAST:event_btPesquisaProdutoActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        novoProduto();
        tipoCadastro = "novo";
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (testarSelecao() == true) {
            novoProduto();
            recuperarProduto();
            tipoCadastro = "alteracao";
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        //excluir produto
        this.excluirProduto();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (jtfNome.getText().trim().equals("") || tfValor.getText().trim().equals("")
                || tfEstoque.getText().trim().equals("") || tfCodigoBarras.getText().trim().equals("")
                || cbFornecedores.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "É necessário preencher todos os campos e selecionar o fornecedor");
        } else if (tipoCadastro.equals("novo")) {
            salvarProduto();
        } else if (tipoCadastro.equals("alteracao")) {
            alterarProduto();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfCodigoBarrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoBarrasKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cbFornecedores.grabFocus();
        }
    }//GEN-LAST:event_tfCodigoBarrasKeyReleased

    private void listarFornecedor() {
        listaFornecedor = controllerFornecedor.getListaFornecedorController();
        cbFornecedores.removeAllItems();
        for (int i = 0; i < listaFornecedor.size(); i++) {
            cbFornecedores.addItem(listaFornecedor.get(i).getNome());
        }
    }

    private boolean testarSelecao() {
        int selecionada = tbProdutos.getSelectedRow();

        if (selecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para realizar essa operação.");
            return false;
        }
        return true;
    }

    private void excluirProduto() {
        if (testarSelecao() == true) {
            int linha = tbProdutos.getSelectedRow();
            String nome = (String) tbProdutos.getValueAt(linha, 1);
            int codigo = (Integer) tbProdutos.getValueAt(linha, 0);
            //pegunta se realmente deseja excluir
            int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                    + " excluir o registro \nNome: "
                    + nome + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim exclui, se não não faz nada    
            if (opcao == JOptionPane.OK_OPTION) {
                if (controllerProdutos.excluirProdutosController(codigo)) {
                    JOptionPane.showMessageDialog(this, "Registro excluído com suscesso!");
                    carregarProdutos();
                    novoProduto();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao e os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private boolean recuperarProduto() {
        //recebe a linha selecionada
        int linha = this.tbProdutos.getSelectedRow();
        //pega o codigo do cliente na linha selecionada
        int codigo = (Integer) tbProdutos.getValueAt(linha, 0);
        try {
            //recupera os dados do banco
            modelProdutos = controllerProdutos.getProdutosController(codigo);
            //seta os dados na interface
            this.tfCodigo.setText(String.valueOf(modelProdutos.getCodigo()));
            this.jtfNome.setText(modelProdutos.getNome());
            this.tfValor.setText(modelProdutos.getValor().toString());
            this.tfEstoque.setText(String.valueOf(modelProdutos.getEstoque()));
            this.cbFornecedores.setSelectedItem(controllerFornecedor.getFornecedorController(modelProdutos.getFornecedoresCodigo()).getNome());
            this.tfCodigoBarras.setText(String.valueOf(modelProdutos.getCodigoBarras()));
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private boolean alterarProduto() {
        modelProdutos.setCodigo(Integer.parseInt(this.tfCodigo.getText()));
        modelProdutos.setNome(this.jtfNome.getText());
        modelProdutos.setValor(Double.parseDouble(this.tfValor.getText()));
        modelProdutos.setFornecedoresCodigo(controllerFornecedor.getFornecedorController(this.cbFornecedores.getSelectedItem().toString()).getCodigo());
        modelProdutos.setEstoque(Integer.parseInt(this.tfEstoque.getText()));
        modelProdutos.setCodigoBarras(this.tfCodigoBarras.getText());
        //salvar 
        if (controllerProdutos.atualizarProdutosController(modelProdutos)) {
            JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!");
            novoProduto();
            this.carregarProdutos();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void carregarProdutos() {
        listamModelProdutos = controllerProdutos.getListaProdutosController();
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setNumRows(0);
        //CARREGA OS DADOS DA LISTA NA TABELA
        int cont = listamModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listamModelProdutos.get(i).getCodigo(),
                listamModelProdutos.get(i).getNome(),
                listamModelProdutos.get(i).getValor(),
                listamModelProdutos.get(i).getEstoque()
            });
        }
    }

    private void novoProduto() {
        tfCodigo.setText("Novo");
        jtfNome.setText("");
        tfValor.setText("");
        tfEstoque.setText("");
        tfCodigoBarras.setText("");
        cbFornecedores.setSelectedItem(null);
        tipoCadastro = "novo";
        jtfNome.grabFocus();
    }

    private boolean salvarProduto() {
        modelProdutos.setNome(this.jtfNome.getText());
        modelProdutos.setValor(Double.parseDouble(this.tfValor.getText()));
        modelProdutos.setFornecedoresCodigo(controllerFornecedor.getFornecedorController(this.cbFornecedores.getSelectedItem().toString()).getCodigo());
        modelProdutos.setEstoque(Integer.parseInt(this.tfEstoque.getText()));
        modelProdutos.setCodigoBarras(this.tfCodigoBarras.getText());
        //salvar 
        if (controllerProdutos.salvarProdutosController(modelProdutos) > 0) {
            JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
            this.carregarProdutos();
            novoProduto();
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisaProduto;
    private javax.swing.JButton btSalvar;
    private componentes.UJComboBox cbFornecedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCodigoBarras;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfPesquisaProduto;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
