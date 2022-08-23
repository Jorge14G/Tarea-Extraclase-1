package application;

public class TipoEstudianteA extends DatosEstudiantes{
	public TipoEstudianteA(String Carne, String Telefono, String NomApe, String Correo, String Nickname, String Tipo, String NotPromExamenes, String NotPromQuices, String NotPromTareas, String NotProyec1, String NotProyec2, String NotProyec3, String NotPromProyectos, String NotPromExamQuizTarea, String NotFinal) {
		super(Carne,Telefono, NomApe, Correo, Nickname,Tipo, NotPromExamenes, NotPromQuices, NotPromTareas, NotProyec1, NotProyec2, NotProyec3, NotPromProyectos, NotPromExamQuizTarea, NotFinal);
	}
	public int CalcNotaPromedio(String NotPromExamenes, String NotPromQuices, String NotPromTareas) {
		int NotaProm;
		NotaProm= (Integer.parseInt(NotPromExamenes) + Integer.parseInt(NotPromQuices) + Integer.parseInt(NotPromTareas))/3;
		return NotaProm;
	}
	public int CalcNotaPromedio(int NotProyect1, int NotProyect2, int NotProyect3) {
		int NotaProm;
		NotaProm= (NotProyect1 + NotProyect2 + NotProyect3)/3;
		return NotaProm;
	}
}
