package sample;
import com.sun.tools.javac.comp.Enter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class Controller implements Initializable
{
    @FXML
    private Label PredatorLabel;
    @FXML
    private Label PreyLabel;
    @FXML
    private Label GridRowLabel;
    @FXML
    private Label GridColumnLabel;
    @FXML
    private Label TimeStepsLabel;
    @FXML
    private TextField predatorTextBox;
    @FXML
    private TextField preyTextBox;
    @FXML
    private TextField gridRowTextBox;
    @FXML
    private TextField gridColumnTextBox;
    @FXML
    private TextField timeTextBox;
    @FXML
    private Button SimulateButton;
    @FXML
    private Button PositionsButton;




    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        PositionsButton.setOnAction(e->System.out.println("You pressed me!"));
        SimulateButton.setOnAction(e-> {
            getTextfromPredatorBox();
            getTextfromPreyBox();
        });






    }

    public void getTextfromPredatorBox()
    {
        String input2 = predatorTextBox.getText();
        System.out.println("Predators: " + input2);
        Predator pred = new Predator();
        int num = Integer.parseInt(input2); // Converts a STRING -> INTEGER
        pred.setNum_of_Preds(num);
        System.out.println("Number of predators: " + pred.getNum_of_Preds());
    }

    public void getTextfromPreyBox()
    {
        String input = preyTextBox.getText();
        Prey prey = new Prey();
        int num = Integer.parseInt(input);
        prey.setNum_of_Prey(num);
        System.out.println("Prey: " + prey.getNum_of_Prey());
    }


}
