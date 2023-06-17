package com.example.calcolatrice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalcController {

        @FXML private Button canc;
        @FXML private Button div;
        @FXML private Button dot;
        @FXML private Button eight;
        @FXML private Button eq;
        @FXML private Button five;
        @FXML private Button four;
        @FXML private Button min;
        @FXML private Button mult;
        @FXML private Button nine;
        @FXML private Button one;
        @FXML private Button plus;
        @FXML private Button seven;
        @FXML private Button six;
        @FXML private TextField text;
        @FXML private Button three;
        @FXML private Button two;
        @FXML private Button zero;
    @FXML private Text saveNum;

        private String currNum = "";
        private String firstNum = "";
        private String operazione;

        @FXML
        void OnAction(ActionEvent event) {
            Node source = (Node) event.getSource();
            if (source == plus) {
                setUp("+");
            }
            if (source == min) {
                setUp("-");
            }
            if (source == mult) {
                setUp("*");
            }
            if (source == div) {
                setUp("/");
            }
            if(source == eq){
                calculate();
            }
        }

        @FXML
        void OnClick(ActionEvent event) {
            Node source = (Node) event.getSource();
            if(source == one) {addNumber("1");}
            if(source == two) {addNumber("2");}
            if(source == three) {addNumber("3");}
            if(source == four) {addNumber("4");}
            if(source == five) {addNumber("5");}
            if(source == six) {addNumber("6");}
            if(source == seven) {addNumber("7");}
            if(source == eight) {addNumber("8");}
            if(source == nine) {addNumber("9");}
            if(source == zero) {addNumber("0");}
            if(source == dot){addNumber(".");}
            if (source == canc){clearTextField();}
        }
        private void addNumber(String num){
            currNum += num;
            updateTextFild();
        }
        private void updateTextFild(){
            text.setText(currNum);
        }
    private void setUp(String operazione){
            this.operazione = operazione;
            firstNum = currNum;
            currNum = "";
            saveNum.setText(firstNum+""+operazione);
    }
    public void calculate(){
            int primo = Integer.parseInt(firstNum);
            int secondo = Integer.parseInt(currNum);
            switch (operazione){
                case "+" -> {
                    int result = somma(primo, secondo);
//                    int result = primo + secondo;
                    saveNum.setText(firstNum + "+" + currNum + " = " + result);
                    text.setText(String.valueOf(result));
                }
                case "-" -> {
                    int result = sottrazione(primo, secondo);
//                    int result = primo - secondo;
                    saveNum.setText(firstNum + "-" + currNum + " = " + result);
                    text.setText(String.valueOf(result));
                }
                case "*" -> {
                    int result = moltiplicazione(primo, secondo);
//                    int result = primo * secondo;
                    saveNum.setText(firstNum + "*" + currNum + " = " + result);
                    text.setText(String.valueOf(result));
                }
                case "/" -> {
                    double result = divisione(primo, secondo);
//                    if(primo == 0 ){
//                        result = 0;
//                    }else if (secondo == 0){
//                        text.setText("ERROR");
//                    } else {
//                        result = primo / (double)secondo;
//                    }
                    saveNum.setText(firstNum + "/" + currNum + " = " + result);
                    text.setText(String.valueOf(result));
                }
            }
    }
    private void clearTextField(){
            currNum = "";
            text.setText("");
            saveNum.setText("");
    }
    public Integer somma(Integer a, Integer b) {
            int result = a+b;
            return result;
    }
    public Integer sottrazione(Integer a, Integer b){
            int result = a-b;
            return result;
    }
    public Integer moltiplicazione(Integer a, Integer b){
            int result = a*b;
            return result;
    }
    public Double divisione(Integer a, Integer b){
            double result;
            if(a == 0){
                result = 0;
            } else {
                result = a / b;
            }
            return result;
    }
}