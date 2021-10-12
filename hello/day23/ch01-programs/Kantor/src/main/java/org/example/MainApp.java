package org.example;

import com.app.action.*;
import com.app.conroller.PersonControllerImpl;
import com.app.model.Person;
import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        HBox hBox = new HBox(30);
        hBox.setAlignment(Pos.CENTER);


        VBox tablePart = new VBox(10);
        tablePart.setPadding(new Insets(30, 30, 30, 30));
        VBox dataPart = new VBox(10);
        dataPart.setPadding(new Insets(30, 30, 30, 30));

        hBox.getChildren().add(tablePart);
        hBox.getChildren().add(dataPart);

        //-------------   right part   -----------------------------

        Label nameLabel = new Label("Name");
        final TextField nameTextField = new TextField();
        dataPart.getChildren().addAll(nameLabel, nameTextField);

        Label ageLable = new Label("Age");
        final TextField ageTextField = new TextField();
        dataPart.getChildren().addAll(ageLable, ageTextField);

        Label phoneLable = new Label("Phone");
        final TextField phoneTextField = new TextField();
        dataPart.getChildren().addAll(phoneLable, phoneTextField);

        Button createButton = new Button("Create");
        Button editButton = new Button("Edit");
        Button deleteButton = new Button("Delete");
        Button deleteAllButton = new Button("Delete All");
        Button loadButton = new Button("Load");
        Button loadButton2 = new Button("Load2");
        Button loadButton3 = new Button("Load3");
        Button saveButton = new Button("Save");
        Button saveButton2 = new Button("Save2");
        Button saveButton3 = new Button("Save3");

        VBox crudPanel = new VBox(10);
        crudPanel.getChildren().addAll(createButton, editButton, deleteButton, deleteAllButton);

        VBox saveLoadPanel = new VBox(10);
        saveLoadPanel.getChildren().addAll(saveButton, saveButton2, saveButton3, loadButton, loadButton2, loadButton3);

        HBox buttonsPanel = new HBox(10);
        buttonsPanel.getChildren().addAll(crudPanel, saveLoadPanel);

        dataPart.getChildren().addAll(buttonsPanel);

        //-------------   left part   ------------------------------

        TableView tableView = new TableView();

        TableColumn idTableColumn = new TableColumn("id");
        idTableColumn.setCellValueFactory(new PropertyValueFactory("id"));

        TableColumn nameTableColumn = new TableColumn("Name");
        nameTableColumn.setCellValueFactory(new PropertyValueFactory("name"));

        TableColumn ageTableColumn = new TableColumn("Age");
        ageTableColumn.setCellValueFactory(new PropertyValueFactory("age"));

        TableColumn phoneTableColumn = new TableColumn("Phone");
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory("phone"));

        tableView.getColumns().addAll(idTableColumn, nameTableColumn, ageTableColumn, phoneTableColumn);

        final TableView.TableViewSelectionModel selectionModel = tableView.getSelectionModel();
        ObservableList selectedItems = selectionModel.getSelectedItems();

        selectedItems.addListener(new ListChangeListener<Person>() {
            @Override
            public void onChanged(Change object) {
                int index = selectionModel.getSelectedIndex();

                Person selectedPerson = PersonControllerImpl.getInstance().read(index);

                nameTextField.setText(selectedPerson.getName());
                ageTextField.setText(selectedPerson.getAge() + "");
                phoneTextField.setText(selectedPerson.getPhone());
            }
        });

        tablePart.getChildren().add(tableView);

        CreateButtonAction createButtonAction = new CreateButtonAction(nameTextField, ageTextField, phoneTextField, tableView);
        createButton.setOnAction(createButtonAction);

        EditButtonAction editButtonAction = new EditButtonAction(nameTextField, ageTextField, phoneTextField, tableView);
        editButton.setOnAction(editButtonAction);

        RemoveButtonAction removeButtonAction = new RemoveButtonAction(tableView);
        deleteButton.setOnAction(removeButtonAction);

        RemoveAllButtonAction removeAllButtonAction = new RemoveAllButtonAction(tableView);
        deleteAllButton.setOnAction(removeAllButtonAction);

        saveButton.setOnAction(new SaveButtonAction());
        saveButton2.setOnAction(new SaveButton2Action());
        saveButton3.setOnAction(new SaveButton3Action());

        loadButton.setOnAction(new LoadButtonAction(tableView));
        loadButton2.setOnAction(new LoadButton2Action(tableView));
        loadButton3.setOnAction(new LoadButton3Action(tableView));

        Scene scene = new Scene(hBox, 800, 600);

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
