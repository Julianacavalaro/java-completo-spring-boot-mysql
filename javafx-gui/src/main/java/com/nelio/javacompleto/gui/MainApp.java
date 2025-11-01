package com.nelio.javacompleto.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Aplicação JavaFX demonstrando interface gráfica desktop
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cadastro de Produtos - JavaFX");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Cadastro de Produto");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label nomeLabel = new Label("Nome:");
        grid.add(nomeLabel, 0, 1);

        TextField nomeTextField = new TextField();
        grid.add(nomeTextField, 1, 1);

        Label precoLabel = new Label("Preço:");
        grid.add(precoLabel, 0, 2);

        TextField precoTextField = new TextField();
        grid.add(precoTextField, 1, 2);

        Label quantidadeLabel = new Label("Quantidade:");
        grid.add(quantidadeLabel, 0, 3);

        TextField quantidadeTextField = new TextField();
        grid.add(quantidadeTextField, 1, 3);

        Button btnCadastrar = new Button("Cadastrar");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btnCadastrar);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        btnCadastrar.setOnAction(e -> {
            String nome = nomeTextField.getText();
            String preco = precoTextField.getText();
            String quantidade = quantidadeTextField.getText();
            
            if (!nome.isEmpty() && !preco.isEmpty() && !quantidade.isEmpty()) {
                actiontarget.setText("Produto cadastrado: " + nome);
                nomeTextField.clear();
                precoTextField.clear();
                quantidadeTextField.clear();
            } else {
                actiontarget.setText("Por favor, preencha todos os campos!");
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
