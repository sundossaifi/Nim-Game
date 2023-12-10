package com.nim.game;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;

import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import com.nim.game.util.Helper;

import static com.nim.game.util.Helper.loadView;

public class Main extends Application
{
    @Override
    public void start(Stage stage)
    {
        AnchorPane root = new AnchorPane();
        stage.setScene(new Scene(root));

        stage.setWidth(800);
        stage.setHeight(600);
        stage.setResizable(false);

        stage.getIcons()
            .add(
                new Image(
                    String.valueOf(
                        Helper.getResource("assets/image/icon.png")
                    )
                )
            );

        stage.setTitle("Nim Game");
        stage.show();

        loadView("view/main-menu.fxml", stage, root);
    }

    public static void main(String[] args)
    {
        launch();
    }
}