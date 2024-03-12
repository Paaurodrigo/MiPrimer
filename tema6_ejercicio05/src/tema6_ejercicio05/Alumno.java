package tema6_ejercicio05;

public class Alumno {
	private String nombre;
	private	int nota1;
	private int nota2;
	private int nota3;
	private double media;
	
	Alumno(String nombre, int nota1, int nota2,int nota3) {
		this.nombre=nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = (nota1+nota2+nota3)/3.0;
	}
	//COMIASOOOOOO
	
	
	Alumno(){}


	String getNombre() {
		return nombre;
	}


	int getNota1() {
		return nota1;
	}


	int getNota2() {
		return nota2;
	}


	int getNota3() {
		return nota3;
	}


	double getMedia() {
		return media;
	}


	void setNombre(String nombre) {
		this.nombre = nombre;
	}


	void setNota1(int nota1) {
		this.nota1 = nota1;
	}


	void setNota2(int nota2) {
		this.nota2 = nota2;
	}


	void setNota3(int nota3) {
		this.nota3 = nota3;
	}


	void setMedia(double media) {
		this.media = media;
	}
	
}

