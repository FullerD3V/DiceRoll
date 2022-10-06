/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroll.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author alumno
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView img;
    
    Image uno, dos, tres, cuatro, cinco, seis;
    
    int opt = 0;
    
    @FXML
    public void imgOnMouseClicked(MouseEvent event){
        opt = (int)(Math.random() * 6 + 1);
        switch(opt){
            case 1:
                img.setImage(uno);
                break;
            case 2:
                img.setImage(dos);
                break;
            case 3:
                img.setImage(tres);
                break;
            case 4:
                img.setImage(cuatro);
                break;
            case 5:
                img.setImage(cinco);
                break;
            case 6:
                img.setImage(seis);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        opt = 0;
        uno = new Image("diceroll/Assets/1.png");    
        dos = new Image("diceroll/Assets/2.png");
        tres = new Image("diceroll/Assets/3.png");
        cuatro = new Image("diceroll/Assets/4.png");
        cinco = new Image("diceroll/Assets/5.png");
        seis = new Image("diceroll/Assets/6.png");

    }    
    
}
