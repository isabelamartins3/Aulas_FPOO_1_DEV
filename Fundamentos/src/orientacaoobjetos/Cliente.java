/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos;


public class Cliente implements AluguelFilme{
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
             return "Cliente{" + "nome=" + nome + '}';
        } else {
            return "Cliente{" + "nome=" + nome + ", email=" + email + '}';
        }
    }
    /**
     * Calcula o valor total da locação do filme
     * Regra para filmes comuns.
     * @param qtdeDias
     * @return
     */
        public double calcularLocacao(int qtdeDias) {
            return qtdeDias * VALOR_FILME_SIMPLES;
        }
        
        public double calcularLocacao(int qtdeDias,boolean lancamento) {
            return qtdeDias * VALOR_FILME_LANCAMENTO;
        }
    
}
