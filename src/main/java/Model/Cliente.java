/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author gabri
 */
public class Cliente extends Pessoa{
    
   private String enedereço;
   private String cep;

    public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String enedereço, String cep) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.enedereço = enedereço;
        this.cep = cep;
    }

    public Cliente( int id, String nome, String enedereço, String cep) {
        super(id, nome);
        this.enedereço = enedereço;
        this.cep = cep;
    }

   
    
    public String getEnedereço() {
        return enedereço;
    }

    public void setEnedereço(String enedereço) {
        this.enedereço = enedereço;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

  
   @Override
   public String toString(){
       return getNome();
       
   }

    

 
    
    
    
}
