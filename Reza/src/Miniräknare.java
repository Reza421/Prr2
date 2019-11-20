import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.beans.Expression;
import java.util.function.Function;


public class Miniräknare extends Application implements EventHandler<ActionEvent> {

    private Object Border;

    public static void main(String[] args) {
        launch(args);
    }

    Button button1 = new Button("1");
    Button button2 = new Button("2");
    Button button3 = new Button("3");
    Button button4 = new Button("4");
    Button button5 = new Button("5");
    Button button6 = new Button("6");
    Button button7 = new Button("7");
    Button button8 = new Button("8");
    Button button9 = new Button("9");
    Button button10 = new Button("+");
    Button button11 = new Button("-");
    Button button12 = new Button("*");
    Button button13 = new Button("=");
    Button button14 = new Button("CE");
    Button button15 = new Button("Sin");
    Button button16 = new Button("/");
    Button button17 = new Button(".");
    Button button0 = new Button("0");

    TextField input = new TextField();

    BorderPane border = new BorderPane();

    GridPane root1 = new GridPane();


    @Override
    public void start(Stage primaryStage) {

        root1.setHgap(5);
        root1.setVgap(5);
        root1.setPadding(new Insets(10 ,10 , 10 ,10 ));

        root1.add(button1, 0, 1);
        button1.setOnAction(this);
        root1.add(button2, 1, 1);
        button2.setOnAction(this);
        root1.add(button3, 2, 1);
        button3.setOnAction(this);
        root1.add(button4, 0, 2);
        button4.setOnAction(this);
        root1.add(button5, 1, 2);
        button5.setOnAction(this);
        root1.add(button6, 2, 2);
        button6.setOnAction(this);
        root1.add(button7, 0, 3);
        button7.setOnAction(this);
        root1.add(button8, 1, 3);
        button8.setOnAction(this);
        root1.add(button9, 2, 3);
        button9.setOnAction(this);
        root1.add(button10,4, 0);
        button10.setOnAction(this);
        root1.add(button11,4, 1);
        button11.setOnAction(this);
        root1.add(button12,4, 2);
        button12.setOnAction(this);
        root1.add(button13,4, 3);
        button13.setOnAction(this);
        root1.add(button14,2, 0);
        button14.setOnAction(this);
        root1.add(button15,5,0);
        button15.setOnAction(this);
        root1.add(button16, 5, 1);
        button16.setOnAction(this);
        root1.add(button17, 2, 4);
        button17.setOnAction(this);
        root1.add(button0, 0, 4);
        button0.setOnAction(this);

        border.setTop(input);
        border.setCenter(root1);


        Scene scene = new Scene(border, 400, 400);

        primaryStage.setTitle("Miniräknare");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource().equals(button1))
        {
            input.textProperty().set(input.textProperty().get() + "1");
        }
        if (event.getSource().equals(button2))
        {
            input.textProperty().set(input.textProperty().get() + "2");
        }
        if (event.getSource().equals(button3))
        {
            input.textProperty().set(input.textProperty().get() + "3");
        }
        if (event.getSource().equals(button4))
        {
            input.textProperty().set(input.textProperty().get() + "4");
        }
        if (event.getSource().equals(button5))
        {
            input.textProperty().set(input.textProperty().get() + "5");
        }
        if (event.getSource().equals(button6))
        {
            input.textProperty().set(input.textProperty().get() + "6");
        }
        if (event.getSource().equals(button7))
        {
            input.textProperty().set(input.textProperty().get() + "7");
        }
        if (event.getSource().equals(button8))
        {
            input.textProperty().set(input.textProperty().get() + "8");
        }
        if (event.getSource().equals(button9))
        {
            input.textProperty().set(input.textProperty().get() + "9");
        }
        if (event.getSource().equals(button15))
        {
            input.textProperty().set(input.textProperty().get() + "Sin(");
        }
        if (event.getSource().equals(button17))
        {
            input.textProperty().set(input.textProperty().get() + ".");
        }
        if (event.getSource().equals(button11))
        {
            input.textProperty().set(input.textProperty().get() + "-");
        }
        if (event.getSource().equals(button10))
        {
            input.textProperty().set(input.textProperty().get() + "+");
        }
        if (event.getSource().equals(button12))
        {
            input.textProperty().set(input.textProperty().get() + "*");
        }
        if (event.getSource().equals(button0))
        {
            input.textProperty().set(input.textProperty().get() + "0");
        }
        if (event.getSource().equals(button16))
        {
            input.textProperty().set(input.textProperty().get() + "/");
        }
        if (event.getSource().equals(button13))
        {
            try {
                calculate();
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        }
        if (event.getSource().equals(button14))
        {
            input.clear();
        }


    }

    private void calculate() throws ScriptException {
        String expression = input.textProperty().get();

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        input.textProperty().set(engine.eval(expression).toString());

    }

    private String method(String in){

        in = in.replace("sin", "Math.sin");

        return in;
    }
}