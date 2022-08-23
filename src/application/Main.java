package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class Main extends Application {
	public void start(Stage Window) {
		VBox root = new VBox();
		HBox root2 = new HBox();
		Scene canvas = new Scene(root, 500,500);
		Window.setScene(canvas);
		Window.show();

		Label title = new Label("Notas de Estudiantes");
		Label nombreArchivo = new Label("                  ");
		Button buscarArchivo = new Button("Buscar Archivo");
		
		root.getChildren().addAll(title, root2);
		root2.getChildren().addAll(nombreArchivo, buscarArchivo);
		root.setAlignment(Pos.TOP_CENTER);
		root2.setAlignment(Pos.TOP_CENTER);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
