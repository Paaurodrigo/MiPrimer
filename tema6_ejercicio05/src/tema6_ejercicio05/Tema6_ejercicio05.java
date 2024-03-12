package tema6_ejercicio05;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import  java.util.NoSuchElementException;

public class Tema6_ejercicio05 {
	

	public static void main(String[] args) {
		
		try {
		FileReader fr = new FileReader("../tema5_ejercicio1/notas.txt");
		
		
		
		Scanner s = new Scanner(fr);
		
		Alumno[] alumnos = new Alumno [20];
		
		String nombre;
		int nota1,nota2,nota3;
		
					
int linea=0;			

			while (s.hasNextLine()) {
				nombre = s.next();
				nota1 = s.nextInt();
				nota2 = s.nextInt();
				nota3 = s.nextInt();
				System.out.println("HOLSSS");
			
				alumnos [linea]=new Alumno(nombre,nota1,nota2,nota3);
				
				linea++;
			}
				for(int i=0; i<linea; i++) {
					System.out.println(alumnos[i].getNombre()+" "+ alumnos[i].getNota1()+" "+ alumnos[i].getNota2()+" "+ alumnos[i].getNota3()+" "+ alumnos[i].getMedia());
				}
				
		
		}catch(NoSuchElementException e) {
			System.out.print("ERROR");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}