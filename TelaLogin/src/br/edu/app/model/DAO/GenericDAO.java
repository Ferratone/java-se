/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.app.model.DAO;

import java.util.List;

/**
 *
 * @author Diego Bezerra de Paula
 */
public interface GenericDAO<T> {

    public String cadastrar(T object);

    public String alterar(T object);

    public String excluir(Integer id);

    public List<T> listarTodos();

    public T consultarPorId(Integer id);
}
