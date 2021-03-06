package zajecia7;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

//Zapis stanu gry: https://en.wikipedia.org/wiki/Forsyth%E2%80%93Edwards_Notation

public class Controller {

    @FXML
    Canvas szachycanvas;

    @FXML
    TextField input_kodu;

    @FXML
    ComboBox<String> figury;

    @FXML
    ComboBox<String> kolor;

    @FXML
    TextField kwota;
    @FXML
    TextField stopa;
    @FXML
    TextField inflacja;
    @FXML
    TextField lata;
    @FXML
    TextField future;
    @FXML
    TextField now;

    String rook = "\u265C";
    String pawn = "\u265F";

    //Funkcja uruchamiana przy starcie aplikacji
    public void initialize() {
        szachycanvas.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int x = (int)event.getX();
                int y = (int)event.getY();
                System.out.println("Kliknięto na " + x + " , " + y);
                int rzad = y / 40;
                int col = x / 40;
                String wybranaFigura = figury.getSelectionModel().getSelectedItem();
                System.out.println(wybranaFigura);

                int type = 0;
                if (wybranaFigura.equals("Pion")) {
                    type = 1;
                } else if (wybranaFigura.equals("Wieża")) {
                    type = 4;
                }
                rysujFigureSzachowa(rzad, col, type, false);


            }
        });
    }


    public void aaa() {
        String wybrany = kolor.getSelectionModel().getSelectedItem();
        System.out.println("Wybrany kolor:" + wybrany);
    }


    //najprostsza funkcja
    public int plus(int a, int b) {
        int x = a + b;
        return x;
    }


    //Funkcja rysująca figurę w odpowiednim miejscu
    void rysujFigureSzachowa(int rzad, int kol, int type, boolean isWhite) {
        GraphicsContext gc = szachycanvas.getGraphicsContext2D();
        if (isWhite) {
            gc.setFill(Color.WHITE);
        } else {
            gc.setFill(Color.BLACK);
        }
        gc.setFont(Font.font ("Verdana", 40));
        String piece = "x";
        if (type==1) {
            piece = pawn;
        } else if (type==4) {
            piece = rook;
        }
        gc.fillText(piece, kol * 40, 32 + rzad * 40);

    }


    public void rysujPlansze() {
        GraphicsContext gc = szachycanvas.getGraphicsContext2D();
        gc.setLineWidth(5);     //ustalenie szerokości lini
        gc.setStroke(Color.CORNFLOWERBLUE);  //ustalenie koloru lini
//        gc.strokeLine(5,5, 100,200);        //pojedyncza linia
//        gc.fillRect(50,50, 20, 20);     //zamalowany prostokąt
//        gc.fillRect(90,50, 20, 20);
//        gc.fillRect(70,70, 20, 20);

//        gc.setLineWidth(1);
//        gc.setStroke(Color.DARKGREY);
//        gc.strokeRect(5,5,390,390);

        //Rysowanie planszy z prostokątów

        for (int r = 0; r < 8; r++) {
            //jesteśmy w rzędzie o numerze "r"
            for (int c = 0; c < 8; c++) {
                //jesteśmy na polu o wsp. (r,c)
                int x = (r + c) % 2;  //reszta z dzielenia przez 2
                if (x==0) {
                    //rysuj jasne pole
                    gc.setFill(Color.LIGHTGREY);
                } else {
                    //rysuj ciemne pole
                    gc.setFill(Color.rgb(90,90,90));
                }
                gc.fillRect(c * 40, r * 40, 40, 40);
            }
        }


        //ustawienie rodzaju fontu i wielkości
        gc.setFont(Font.font ("Arial", 40));
        gc.setFont(Font.font ("Verdana", 40));

        //wypisuje dostępne fonty
        System.out.println(javafx.scene.text.Font.getFamilies());

        System.out.println(gc.getFont());

        //figurki szachowe są dostępne jako "literki"
        //https://en.wikipedia.org/wiki/Chess_symbols_in_Unicode
        gc.setFill(Color.BLACK);

        gc.fillText(rook, 0 + 1 * 40, 32 + 0 * 40);
        gc.fillText(pawn, 0 + 2 * 40, 32 + 5 * 40);



        //Dwie linie pionków
        for (int i = 0; i < 8; i++) {
            rysujFigureSzachowa(1, i, 1, true);
            rysujFigureSzachowa(6, i, 1, false);
        }

        //Dwie wieże
        rysujFigureSzachowa(0, 0, 4, true);
        rysujFigureSzachowa(0, 7, 4, true);

    }

    ///




    public void oblicz() {
        double dkwota = Double.valueOf(kwota.getText());
        double dstopa = Double.valueOf(stopa.getText());
        double dinflacja = Double.valueOf(inflacja.getText());

        int ilata = Integer.valueOf(lata.getText());

        double inf = dinflacja / 100;
        double sto = dstopa / 100;

        double total = 0;
        for (int i = 0; i < ilata; i++) {
            total += (dkwota) * sto;
        }

        double doZaplaty = dkwota + total;
        future.setText("" + (doZaplaty));






    }
}
