import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/*
 * @author Andrew Gottilla
 */
public class ScoutTheJason extends Application {

    @Override
    public void start(Stage stage) throws Exception
    {
        // Build Form --------------------------------------------------------------
        Parent root = FXMLLoader.load(getClass().getResource("UserLoginForm.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setTitle("(WIP) STJ - Login");
        stage.setScene(scene);
        stage.show();
        // Build Form --------------------------------------------------------------
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {        
        //Scanner keyb = new Scanner(System.in);
        
        // Launch the User Form. Calls the Initialize function in FormController.java
        launch(args);
        
    }
}