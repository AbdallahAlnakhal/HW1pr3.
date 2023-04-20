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
public class LogInDashbord extends Stage {
      // All Scenes that AdminDashboard page have
    private Scene login;

    //private Scene operationsScene;

    public LogInDashbord() throws IOException {
        
        
        //load CreateUser FXML File in CreateUser Scene
        FXMLLoader createUserLoader = new FXMLLoader(getClass().getResource("view.viewfxml/Xchange.fxml"));
        Parent createUserRoot = createUserLoader.load();     
        login = new Scene(createUserRoot);
        
     
        
    }
    public void changeSceneToUsersManagment(){
        this.setScene(login);
    }

   
   
    
   
    
    
    
}

