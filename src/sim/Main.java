package sim;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public static final int WIEVIEL_PLOTS = 5; //magic number global konstante

    @Override
    public void start(Stage primaryStage) throws Exception {


        MainLogik myMain = new MainLogik();
        myMain.writePlotArray(WIEVIEL_PLOTS);

        FXMLLoader fxmlLoader = new FXMLLoader();

        Parent root = fxmlLoader.load(getClass().getResource("layout.fxml").openStream()); /*"load" lädt das Layout aus FXML sowie
        den verknüpften Controller und dessen Felder*/

        myMain.initBtns(fxmlLoader.getController(), myMain.plots);


        // window display statements... STAGE stuff
        primaryStage.setTitle("Healers Demo");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
