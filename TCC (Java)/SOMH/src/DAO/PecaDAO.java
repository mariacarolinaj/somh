/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Domain.Peca;
import Exception.ExcecaoPersistencia;
import java.util.List;

/**
 *
 * @author Luiz
 */
public interface PecaDAO {
    public List<Peca> listAll() throws ExcecaoPersistencia;
    public boolean insert(Peca peca) throws ExcecaoPersistencia;
}
