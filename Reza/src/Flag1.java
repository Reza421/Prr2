import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class Flag1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane border = new BorderPane();

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();

        rectangle.setHeight(1000);
        rectangle.setWidth(200);
        rectangle.setFill(Color.RED);

        rectangle1.setHeight(1000);
        rectangle1.setWidth(200);
        rectangle1.setFill(Color.BLUE);

        Group root = new Group(rectangle);
        Group root1 = new Group(rectangle1);

        border.setLeft(root);
        border.setRight(root1);

        //Creating a scene object
        Scene scene = new Scene(border, 600, 300);
        //Setting title to the Stage
        primaryStage.setTitle("Drawing a Rectangle");

        primaryStage.setScene(scene);

        primaryStage.show();


    }
}