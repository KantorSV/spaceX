package org.example;

import com.app.action.*;
import com.app.controller.PersonControllerImpl;
import com.app.model.Person;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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


        //StackPane tablePart = new StackPane();
        VBox tablePart = new VBox(10);
        tablePart.setPadding(new Insets(30, 30, 30, 30));
        //tablePart.setAlignment(Pos.CENTER);

        VBox dataPart = new VBox(10);
        dataPart.setPadding(new Insets(30, 30, 30, 30));
        //dataPart.setAlignment(Pos.CENTER);

        hBox.getChildren().add(tablePart);
        hBox.getChildren().add(dataPart);

        //----right part
        Label nameLabel = new Label("Name");
        final TextField nameTextField = new TextField();
        dataPart.getChildren().add(nameLabel);
        dataPart.getChildren().add(nameTextField);

        Label ageLabel = new Label("Age");
        final TextField ageTextField = new TextField();
        dataPart.getChildren().addAll(ageLabel, ageTextField);

        Label phoneLabel = new Label("Phone");
        final TextField phoneTextField = new TextField();
        dataPart.getChildren().addAll(phoneLabel, phoneTextField);

        Button createButton = new Button("Create");
        Button editButton = new Button("Edit");
        Button deleteButton = new Button("Delete");
        Button deleteAllButton = new Button("Delete All");
        Button saveToFileButton = new Button("Save to file");
        Button loadFromFileButton = new Button("Load from file");
        Button saveToFile2Button = new Button("Save2 to file");
        Button loadFromFile2Button = new Button("Load2 from file");
        Button saveToFile3Button = new Button("Save3 to file");
        Button loadFromFile3Button = new Button("Load3 from file");


        VBox crudPanel = new VBox(10);
        crudPanel.getChildren().addAll(createButton, editButton, deleteButton, deleteAllButton);

        VBox saveLoadPanel = new VBox(10);
        saveLoadPanel.getChildren().addAll(saveToFileButton, loadFromFileButton, saveToFile2Button, loadFromFile2Button, saveToFile3Button, loadFromFile3Button);

        HBox buttonsPanel = new HBox(10);
        buttonsPanel.getChildren().addAll(crudPanel, saveLoadPanel);


        dataPart.getChildren().addAll(buttonsPanel);





        //table part
        TableView tableView = new TableView();
        TableColumn idTableColumn = new TableColumn("id");
        //idTableColumn.setCellValueFactory(new PropertyValueFactory("lastName"));

        TableColumn nameTableColumn = new TableColumn("Name");
        nameTableColumn.setCellValueFactory(new PropertyValueFactory("name"));

        TableColumn ageTableColumn = new TableColumn("Age");
        ageTableColumn.setCellValueFactory(new PropertyValueFactory("age"));

        TableColumn phoneTableColumn = new TableColumn("Phone");
        phoneTableColumn.setCellValueFactory(new PropertyValueFactory("phone"));

        tableView.getColumns().add(idTableColumn);
        tableView.getColumns().add(nameTableColumn);
        tableView.getColumns().add(ageTableColumn);
        tableView.getColumns().add(phoneTableColumn);

        //tableView.getItems().add(new Person("Name1",1,"123"));
        //tableView.getItems().add(new Person("Name2",2,"123"));
        //tableView.getItems().add(new Person("Name3",3,"123"));


        final TableView.TableViewSelectionModel selectionModel = tableView.getSelectionModel();
        ObservableList selectedItems = selectionModel.getSelectedItems();

        selectedItems.addListener(new ListChangeListener<Person>() {

            @Override
            public void onChanged(Change object) {
                int index = selectionModel.getSelectedIndex();

                //selectionModel.getSelectedItem();
                Person selectedPerson = PersonControllerImpl.getInstance().read(index);

                nameTextField.setText(selectedPerson.getName());
                ageTextField.setText(selectedPerson.getAge()+"");
                phoneTextField.setText(selectedPerson.getPhone());
            }
        });



        tablePart.getChildren().add(tableView);




        CreateButtonAction createButtonAction = new CreateButtonAction(nameTextField, ageTextField, phoneTextField, tableView);
        createButton.setOnAction(createButtonAction);

        EditButtonAction editButtonAction = new EditButtonAction(nameTextField, ageTextField, phoneTextField, tableView);
        editButton.setOnAction(editButtonAction);

        RemovButtonAction removButtonAction = new RemovButtonAction(tableView);
        deleteButton.setOnAction(removButtonAction);

        RemoveAllButtonAction removeAllButtonAction = new RemoveAllButtonAction(tableView);
        deleteAllButton.setOnAction(removeAllButtonAction);

        saveToFileButton.setOnAction(new SaveButtonAction());
        loadFromFileButton.setOnAction(new LoadButtonAction(tableView));

        saveToFile2Button.setOnAction(new Save2ButtonAction());
        loadFromFile2Button.setOnAction(new Load2ButtonAction(tableView));
        saveToFile3Button.setOnAction(new Save3ButtonAction());
        loadFromFile3Button.setOnAction(new Load3ButtonAction(tableView));


        Scene scene = new Scene(hBox, 900, 900);
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
