/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesAtividades;

/**
 *
 * @author Aluno
 */
public class Programa {

    public static void main(String[] args) {
        Sala sala1 = new Sala(32, 32, 1, true, 2);
        Sala sala2 = new Sala(40, 40, 2, false, 3);
        Sala sala3 = new Sala(36, 36, 3, true, 1);

        System.out.println(sala1);
        System.out.println(sala2);
        System.out.println(sala3);

        Computador computador1 = new Computador(Memoria.DDR1, Processador.I3, "256gb", "Windows 10");
        Computador computador2 = new Computador(Memoria.DDR2, Processador.I5, "256gb", "Ubuntu");
        Computador computador3 = new Computador(Memoria.DDR3, Processador.I7, "256gb", "Windows 7");

        System.out.println(computador1);
        System.out.println(computador2);
        System.out.println(computador3);

        Curso curso1 = new Curso("Curso de Python", "Curso sobre python", Categoria.PROGRAMACAO);
        Curso curso2 = new Curso("Curso de Exatas", "Curso sobre exatas", Categoria.MATEMATICA);
        Curso curso3 = new Curso("Curso de Biologia", "Curso sobre biologia", Categoria.BIOLOGIA);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

    }
}
