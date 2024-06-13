/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela() {
        
        // busca uma lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //exibir essa lista na view 
        helper.preencherTabela(agendamentos);
        
        
     
        
        
    
}
    public void atualizaCliente(){
     //busca  cliente no banco de dados   
     ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //exibir clinte no combobox clientes
        helper.preencherClientes(clientes);
        
        
    }
    
    public void atualizaServico(){
     ServicoDAO servicoDAO = new ServicoDAO();   
     ArrayList<Servico>servicos = servicoDAO.selectAll();
     
     helper.preencherServicos(servicos);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();   
        helper.setarValor(servico.getValor());
    }

    public void agendar(){
     //busca obj agendamento da tela   
     Agendamento agendamento = helper.obterModelo();
     
     
     //salva objeto no banco de dados
     new AgendamentoDAO().insert(agendamento);
     
     //inserir elemneto na tabela
     atualizaTabela();
     helper.limparTela();
     
     
    }
        
}
