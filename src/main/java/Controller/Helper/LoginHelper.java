/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.Usuario;
import View.Login;

/**
 *
 * @author gabri
 */
public class LoginHelper implements IHelper{
    
    private final Login view;    

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
         String nome = view.getTextusuario().getText();
        String senha =view.getTextsenha().getText();
        
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
}

  public void setarModelo(Usuario modelo){  
      String nome = modelo.getNome();
      String senha = modelo.getSenha();
      
      view.getTextusuario().setText(nome);
      view.getTextsenha().setText(senha);
      
     
  }
  
  public void limparTela(){
   view.getTextusuario().setText("");
   view.getTextsenha().setText("");
   
  }

}
