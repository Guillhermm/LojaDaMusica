/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unicamp.ft.lojadamusica.login;

import br.unicamp.ft.lojadamusica.login.Funcionario;
import br.unicamp.ft.lojadamusica.login.IFuncionario;
import br.unicamp.ft.lojadamusica.armazenamento.ArquivoDeLogin;
import br.unicamp.ft.lojadamusica.logica.LojaDaMusica;

/**
 *
 * @author Guillhermm
 */
class proxyDeProtecao implements IFuncionario {

    private final String numeroDaMatricula, senhaDigitada;
    Funcionario funcionario;
    
    public proxyDeProtecao(String matricula, String senha) {
        numeroDaMatricula = matricula;
        senhaDigitada = senha;
        funcionario = new Funcionario();
    }

    public String obterSenhaDoFuncionario() {
        
        String matriculaAberta = new ArquivoDeLogin().abrirArquivoDeAcesso("matricula.txt");
        int posicaoDoSeparador = matriculaAberta.indexOf("|", 0);
            
        String matricula = matriculaAberta.substring(0, posicaoDoSeparador);
        String indice = matriculaAberta.substring(posicaoDoSeparador+1);
        
        if(matricula.matches(numeroDaMatricula)) {
            funcionario.setarIndiceDeBusca(indice);
            String senha = funcionario.obterSenhaDoFuncionario();
            if(senha.matches(senhaDigitada)){
                LojaDaMusica.iniciarPrograma();
                return "acesso concedido";
            } else {
                LojaDaMusica.exibirSenhaInvalida();
                return "senha inválida";
            }
        } else {
            LojaDaMusica.exiberMatriculaInvalida();
            return "matrícula inválida";
        }
        
    }
    
}
