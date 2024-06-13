/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;
import java.awt.Menu;

/**
 *
 * @author gabri
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        
        //pega um usuario da view
       Usuario usuario = helper.obterModelo();
        
        
                
        //pesquisa usuario no banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado =  usuarioDAO.selectPorNomeESenha(usuario);
        
        //se o ususario da view tive o msm usuario e senha q o ususario da banco vou direciona direto para o menu
        // se naão vou o  mostra uma mensagem ao usuario "usuario ou senha invalidos"
        if(usuarioAutenticado !=null){
        MenuPrincipal menu = new MenuPrincipal();         
        menu.setVisible(true);
        this.view.dispose();
        }else{ 
            view.exibeMensagem("Usuario e Senha Invalidos");
           
        }       
        
            
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do Banco de Dados");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }

    
    
}
