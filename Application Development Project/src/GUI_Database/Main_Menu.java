import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

package GUI_Database; //entire window is called the stage, content inside window is called the scene//

public class Main_Menu extends Application implements EventHandler<ActionEvent> { //action handler is, for example,  a simple button click//

	Button button; 
	
	Stage window;
	Scene scene1, scene2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*launch(args);*/

	}
	@Override
	public void start(Stage primaryStage) throws Exception{ // calls launch, goes into application extends,it sets everything up, and it calls start// 
		primaryStage.setTitle("Airplane Project"); //sets title at the top of the window//
		window = primaryStage;
		Label label1 = new Label("Login");
		Button button1 = new Button("Login to account");
		button1.setOnAction(e -> window.setScene(scene2);)//changes view or scene to another page from the main page//
		//Layout 1 - children are laid out in vertical column
		Vbox layout1 = new Vbox(20); //layout out that stacks all the objects on top of each seperated by a certain size//
		layout1.getChildren().allAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		//Button2
		Button button2 = new Button("Register");
		button2.setOnAction(e -> window.setScene(scene1);)//changes view or scene to the main page from other switched page//
		//LAyout2
		StackPane layout2 = new StackPane(); //positions button in  the middle//
		layout2.getChildren().allAll(label2, button2);
		scene2 = new Scene(layout1, 600, 300);
		
		window.setScene(scene1);
		window.setTitle("Random Title");
		window.show();
		
		
		/*
	------------------------
	    button = new Button();
		button.setText("Click me");
		
		button.setOnAction(this); //whenever the button is clicked, the code to handle this is in this class//
		
		StackPane layout = newStackPane(); //layout is how everything is arranged on the screen// //Stack Pane positions the button in the middle//
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);//size of the scene//
		primaryStage.setScene(scene);
		primaryStage.show(); 
		--------------------------------------------*/
		
	}
   @Override
  /*public void handle(ActionEvent event) { //handle is the method that is going to be called whenever the user clicks the button or an event occurs//
	   if(event.getSource()==button) { //don't want all buttons to do the same thing// //this code is for one specific button//
		   System.out.println("You clicked a button!");
	   }
	  
   }*/
}
