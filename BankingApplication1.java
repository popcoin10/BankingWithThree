package bankingapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankingApplication1 extends Application
{
   private final TextField firstName = new TextField();
   private final TextField lastName = new TextField();
   private final TextField streetAddress = new TextField();
   private final Button btSubmit = new Button("Submit");
   private final Button btReset = new Button("Clear");
   private final Label label = new Label("Test");
   private final CustomerDatabase cList = new CustomerDatabase();

   @Override // Override the start method in the Application class
   public void start (Stage primaryStage)
   {
      VBox vBox1 = new VBox(5);
      vBox1.setPadding(new Insets(5, 5, 5, 5));

      Button btAdd = new Button("Add ");
      Button btDelete = new Button("Delete");
      Button btSearch = new Button("Search");

      vBox1.getChildren().add(btAdd);
      vBox1.getChildren().add(btDelete);
      vBox1.getChildren().add(btSearch);
      vBox1.setStyle("-fx-background-color: blue");

      btAdd.setOnAction((ActionEvent event) -> {
         this.addCustomer(primaryStage);
      });
      btDelete.setOnAction((ActionEvent event) -> {// this button will bring up drop down list of all created customers in array list, and give option to deleted. Can also make a confirmation pop up button
      });
      btSearch.setOnAction((ActionEvent event) -> {// this button will give a drop down list of created customers and we will just display information on screen for selected customer
      });

      Scene scene = new Scene(vBox1, 1000, 500);
      primaryStage.setTitle("Mortgage Database"); // Set title
      primaryStage.setScene(scene); // Place the scene in the stage
      primaryStage.show(); // Display the stage
   }


   public void addCustomer (Stage stage)
   {
      GridPane gridPane = new GridPane();
      gridPane.setHgap(5);
      gridPane.setVgap(5);
      gridPane.setStyle("-fx-background-color: blue");
      gridPane.add(new Label("First Name"), 0, 0);
      gridPane.add(firstName, 1, 0);
      gridPane.add(new Label("Last Name"), 0, 1);
      gridPane.add(lastName, 1, 1);
      gridPane.add(new Label("Street Address"), 0, 2);
      gridPane.add(streetAddress, 1, 2);
      gridPane.add(btSubmit, 1, 4);
      gridPane.add(btReset, 0, 4);

      firstName.setAlignment(Pos.BOTTOM_RIGHT);
      firstName.setPromptText("Enter your first name.");
      firstName.setPrefColumnCount(10);
      firstName.getText();

      lastName.setAlignment(Pos.BOTTOM_RIGHT);
      lastName.setPromptText("Enter your last name.");
      lastName.setPrefColumnCount(10);
      lastName.getText();

      streetAddress.setAlignment(Pos.BOTTOM_RIGHT);
      streetAddress.setPromptText("Enter your street address.");
      streetAddress.setPrefColumnCount(40);
      streetAddress.getText();

      btSubmit.setOnAction((ActionEvent event) -> {
         Customer c1 = new Customer(firstName.getText(), lastName.getText(), streetAddress.getText());
         cList.getCustomerList().add(c1);
         System.out.println(cList.getCustomerList().get(0).getFirstName());
         System.out.println(cList.getCustomerList().get(0).getLastName());
         System.out.println(cList.getCustomerList().get(0).getHomeAddress());

         if ((firstName.getText() != null && !firstName.getText().isEmpty())) {
            label.setText(firstName.getText() + " " + lastName.getText() + ", "
                    + "Let us calculate your mortgage options");
         }
         else {
            label.setText("Fields cannot be left blank");
         }
      });

      gridPane.setAlignment(Pos.CENTER);
      GridPane.setHalignment(btSubmit, HPos.RIGHT);//    Process events
      Scene scene = new Scene(gridPane, 1000, 500);
      stage.setTitle("Mortgage"); // Set title
      stage.setScene(scene); // Place the scene in the stage
      stage.show(); // Display the stage

      GridPane.setConstraints(label, 0, 3);
      GridPane.setColumnSpan(label, 2);
      gridPane.getChildren().add(label);

      btReset.setOnAction(new EventHandler<ActionEvent>()
      {

         @Override
         public void handle (ActionEvent e)
         {
            firstName.clear();
            lastName.clear();
            streetAddress.clear();
            label.setText(null);
         }
      });
   }


   public static void main (String[] args)
   {
      launch(args);
   }

}
//   private final TextField maritialStatus = new TextField();
//   private final TextField tfAnnualInterestRate = new TextField();
//   private final TextField tfNumberOfYears = new TextField();
//   private final TextField tfLoanAmount = new TextField();
//   private final TextField tfMonthlyPayment = new TextField();
//   private final TextField tfTotalPayment = new TextField();


//Setting an action for the Submit button
//      btSubmit.setOnAction(new EventHandler<ActionEvent>()
//      {
//
//         
//         }
//      });

//Setting an action for the Clear button


//      btReset.setOnAction((ActionEvent event) -> {
//         Button clear = new Button("Clear");
////         GridPane.setConstraints(clear, 0, 4);
//         gridPane.getChildren().add(clear);
//      });
////    Create a scene and place it in the stage 
//    Create UI
//Adding a Label
//   private void calculateLoanPayment ()
//   {
//      // Get values from text fields
//      double interest
//              = Double.parseDouble(tfAnnualInterestRate.getText());
//      int year = Integer.parseInt(tfNumberOfYears.getText());
//      double loanAmount
//              = Double.parseDouble(tfLoanAmount.getText());
//
//      // Create a loan object. Loan defined in Listing 10.2
//      Loan loan = new Loan(interest, year, loanAmount);
//
//      // Display monthly payment and total payment
//      tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
//      tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
//
//   }
