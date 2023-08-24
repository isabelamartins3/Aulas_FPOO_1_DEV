/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesAtividades;

/**
 *
 * @author Aluno
 */
public class Computador {
    private Memoria memoria;
    private Processador processador;
    private String capacidadeDiscoRigido;
    private String sistemaoperacional;

    public Computador(Memoria memoria, Processador processador, String capacidadeDiscoRigido, String sistemaoperacional) {
        this.memoria = memoria;
        this.processador = processador;
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
        this.sistemaoperacional = sistemaoperacional;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public String getCapacidadeDiscoRigido() {
        return capacidadeDiscoRigido;
    }

    public void setCapacidadeDiscoRigido(String capacidadeDiscoRigido) {
        this.capacidadeDiscoRigido = capacidadeDiscoRigido;
    }

    public String getSistemaoperacional() {
        return sistemaoperacional;
    }

    public void setSistemaoperacional(String sistemaoperacional) {
        this.sistemaoperacional = sistemaoperacional;
    }

    @Override
    public String toString() {
        return "Computador{" + "memoria=" + memoria + ", processador=" + processador + ", capacidadeDiscoRigido=" + capacidadeDiscoRigido + ", sistemaoperacional=" + sistemaoperacional + '}';
    }

}

