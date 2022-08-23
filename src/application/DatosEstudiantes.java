package application;

import javafx.beans.property.SimpleStringProperty;

/**
 * Clase Datos Estudiantes que corresponde a la abstracción del objeto estudiante.
 * @author Jorge
 *
 */
public class DatosEstudiantes{
	/**
	 * En esta sección se encapsulan los diferentes atributos de la clase DatosEstudiantes, se
	 * dice que están encapsulados porque solo pertenecen a esta clase, y solo se puede acceder
	 * a través de sus clases hijas, o por medio de los métodos de extracción(get) o de asignación(set).
	 */
	private final SimpleStringProperty Carne;
	private final SimpleStringProperty Telefono;
	private final SimpleStringProperty NomApe; 
	private final SimpleStringProperty Correo; 
	private final SimpleStringProperty Nickname; 
	protected final SimpleStringProperty NotPromExamenes; 
	protected final SimpleStringProperty NotPromQuices; 
	protected final SimpleStringProperty NotPromTareas; 
	protected final SimpleStringProperty NotProyec1; 
	protected final SimpleStringProperty NotProyec2; 
	protected final SimpleStringProperty NotProyec3;
	protected final SimpleStringProperty Tipo;
	private final SimpleStringProperty NotPromExamQuizTarea;
	private final SimpleStringProperty NotPromProyects;
	private final SimpleStringProperty NotFinal;

	/**
	 * Método constructor que inicializa cada una de los atributos
	 * @param Carne - Carné identificador
	 * @param Telefono - Teléfono de un estudiante
	 * @param NomApe - Nombre y apellidos de un estudiante
	 * @param Correo - Correo estudiantil
	 * @param Nickname - Sobrenombre o apodo
	 * @param Tipo - Referente a si el estudiante es tipo A o B
	 * @param NotPromExamenes - Nota promedio de los exámenes
	 * @param NotPromQuices - Nota promedio de los quices
	 * @param NotPromTareas - Nota promedio de las tareas
	 * @param NotProyec1 - Nota del proyecto #1
	 * @param NotProyec2 - Nota del proyecto #2
	 * @param NotProyec3 - Nota del proyecto #3
	 * @param NotPromExamQuizTarea - Promedio general de exámenes, quices y tareas
	 * @param NotPromProyects - Promedio general de los proyectos
	 * @param NotFinal - Nota final
	 */
	public DatosEstudiantes(String Carne, String Telefono, String NomApe, String Correo, String Nickname, String Tipo,String NotPromExamenes, String NotPromQuices, String NotPromTareas, String NotProyec1, String NotProyec2, String NotProyec3, String NotPromExamQuizTarea, String NotPromProyects, String NotFinal){
		this.Carne = new SimpleStringProperty(Carne);
		this.Telefono = new SimpleStringProperty(Telefono);
		this.NomApe = new SimpleStringProperty(NomApe);
		this.Correo = new SimpleStringProperty(Correo);
		this.Nickname = new SimpleStringProperty(Nickname);
		this.NotPromExamenes = new SimpleStringProperty(NotPromExamenes);
		this.NotPromQuices = new SimpleStringProperty(NotPromQuices);
		this.NotPromTareas = new SimpleStringProperty(NotPromTareas);
		this.NotProyec1 = new SimpleStringProperty(NotProyec1);
		this.NotProyec2 = new SimpleStringProperty(NotProyec2);
		this.NotProyec3 = new SimpleStringProperty(NotProyec3);
		this.Tipo = new SimpleStringProperty(Tipo);
		this.NotPromExamQuizTarea = new SimpleStringProperty(NotPromExamQuizTarea);
		this.NotPromProyects = new SimpleStringProperty(NotPromProyects);
		this.NotFinal = new SimpleStringProperty(NotFinal);
	}
	
	/**
	 * Método en sobrecarga que es heredado a cada uno de los tipos de estudiantes para sobreescribirlos y calcular la nota promedio de los exámenes, quices
	 * y tareas.
	 * @param NotPromExamenes
	 * @param NotPromQuices
	 * @param NotPromTareas
	 * @return
	 */
	public int CalcNotaPromedio(String NotPromExamenes, String NotPromQuices, String NotPromTareas) {
		return 0;
	}
	
	/**
	 * * Método en sobrecarga que es heredado a cada uno de los tipos de estudiantes para sobreescribirlos y calcular la nota promedio de los proyectos.
	 * @param NotProyect1
	 * @param NotProyect2
	 * @param NotProyect3
	 * @return
	 */
	public int CalcNotaPromedio(int NotProyect1, int NotProyect2, int NotProyect3) {
		return 0;
	}
	
	/**
	 * Método que calcula el promedio general de las instancias.
	 * @param NotPromExamQuizTarea
	 * @param NotPromProyectos
	 * @return
	 */
	public int NotaFinal(String NotPromExamQuizTarea, String NotPromProyectos) {
		int NotaFinal;
		NotaFinal= (Integer.parseInt(NotPromExamQuizTarea) + Integer.parseInt(NotPromProyectos))/2;
		return NotaFinal;
	}
	
	/**
	 * Método que retorna el valor del atributo carné de un objeto
	 * @return
	 */
	public String getCarne(){
		return Carne.get();
	}
	
	/**
	 * Método que asigna un valor al atributo Carné
	 * @param x - parámetro que es asignado al atributo respectivo
	 */
	public void setCarne(String x) {
		Carne.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo teléfono de un objeto
	 * @return
	 */
	public String getTelefono(){
		return Telefono.get();
	}
	
	/**
	 * Método que asigna un valor al atributo Teléfono
	 * @param x
	 */
	public void setTelefono(String x) {
		Telefono.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NomApe de un objeto
	 * @return
	 */
	public String getNomApe(){
		return NomApe.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NomApe
	 * @param x
	 */
	public void setNomApe(String x) {
		NomApe.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo Correo de un objeto
	 * @return
	 */
	public String getCorreo(){
		return Correo.get();
	}
	
	/**
	 * Método que asigna un valor al atributo Correo
	 * @param x
	 */
	public void setCorreo(String x) {
		Correo.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo Nickname de un objeto
	 * @return
	 */
	public String getNickname(){
		return Nickname.get();
	}
	
	/**
	 * Método que asigna un valor al atributo Nickname
	 * @param x
	 */
	public void setNickname(String x) {
		Nickname.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NotPromExamenes de un objeto
	 * @return
	 */
	public String getNotPromExamenes(){
		return NotPromExamenes.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotPromExamenes
	 * @param x
	 */
	public void setNotPromExamenes(String x) {
		NotPromExamenes.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NotPromQuices de un objeto
	 * @return
	 */
	public String getNotPromQuices(){
		return NotPromQuices.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotPromQuices
	 * @param x
	 */
	public void setNotPromQuices(String x) {
		NotPromQuices.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo getNotPromTareas de un objeto
	 * @return
	 */
	public String getNotPromTareas(){
		return NotPromTareas.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotPromTareas
	 * @param x
	 */
	public void setNotPromTareas(String x) {
		NotPromTareas.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NotProyec1 de un objeto
	 * @return
	 */
	public String getNotProyec1(){
		return NotProyec1.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotProyec1
	 * @param x
	 */
	public void setNotProyec1(String x) {
		NotProyec1.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NotProyec2 de un objeto
	 * @return
	 */
	public String getNotProyec2(){
		return NotProyec2.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotProyec2
	 * @param x
	 */
	public void setNotProyec2(String x) {
		NotProyec2.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NotProyec3 de un objeto
	 * @return
	 */
	public String getNotProyec3(){
		return NotProyec3.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotProyec3
	 * @param x
	 */
	public void setNotProyec3(String x) {
		NotProyec3.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo Tipo de un objeto
	 * @return
	 */
	public String getTipo(){
		return Tipo.get();
	}
	
	/**
	 * Método que asigna un valor al atributo Tipo
	 * @param x
	 */
	public void setTipo(String x) {
		Tipo.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NotPromExamQuizTarea de un objeto
	 * @return
	 */
	public String getNotPromExamQuizTarea(){
		return NotPromExamQuizTarea.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotPromExamQuizTarea
	 * @param x
	 */
	public void setNotPromExamQuizTarea(String x) {
		NotPromExamQuizTarea.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NotPromProyects de un objeto
	 * @return
	 */
	public String getNotPromProyects(){
		return NotPromProyects.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotPromProyects
	 * @param x
	 */
	public void setNotPromProyects(String x) {
		NotPromProyects.set(x);
	}
	
	/**
	 * Método que retorna el valor del atributo NotFinal de un objeto
	 * @return
	 */
	public String getNotFinal(){
		return NotFinal.get();
	}
	
	/**
	 * Método que asigna un valor al atributo NotFinal
	 * @param x
	 */
	public void setNotFinal(String x) {
		NotFinal.set(x);
	}
}