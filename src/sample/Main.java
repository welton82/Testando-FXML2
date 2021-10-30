package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

    public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //CARREGAR TELA FXML NA APLICAÇÃO

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

/*
        //OU PODEMOS INSTANCIAR ASSIM:
        Parent parent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();

*/
/*
        //TAMBÉM PODEMOS INSTANCIAR ASSIM:
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400);
        scene.getStylesheets().add(String.valueOf(getClass().getResource("sample.fxml")));
        primaryStage.setTitle("Meu Titulo");
        primaryStage.setScene(scene);
        primaryStage.show();
        */
    }


    public static void main(String[] args) {
        launch(args);
    }
}
/*
* No intellij devemos configurar da seguinte forma:
* 1 baixar o sdk do javaFx
* 2 - file => Project Structure ou F4
* 3 - conferir project o sdk do fx igual ao sdk do java
* 4 - global libraries => clicar no + => Java e procurar onde descompactou o sdk javafx => apply e ok
* 5 - Clicar botão direito em src => new => module info java
* 6 - Digitar: requires javafx.fxml;
*              requires javafx.controls;
*              opens sample; Lembrando que sample é o nome do package
*  */