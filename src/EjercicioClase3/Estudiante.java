package EjercicioClase3;

public class Estudiante {

    private int edad;
    private char genero;
    private String nombre;
    private String apellido;
    private String corte;
    private String curso;
    private String materia;
    private float nota;
    private String cc;


    public Estudiante(String cc, float nota, int edad, char genero, String nombre,
                      String apellido, String corte, String curso, String materia) {
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.corte = corte;
        this.curso = curso;
        this.materia = materia;
        this.nota = nota;
        this.cc = cc;

    }

    public String toString() {
        return "Estudiante{" +
                "cc='" + cc + '\'' +
                ", nota=" + nota +
                ", materia='" + materia + '\'' +
                ", curso=" + curso +
                ", corte=" + corte +
                ", apellido=" + apellido +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad + '\'' +
                '}';
    }


    public void hablar() {
        System.out.println("Hablando");
    }

    public void estudiar() {
        System.out.println(nombre+" "+"estudiando");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorte() {
        return corte;
    }

    public void setCorte(String corte) {
        this.corte = corte;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
