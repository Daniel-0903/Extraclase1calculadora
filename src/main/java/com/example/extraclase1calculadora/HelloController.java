package com.example.extraclase1calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;
public class HelloController implements Initializable {
    @FXML
    private ChoiceBox<String> dro;
    private String[] provincias = {"San Jose", "Heredia", "Cartago", "Alajuela", "Guanacaste", "Limon", "Puntarenas"};


//dropdown list con las instancias cradas por el usuario:
    @FXML
    private ComboBox pers1;

    @FXML
    private ComboBox pers2;

//Textos
    @FXML
    private TextField no;
    @FXML
    private TextField dd;
    @FXML
    private TextField rslt;
//Botones
    @FXML
    private Button add;
    @FXML
    private Button dsn;
    @FXML
    private Button rst;
    @FXML
    private Button su;
    @FXML
    private Button ult;

    int cont = 0;
    int[] pos_edades = new int[4];  //array para tener el nombre y la edad de la insatncia en la misma posicion

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        dro.getItems().addAll(provincias);
    }



    //Metodo para agregar objetos persona, asociado al boton "Agregar Persona"

    @FXML
    private void Agregar(ActionEvent event) {
        if (cont < 4) {   //Valida que solo se puedan crear 4 instancias de la clase persona
            persona Persona = new persona();
            String nombre = this.no.getText();
            int edad = Integer.parseInt(this.dd.getText()); //pasar el int de edad a Stirng
            String provincia = "";
            Persona.setNombre(nombre);
            Persona.setEdad(edad);
            Persona.setProvincia(provincia);

            //añade el nombre digitado por el usuario a los ComboBox
            pers1.getItems().add(Persona.getNombre());
            pers2.getItems().add(Persona.getNombre());
            pos_edades[cont] = Persona.getEdad(); //añade la edad segun la posicion en el arreglo para que corresponda con el nombre
            cont++;
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);   //En caso de que se intente crear una quinta instancia
            alert.setTitle("Maximo de personas alcanzado");
            alert.setContentText("Ya hay 4 personas añadidas");
            alert.showAndWait();
        }
    }

    @FXML
    //metodo de suma, asociado al boton +
    private void suma(ActionEvent event) {
        int num1 = pos_edades[pers1.getItems().indexOf(pers1.getValue())];  //añade a la variable num1 el valor almacenado en pers1
        int num2 = pos_edades[pers2.getItems().indexOf(pers2.getValue())];  //añade a la variable num2 el valor almacenado en pers2

        int sum = num1 + num2;   //opera con las variables creadas a las que se les extrajo su valor digitao por el usuario

        this.rslt.setText(sum + "");   //añade el resulatdo al TextField del resultado
    }

    @FXML
    //metodo de resta, asociado al boton -
    private void resta(ActionEvent event) {
        int num1 = pos_edades[pers1.getItems().indexOf(pers1.getValue())];
        int num2 = pos_edades[pers2.getItems().indexOf(pers2.getValue())];

        int res = num1 - num2;   //opera con las variables creadas a las que se les extrajo su valor digitao por el usuario

        this.rslt.setText(res + "");   //añade el resulatdo al TextField del resultado
    }

    @FXML
    //metodo de multiplicacion, asociado al boton *
    private void multiplicacion(ActionEvent event) {
        int num1 = pos_edades[pers1.getItems().indexOf(pers1.getValue())];
        int num2 = pos_edades[pers2.getItems().indexOf(pers2.getValue())];

        int mult = num1 * num2;  //opera con las variables creadas a las que se les extrajo su valor digitao por el usuario

        this.rslt.setText(mult + ""); //añade el resulatdo al TextField del resultado
    }

    @FXML
    //metodo de division, asociado al boton /
    private void division(ActionEvent event) {
        int num1 = pos_edades[pers1.getItems().indexOf(pers1.getValue())];
        int num2 = pos_edades[pers2.getItems().indexOf(pers2.getValue())];

        double div = (double) num1/num2;   //opera con las variables creadas a las que se les extrajo su valor digitao por el usuario, se usa un double para que la divison sea más exacta

        this.rslt.setText(div + ""); //añade el resulatdo al TextField del resultado
    }
}