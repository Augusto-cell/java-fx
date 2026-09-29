package com.senai.javafx.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField digiteAqui;

    @FXML
    private Label nomePessoa;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void cadastrarPessoa(){
        String nome = digiteAqui.getText();
        nomePessoa.setText("Olá " + nome);

    }
}
