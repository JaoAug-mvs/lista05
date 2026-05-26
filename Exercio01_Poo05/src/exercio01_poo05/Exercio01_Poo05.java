/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercio01_poo05;

import java.util.Scanner;

/**
 *
 * @author JaoAug-mvs(ADX)
 */
public class Exercio01_Poo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        System.out.println("--- Calculadora de IMC ---");

        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Sobrenome: ");
        String sobrenome = entrada.nextLine();
        
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        
        System.out.print("Altura (em metros, ex: 1,75): ");
        double altura = entrada.nextDouble();
        
        System.out.print("Peso (em kg, ex: 70,5): ");
        double peso = entrada.nextDouble();

        Pessoa paciente = new Pessoa(nome, sobrenome, idade, altura, peso);

        paciente.calculaIMC();

        System.out.printf("\nResultado para %s %s:\n", paciente.getNome(), paciente.getSobrenome());
        System.out.printf("IMC: %.2f\n", paciente.getImc());
        System.out.println("Classificação: " + paciente.informaObesidade());

    }
}
