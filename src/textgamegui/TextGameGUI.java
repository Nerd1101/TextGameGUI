package textgamegui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import static javafx.scene.text.TextAlignment.CENTER;
import javafx.stage.Stage;


public class TextGameGUI extends Application {
    
        TextField enterName;
        Button ok;
        String name;
        VBox v;
        Scene opening;
        Scene game;
        GridPane g;
        BorderPane b;
        Label lName;
        Text t;
        StackPane s;
        HBox h;
        Button op1;
        Button op2;
        Button op3;
        Button op4;
        Text main;
        StackPane p;
        Item [] items;
        VBox itemList;
        Text item;
        boolean visited;
        boolean visited1;
        boolean up;
        
        Image image1;
        Image image2;
        Image image3;
        Image image4;
        Image image5;
        Image image6;
        Image image7;
        Image image8;
        ImageView i1;
        ImageView i2;
        ImageView i3;
        ImageView i4;
        ImageView i5;
        ImageView i6;
        ImageView i7;
        Label flashlight;
        Label battery;
        Label masterKey;
        Label basementKey;
        Label rope;
        Label screwdriver;
        Label bear;
        Text numbers;
        
        Button b0;
        Button b1;
        Button b2;
        Button b3;
        Button b4;
        Button b5;
        Button b6;
        Button b7;
        Button b8;
        Button b9;
        Button b10;
        Button b11;
        Button b12;
        Button b13;
        Button b14;
        Button b15;
        Button b16;
        
        File file1;
        Media media;
        File file2;
        File file4;
        File file5;
        File file6;
        File file7;
        File file8;
        File file9;
        File file10;
        File file11;
        File file12;
        File file13;
        File file14;
        File file15;
        File file16;
        Media media2;
        String music;
        String music2;
        Boolean playing;
        Image pape;
        ImageView paper;
        
        VBox vbox;
        Stage popup;
        Scene q;
        boolean mirrorVisited;
        
        
    
    @Override
    public void start(Stage primaryStage){
       
        //THINGS
        v = new VBox();
        b = new BorderPane();
        s = new StackPane();
        p = new StackPane();
        h = new HBox();
        itemList = new VBox();
        itemList.setPadding(new Insets(5,5,5,5));
        itemList.setStyle("-fx-background-color: black;");
        itemList.setPrefWidth(80);
        itemList.setAlignment(Pos.CENTER);
        visited = false;
        visited1 = false;
        mirrorVisited = false;
        up = false;
        
        image8 = new Image(getClass().getResourceAsStream("/stuff/asylum.jpg"));
        ImageView view = new ImageView(image8);
        Text hello = new Text("Welcome to the Asylum");
        hello.setFont(Font.font ("Papyrus", 50));
        hello.setFill(Color.WHITE);
        hello.setTextAlignment(TextAlignment.CENTER);
        hello.setWrappingWidth(400);
        view.setFitWidth(500);
        view.setFitHeight(600);
        StackPane pane = new StackPane();
        pane.getChildren().addAll(hello,view,v);
        opening = new Scene(pane,500,600);
        game = new Scene(b,500,600);
        
        ok = new Button("OK!");
        op1 = new Button();
        op2 = new Button();
        op3 = new Button();
        op4 = new Button();
        enterName = new TextField();
        enterName.setPromptText("Enter your name");
        enterName.setFocusTraversable(false);
        t = new Text();
        main = new Text();
        item = new Text();
        item.setText("Items");
        item.setFont(Font.font ("Papyrus", 20));
        item.setFill(Color.WHITE);
        
        Image image9 = new Image(getClass().getResourceAsStream("/stuff/clouds.jpg"));
        Image image10 = new Image(getClass().getResourceAsStream("/stuff/fog.jpg"));
        ImageView view2 = new ImageView(image10);
        ImageView view1 = new ImageView(image9);
        view1.setFitHeight(50);
        view1.setFitWidth(500);
        view2.setFitHeight(430);
        view2.setFitWidth(420);
        
        
       items = new Item[7];
        items[0] = new Item("Flashlight");
        items[1] = new Item("Battery");
        items[2] = new Item("Master Key");
        items[3] = new Item("Basement Key");
        items[4] = new Item("Rope");
        items[5] = new Item("Screwdriver");
        items[6] = new Item("Bear");
        
        file1 = new File(".\\src\\stuff\\patient336.txt");
            file2 = new File(".\\src\\stuff\\suicide.txt");
            file4 = new File(".\\src\\stuff\\march30.txt");
            file5 = new File(".\\src\\stuff\\march31.txt");
            file6 = new File(".\\src\\stuff\\april2.txt");
            file7 = new File(".\\src\\stuff\\april4.txt");
            file8 = new File(".\\src\\stuff\\april5.txt");
            file9 = new File(".\\src\\stuff\\april9.txt");
            file10 = new File(".\\src\\stuff\\april15.txt");
            file11 = new File(".\\src\\stuff\\april16.txt");
            file12 = new File(".\\src\\stuff\\note.txt");
            file13 = new File(".\\src\\stuff\\note2.txt");
            file14 = new File(".\\src\\stuff\\notice.txt");
            file15 = new File(".\\src\\stuff\\notice2.txt");
            file16 = new File(".\\src\\stuff\\notice3.txt");
            music = ".\\src\\stuff\\march23.wav";
            music2 = ".\\src\\stuff\\end.wav";
            media = new Media(new File(music).toURI().toString());
            media2 = new Media(new File(music2).toURI().toString());
            
            pape = new Image(getClass().getResourceAsStream("/stuff/paper.jpg"));
            paper = new ImageView(pape);
            
        
            
        //LAYOUT
        t.setFont(Font.font ("Papyrus", 30));
        main.setFont(Font.font ("Papyrus", 20));
        main.setWrappingWidth(400);
        DropShadow borderGlow = new DropShadow();
        borderGlow.setColor(Color.WHITE);
        borderGlow.setSpread(.95);
        main.setEffect(borderGlow);
        v.getChildren().addAll(hello,enterName,ok);
        v.setAlignment(Pos.CENTER);
        s.getChildren().addAll(view1,t);
        p.getChildren().addAll(view2,main);
        b.setTop(s);
        b.setBottom(h);
        b.setCenter(p);
        b.setRight(itemList);
        s.setAlignment(Pos.CENTER);
        h.setAlignment(Pos.CENTER);
        p.setAlignment(Pos.CENTER);
        op1.setPrefSize(125,100);
        op2.setPrefSize(125,100);
        op3.setPrefSize(125,100);
        op4.setPrefSize(125,100);
        op1.setWrapText(true);
        op2.setWrapText(true);
        op3.setWrapText(true);
        op4.setWrapText(true);
        h.setPadding(new Insets(10, 10, 10, 10));
        h.setSpacing(10);
        h.getChildren().addAll(op1,op2,op3,op4);
        h.setStyle("-fx-background-color: #000000;");
        
                numbers = new Text();
                numbers.setText("Sticky Note: 6284\n");
                b0 = new Button();
                b1 = new Button();
                b2 = new Button();
                b3 = new Button();
                b4 = new Button();
                b5 = new Button();
                b6 = new Button();
                b7 = new Button();
                b8 = new Button();
                b9 = new Button();
                b10 = new Button();
                b11 = new Button();
                b12 = new Button();
                b13 = new Button();
                b14 = new Button();
                b15 = new Button();
                b16 = new Button();
                numbers.setVisible(false);
                
            b0.setText("Patient 3-3-6");
            b1.setText("Julie's Suicide Note");
            b2.setText("March 23rd (audio)");
            b3.setText("March 30th");
            b4.setText("March 31st");
            b5.setText("April 2nd");
            b6.setText("April 4th");
            b7.setText("April 5th");
            b8.setText("April 9th");
            b9.setText("April 15th");
            b10.setText("April 16th");
            b11.setText("Note");
            b12.setText("Note 2");
            b13.setText("Termination Notice 1");
            b14.setText("Termination Notice 2");
            b15.setText("Termination Notice 3");
            b16.setText("Final Transmission (audio)");
        
            b0.setDisable(true);
            b0.setVisible(false);
            b1.setDisable(true);
            b1.setVisible(false);
            b2.setDisable(true);
            b2.setVisible(false);
            b3.setDisable(true);
            b3.setVisible(false);
            b4.setDisable(true);
            b4.setVisible(false);
            b5.setDisable(true);
            b5.setVisible(false);
            b6.setDisable(true);
            b6.setVisible(false);
            b7.setDisable(true);
            b7.setVisible(false);
            b8.setDisable(true);
            b8.setVisible(false);
            b9.setDisable(true);
            b9.setVisible(false);
            b10.setDisable(true);
            b10.setVisible(false);
            b11.setDisable(true);
            b11.setVisible(false);
            b12.setDisable(true);
            b12.setVisible(false);
            b13.setDisable(true);
            b13.setVisible(false);
            b14.setDisable(true);
            b14.setVisible(false);
            b15.setDisable(true);
            b15.setVisible(false);
            b16.setDisable(true);
            b16.setVisible(false);
        
        //All the image crap
        image1 = new Image(getClass().getResourceAsStream("/stuff/flashlight.png"));
        image2 = new Image(getClass().getResourceAsStream("/stuff/battery.png"));
        image3 = new Image(getClass().getResourceAsStream("/stuff/mkey.png"));
        image4 = new Image(getClass().getResourceAsStream("/stuff/bkey.png"));
        image5 = new Image(getClass().getResourceAsStream("/stuff/rope.png"));
        image6 = new Image(getClass().getResourceAsStream("/stuff/screw.png"));
        image7 = new Image(getClass().getResourceAsStream("/stuff/bear.png"));
        
        i1 = new ImageView(image1);
        i2 = new ImageView(image2);
        i3 = new ImageView(image3);
        i4 = new ImageView(image4);
        i5 = new ImageView(image5);
        i6 = new ImageView(image6);
        i7 = new ImageView(image7);
        flashlight = new Label("");
        battery = new Label("");
        masterKey = new Label("");
        basementKey = new Label("");
        rope = new Label("");
        screwdriver = new Label("");
        bear = new Label("");
        i1.setFitHeight(50);
        i1.setFitWidth(50);
        i2.setFitHeight(50);
        i2.setFitWidth(50);
        i3.setFitHeight(50);
        i3.setFitWidth(50);
        i4.setFitHeight(50);
        i4.setFitWidth(50);
        i5.setFitHeight(50);
        i5.setFitWidth(50);
        i6.setFitHeight(50);
        i6.setFitWidth(50);
        i7.setFitHeight(50);
        i7.setFitWidth(50);
        
        flashlight.setGraphic(i1);
        battery.setGraphic(i2);
        masterKey.setGraphic(i3);
        basementKey.setGraphic(i4);
        rope.setGraphic(i5);
        screwdriver.setGraphic(i6);
        bear.setGraphic(i7);
        flashlight.setVisible(false);
        battery.setVisible(false);
        masterKey.setVisible(false);
        basementKey.setVisible(false);
        rope.setVisible(false);
        screwdriver.setVisible(false);
        bear.setVisible(false);
        
        Button docs = new Button("Docs");
        docs.setOnAction(e ->{try {
            Documents();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
});
        
        itemList.getChildren().addAll(item,flashlight,battery,masterKey,basementKey,rope,screwdriver,bear,docs);
        
        //THINGS' ACTIONS
        ok.setOnAction(e ->{
            name = enterName.getText();
            primaryStage.setScene(game);
            t.setText("Welcome, "+name);
            primaryStage.setTitle(name + "'s Adventure");
            startUp();
        });
        
        
                
        //MAKE WINDOW
        primaryStage.setTitle("");
        primaryStage.setScene(opening);
        primaryStage.show();
    }

    //MAIN
    public static void main(String[] args) {
        launch(args);
    }
    
    public void setImage(ImageView z){
        z.setFitHeight(430);
        z.setFitWidth(420);
        p.getChildren().clear();
        p.getChildren().addAll(z,main);
    }
    
    public void clear(){
        op1.setOnAction(e ->{});
        op2.setOnAction(e ->{});
        op3.setOnAction(e ->{});
        op4.setOnAction(e ->{});
        op1.setText("");
        op2.setText("");
        op3.setText("");
        op4.setText("");
    }
    
    public void generalPop(String s,String u){
        Stage stage = new Stage();
        VBox vbox = new VBox();
        Text y = new Text(s);
        vbox.setAlignment(Pos.CENTER);
        y.setTextAlignment(CENTER);
        Button btn = new Button(u);
        btn.setOnAction(e ->{
            stage.close();
        });
        vbox.getChildren().addAll(y,btn);
        Scene scene1 = new Scene(vbox);
        stage.setResizable(false);
        stage.setScene(scene1);
        stage.show();
    }
    
    public void Documents() throws FileNotFoundException{
            vbox = new VBox();
            popup = new Stage();
            paper.setFitHeight(600);
            paper.setFitWidth(400);
            StackPane pane1 = new StackPane();
            pane1.getChildren().addAll(paper,vbox);
            vbox.getChildren().addAll(numbers,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16);
            vbox.setAlignment(Pos.CENTER);
            q = new Scene(pane1,400,600);
            
            b0.setOnAction(e ->{
                try {
                    docPop(file1);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b1.setOnAction(e ->{
                try {
                    docPop(file2);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b2.setOnAction(e ->{
                soundPop(media,"March 23rd");
            });
            b3.setOnAction(e ->{
                try {
                    docPop(file4);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b4.setOnAction(e ->{
                try {
                    docPop(file5);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b5.setOnAction(e ->{
                try {
                    docPop(file6);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b6.setOnAction(e ->{
                try {
                    docPop(file7);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b7.setOnAction(e ->{
                try {
                    docPop(file8);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b8.setOnAction(e ->{
                try {
                    docPop(file9);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b9.setOnAction(e ->{
                try {
                    docPop(file10);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b10.setOnAction(e ->{
                try {
                    docPop(file11);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b11.setOnAction(e ->{
                try {
                    docPop(file12);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b12.setOnAction(e ->{
                try {
                    docPop(file13);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b13.setOnAction(e ->{
                try {
                    docPop(file14);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b14.setOnAction(e ->{
                try {
                    docPop(file15);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b15.setOnAction(e ->{
                try {
                    docPop(file16);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(TextGameGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            b16.setOnAction(e ->{
                soundPop(media2,"Final Transmission");
            });
            
            //Show popup
            popup.setScene(q);
            popup.setTitle("Found Documents");
            popup.setResizable(false);
            popup.show();
    }
    
    public void docPop(File f) throws FileNotFoundException{
        Scanner in = new Scanner(f);
        Button back = new Button("Back");
        VBox box = new VBox();
        Text te = new Text();
        te.setTextAlignment(TextAlignment.CENTER);
        back.setPrefSize(300,50);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(back,te);
        te.setWrappingWidth(475);
        while(in.hasNext()){
            te.setText(te.getText() +"\n" + in.nextLine());
        }
        
        Scene yup = new Scene(box,500,500);
        popup.setScene(yup);
        back.setOnAction(e ->{popup.setScene(q);});
    }
    
    public void itemPop(String s){
        Stage stage = new Stage();
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        Text y = new Text("You got a " + s + "\n\n");
        Button btn = new Button("Sweet!!");
        btn.setOnAction(f ->{
            stage.close();
        });
        vbox.getChildren().addAll(y,btn);
        Scene scene1 = new Scene(vbox);
        stage.setScene(scene1);
        stage.setResizable(false);
        stage.show();
    }
    
    public void soundPop(Media m, String s){
        playing = false;
        Text tex = new Text();
        tex.setFont(Font.font ("Papyrus", 30));
        tex.setTextAlignment(TextAlignment.CENTER);
        tex.setText(s);
        Button back = new Button("Back");
        Button play = new Button("Play");
        Button stop = new Button("Stop");
        VBox box = new VBox();
        back.setPrefSize(300,50);
        play.setPrefSize(300,50);
        stop.setPrefSize(300,50);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(tex,back,play,stop);
        MediaPlayer mediaPlayer = new MediaPlayer(m);
        play.setOnAction(e ->{
            mediaPlayer.play();
            playing = true;
        });
        stop.setOnAction(e ->{
            if(playing == true){
                mediaPlayer.stop();
                playing = false;
            }
            else{
                
            }
        });
        
        Scene yup = new Scene(box,500,500);
        popup.setScene(yup);
        back.setOnAction(e ->{popup.setScene(q);});
        
    }
    
    public void startUp(){
        clear();
        main.setText("This is your adventure!! You will be checking out an asylum and solving the mystery that lies within. You will need to search for items to open new areas"
                + ". You will also gather evidence and knowledge to help you solve the mystery. This evidence can be viewed from the 'Docs' button. Have fun!");
        op1.setText("Let's do it!");
        op1.setOnAction(e ->{
            main.setText("");
            op1.setText("");
            beginAdventure();
        }); 
        
        op2.setOnAction(e ->{basement2();});
    }
    
    public void beginAdventure(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/asylum2.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Blackbay Asylum");
        main.setText("You are a paranormal ghost hunter looking into a closed down asylum in Germany. You get out of the car as your crew gathers their supplies. The asylum is very run down."
                + " Broken windows, graffiti, boarded doors.");
        op1.setText("Go inside");
        op1.setOnAction(e ->{
            goInside();
        });
    }
    
    public void goInside(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/lobby.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Lobby");
        main.setText("You eventually get the boards off the front door and head inside. Your crew sets up their lights and thermal cameras. The crew consists of\n"
                + "-Kevin: the camera man\n"
                + "-Carl: the sound guy\n"
                + "-Misty: the hardware technician");
        op1.setText("Talk to Kevin");
        op2.setText("Talk to Carl");
        op3.setText("Talk to Misty");
        op4.setText("Head into the asylum depths");
        
        op1.setOnAction(e ->{Kevin();});
        op2.setOnAction(e ->{Carl();});
        op3.setOnAction(e ->{Misty();});
        op4.setOnAction(e ->{mainHallway();});
    }
    
    public void Lobby(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/lobby.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Lobby");
        main.setText("So here we are in the lobby, what now?");
        op1.setText("Talk to Kevin");
        op2.setText("Talk to Carl");
        op3.setText("Talk to Misty");
        op4.setText("Head into the asylum depths");
        
        op1.setOnAction(e ->{Kevin();});
        op2.setOnAction(e ->{Carl();});
        op3.setOnAction(e ->{Misty();});
        op4.setOnAction(e ->{mainHallway();});
    }
    
    public void Kevin(){
        clear();
        main.setText("KEVIN:\n"
                + "Hey, " + name + "! Pretty creey place, huh? It's pretty dark, here take a flashlight. Sadly, I don't have any batteries....maybe you can find one lying around.");
        items[0].setHas(true);
        flashlight.setVisible(true);
        
        op1.setText("Cool, thanks!");
        op1.setOnAction(e ->{itemPop("Flashlight");Lobby();});
    }
    
    public void Carl(){
        clear();
        main.setText("CARL:\nOh hey, " + name + "! How's it going? I'm not too fond of this place, feels like something is very off here.");
        op1.setText("Like what?");
        op2.setText("I feel it too");
        op1.setOnAction(e ->{
            clear();
            main.setText("CARL:\nI don't know...just feels like something really bad happened here");
            op1.setText("*back*");
            op1.setOnAction(f ->{Lobby();});
        });
        op2.setOnAction(e ->{
            clear();
            main.setText("CARL:\nOk, so it's not just me!");
            op1.setText("*back*");
            op1.setOnAction(f ->{Lobby();});
        });
        
        
    }
    
    public void Misty(){
        clear();
        main.setText("MISTY:\nWhat do you want, " + name + "? Can't you see I'm kind of busy here?");
        op1.setText("Sorry");
        op2.setText("Excuse you");
        op1.setOnAction(e ->{
            clear();
            main.setText("MISTY:\nNo, I'M sorry...this place seems to be affecting my mood....weird.");
            op1.setText("*back*");
            op1.setOnAction(f ->{Lobby();});
        });
        op2.setOnAction(e ->{
            clear();
            main.setText("MISTY:\nI don't need your attitude. Go do your job or something.");
            op1.setText("*back*");
            op1.setOnAction(f ->{Lobby();});
        });
        
    }
    
    public void mainHallway(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/mainHallway.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Main Hallway");
        main.setText("You go off to venture into the unknown. After passing reception, you come to a crossroads. Luckily, the signs above each hallway are still legible.");
        op1.setText("Left\nWest Wing");
        op2.setText("Straight\nNursery");
        op3.setText("Right\nEast Wing");
        op4.setText("*back*");
        op1.setOnAction(e ->{westWing();});
        op2.setOnAction(e ->{nursery();});
        op3.setOnAction(e ->{eastWing();});
        op4.setOnAction(e ->{Lobby();});
    }
    //NURSERY*****************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    public void nursery(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/nursery.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Nursery");
        main.setText("The eerie scent of lost innocence fills your nostrils. You can almost hear the sounds of children playing echoing off the walls.");
        op1.setText("Left\nRoom 110");
        op2.setText("Straight");
        op3.setText("Right\nRoom 115");
        op4.setText("*back*");
        
            op1.setOnAction(e ->{
                if (items[2].doesHave() == false){
                    clear();
                    Image imageAsylum1 = new Image(getClass().getResourceAsStream("/stuff/locked.jpg"));
                    ImageView i1 = new ImageView(imageAsylum1);
                    setImage(i1);
                    main.setText("It's locked");
                    op1.setText("*back*");
                    op1.setOnAction(f ->{nursery();});
                }
                else{
                    room110();
                }
            });
            
            op2.setOnAction(e ->{
                if(items[0].doesHave() == false || items[1].doesHave() == false){
                    clear();
                    Image imageAsylum1 = new Image(getClass().getResourceAsStream("/stuff/dark2.JPG"));
                    ImageView i1 = new ImageView(imageAsylum1);
                    setImage(i1);
                    main.setText("It's way too dark down there. It would be scary as hell without a working flashlight.");
                    op1.setText("*back*");
                    op1.setOnAction(f ->{nursery();});
                }
                else{
                    nursery2();
                }
            });
            
            op3.setOnAction(e ->{
                if (items[2].doesHave() == false){
                    clear();
                    Image imageAsylum1 = new Image(getClass().getResourceAsStream("/stuff/locked.jpg"));
                    ImageView i1 = new ImageView(imageAsylum1);
                    setImage(i1);
                    main.setText("It's locked");
                    op1.setText("*back*");
                    op1.setOnAction(f ->{nursery();});
                }
                else{
                    room115();
                }
            });
            
            op4.setOnAction(e ->{mainHallway();});
            
    }
    
    public void nursery2(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/nursery2.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Nursery Bedrooms");
        main.setText("You come to a big circular area with 6 rooms around it. Each one has a name...probably each patient's room.");
        op1.setText("Left 3 rooms");
        op2.setText("Right 3 rooms");
        op3.setText("*back*");
        
        op1.setOnAction(e ->{
            leftRooms();
        });
        
        op2.setOnAction(e ->{
            rightRooms();
        });
        
        op3.setOnAction(e ->{nursery();});
    }
    
    public void rightRooms(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/3rooms.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Right Rooms");
        
            op1.setText("Room 4");
            op2.setText("Room 5");
            op3.setText("Room 6");
            op4.setText("*back*");
            op1.setOnAction(f ->{room4();});
            op2.setOnAction(f ->{room5();});
            op3.setOnAction(f ->{room6();});
            op4.setOnAction(f ->{nursery2();});
    }
    
    public void leftRooms(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/3rooms.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Left Rooms");
        
            op1.setText("Room 1");
            op2.setText("Room 2");
            op3.setText("Room 3");
            op4.setText("*back*");
            op1.setOnAction(f ->{room1();});
            op2.setOnAction(f ->{room2();});
            op3.setOnAction(f ->{room3();});
            
            op4.setOnAction(f ->{nursery2();});
    }
    
    public void room1(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/room1.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Room 1");
        main.setText("There are crayon drawings on the walls, a little desk in the corner, and a small cot. Crayons are scattered everywhere.");
        op1.setText("Look at drawings");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{
            clear();
            main.setText("Good...Hell... These are just a bunch of stick figures killing each other. Blood everywhere, crude figures being hit by cars, being stabbed....heavy.");
            op1.setText("*back*");
            op1.setOnAction(f ->{room1();});
        });
        
        op2.setOnAction(e ->{leftRooms();});
        
    }
    
    public void room2(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/room5.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Room 2");
        main.setText("This room is pretty messy...a big shelf holds a lot of random papers and books. Though there is also a stray paper under the pillow on the cot.");
        op1.setText("Go to cot");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{
           clear();
           main.setText("It's a note...Added to docs.");
           b11.setVisible(true);
           b11.setDisable(false);
           op1.setText("*back*");
           op1.setOnAction(f ->{room2();});
        });
        
        op2.setOnAction(e ->{leftRooms();});
    }
    
    public void room3(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/room4.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Room 3");
        main.setText("This is just a big padded room...nothing but some brutal writing on the wall.");
        op1.setText("*back*");
        op1.setOnAction(e ->{leftRooms();});
    }
    
    public void room4(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/room2.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Room 4");
        main.setText("This room is pretty empty, but still quite messy.");
        op1.setText("*back*");
        op1.setOnAction(e ->{rightRooms();});
    }
    
    public void room5(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/room3.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Room 5");
        main.setText("There's blood everywhere in here. Yet another piece of paper on the bed.");
        op1.setText("Inspect room");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{
            clear();
            main.setText("Which one do you want to check out?");
            op1.setText("Desk");
            op2.setText("Bloody bed");
            op3.setText("*back*");
            
            op1.setOnAction(f ->{
               clear();
               main.setText("There are bloody drawings on the desk, crayons in the drawer...oh...something is taped to the bottom of the drawer. "
                       + "It's a key!! Looks like quite an important one.");
               items[2].setHas(true);
               masterKey.setVisible(true);
               op1.setText("*back*");
               itemPop("Master Key");
               op1.setOnAction(h ->{room5();});
            });
            
            op2.setOnAction(f ->{
                clear();
                main.setText("Just lots of blood....also kind of seems like blood from multiple people.");
                op1.setText("*back*");
                op1.setOnAction(h ->{room5();});
            });
            
            op3.setOnAction(f ->{room5();});
        });
        
        op2.setOnAction(e ->{rightRooms();});
    }
    
    public void room6(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/room6.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Room 6");
        main.setText("This room is rather big! A couple turned over beds, and a note. Added to docs.");
        b12.setVisible(true);
        b12.setDisable(false);
        op1.setText("*back*");
        op1.setOnAction(e ->{rightRooms();});
    }
    
    public void room110(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/interrogation.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Room 110");
        main.setText("This just looks like some kind of interrogation room. There's just a chair with restraints below a dimly lit light bulb.");
        op1.setText("*back*");
        op1.setOnAction(e ->{nursery();});
    }
    
    public void room115(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/surveillanceRoom.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Room 115");
        main.setText("Here's the surveillance room. Lots of the monitors are broken and the keyboards are smashed into pieces everywhere. There are some filing cabinets in the corner.");
        op1.setText("Check out the filing cabinets");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{
            clear();
            main.setText("After some intense searching, you come across some important looking documents.");
            op1.setText("*back*");
            op1.setOnAction(f ->{nursery();});
        });
        
        op2.setOnAction(e ->{nursery();});
    }
    
    //WEST WING***************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    
    public void westWing(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/westWing.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("West Wing");
        main.setText("Here, we see a decently lit hallway leading to some operating room. To the left is some kind of office.");
        op1.setText("Left\nOffice");
        op2.setText("Straight\nOperating Room");
        op3.setText("Right\nBathroom");
        op4.setText("*back*");
        
        op1.setOnAction(e ->{
            if(items[2].doesHave() == false){
                clear();
                Image imageAsylum1 = new Image(getClass().getResourceAsStream("/stuff/locked.jpg"));
                ImageView i1 = new ImageView(imageAsylum1);
                setImage(i1);
                main.setText("It's locked.");
                op1.setText("*back*");
                op1.setOnAction(f ->{westWing();});
            }
            else{
                office();
            }
        });
        
        op2.setOnAction(e ->{opRoom();});
        
        op3.setOnAction(e ->{bathroom();});
        
        op4.setOnAction(e ->{mainHallway();});
    }
    
    public void bathroom(){
        clear();
                Image imageAsylum1 = new Image(getClass().getResourceAsStream("/stuff/bathroom.jpg"));
                ImageView i1 = new ImageView(imageAsylum1);
                setImage(i1);
        t.setText("Bathroom");
        main.setText("Creepy looking bathroom, just look at it!");
        op1.setText("*back*");
        op1.setOnAction(e ->{westWing();});
    }
    
    public void office(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/office.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Office");
        main.setText("Seems like the office of someone important. Old pictures, awards, and degrees hang on the wall. After some inspection, you see a safe under the desk");
        op1.setText("Check out safe");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{safe();});
        
        op2.setOnAction(e ->{westWing();});
    }
    
    public void safe(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/closedSafe.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Office Safe");
        main.setText("It's a combination safe. Just need 4 numbers to unlock it....maybe it's on a note somewhere.");
        TextField numbers = new TextField();
        numbers.setPrefSize(250,100);
        op1.setText("Enter");
        op1.setOnAction(e ->{
           if(numbers.getText().equals("6284")){
               clear();
               Image imageAsylum1 = new Image(getClass().getResourceAsStream("/stuff/openSafe.jpg"));
               ImageView i1 = new ImageView(imageAsylum1);
               setImage(i1);
               main.setText("Success!! Inside is a few documents and a key....but it doesn't look too important.");
               items[3].setHas(true);
               basementKey.setVisible(true);
               op1.setText("*back*");
               itemPop("Basement Key");
               op1.setOnAction(f ->{
                   
                   office();
                   h.getChildren().clear();
                   h.getChildren().addAll(op1,op2,op3,op4);
               });
           }
           else{
               clear();
               main.setText("Nope, didn't work :(");
               op1.setText("*back*");
               op1.setOnAction(f ->{safe();});
           }
        });
        op2.setText("*back*");
        op2.setOnAction(e ->{
            office();
            h.getChildren().clear();
            h.getChildren().addAll(op1,op2,op3,op4);
        });
        
        h.getChildren().clear();
        h.getChildren().addAll(numbers,op1,op2);
    }
    
    public void opRoom(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/opRoom.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Operating Room");
        main.setText("A table sits in the middle of the room. Restraints on it, blood everywhere. There's a little rolling table with rusty, bloody utensils.");
        op1.setText("Look around the room");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{
            clear();
             main.setText("As you look around the room, you see some sticky notes with a lot of medical jargon. All talking about 'the subject'");
             op1.setOnAction(f ->{opRoom();});
        });
        
        op2.setOnAction(e ->{westWing();});
    }
    
    //EAST WING***************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    //************************************************************************************************************************************************************************************
    
    public void eastWing(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/eastWing.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("East Wing");
        main.setText("Here, there is a darkened hallway straight ahead. To the right is some kind of meeting room. To the left looks like a Janitor's closet. "
                + "There may be some usefull stuff in there.");
        op1.setText("Closet");
        op2.setText("Straight");
        op3.setText("Meeting Room");
        op4.setText("*back*");
        
        op1.setOnAction(e ->{closet();});
        
        op2.setOnAction(e ->{
                if(items[0].doesHave() == false || items[1].doesHave() == false){
                    clear();
                    Image imageAsylum1 = new Image(getClass().getResourceAsStream("/stuff/dark.jpg"));
                    ImageView i1 = new ImageView(imageAsylum1);
                    setImage(i1);
                    main.setText("It's way too dark down there. It would be scary as hell without a working flashlight.");
                    op1.setText("*back*");
                    op1.setOnAction(f ->{eastWing();});
                }
                else{
                    east2();
                }
            });
        
        op3.setOnAction(e ->{meetingRoom();});
        
        op4.setOnAction(e ->{mainHallway();});
    }
    
    public void closet(){
        clear();
        if(up == true){
            main.setText("The shaft lead back up to the janitor's closet!");
        }
        else{
            main.setText("It's all musty in here. There are flies buzzing around a mop bucket full of....something. There's a desk and 2 lockers.");
        }
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/janitorCloset.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Janitor's Closet");
        
        op1.setText("Check Desk");
        op2.setText("Check locker 1");
        op3.setText("Check locker 2");
        op4.setText("*back*");
        
        op1.setOnAction(e ->{
            clear();
            main.setText("Woah, a screwdriver....might come in handy.");
            items[5].setHas(true);
            screwdriver.setVisible(true);
            op1.setText("*back*");
            itemPop("Screwdriver");
            op1.setOnAction(f ->{closet();});
        });
        
        op2.setOnAction(e ->{
            clear();
            main.setText("Nothing important");
            op1.setText("*back*");
            op1.setOnAction(f ->{closet();});
        });
        
        op3.setOnAction(e ->{
            clear();
            main.setText("Hey, a battery!! Perfect fit for a flashlight.");
            items[1].setHas(true);
            battery.setVisible(true);
            op1.setText("*back*");
            itemPop("Battery");
            op1.setOnAction(f ->{closet();});
        });
        
        
        op4.setOnAction(e ->{eastWing();});
                
    }
    
    public void meetingRoom(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/meetingRoom.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Meeting Room");
        main.setText("A big table sits in the middle of the room. Scattered papers all over the place. Just one filing cabinet.");
        op1.setText("Check cabinet");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{
           clear();
           Image imageAsylum1 = new Image(getClass().getResourceAsStream("/stuff/closedCabinet.jpg"));
           ImageView i1 = new ImageView(imageAsylum1);
           setImage(i1);
           if(items[5].doesHave() == false){
               clear();
               main.setText("It's jammed pretty good, maybe you can find something to pry it open.");
               op1.setText("*back*");
               op1.setOnAction(f ->{meetingRoom();});
           }
           else{
               clear();
               Image imageAsylum2 = new Image(getClass().getResourceAsStream("/stuff/openCabinet.jpg"));
               ImageView i2 = new ImageView(imageAsylum2);
               setImage(i2);
            main.setText("The screwdriver did the trick! Amongst all the clutter, there's a sticky note on the inside of the drawer. Just the numbers '6284'. Put it with your docs."); 
            this.numbers.setVisible(true);
            op1.setText("*back*");
            op1.setOnAction(f ->{meetingRoom();});
           }
        });
        
        op2.setOnAction(e ->{eastWing();});
    }
    
    public void east2(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/forever.jpg"));
        ImageView i = new ImageView(imageAsylum);
        setImage(i);
        t.setText("Further East Wing");
        main.setText("This hallway just seems to go on forever....");
        op1.setText("Keep going");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{east3();});
        
        op2.setOnAction(e ->{eastWing();});
    }
    
    public void east3(){
        clear();
        t.setText("The end of the forever long hall");
        main.setText("You finally come to a big door marked 'basement'");
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/basementDoor.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        
        op1.setText("Open door");
        op2.setText("*back*");
        
        op1.setOnAction(e ->{
            clear();
           if(items[3].doesHave() == false){
                main.setText("It needs a key...seems a master key doesn't work on this door. Maybe there's another one somewhere?");
                op1.setText("*back*");
                op1.setOnAction(f ->{east2();});
            }
            else{
                stairs();
            } 
        });
    }
    
    public void stairs(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/stairs.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        t.setText("Stairs");
        main.setText("You come to some rickety looking stairs, better head down carefully");
        op1.setText("Continue");
        op1.setOnAction(e ->{basement();});
    }
    
    public void basement(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/broken.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        String crack = ".\\src\\stuff\\crack.wav";
         Media media1 = new Media(new File(crack).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media1);
        mediaPlayer.play();
        t.setText("Basement");
        generalPop("Woah! The stairs just collapsed behind you...\nyou're going to have to find another way back up.","Crap");
        main.setText("");
        op1.setText("Continue");
        op1.setOnAction(e ->{basement1();});
    }
    
    public void basement1(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/basement.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        t.setText("Basement");
        main.setText("Here you are in the basement. It's dark, creepy, and definitely not commonplace in this asylum.");
        op2.setText("Right");
        op1.setText("Straight");
        op2.setOnAction(e ->{baseRoom();});
        op1.setOnAction(e ->{basement2();});
    }
    
    public void basement2(){
        clear();
        t.setText("Basement");
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/basement2.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        if(items[4].doesHave()){
            main.setText("This hallway eventually fills with pipes and seems even less visited than the other area. Wait...is that a rope??");
            op1.setText("Grab Rope");
            op2.setText("Continue");
            op2.setOnAction(e ->{
                if(mirrorVisited == true){
                    generalPop("You must find Justin's bear first","Kk");
                }
                else{
                    basement1();
                }
            });
            op1.setOnAction(e ->{
                items[4].setHas(true);
                rope.setVisible(true);
                itemPop("Rope.\nNow you can climb back up to the main floor!");
                op1.setText("*back*");
                op1.setOnAction(f ->{basement1();});
            });
        }
        else{
            main.setText("This hallway eventually fills with pipes and seems even less visited than the other area.");
            op1.setText("Continue");
            op2.setText("*back*");
            op2.setOnAction(e ->{basement1();});
            op1.setOnAction(e ->{
                if(mirrorVisited == true){
                    generalPop("You must find Justin's bear first","Kk");
                }
                else{
                    basement3();
                }
            });
        }
    }
    
    public void baseRoom(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/smallRoom.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        t.setText("First Basement Room");
        main.setText("It's a small room with some kind of small door in the side of the wall.");
        op1.setText("Check Door");
        op2.setText("*back*");
        op1.setOnAction(e ->{shaft();});
        op2.setOnAction(e ->{basement1();});
        
    }
    
    public void shaft(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/shaft.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        t.setText("Shaft");
        if(visited == false){
            main.setText("Oh it's a little dumbwaiter! This could be a way back to the main floor."
                    + "Looks too slimy to crawl up. You need something like a rope.");
            visited = true;
            op1.setText("*back*");
            op1.setOnAction(e ->{baseRoom();});
            
        }
        else{
            main.setText("The shaft you need a rope to climb up.");
            if(items[4].doesHave() == false){
                op1.setText("*back*");
                op1.setOnAction(e ->{baseRoom();});
            }
            else{
                op1.setText("Go up");
                op2.setText("*back*");
                op1.setOnAction(e ->{closet();});
                up = true;
            }
        }
    }
    
    public void basement3(){
        mirrorVisited = true;
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/room.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        t.setText("Weird Mirror Room");
        generalPop("Please...help me","What?");
        main.setText("Well that was creepy...The hell kind of a room is this? It's a dark room with a ton of giant mirrors everywhere all pointing inwoard at a chair "
                + "in the middle.");
        op1.setText("Reluctantly go towards the chair");
        op1.setOnAction(e ->{chair();});
    }
    
    public void chair(){
        clear();
        Image imageAsylum = new Image(getClass().getResourceAsStream("/stuff/chair.jpg"));
                ImageView i = new ImageView(imageAsylum);
                setImage(i);
        t.setText("The Creepy Chair");
        main.setText("Something compells yout to sit down...though your better judgement tells you otherwise, you do it anyway.");
        op1.setText("Well ok then...");
        op1.setOnAction(e ->{chairSit();});
    }
    
    public void chairSit(){
        clear();
        t.setText("Crazy Visions");
        main.setText("As you sit down, your head is suddenly filled with visions. Such terrible visions of Justin and scientific tests, torture, the horrible treatment of the children."
                + "And finally...a bear. A teddy bear. Then an image of the office desk.");
        op1.setText("Stand Up");
        op1.setOnAction(e ->{stand();});
    }
    
    public void stand(){
        clear();
        t.setText("Woah");
        main.setText("You understand now...Justin just wants his teddy bear. That was his only form of love in this god forsaken place. You must go find it.");
        op1.setText("*back*");
        op1.setOnAction(e ->{basement2();});
    }
    
}
