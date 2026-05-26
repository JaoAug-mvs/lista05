/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02_poo5;

/**
 *
 * @author JaoAugug-mvs(ADX)
 */
public class Aluno {
    private String nome;
    private int idade;
    private double coragem;
    private double inteligencia;
    private double ambicao;
    private double lealdade;

    private double estrategia;
    private double criatividade;

    private String casa;

    public Aluno(String nome, int idade, double coragem, double inteligencia, double ambicao, double lealdade, double estrategia, double criatividade) {
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

    public String getNome() { return nome; }
    public String getCasa() { return casa; }

    public void calcularCasa() {
  
        double ptsGrifinoria = (2 * this.coragem) + this.lealdade;
        double ptsSonserina = (2 * this.ambicao) + this.estrategia;
        double ptsCorvinal = (2 * this.inteligencia) + this.criatividade;
        double ptsLufaLufa = ((2 * this.lealdade) + this.coragem) / 3.0; 
        double maiorPontuacao = ptsGrifinoria;
        this.casa = "Grifinória";

        if (ptsSonserina > maiorPontuacao) {
            maiorPontuacao = ptsSonserina;
            this.casa = "Sonserina";
        }
        if (ptsCorvinal > maiorPontuacao) {
            maiorPontuacao = ptsCorvinal;
            this.casa = "Corvinal";
        }
        if (ptsLufaLufa > maiorPontuacao) {
            this.casa = "Lufa-Lufa";
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n--- Resultado do Chapéu Seletor ---");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Casa Selecionada: " + this.casa);
        System.out.println("-----------------------------------\n");
    }
}
