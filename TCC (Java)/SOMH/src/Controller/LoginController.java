/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Domain.Usuario;
import Exception.ExcecaoPersistencia;
import Main.Run;
import ServiceImpl.ManterUsuarioImpl;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Service.ManterUsuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Aluno
 */
public class LoginController implements Initializable {
    
    @FXML
    private Button botaoEntrar;
    @FXML
    private TextField user;
    @FXML
    private TextField password;
    
    private Run run;
    private Usuario usuarioLogado;

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public void setRun(Run run) {
        this.run = run;
    }
    
    
    @FXML
    private void login(ActionEvent event) throws ExcecaoPersistencia {
        String nomeUsuario = user.getText();
        String senha = password.getText();
        System.out.println(nomeUsuario + ", " + senha);
        ManterUsuario manterUsuario = new ManterUsuarioImpl();
        /*usuarioLogado = manterUsuario.getUsuarioByEmailSenha(nomeUsuario, senha);
        int codPerfil = usuarioLogado.getPerfil().getId().intValue();
        switch (codPerfil){
            case 1:
                showTelaAdministradorView();
                break;
            case 2:
                showTelaAtendenteView();
                break;
            case 3:
                showTelaTelefonistaView();
                break;
            case 4:
                showTelaTecnicoView();
                break;
            default:
                break;
        }*/ // arrumar ordem das chamadas
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    private void redirecionaTelaFuncionario() {
        System.out.println("tela de funcionario");
        try{
            FXMLLoader loader = new FXMLLoader();
            
            loader.setLocation(Run.class.getResource("../View/teste.fxml"));
            AnchorPane TelaFuncionario = (AnchorPane) loader.load();
            
            run.getRootLayout().setCenter(TelaFuncionario);
        
        } catch (IOException ex) {
            Logger.getLogger(Run.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void showTelaAdministradorView(){
        System.out.println("Tela Administrador");
    }
    
    private void showTelaAtendenteView(){
        System.out.println("Tela Atendente");
    }
    
    private void showTelaTelefonistaView(){
        System.out.println("Tela Telefonista");
    }
    
    private void showTelaTecnicoView(){
        System.out.println("Tela Tecnico");
    }
    
    
}