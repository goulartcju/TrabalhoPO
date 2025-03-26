
package cep;

import javax.swing.JFrame;


public class Main {
    public static String url_base = "https://viacep.com.br/ws/";
    
    public static void main(String[] args) {
       
        
        ConsultarCEP telaPrincipal = new ConsultarCEP();
        
        telaPrincipal.setVisible(true);
        
    }
}