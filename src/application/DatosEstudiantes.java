package application;

import javafx.beans.property.SimpleStringProperty;

public class DatosEstudiantes{
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

	public int CalcNotaPromedio(String NotPromExamenes, String NotPromQuices, String NotPromTareas) {
		return 0;
	}
	public int CalcNotaPromedio(int NotProyect1, int NotProyect2, int NotProyect3) {
		return 0;
	}
	public int NotaFinal(String NotPromExamQuizTarea, String NotPromProyectos) {
		int NotaFinal;
		NotaFinal= Integer.parseInt(NotPromExamQuizTarea) + Integer.parseInt(NotPromProyectos);
		return NotaFinal;
	}
	public String getCarne(){
		return Carne.get();
	}
	public void setCarne(String x) {
		Carne.set(x);
	}
	public String getTelefono(){
		return Telefono.get();
	}
	public void setTelefono(String x) {
		Telefono.set(x);
	}
	public String getNomApe(){
		return NomApe.get();
	}
	public void setNomApe(String x) {
		NomApe.set(x);
	}
	public String getCorreo(){
		return Correo.get();
	}
	public void setCorreo(String x) {
		Correo.set(x);
	}
	public String getNickname(){
		return Nickname.get();
	}
	public void setNickname(String x) {
		Nickname.set(x);
	}
	public String getNotPromExamenes(){
		return NotPromExamenes.get();
	}
	public void setNotPromExamenes(String x) {
		NotPromExamenes.set(x);
	}
	public String getNotPromQuices(){
		return NotPromQuices.get();
	}
	public void setNotPromQuices(String x) {
		NotPromQuices.set(x);
	}
	public String getNotPromTareas(){
		return NotPromTareas.get();
	}
	public void setNotPromTareas(String x) {
		NotPromTareas.set(x);
	}
	public String getNotProyec1(){
		return NotProyec1.get();
	}
	public void setNotProyec1(String x) {
		NotProyec1.set(x);
	}
	public String getNotProyec2(){
		return NotProyec2.get();
	}
	public void setNotProyec2(String x) {
		NotProyec2.set(x);
	}
	public String getNotProyec3(){
		return NotProyec3.get();
	}
	public void setNotProyec3(String x) {
		NotProyec3.set(x);
	}
	public String getTipo(){
		return Tipo.get();
	}
	public void setTipo(String x) {
		Tipo.set(x);
	}
	public String getNotPromExamQuizTarea(){
		return NotPromExamQuizTarea.get();
	}
	public void setNotPromExamQuizTarea(String x) {
		NotPromExamQuizTarea.set(x);
	}
	public String getNotPromProyects(){
		return NotPromProyects.get();
	}
	public void setNotPromProyects(String x) {
		NotPromProyects.set(x);
	}
	public String getNotFinal(){
		return NotFinal.get();
	}
	public void setNotFinal(String x) {
		NotFinal.set(x);
	}
}