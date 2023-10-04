package com.example.martocalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalculatorController {
    private Label label0;
    public Button button0;
    public Button button1, button2, button3;
    public Button button4, button5, button6;
    public Button button7, button8, button9;
    public Button buttonAdd, buttonSub;
    public Button buttonMul, buttonDiv, buttonEqu;
    public Button buttonC, buttonPun, buttonTurnOff;
    @FXML
    private Label Risultato;
    private int Result;
    @FXML
    protected void onButton1Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "1");
    }
    @FXML
    protected void onButton2Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "2");
    }
    @FXML
    protected void onButton3Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "3");
    }
    @FXML
    protected void onButton4Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "4");
    }
    @FXML
    protected void onButton5Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "5");
    }
    @FXML
    protected void onButton6Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "6");
    }
    @FXML
    protected void onButton7Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "7");
    }
    @FXML
    protected void onButton8Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "8");
    }
    @FXML
    protected void onButton9Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "9");
    }
    @FXML
    protected void onButton0Click() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "0");
    }
    @FXML
    protected void onButtonSubClick() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "-");
    }
    @FXML
    protected void onButtonPlusClick() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "+");
    }
    @FXML
    protected void onButtonMulClick() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "*");
    }

    @FXML
    protected void onButtonDivClick() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + "/");
    }

    @FXML
    protected void onButtonEquClick(){
        String RisultatoAttuale = Risultato.getText();
        String exprString = "";
        char carattere;
        char oper = 't';
        boolean ver = true;
        double res;
        while(ver){
            for(int i = 0; i< RisultatoAttuale.length();  i++){
                carattere = RisultatoAttuale.charAt(i);
                if (!Character.isDigit(carattere)){
                    exprString = exprString + RisultatoAttuale.charAt(i);
                } else {
                    if (exprString == "") {
                        Risultato.setText("SYNTAX ERROR");
                    }
                    else if(oper != 't'){
                        //fai l'operazione
                        switch(oper){
                            case '+': {
                                //res = res + ;
                            }
                        }
                    }
                    else {
                        res = Integer.parseInt(exprString);
                        oper = carattere;


                    }

                }
            }
        }
    }

    @FXML
    public void onButtonCClick() {
        Risultato.setText("");
    }

    public void onButtonPunClick() {
        String RisultatoAttuale = Risultato.getText();
        Risultato.setText(RisultatoAttuale + ".");
    }

    public void onButtonOffClick() {
    }
}