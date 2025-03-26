package cep;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;


public class Endereco {
    
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String DDD;
    private String dataCriacao;
    
    public Endereco(Map<String, String> dados){
        this.cep = dados.getOrDefault("cep", "");
        this.logradouro = dados.getOrDefault("logradouro", "");
        this.complemento = dados.getOrDefault("complemento", "");
        this.bairro = dados.getOrDefault("bairro", "");
        this.localidade = dados.getOrDefault("localidade", "");
        this.uf = dados.getOrDefault("uf", "");
        this.DDD = dados.getOrDefault("DDD", "");
        this.dataCriacao = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
        // Métodos getters para acessar os atributos da classe
    
    //Retorna o CEP
    public String getCep(){
        return this.cep;
    }
    
    //Retorna a rua 
    public String getLogradouro(){
        return this.logradouro;
    }

    //Retorna o complemento
    public String getComplemento(){
        return this.complemento;
    }
    
    //Retorna o bairro
    public String getBairro(){
        return this.bairro;
    }    
    
    //Retorna a localidade
    public String getLocalidade(){
        return this.localidade;
    }
   
    //Retorna o UF
    public String getUF(){
        return this.uf;
    }

    //Retorna o DDD
    public String getDDD(){
        return this.DDD;
    }
    //Retorna a data
    public String getData(){
        return this.dataCriacao;
    }
    
    //Retorna uma string formatada contendo todas as informações do endereço
    public String formatarEndereco() {
        return String.format("Data: %s, CEP: %s, Logradouro: %s, Complemento: %s, Bairro: %s, Localidade: %s, UF: %s, DDD: %d", 
                dataCriacao, cep, logradouro, complemento, bairro, localidade, uf, DDD);
    }
}
