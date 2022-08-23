package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
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

/**
 * Clase que hereda de la clase Application, a través de la cual se genera
 * la interfaz de la tabla que mostrará el archivo CSV.
 * @author Jorge Luis Guillén Campos
 *
 */
public class Main extends Application {
	private int cont = 0, auxiliar = 0;
	private BufferedReader Reader, Reader2;
	private File file;
	private String Line;
	private String vectorLineas[];
	private String matrizObjetos[][];
	private ObservableList <DatosEstudiantes> estudiantes;
	private TableView <DatosEstudiantes> tablaNotas;
	private TableColumn<DatosEstudiantes, String> colNotPromExamQuizTarea;
	private TableColumn<DatosEstudiantes, String> colNotPromProyects;
	private TableColumn<DatosEstudiantes, String> colNotFinal;

	/**
	 * Método sin parámetros que se encarga de ordenar todos los datos extraídos del archivo CSV en una matriz
	 * y a su vez crear los objetos estudiantes con todas sus características empleando los datos contenidos en
	 * la matriz.
	 */
	public void ObjectParameters(){
		matrizObjetos = new String[cont][12]; 
		int column = 0;
		for(int i=0; i<cont;i++) {
			String objeto = vectorLineas[i];
			int tamano = objeto.length();
			for(int j=0;j<tamano;j++) {
				if(j==tamano-1) {
					matrizObjetos[i][column]= objeto.substring(auxiliar,j+1);
				}
				if(objeto.charAt(j) == ';') {
					matrizObjetos[i][column]= objeto.substring(auxiliar,j);
					column++;
					auxiliar=j+1;
				}
			}
			column=0;
			auxiliar=0;
		}
		DatosEstudiantes Objects[] = new DatosEstudiantes[cont];
		for(int i = 0; i<cont;i++) {
			/**
			 * A partir de este espacio se generaron objetos basados en la clase Datos estudiantes, no obstante, 
			 * se empleó polimorfismo, pues los objetos fueron instanciados con clases diferentes, según cada uno
			 * de los tipos de estudiantes, empleando a su vez los métodos que se encuentran en sobrecarga y además
			 * que fueron sobreescritos con respecto a la súperclase DatosEstudiantes.
			 */
			if((matrizObjetos[i][5]).contentEquals("A")) {
				Objects[i] = new TipoEstudianteA(matrizObjetos[i][0],matrizObjetos[i][1],matrizObjetos[i][2],matrizObjetos[i][3],matrizObjetos[i][4],matrizObjetos[i][5],matrizObjetos[i][6],matrizObjetos[i][7],matrizObjetos[i][8],matrizObjetos[i][9],matrizObjetos[i][10],matrizObjetos[i][11], "","","");
				Objects[i].setNotPromExamQuizTarea(Integer.toString(Objects[i].CalcNotaPromedio(matrizObjetos[i][6],matrizObjetos[i][7],matrizObjetos[i][8])));
				Objects[i].setNotPromProyects(Integer.toString(Objects[i].CalcNotaPromedio(matrizObjetos[i][9],matrizObjetos[i][10],matrizObjetos[i][11])));
				Objects[i].setNotFinal(Integer.toString(Objects[i].NotaFinal(Objects[i].getNotPromExamQuizTarea(),Objects[i].getNotPromProyects())));
				Objects[i].setNotPromProyects(null);
			}
			else {
				Objects[i] = new TipoEstudianteB(matrizObjetos[i][0],matrizObjetos[i][1],matrizObjetos[i][2],matrizObjetos[i][3],matrizObjetos[i][4],matrizObjetos[i][5],matrizObjetos[i][6],matrizObjetos[i][7],matrizObjetos[i][8],matrizObjetos[i][9],matrizObjetos[i][10],matrizObjetos[i][11], "","","");
				Objects[i].setNotPromExamQuizTarea(Integer.toString(Objects[i].CalcNotaPromedio(matrizObjetos[i][6],matrizObjetos[i][7],matrizObjetos[i][8])));
				Objects[i].setNotPromProyects(Integer.toString(Objects[i].CalcNotaPromedio(matrizObjetos[i][9],matrizObjetos[i][10],matrizObjetos[i][11])));
				Objects[i].setNotFinal(Integer.toString(Objects[i].NotaFinal(Objects[i].getNotPromExamQuizTarea(),Objects[i].getNotPromProyects())));
				Objects[i].setNotPromExamQuizTarea(null);
			}

		}
		estudiantes = FXCollections.observableArrayList(
				Objects
				);
		tablaNotas.setItems(estudiantes);
		tablaNotas.getColumns().addAll(colNotPromExamQuizTarea,colNotPromProyects, colNotFinal);
	}

	/**
	 * Método que se encarga de crear y mostrar todos los elementos de la interfaz, así como buscar la dirección de un archivo CSV
	 * y extraer sus elementos. Esta última función se desarrolla después de haber seleccionado un archivo de tipo CSV por
	 * medio del respectivo botón ubicado en pantalla.
	 */
	public void start(Stage Window) {
		VBox root = new VBox();
		HBox root2 = new HBox();
		Scene canvas = new Scene(root, 500,500);
		Window.setScene(canvas);
		Window.show();

		Label title = new Label("Notas de Estudiantes");
		Label nombreArchivo = new Label("                  ");
		Button buscarArchivo = new Button("Buscar Archivo");

		buscarArchivo.setOnAction(new EventHandler<ActionEvent>(){
			/**
			 * Método que se encarga de asignarle una función al botón de buscarArchivo.
			 */
			public void handle(ActionEvent event) {
				FileChooser fc = new FileChooser();
				file = fc.showOpenDialog(Window);
				try {
					Reader = new BufferedReader(new FileReader(file));
					while((Line = Reader.readLine()) != null) {
						cont +=1;			
					}
					Reader.close();
					Line = null;
					Reader2 = new BufferedReader(new FileReader(file));
					vectorLineas = new String[cont];
					cont= 0 ;
					while((Line = Reader2.readLine()) != null) {	
						vectorLineas[cont] = Line;
						cont++;			
					}
					Reader2.close();
					Line = null;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e);
				}
				ObjectParameters();
			}
		});


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
	/**
	 * Main o método principal que se encarga de inicializar y ejecutar las funciones
	 * del programa consecuentemente. 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
