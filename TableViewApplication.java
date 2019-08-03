

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.SimpleIntegerProperty;
//import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;  
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableCell;

 

public class TableViewApplication extends Application {
 
    private TableView<Person> table = new TableView<Person>(); //create an instance variable
    private final ObservableList<Person> data =
            FXCollections.observableArrayList(
            new Person("762", "Andres", "Bonifacio", "Mississauga", "Single", "100000.00", "10000.00", "5000.00", "3500.00"),
            new Person("612", "Jose", "Rizal", "Mississauga", "Married", "100000.00", "10000.00", "5000.00", "2500.00"));
    
    final HBox hb = new HBox();
 
    public static void main(String[] args) {
        launch(args);
    }
 
   // @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View of Customer Mortgage Application");
        stage.setWidth(450);
        stage.setHeight(550);
        
        //First label created to display "Customer Database"
        final Label label1 = new Label("Customer Information");
        label1.setFont(new Font("Arial", 22));
        label1.setTextAlignment(TextAlignment.CENTER);
        label1.setWrapText(true);
        
       // VBox vBox = new VBox(10, label);
       // vBox.setAlignment(CENTER);

       // Scene scene = new Scene(vBox, 200, 200);
        
       // primaryStage.setTitle("Mortgage");
       // primaryStage.setScene(scene);
       // primaryStage.show();
 
        table.setEditable(true);
       
        //second label created
        final Label label2 = new Label("Please enter your data here:");
        label2.setFont(new Font("Arial", 14));
        
        //TableColumn represents the attributes such as the width, resizibility
        TableColumn custIDCol = new TableColumn("Customer ID");
        custIDCol.setMinWidth(50);
        custIDCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custID"));
        custIDCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custIDCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setCustID(t.getNewValue());
                }
            }
        );
 
        TableColumn custFNameCol = new TableColumn("First Name");
        custFNameCol.setMinWidth(150);
        custFNameCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custFName"));
        custFNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custFNameCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                            t.getTablePosition().getRow())
                            ).setCustFName(t.getNewValue());
                }
            }
        );
 
 
        TableColumn custLNameCol = new TableColumn("Last Name");
        custLNameCol.setMinWidth(150);
        custLNameCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custLName"));
        custLNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custLNameCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setCustLName(t.getNewValue());
                }
            }
        );
 
        TableColumn custAddressCol = new TableColumn("Address");
        custAddressCol.setMinWidth(200);
        custAddressCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custAddress"));
        custAddressCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custAddressCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setCustAddress(t.getNewValue());
                }
            }
        );
        
        TableColumn custStatusCol = new TableColumn("Marital Status");
        custStatusCol.setMinWidth(100);
        custStatusCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custStatus"));
        custStatusCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custStatusCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setCustStatus(t.getNewValue());
                }
            }
        );
        
        TableColumn custChkAcctCol = new TableColumn("Chequing Account");
        custChkAcctCol.setMinWidth(120);
        custChkAcctCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custChkAcct"));
        custChkAcctCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custChkAcctCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setCustChkAcct(t.getNewValue());
                }
            }
        );
  TableColumn custNetSalaryCol = new TableColumn("Net Salary");
        custNetSalaryCol.setMinWidth(120);
        custNetSalaryCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custNetSalary"));
        custNetSalaryCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custNetSalaryCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setCustNetSalary(t.getNewValue());
                }
            }
        );
        TableColumn custDownPaymentCol = new TableColumn("Down Payment");
        custDownPaymentCol.setMinWidth(120);
        custDownPaymentCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custDownPayment"));
        custDownPaymentCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custDownPaymentCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setCustDownPayment(t.getNewValue());
                }
            }
        );
        
        TableColumn custMonthlyPayCol = new TableColumn("Mortgage Monthly Payment");
        custMonthlyPayCol.setMinWidth(180);
        custMonthlyPayCol.setCellValueFactory(
            new PropertyValueFactory<Person, String>("custMonthlyPay"));
        custMonthlyPayCol.setCellFactory(TextFieldTableCell.forTableColumn());
        custMonthlyPayCol.setOnEditCommit(
            new EventHandler<CellEditEvent<Person, String>>() {
                @Override
                public void handle(CellEditEvent<Person, String> t) {
                    ((Person) t.getTableView().getItems().get(
                        t.getTablePosition().getRow())
                        ).setCustMonthlyPay(t.getNewValue());
                }
            }
        );
        
        
        table.setItems(data);
        table.getColumns().addAll(custIDCol, custFNameCol, custLNameCol, custAddressCol, custStatusCol, custChkAcctCol, custNetSalaryCol, custDownPaymentCol, custMonthlyPayCol);
        
        //create TextField for data entry
        
        final TextField addCustID = new TextField();
        addCustID.setMaxWidth(custIDCol.getPrefWidth());
        addCustID.setPromptText("Customer ID");
        
        final TextField addCustFName = new TextField(); 
        addCustFName.setMaxWidth(custFNameCol.getPrefWidth());
        addCustFName.setPromptText("First Name");
         
        final TextField addCustLName = new TextField();
        addCustLName.setMaxWidth(custLNameCol.getPrefWidth());
        addCustLName.setPromptText("Last Name");
        
        final TextField addCustAddress = new TextField(); 
        addCustAddress.setMaxWidth(custAddressCol.getPrefWidth());
        addCustAddress.setPromptText("Address");
        
        final TextField addCustStatus = new TextField();
        addCustStatus.setMaxWidth(custStatusCol.getPrefWidth());
        addCustStatus.setPromptText("Marital Status");
        
        final TextField addCustChkAcct = new TextField();
        addCustChkAcct.setMaxWidth(custChkAcctCol.getPrefWidth());
        addCustChkAcct.setPromptText("Checquing Account");
       
        
        
        final TextField addCustNetSalary = new TextField();
        addCustNetSalary.setMaxWidth(custNetSalaryCol.getPrefWidth());
        addCustNetSalary.setPromptText("Net Salary");
        
        final TextField addCustDownPayment = new TextField();
        addCustDownPayment.setMaxWidth(custDownPaymentCol.getPrefWidth());
        addCustDownPayment.setPromptText("Down Payment");
        
        final TextField addCustMonthlyPay = new TextField();
        addCustMonthlyPay.setMaxWidth(custMonthlyPayCol.getPrefWidth());
        addCustMonthlyPay.setPromptText("Monthly Payment");
 
        final Button addButton = new Button("Add");
        final Button addButton1 = new Button("Print");
        
        //eventhandler for addButton and if click will add data to the table
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                data.add(new Person(
                        addCustID.getText(),
                        addCustFName.getText(),
                        addCustLName.getText(),
                        addCustAddress.getText(),
                        addCustStatus.getText(),
                        addCustChkAcct.getText(),
                        addCustNetSalary.getText(),
                        addCustDownPayment.getText(),
                        addCustMonthlyPay.getText()));
                
                addCustID.clear();
                addCustFName.clear();
                addCustLName.clear();
                addCustAddress.clear();
                addCustStatus.clear();
                addCustChkAcct.clear();
                addCustNetSalary.clear();
                addCustDownPayment.clear();
                addCustMonthlyPay.clear();
                
            }
        });
 
        hb.getChildren().addAll(addCustID, addCustFName, addCustLName, addCustAddress, addCustStatus, addCustChkAcct, addCustNetSalary, addCustDownPayment, addCustMonthlyPay, addButton, addButton1);
        hb.setSpacing(3);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label1, table, label2, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
 
    public static class Person {
 
        private final SimpleStringProperty custID;
        private final SimpleStringProperty custFName;
        private final SimpleStringProperty custLName;
        private final SimpleStringProperty custAddress;
        private final SimpleStringProperty custStatus;
        private final SimpleStringProperty custChkAcct;
        private final SimpleStringProperty custNetSalary;
        private final SimpleStringProperty custDownPayment;
        private final SimpleStringProperty custMonthlyPay;
        
        //public double chkAcct1;
       // public double netSalary1;
        //public double downPayment1;
       
 
        private Person(String id, String fn, String ln, String ad, String stat, String chkAcct, String netSal, String dpmt, String mp) {
            this.custID = new SimpleStringProperty(id);
            this.custFName = new SimpleStringProperty(fn);
            this.custLName = new SimpleStringProperty(ln);
            this.custAddress = new SimpleStringProperty(ad);
            this.custStatus = new SimpleStringProperty(stat);
            this.custChkAcct = new SimpleStringProperty(chkAcct);
            this.custNetSalary = new SimpleStringProperty(netSal);
            this.custDownPayment = new SimpleStringProperty(dpmt);
            this.custMonthlyPay = new SimpleStringProperty(mp);
        }
 
        public String getCustID() {
            return custID.get();
        }
 
        public void setCustID(String id) {
            custID.set(id);
        }
        
        public String getCustFName() {
            return custFName.get();
        }
 
        public void setCustFName(String fn) {
            custFName.set(fn);
        }
        
        public String getCustLName() {
            return custLName.get();
        }
 
        public void setCustLName(String ln) {
            custLName.set(ln);
        }
        
        public String getCustAddress() {
            return custAddress.get();
        }
 
        public void setCustAddress(String ad) {
            custAddress.set(ad);
        }
 
        public String getCustStatus() {
            return custStatus.get();
        }
 
        public void setCustStatus(String stat) {
            custStatus.set(stat);
        }
 
        public String getCustChkAcct() {
            return custChkAcct.get();
        }
 
        public void setCustChkAcct(String chkAcct) {
         // double chkAcct1 =Double.parseDouble(chkAcct);
           custChkAcct.set(chkAcct);
        }
        
        public String getCustNetSalary() {
            return custNetSalary.get();
        }
 
        public void setCustNetSalary(String netSal) {
           // double netSalary1 = Double.parseDouble(netSal);
            custNetSalary.set(netSal);
        }
        
        public String getCustDownPayment() {
            return custDownPayment.get();
        }
 
        public void setCustDownPayment(String dpmt) {     
           custDownPayment.set(dpmt);
        } 
        
         public String getCustMonthlyPay() {
            return custMonthlyPay.get();
        }
 
           public void setCustMonthlyPay(String mp) {
             custMonthlyPay.set(mp);
        }
    }
    
    class EditingCell extends TableCell<Person, String> {
 
        private TextField textField;
 
        public EditingCell() {
        }
 
        @Override
        public void startEdit() {
            if (!isEmpty()) {
                super.startEdit();
                createTextField();
                setText(null);
                setGraphic(textField);
                textField.selectAll();
            }
        }
 
        @Override
        public void cancelEdit() {
            super.cancelEdit();
 
            setText((String) getItem());
            setGraphic(null);
        }
 
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
 
            if (empty) {
                setText(null);
                setGraphic(null);
            } else {
                if (isEditing()) {
                    if (textField != null) {
                        textField.setText(getString());
                    }
                    setText(null);
                    setGraphic(textField);
                } else {
                    setText(getString());
                    setGraphic(null);
                }
            }
        }
 
        private void createTextField() {
            textField = new TextField(getString());
            textField.setMinWidth(this.getWidth() - this.getGraphicTextGap()* 2);
            textField.focusedProperty().addListener(new ChangeListener<Boolean>(){
                @Override
                public void changed(ObservableValue<? extends Boolean> arg0, 
                    Boolean arg1, Boolean arg2) {
                        if (!arg2) {
                            commitEdit(textField.getText());
                        }
                }
            });
        }
 
        private String getString() {
            return getItem() == null ? "" : getItem().toString();
        }
    }
}
