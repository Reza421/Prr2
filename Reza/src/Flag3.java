 import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class Flag3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane border = new BorderPane();

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle.setHeight(80);
        rectangle.setWidth(1000);
        rectangle.setFill(Color.RED);

        rectangle1.setHeight(80);
        rectangle1.setWidth(1000);
        rectangle1.setFill(Color.RED);

        rectangle2.setHeight(150);
        rectangle2.setWidth(1000);
        rectangle2.setFill(Color.YELLOW);

        Group root = new Group(rectangle);
        Group root1 = new Group(rectangle1);
        Group root2 = new Group(rectangle2);

        border.setBottom(root);
        border.setTop(root1);
        border.setCenter(root2);

        //Creating a scene object
        Scene scene = new Scene(border, 600, 300);
        //Setting title to the Stage
        primaryStage.setTitle("Drawing a Rectangle");

        primaryStage.setScene(scene);

        primaryStage.show();


    }
}