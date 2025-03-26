/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;
/**
 *
 * @author bruno
 */
public class Historico extends javax.swing.JFrame {
 
    /**
     * Creates new form Historico
     */
    public Historico() {
         
        initComponents(); 
        // Variável para verificar se há registros no histórico
        boolean temHistorico = false;
        
        // Fecha somente a janela do histórico
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        // Tenta abrir e ler o arquivo de histórico
        try (BufferedReader br = new BufferedReader(new FileReader("historico.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                temHistorico = true;
                JSONObject json = new JSONObject(linha);
                // Adiciona as informações no JTextArea
                textConsultas.append("Data: " + json.getString("data") + ", ");
                textConsultas.append("CEP: " + json.getString("cep") + ", ");
                textConsultas.append("Logradouro: " + json.getString("logradouro") + ", ");
                textConsultas.append("Complemento: " + json.optString("complemento", "") + ", ");
                textConsultas.append("Bairro: " + json.getString("bairro") + ", ");
                textConsultas.append("Localidade: " + json.getString("localidade") + ", ");
                textConsultas.append("UF: " + json.getString("uf") + ", ");
                textConsultas.append("DDD: " + Integer.toString(json.optInt("DDD", 0)));
                textConsultas.append("\n\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler historico: " + e.getMessage());
        }
        
        // Se não houver histórico
        if (!temHistorico) {
            textConsultas.setText("Você ainda não realizou nenhuma consulta.");
        }  
    
        textConsultas.setCaretPosition(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textHistorico = new javax.swing.JLabel();
        separadorConsultas = new javax.swing.JSeparator();
        scrollConsultas = new javax.swing.JScrollPane();
        textConsultas = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textHistorico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textHistorico.setText("Histórico de Consultas");

        textConsultas.setEditable(false);
        textConsultas.setColumns(20);
        textConsultas.setRows(5);
        scrollConsultas.setViewportView(textConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorConsultas)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 340, Short.MAX_VALUE)
                        .addComponent(textHistorico)
                        .addGap(0, 339, Short.MAX_VALUE))
                    .addComponent(scrollConsultas))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollConsultas;
    private javax.swing.JSeparator separadorConsultas;
    private javax.swing.JTextArea textConsultas;
    private javax.swing.JLabel textHistorico;
    // End of variables declaration//GEN-END:variables
}
