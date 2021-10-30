package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import sample.util.Alerts;

public class Controller {
    @FXML
    private Button btn;

    //ESTE MÉTODO SERÁ PARA CRIAR CAIXA DE MSG NA FRENTE DA TELA
    @FXML
    public void onBtnAction(){
        //Alerts.showAlert("Alert Title", "Alert Header", "Olá", Alert.AlertType.ERROR);
        Alerts.showAlert("Alert Title", null, "Olá", Alert.AlertType.ERROR);

    }

}
