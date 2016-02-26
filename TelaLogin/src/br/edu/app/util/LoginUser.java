/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.app.util;

import br.edu.app.model.DAO.LoginDAO;
import br.edu.app.model.bean.Login;

/**
 *
 * @author Diego Bezerra de Paula
 */
public class LoginUser {

    public boolean logar(Login login) {
        boolean resultado = false;
        try {
            /*
            if (login.getNome() == null || "".equals(login.getNome())) {
                Funcoes.messageWarning("Login obrigátorio");
            } else if (login.getSenha() == null || "".equals(login.getSenha())) {
                Funcoes.messageWarning("Senha obrigátoria");
            } else {
                
            }
             */
            LoginDAO loginDAO = new LoginDAO();
            resultado = loginDAO.logar(login);
        } catch (Exception e) {
            Funcoes.messageError(e.getMessage());
        }
        return resultado;
    }
}