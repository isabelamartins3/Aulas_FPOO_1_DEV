/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesAtividades;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int numerodeCadeira;
    private int numeroMesas;
    private int numeroSalas;
    private boolean temprojetor;
    private int numeroComputadores;

    public Sala(int numerodeCadeira, int numeroMesas, int numeroSalas, boolean temprojetor, int numeroComputadores) {
        this.numerodeCadeira = numerodeCadeira;
        this.numeroMesas = numeroMesas;
        this.numeroSalas = numeroSalas;
        this.temprojetor = temprojetor;
        this.numeroComputadores = numeroComputadores;
    }

    public int getNumerodeCadeira() {
        return numerodeCadeira;
    }

    public void setNumerodeCadeira(int numerodeCadeira) {
        this.numerodeCadeira = numerodeCadeira;
    }

    public int getNumeroMesas() {
        return numeroMesas;
    }

    public void setNumeroMesas(int numeroMesas) {
        this.numeroMesas = numeroMesas;
    }

    public int getNumeroSalas() {
        return numeroSalas;
    }

    public void setNumeroSalas(int numeroSalas) {
        this.numeroSalas = numeroSalas;
    }

    public boolean isTemprojetor() {
        return temprojetor;
    }

    public void setTemprojetor(boolean temprojetor) {
        this.temprojetor = temprojetor;
    }

    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    @Override
    public String toString() {
        return "Sala{" + "numerodeCadeira=" + numerodeCadeira + ", numeroMesas=" + numeroMesas + ", numeroSalas=" + numeroSalas + ", temprojetor=" + temprojetor + ", numeroComputadores=" + numeroComputadores + '}';
    }
    
}
