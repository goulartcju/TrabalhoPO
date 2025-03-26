
package cep;

import static cep.Main.url_base;
import cep.http.ClienteHttp;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import org.json.JSONObject;
/**
 *
 * @author bruno
 */
public class ConsultarCEP extends javax.swing.JFrame {

    public ConsultarCEP() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelCEP = new javax.swing.JLabel();
        txtcep = new javax.swing.JTextField();
        consultar = new javax.swing.JButton();
        consultarHistorico = new javax.swing.JButton();
        limparCampos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        LabelResultado = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        resultCEP = new javax.swing.JTextField();
        Logradouro = new javax.swing.JLabel();
        resultLogradouro = new javax.swing.JTextField();
        Complemento = new javax.swing.JLabel();
        resultBairro = new javax.swing.JTextField();
        Bairro = new javax.swing.JLabel();
        resultComplemento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        resultLocalidade = new javax.swing.JTextField();
        UF = new javax.swing.JLabel();
        resultUF = new javax.swing.JTextField();
        DDD = new javax.swing.JLabel();
        resultDDD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelCEP.setText("CEP:");

        txtcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcepActionPerformed(evt);
            }
        });

        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        consultarHistorico.setText("Histórico");
        consultarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarHistoricoActionPerformed(evt);
            }
        });

        limparCampos.setText("Limpar");
        limparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCamposActionPerformed(evt);
            }
        });

        LabelResultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelResultado.setText("Resultado");

        CEP.setText("CEP:");

        resultCEP.setEditable(false);
        resultCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultCEPActionPerformed(evt);
            }
        });

        Logradouro.setText("Logradouro:");

        resultLogradouro.setEditable(false);
        resultLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultLogradouroActionPerformed(evt);
            }
        });

        Complemento.setText("Complemento:");

        resultBairro.setEditable(false);

        Bairro.setText("Bairro:");

        resultComplemento.setEditable(false);

        jLabel1.setText("Localidade:");

        resultLocalidade.setEditable(false);
        resultLocalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultLocalidadeActionPerformed(evt);
            }
        });

        UF.setText("UF:");

        resultUF.setEditable(false);

        DDD.setText("DDD:");

        resultDDD.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(consultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultarHistorico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limparCampos))
                    .addComponent(LabelResultado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Complemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Logradouro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultUF)
                            .addComponent(resultComplemento)
                            .addComponent(resultLogradouro)
                            .addComponent(resultBairro)
                            .addComponent(resultLocalidade)
                            .addComponent(resultDDD, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(resultCEP))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limparCampos)
                    .addComponent(consultarHistorico)
                    .addComponent(consultar)
                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelResultado)
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEP)
                    .addComponent(resultCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logradouro)
                    .addComponent(resultLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Complemento)
                    .addComponent(resultComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro)
                    .addComponent(resultBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultLocalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UF)
                    .addComponent(resultUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DDD)
                    .addComponent(resultDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcepActionPerformed

    private void resultLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultLogradouroActionPerformed

    private void resultLocalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultLocalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultLocalidadeActionPerformed
    // Método chamado quando o botão "Consultar" é pressionado
    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed

        String cep = txtcep.getText();
        ClienteHttp cliente = new ClienteHttp();
         
        // Validação para garantir que o CEP foi informado
        if (cep.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o CEP.");
            return;
        }
        
        // Realiza a consulta na API via HTTP
        String resultado = cliente.buscaDados(url_base + cep + "/json/");
 
        
        try{
            JSONObject teste = new JSONObject(resultado);
            
            // Verifica se o CEP não existe
            if (teste.has("erro") && teste.getBoolean("erro")) {
                JOptionPane.showMessageDialog(null, "CEP não encontrado. Verifique o número e tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
          
            // Criando o Map com os dados
            Map<String, String> dados = new HashMap<>();
            dados.put("cep", teste.optString("cep").isEmpty() ? "Informação não encontrada" : teste.optString("cep"));
            dados.put("logradouro", teste.optString("logradouro").isEmpty() ? "Informação não encontrada" : teste.optString("logradouro"));
            dados.put("complemento", teste.optString("complemento").isEmpty() ? "Informação não encontrada" : teste.optString("complemento"));
            dados.put("bairro", teste.optString("bairro").isEmpty() ? "Informação não encontrada" : teste.optString("bairro"));
            dados.put("localidade", teste.optString("localidade").isEmpty() ? "Informação não encontrada" : teste.optString("localidade"));
            dados.put("uf", teste.optString("uf").isEmpty() ? "Informação não encontrada" : teste.optString("uf"));
            dados.put("DDD", teste.optString("ddd").isEmpty() ? "Informação não encontrada" : teste.optString("ddd"));

            // Criando o objeto Endereco
            Endereco meuEndereco = new Endereco(dados);

            // Exibindo os dados nos campos do formulário
            resultCEP.setText(meuEndereco.getCep());
            resultLogradouro.setText(meuEndereco.getLogradouro());
            resultComplemento.setText(meuEndereco.getComplemento());
            resultBairro.setText(meuEndereco.getBairro());
            resultLocalidade.setText(meuEndereco.getLocalidade());
            resultUF.setText(meuEndereco.getUF());
            resultDDD.setText(meuEndereco.getDDD());
        
            // Salva o histórico da consulta em um arquivo
            salvarHistorico(meuEndereco);            
         
        } catch(org.json.JSONException e){
            // Trata erro caso o CEP informado seja inválido ou a API não retorne um JSON válido  
            JOptionPane.showMessageDialog(null, "CEP inválido, por favor tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch(Exception e){
            // Captura qualquer erro inesperado
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        

    }//GEN-LAST:event_consultarActionPerformed

    private void resultCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultCEPActionPerformed
        // Método para limpar os campos de resultado da consulta
    private void limparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCamposActionPerformed
        // TODO add your handling code here:
        resultCEP.setText("");
        resultLogradouro.setText("");
        resultComplemento.setText("");
        resultBairro.setText("");
        resultLocalidade.setText("");
        resultUF.setText("");
        resultDDD.setText("");
        
        JOptionPane.showMessageDialog(null, "Os campos foram limpos com sucesso.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_limparCamposActionPerformed
        // Método que abre a tela do histórico de consultas
    private void consultarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarHistoricoActionPerformed
        // TODO add your handling code here:
        Historico telaHistorico = new Historico();
        telaHistorico.setVisible(true);
    }//GEN-LAST:event_consultarHistoricoActionPerformed

    
    // Método para salvar o histórico de consultas em um arquivo JSON
    private void salvarHistorico(Endereco meuEndereco) {
        try (FileWriter file = new FileWriter("historico.txt", true)) {
            JSONObject json = new JSONObject();
            json.put("data", meuEndereco.getData());
            json.put("cep", meuEndereco.getCep());
            json.put("logradouro", meuEndereco.getLogradouro());
            json.put("complemento", meuEndereco.getComplemento());
            json.put("bairro", meuEndereco.getBairro());
            json.put("localidade", meuEndereco.getLocalidade());
            json.put("uf", meuEndereco.getUF());
            json.put("DDD", meuEndereco.getDDD());

            file.write(json.toString() + "\n");
            file.flush();
        } catch (IOException e) {
            System.err.println("Erro ao salvar histórico: " + e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarCEP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCEP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCEP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCEP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCEP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel Complemento;
    private javax.swing.JLabel DDD;
    private javax.swing.JLabel LabelCEP;
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JLabel Logradouro;
    private javax.swing.JLabel UF;
    private javax.swing.JButton consultar;
    private javax.swing.JButton consultarHistorico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limparCampos;
    private javax.swing.JTextField resultBairro;
    private javax.swing.JTextField resultCEP;
    private javax.swing.JTextField resultComplemento;
    private javax.swing.JTextField resultDDD;
    private javax.swing.JTextField resultLocalidade;
    private javax.swing.JTextField resultLogradouro;
    private javax.swing.JTextField resultUF;
    private javax.swing.JTextField txtcep;
    // End of variables declaration//GEN-END:variables
}
