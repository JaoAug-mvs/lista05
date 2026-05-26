/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02_poo5;

import java.util.Scanner;

/**
 *
 * @author  JaoAugug-mvs(ADX)
 */
public class Exercicio02_poo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String continuar = "S";

        System.out.println("=== Bem-vindo a Hogwarts! ===");
        System.out.println("O Chapeu Seletor está pronto para analisar os alunos.");

        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("\nNome do aluno: ");
            String nome = entrada.nextLine();
            
            System.out.print("Idade: ");
            int idade = entrada.nextInt();
            
            System.out.println("Insira os niveis de caracteristicas (ex: de 0 a 10):");
            System.out.print("Coragem: ");
            double coragem = entrada.nextDouble();
            
            System.out.print("Inteligencia: ");
            double inteligencia = entrada.nextDouble();
            
            System.out.print("Ambicao: ");
            double ambicao = entrada.nextDouble();
            
            System.out.print("Lealdade: ");
            double lealdade = entrada.nextDouble();
            
            System.out.print("Estrategia: ");
            double estrategia = entrada.nextDouble();
            
            System.out.print("Criatividade: ");
            double criatividade = entrada.nextDouble();

            entrada.nextLine(); 

            Aluno estudante = new Aluno(nome, idade, coragem, inteligencia, ambicao, lealdade, estrategia, criatividade);
            
            estudante.calcularCasa();
            estudante.exibirInformacoes();
            
            System.out.print("Deseja avaliar outro aluno? (S/N): ");
            continuar = entrada.nextLine();
        }

        System.out.println("Selecao finalizada. Que o banquete comece!");
        entrada.close();
    }
    
}
