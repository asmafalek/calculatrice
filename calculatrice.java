import  javafx.application.*;
import  javafx.scene.*;
import  javafx.stage.*;
import  javafx.scene.layout.*;
import  javafx.scene.control.*;
import  javafx.geometry.*;
import  javafx.event.*;

public class calculatrice extends Application
{
    public static void main(String [] Arguments)
    {
    launch(Arguments);
    }

    public void start (Stage Plateau)
    {
        Plateau.setTitle("Calculatrice");

        FlowPane Agencement=new FlowPane(Orientation.VERTICAL,10,10);
        Agencement.setAlignment(Pos.CENTER);
        Agencement.setColumnHalignment(HPos.CENTER);

        Label Message=new Label("");
        Agencement.getChildren().add(Message);
        Agencement.getChildren().add(new Separator());

        //clavier num
        FlowPane Ligne1=new FlowPane(Orientation.HORIZONTAL,5,5);
        Ligne1.setAlignment(Pos.CENTER);

        Button bt7=new Button("7");
        bt7.setOnAction((ActionEvent Evenement) -> {Message.setText("7");});
        Button bt8=new Button("8");
        bt8.setOnAction((ActionEvent Evenement) -> {Message.setText("8");});
        Button bt9=new Button("9");
        bt9.setOnAction((ActionEvent Evenement) -> {Message.setText("9");});
        Button addition=new Button("+");
        //addition.setOnAction((ActionEvent Evenement) -> {Message.setText("+");});
        Ligne1.getChildren().addAll(bt7,bt8,bt9,addition);
               
        FlowPane Ligne2=new FlowPane(Orientation.HORIZONTAL,5,5);
        Ligne2.setAlignment(Pos.CENTER);

        Button bt4=new Button("4");
        bt4.setOnAction((ActionEvent Evenement) -> {Message.setText("4");});
        Button bt5=new Button("5");
        bt5.setOnAction((ActionEvent Evenement) -> {Message.setText("5");});
        Button bt6=new Button("6");
        bt6.setOnAction((ActionEvent Evenement) -> {Message.setText("6");});
        Button soustraction=new Button("-");
        //soustraction.setOnAction((ActionEvent Evenement) -> {Message.setText("-");});
        Ligne2.getChildren().addAll(bt4,bt5,bt6,soustraction);

        FlowPane Ligne3=new FlowPane(Orientation.HORIZONTAL,5,5);
        Ligne3.setAlignment(Pos.CENTER);

        Button bt1=new Button("1");
        bt1.setOnAction((ActionEvent Evenement) -> {Message.setText("1");});
        Button bt2=new Button("2");
        bt2.setOnAction((ActionEvent Evenement) -> {Message.setText("2");});
        Button bt3=new Button("3");
        bt3.setOnAction((ActionEvent Evenement) -> {Message.setText("3");});
        Button multiplication=new Button("*");
        //multiplication.setOnAction((ActionEvent Evenement) -> {Message.setText("*");});
        Ligne3.getChildren().addAll(bt1,bt2,bt3,multiplication);

        FlowPane Ligne4=new FlowPane(Orientation.HORIZONTAL,5,5);
        Ligne4.setAlignment(Pos.CENTER);

        Button btE=new Button("E");
        btE.setOnAction((ActionEvent Evenement) -> {Message.setText("E");});
        Button bt0=new Button("0");
        bt0.setOnAction((ActionEvent Evenement) -> {Message.setText("0");});
        Button btpoint=new Button(".");
        btpoint.setOnAction((ActionEvent Evenement) -> {Message.setText(".");});
        Button div=new Button("/");
        //div.setOnAction((ActionEvent Evenement) -> {Message.setText("/");});

        Ligne4.getChildren().addAll(btE, bt0, btpoint,div);
        Agencement.getChildren().addAll(Ligne1, Ligne2, Ligne3,Ligne4);

        Scene Scene_Principale=new Scene(Agencement, 500, 300);
  

        Scene_Principale.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>()
        {
            
            public void handle (ActionEvent Evenement){
                Button ev=(Button) Evenement.getTarget();
                if(ev==addition){
                    Message.setText("+");
                }else{
                    if(ev==soustraction){
                        Message.setText("-");
                    }else{
                        if(ev==multiplication){
                            Message.setText("*");
                        }else {
                            if(ev==div){
                            Message.setText("/");
                            }
                        }

                        
                    }
                }
            }
        });
        
        
        Plateau.setScene(Scene_Principale);
        Plateau.show();
        

    }

}