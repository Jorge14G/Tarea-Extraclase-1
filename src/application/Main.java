package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class Main extends Application {
	private TableView <DatosEstudiantes> tablaNotas;
	private TableColumn<DatosEstudiantes, String> colNotPromExamQuizTarea;
	private TableColumn<DatosEstudiantes, String> colNotPromProyects;
	private TableColumn<DatosEstudiantes, String> colNotFinal;
	
	public void start(Stage Window) {
		VBox root = new VBox();
		HBox root2 = new HBox();
		Scene canvas = new Scene(root, 500,500);
		Window.setScene(canvas);
		Window.show();

		Label title = new Label("Notas de Estudiantes");
		Label nombreArchivo = new Label("                  ");
		Button buscarArchivo = new Button("Buscar Archivo");
		
		
		tablaNotas = new TableView<>();

		TableColumn<DatosEstudiantes, String> colCarne = new TableColumn<>("Carné");
		colCarne.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("Carne"));

		TableColumn<DatosEstudiantes, String> colTelefono = new TableColumn<>("Teléfono");
		colTelefono.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("Telefono"));

		TableColumn<DatosEstudiantes, String> colNomApe = new TableColumn<>("Nombre Completo");
		colNomApe.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NomApe"));

		TableColumn<DatosEstudiantes, String> colCorreo = new TableColumn<>("Correo");
		colCorreo.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("Correo"));

		TableColumn<DatosEstudiantes, String> colNickname = new TableColumn<>("Nickname");
		colNickname.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("Nickname"));

		TableColumn<DatosEstudiantes, String> colTipoEstudiante = new TableColumn<>("Tipo");
		colTipoEstudiante.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("Tipo"));

		TableColumn<DatosEstudiantes, String> colNotPromExamenes = new TableColumn<>("Prom.Exámenes");
		colNotPromExamenes.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotPromExamenes"));

		TableColumn<DatosEstudiantes, String> colNotPromQuices = new TableColumn<>("Prom.Quices");
		colNotPromQuices.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotPromQuices"));

		TableColumn<DatosEstudiantes, String> colNotPromTareas = new TableColumn<>("Prom.Tareas");
		colNotPromTareas.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotPromTareas"));

		TableColumn<DatosEstudiantes, String> colNotProyec1 = new TableColumn<>("Proyecto #1");
		colNotProyec1.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotProyec1"));

		TableColumn<DatosEstudiantes, String> colNotProyec2 = new TableColumn<>("Proyecto #2");
		colNotProyec2.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotProyec2"));

		TableColumn<DatosEstudiantes, String> colNotProyec3 = new TableColumn<>("Proyecto #3");
		colNotProyec3.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotProyec3"));

		colNotPromExamQuizTarea = new TableColumn<>("Nota Promedio (Exámenes, Quices, Tareas)");
		colNotPromExamQuizTarea.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotPromExamQuizTarea"));

		colNotPromProyects = new TableColumn<>("Nota Promedio (Proyectos)");
		colNotPromProyects.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotPromProyects"));

		colNotFinal = new TableColumn<>("Nota Final");
		colNotFinal.setCellValueFactory(new PropertyValueFactory <DatosEstudiantes, String>("NotFinal"));

		tablaNotas.getColumns().addAll(colCarne, colTelefono, colNomApe, colCorreo, colNickname, colTipoEstudiante, colNotPromExamenes, colNotPromQuices, colNotPromTareas, colNotProyec1, colNotProyec2, colNotProyec3);

		
		root.getChildren().addAll(title, root2, tablaNotas);
		root2.getChildren().addAll(nombreArchivo, buscarArchivo);
		root.setAlignment(Pos.TOP_CENTER);
		root2.setAlignment(Pos.TOP_CENTER);
	}
	public static void main(String[] args) {
		launch(args);
	}
}
