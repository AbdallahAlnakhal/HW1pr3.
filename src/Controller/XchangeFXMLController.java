/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import view.ViewManager;

/**
 * FXML Controller class
 *
 * @author MSI GL65
 */
public class XchangeFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnConvert(ActionEvent event) {
        
    }

    @FXML
    private void btnLogOut(ActionEvent event) {
          ViewManager.logout.changeSceneToUsersManagment();
        
    }
    
}
