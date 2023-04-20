/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author MSI GL65
 */
public class XchangeDashbord extends Stage{
       // All Scenes that AdminDashboard page have
    private Scene logout;

    //private Scene operationsScene;

    public XchangeDashbord() throws IOException {
        
        
        //load CreateUser FXML File in CreateUser Scene
        FXMLLoader createUserLoader = new FXMLLoader(getClass().getResource("view.viewfxml/FXMLDocumentController.fxml"));
        Parent createUserRoot = createUserLoader.load();     
        logout = new Scene(createUserRoot);
        
     
        
    }
    public void changeSceneToUsersManagment(){
        this.setScene(logout);
    }
   
    
   
}
