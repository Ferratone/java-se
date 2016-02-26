/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.app.util;

import javax.swing.JOptionPane;

/**
 * 
 * @author Diego Bezerra de Paula
 */
public class Funcoes {
    
    private static final String TITLE = "SYSTEM";
    
    public static void messageInformation(String message) {
        JOptionPane.showMessageDialog(null, message, TITLE, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void messageWarning(String message) {
        JOptionPane.showMessageDialog(null, message, TITLE, JOptionPane.WARNING_MESSAGE);
    }

    public static void messageError(String message) {
        JOptionPane.showMessageDialog(null, message, TITLE, JOptionPane.ERROR_MESSAGE);
    }

    public static boolean messageConfirmation(String message) {
        String[] opcoes = {"Sim", "Não"};
        int retorno = JOptionPane.showOptionDialog(null, message, TITLE, 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        return retorno == 0;
    }

}
