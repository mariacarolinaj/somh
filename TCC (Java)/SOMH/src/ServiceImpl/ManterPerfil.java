/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImpl;

import DAO.PerfilDAO;
import DAOImpl.PerfilDAOImpl;
import Domain.Perfil;
import Exception.ExcecaoPersistencia;
import java.util.List;
import Service.IManterPerfil;

/**
 *
 * @author aluno
 */
public class ManterPerfil implements IManterPerfil {

    public ManterPerfil() {
        perfilDAO = PerfilDAOImpl.getInstance();
    }
    PerfilDAO perfilDAO;
    @Override
    public List<Perfil> pesquisarTodos() throws ExcecaoPersistencia {
        return perfilDAO.listarTodos();
    }

    @Override
    public Perfil pesquisarPorId(Long id) throws ExcecaoPersistencia {
        return perfilDAO.consultarPorId(id);
    }
    
}
