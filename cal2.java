import  javafx.application.*;
import  javafx.scene.*;
import  javafx.stage.*;
import  javafx.scene.layout.*;
import  javafx.scene.control.*;
import  javafx.geometry.*;
import  javafx.event.*;

public class cal2 extends Application
{
    public static void main(String [] Arguments)
    {
    launch(Arguments);
    }

    public void start (Stage Plateau)
    {
        Plateau.setTitle("Calculatrice");

        BorderPane Agencement=new BorderPane(); 
        
        
        Label Message=new Label("");
        Message.setMaxWidth(200);
        
        //agencement du clavier num
        GridPane clavier=new GridPane(); 
        clavier.setHgap(10);

        Button bt7=new Button("7");
        bt7.setOnAction((ActionEvent Evenement) -> {Message.setText("7");});
        clavier.add(bt7,0,0);
        Button bt8=new Button("8");
        bt8.setOnAction((ActionEvent Evenement) -> {Message.setText("8");});
        clavier.add(bt8,1,0);
        Button bt9=new Button("9");
        bt9.setOnAction((ActionEvent Evenement) -> {Message.setText("9");});
        clavier.add(bt9,2,0);

        Button bt4=new Button("4");
        bt4.setOnAction((ActionEvent Evenement) -> {Message.setText("4");});
        clavier.add(bt4,0,1);
        Button bt5=new Button("5");
        bt5.setOnAction((ActionEvent Evenement) -> {Message.setText("5");});
        clavier.add(bt5,1,1);
        Button bt6=new Button("6");
        bt6.setOnAction((ActionEvent Evenement) -> {Message.setText("6");});
        clavier.add(bt6,2,1);

        Button bt1=new Button("1");
        bt1.setOnAction((ActionEvent Evenement) -> {Message.setText("1");});
        clavier.add(bt1,0,2);
        Button bt2=new Button("2");
        bt2.setOnAction((ActionEvent Evenement) -> {Message.setText("2");});
        clavier.add(bt2,1,2);
        Button bt3=new Button("3");
        bt3.setOnAction((ActionEvent Evenement) -> {Message.setText("3");});
        clavier.add(bt3,2,2);

        Button bt0=new Button("0");
        bt0.setOnAction((ActionEvent Evenement) -> {Message.setText("0");});
        clavier.add(bt0,0,3);
        clavier.setColumnSpan(bt0,2);
        Button btpoint=new Button(".");
        btpoint.setOnAction((ActionEvent Evenement) -> {Message.setText(".");});
        clavier.add(btpoint,2,3);
       
        Agencement.getChildren().add(clavier);
        //clavier.setPrefSize(Double.MAX_VALUE,Double.MAX_VALUE);
        //clavier.setAlignment(Pos.CENTER);
        
        GridPane operateur=new GridPane();
        operateur.setHgap(10);

        Button addi=new Button("+");
        addi.setOnAction((ActionEvent Evenement) -> {Message.setText("+");});
        operateur.add(addi,0,1);
        Button sous=new Button("-");
        sous.setOnAction((ActionEvent Evenement) -> {Message.setText("-");});
        operateur.add(sous,0,1);
        Button mul=new Button("*");
        mul.setOnAction((ActionEvent Evenement) -> {Message.setText("*");});
        operateur.add(mul,0,1);
        Button div=new Button("/");
        div.setOnAction((ActionEvent Evenement) -> {Message.setText("/");});
        operateur.add(div,0,1);
        operateur.setMaxHeight(Double.MAX_VALUE);
        operateur.setAlignment(Pos.TOP_CENTER);
        

        Scene Scene_Principale=new Scene(Agencement, 500, 300);
        Plateau.setScene(Scene_Principale);
        Plateau.show();
  
  
    }

}





 