package com.example.pro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class HelloController implements Initializable {

    @FXML private Button btnValidate;

    @FXML private  TextField Title;

    @FXML private  TextField Author;

    @FXML private TextArea Resume;

    @FXML private TextField Column;

    @FXML private TextField Row;

    @FXML private TextField Publication;

    @FXML
    private TableColumn<Book, String> author;

    @FXML
    private TableColumn<Book, Integer> column;

    @FXML
    private TableColumn<Book, Integer> publication;

    @FXML
    private TableColumn<Book, String> resume;

    @FXML
    private TableColumn<Book, Integer> row;

    @FXML
    private TableView<Book> tableView;

    @FXML
    private TableColumn<Book, String> title;

    @FXML
    private Button btnexit;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnAlgo;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnimc;

    @FXML
    private Button IMCsend;

    @FXML
    private AnchorPane global_moncul;

    @FXML
    private VBox globalStats;

    @FXML
    private VBox globalTableau;

    @FXML
    private HBox Hbtn;

    @FXML
    private TableView<?> Tableau;

    @FXML
    private AnchorPane gloSts;

    @FXML
    private AnchorPane IMC;

    @FXML
    private AnchorPane Algo;

    @FXML
    private VBox globalAlgo;

    @FXML
    private VBox globalICM;

    @FXML
    private TextField binary;

    @FXML
    private TextField hexa;

    @FXML
    private TextField weight_id;

    @FXML
    private TextField height_id;

    @FXML
    private TextField deci;

    @FXML
    private TextField roman;

    @FXML
    private Label resultimc;

    public static String binaryNum(int n){
        String our_number_in_binary_str = "";
        //Add in a string the binary number one digit by one digit.
        while( n > 0){
            int r = n % 2;
            our_number_in_binary_str = String.valueOf(r) + our_number_in_binary_str ;
            n = (n-r)/2;

        }
        return our_number_in_binary_str;
    }

    public ObservableList<Book> getBook() {

        ObservableList<Book> book = FXCollections.observableArrayList();

        book.add(new Book("Harry Potter", "J.K Rowling",
                "World of sorcery", 5, 6, 1997));
        return book;
    }

    public static String hexaNum (int decimal){
        int r;
        String hex = "";
        char hexchar[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',};
        while(decimal > 0){
            r = decimal % 16;
            hex = hexchar[r]+hex;
            decimal = decimal / 16;
        }
        return hex;
    }

    public static int getDecimal(String hex){
        String digits = "0123456789ABCDEF";
            hex = hex.toUpperCase();
            int val = 0;
            for (int i = 0; i < hex.length(); i++){
                char c = hex.charAt(i);
                int d = digits.indexOf(c);
                val = 16 * val + d;
            }
            return val;
    }

    public static String RomainNumber(int n){
        List T_unit = Arrays.asList(" ","I","II","III","IV","V","VI","VII","VIII","IX");
        List T_diz = Arrays.asList(" ","X","XX","XXX","XL","L","LX","LXX","LXXX","XC");
        List T_cent = Arrays.asList(" ","C","CC","CCC","CD","D","DC","DCC","DCCC","CM");

        String our_int_in_str = String.valueOf(n);
        String our_int_in_str_reversed = "";
        String our_number_in_Romain_str = "";

        for(int count = 0; count < our_int_in_str.length(); count++){
            our_int_in_str_reversed =  our_int_in_str.substring(count,(count+1)) + our_int_in_str_reversed;
        }
        if (our_int_in_str.length() > 3){
            our_number_in_Romain_str ="ERROR too long";
        }
        else {
            if (our_int_in_str.length() >= 1) {
                our_number_in_Romain_str = T_unit.get(parseInt(our_int_in_str_reversed.substring(0, 1))) + our_number_in_Romain_str;
                if (our_int_in_str.length() >= 2) {
                    our_number_in_Romain_str = T_diz.get(parseInt(our_int_in_str_reversed.substring(1, 2))) + our_number_in_Romain_str;
                    if (our_int_in_str.length() >= 3) {
                        our_number_in_Romain_str = T_cent.get(parseInt(our_int_in_str_reversed.substring(2, 3))) + our_number_in_Romain_str;
                    }

                }
            }
        }
        return our_number_in_Romain_str;
    }

    public static String ReversedbinaryNum(int n){
        String our_number_in_str = String.valueOf(n);
        boolean is_a_binary = true;
        for (int verif = 0; verif<our_number_in_str.length(); verif++){
            int i = Integer.parseInt(our_number_in_str.substring(verif, (verif + 1)));
            if (i != 1){
                if (i != 0) {
                    System.out.println(n + " is is not a binary");
                    System.out.println("because of the number :" + our_number_in_str.substring(verif, (verif + 1)) );
                    is_a_binary = false;
                    break;
                }
            }
        }
        int temp_int = 0;
        for (int length = 0; length < our_number_in_str.length(); length++){
            temp_int += (int) (Integer.parseInt(our_number_in_str.substring(length,length+1))*Math.pow(2, (our_number_in_str.length()-(length+1)) ));
        }
        if (is_a_binary){
            return String.valueOf(temp_int);
        }
        else{
            return "ERROR, this is not a binary";
        }
    }

    /*
                less than 18,5    You are underweight
                18,5 to 25    You have a normal weight
                25 to 30            You are overweight
                30 to 35            You are moderately obese
                35 to 40            You are obese
                more than 40    You are morbidly or massively obese              */

    public static String IMCtest(int weight, int height){
        String imc_message = "";
        boolean verification_weight = true;
        boolean verification_height = true;
        float tempo_height_pow = (height*height);
        float imc = (weight / tempo_height_pow)*10000;

        if (weight < 0){
            verification_weight = false;
        }
        if (height < 0){
            verification_height = false;
        }
        if (verification_height){
            if (verification_weight){
                if (imc <= 18.5) {
                    imc_message = "Your imc is : " + String.valueOf(imc) + ". You are underweight ";
                }
                else{
                    if (imc <= 25){
                        imc_message = "Your imc is : " + String.valueOf(imc) + ". You have a normal weight";
                    }
                    else{
                        if (imc <= 30){
                            imc_message = "Your imc is : " + String.valueOf(imc) + ". You are overweight";
                        }
                        else{
                            if (imc <= 35){
                                imc_message = "Your imc is : " + String.valueOf(imc) + ". You are moderately obese";
                            }
                            else{
                                if (imc <= 40){
                                    imc_message = "Your imc is : " + String.valueOf(imc) + ". You are obese";
                                }
                                else {
                                    imc_message = "Your imc is : " + String.valueOf(imc) + ". You are morbidly or massively obese";
                                }
                            }
                        }
                    }
                }
            }
            else{
                imc_message = "ERROR, wrong weight";
            }
        }
        else{
            imc_message = "ERROR, wrong height";
        }
        return  imc_message;
    }

    public static int romanConvert(String rom) {
        int decimal = 0;
        String romanNumeral = rom.toUpperCase();
        for(int x = 0;x<romanNumeral.length();x++) {
            char convertToDecimal = rom.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal += 1000;
                    break;

                case 'D':
                    decimal += 500;
                    break;

                case 'C':
                    decimal += 100;
                    break;

                case 'L':
                    decimal += 50;
                    break;

                case 'X':
                    decimal += 10;
                    break;

                case 'V':
                    decimal += 5;
                    break;

                case 'I':
                    decimal += 1;
                    break;
            }
        }
        if (romanNumeral.contains("IV"))
        {
            decimal-=2;
        }
        if (romanNumeral.contains("IX"))
        {
            decimal-=2;
        }
        if (romanNumeral.contains("XL"))
        {
            decimal-=10;
        }
        if (romanNumeral.contains("XC"))
        {
            decimal-=10;
        }
        if (romanNumeral.contains("CD"))
        {
            decimal-=100;
        }
        if (romanNumeral.contains("CM"))
        {
            decimal-=100;
        }
        return decimal;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        title.setCellValueFactory(new PropertyValueFactory<Book, String>("title"));

        author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));

        resume.setCellValueFactory(new PropertyValueFactory<Book, String>("resume"));

        column.setCellValueFactory(new PropertyValueFactory<Book, Integer>("column"));

        row.setCellValueFactory(new PropertyValueFactory<Book, Integer>("row"));

        publication.setCellValueFactory(new PropertyValueFactory<Book, Integer>("publication"));

        tableView.setItems(getBook());

        deci.setOnAction(action ->{
            try{
                int num = parseInt(deci.getText());
                binary.setText(binaryNum(num));
                hexa.setText(hexaNum(num));
                roman.setText(RomainNumber(num));
            }
            catch(Exception ERROR){
                System.out.println("ERROR OF ENTRY, this is not an integer");
            }
        });

        hexa.setOnAction(action ->{
            try{
                String num = (hexa.getText());
                deci.setText(String.valueOf(getDecimal(num)));
            }
            catch (Exception ERROR){
                System.out.println("ERROR - it's not a hexadecimal number");
            }
        });
        binary.setOnAction(action -> {
            try{
                deci.setText(ReversedbinaryNum(parseInt(binary.getText())));
            }
            catch (Exception ERROR){
                System.out.println("ERROR - Your binary is trash");
            }
        });

        roman.setOnKeyReleased(actionrom ->{
            try{
                String num = roman.getText();
                deci.setText(String.valueOf(romanConvert(num)));
            }
            catch (Exception ERROR){
                System.out.println("ERROR");
            }
        });
        IMCsend.setOnAction(action -> {
            System.out.println(parseInt(weight_id.getText()));
            System.out.println(parseInt(height_id.getText()));
            resultimc.setText(IMCtest(parseInt(weight_id.getText()), parseInt(height_id.getText())));
        });

        global_moncul.getChildren().removeAll(globalICM);
        globalTableau.getChildren().removeAll(tableView, Hbtn);
        globalAlgo.getChildren().removeAll(Algo);
        btnHome.setOnMouseClicked(action -> {
            globalTableau.getChildren().addAll(tableView, Hbtn);
            globalAlgo.getChildren().removeAll(Algo);

        });
        btnAlgo.setOnMouseClicked(action -> {
            globalAlgo.getChildren().addAll(Algo);
            globalTableau.getChildren().removeAll(tableView, Hbtn);
            global_moncul.getChildren().removeAll(globalICM);
        });
        btnimc.setOnMouseClicked(btnaction -> {
            global_moncul.getChildren().addAll(globalICM);
            globalTableau.getChildren().removeAll(tableView, Hbtn);
            globalAlgo.getChildren().removeAll(Algo);
        });

        btnValidate.setOnMouseClicked(btnaction ->{
            String Title = this.Title.getText();
            String Author = this.Author.getText();
            String Resume = this.Resume.getText();
            String chaine1 = this.Column.getText();
            Integer Column = Integer.parseInt(chaine1);
            String chaine2 = this.Row.getText();
            Integer Row = Integer.parseInt(chaine2);
            String chaine3 = this.Publication.getText();
            Integer Publication = Integer.parseInt(chaine3);
            ObservableList<Book> book = FXCollections.observableArrayList();

            //for(int i = 0; i <book.size(); i++){
            //if(book.get(i) == null){
            book.add(new Book(Title, Author, Resume, Column, Row, Publication));
            //  break;
            //}
            // }

            this.tableView.setItems(book);
        });

        btnexit.setOnMouseClicked(btnaction -> {
            System.exit(0);
        });

    }
}