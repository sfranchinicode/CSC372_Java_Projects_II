
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Generate random green hue ONCE at startup
        Random random = new Random();
        double red = random.nextDouble() * 0.5;
        double green = 0.5 + random.nextDouble() * 0.5;
        double blue = random.nextDouble() * 0.5;
        // Convert to hex for display in menu item
        String hex = String.format("#%02X%02X%02X", (int)(red * 255), (int)(green * 255), (int)(blue * 255));

        // Create the main layout container with padding so background color is visible
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15, 15, 15, 15));

        // Create text area and place it in the center of the layout
        TextArea text = new TextArea();
        root.setCenter(text);

        // Create menu bar, menu, and add menu to the bar
        MenuBar bar = new MenuBar();
        Menu menu = new Menu("Options");
        bar.getMenus().add(menu);
        root.setTop(bar);

        // Create the 4 menu items needed and add to menu dropdown
        MenuItem menuItem1 = new MenuItem("Display date and time.");
        MenuItem menuItem2 = new MenuItem("Write to 'log.txt'");
        MenuItem menuItem3 = new MenuItem("Change background color | " + hex);
        MenuItem menuItem4 = new MenuItem("Exit");

        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menu.getItems().add(menuItem3);
        menu.getItems().add(menuItem4);

        // Create the scene with the layout and set it on the stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Menu item 1 should display current date and time in text box
        menuItem1.setOnAction(e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
            text.appendText(LocalDateTime.now().format(formatter));
        });

        // Menu item 2 should write text area contents and save to log.txt when clicked
        menuItem2.setOnAction(e -> {
            try {
                FileWriter writer = new FileWriter("log.txt");
                writer.write(text.getText());
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        /*
        Menu item 3 should change background to random green hue. 
        Color is generated once at startup and reused each time clicked.
        Red and blue are kept low while green is kept high to ensure a green hue.
         */
        menuItem3.setOnAction(e -> {
            // Apply the random green to the background
            scene.getRoot().setStyle("-fx-background-color:rgb("+ (int)(red * 255) + "," + (int)(green * 255) + "," + (int)(blue * 255) +");");
        });

        // Menu item 4 should exit the program when clicked
        menuItem4.setOnAction(e -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
