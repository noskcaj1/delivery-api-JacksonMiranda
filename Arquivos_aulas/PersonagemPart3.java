/*
     ** Ranking dos ninjas **
     * Gennin
     * Chunnin
     * Jounin
     * 
     ** Solicitar os dados do primeiro ninja (personagem - Naruto)
     * nome
     * idade
     * nível de poder
     * número de missões
     * 
     ** Condições
     * Repete o processo para o segundo ninja (personagem - Rock Lee)
     * Exibir resultado final - Comparando o nível dos ninjas.
     * fechar o Scanner
     * 
     * Objetivo - Criar classe e criar condição utilizando o nivelPoder, numeroDeMissoes
     */

import java.util.Scanner;

public class PersonagemPart3 {
    public static void main(String[] args) { // Método principal

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Cadastro do Ninja 1");
        System.out.print("Nome do Ninja: ");
        String nome1 = caixaDeTexto.nextLine();

        System.out.println("Idade do Ninja: ");
        int idade1 = caixaDeTexto.nextInt();
        System.out.println("Nível de Poder: ");
        int nivelPoder1 = caixaDeTexto.nextInt();
        System.out.println("Número de Missões: ");
        int missoes1 = caixaDeTexto.nextInt();
        String rank1;

        if (missoes1 == 10 && nivelPoder1 < 15) { 
            rank1 = "Chunnin";
        } 
        else if (missoes1 >= 20)
            rank1 = "Jounin";
        else { 
            rank1 = "Genin";
        }

        System.out.println("\n Resultado Ninja 1");
        System.out.println("Nome: " + nome1);
        System.out.println("Idade: " + idade1);
        System.out.println("Nível de Poder: " + nivelPoder1);
        System.out.println("Número de Missões: " + missoes1);
        System.out.println("Rank: " + rank1);
        System.out.printf("\n");

        caixaDeTexto.nextLine(); // Consumir a quebra de linha pendente do nextInt()

        System.out.println("Cadastro do Ninja 2");
        System.out.print("Nome do Ninja: ");
        String nome2 = caixaDeTexto.nextLine();

        System.out.println("Idade do Ninja: ");
        int idade2 = caixaDeTexto.nextInt();
        System.out.println("Nível de Poder: ");
        int nivelPoder2 = caixaDeTexto.nextInt();
        System.out.println("Número de Missões: ");
        int missoes2 = caixaDeTexto.nextInt();
        String rank2;

        if (missoes2 == 10 && nivelPoder1 < 15) { 
            rank2 = "Chunnin";
        } 
        else if (missoes2 >= 20)
            rank2 = "Jounin";
        else {
            rank2 = "Genin";
        }
        
        System.out.println("\n Resultado Ninja 2");
        System.out.println("Nome: " + nome2);
        System.out.println("Idade: " + idade2);
        System.out.println("Nível de Poder: " + nivelPoder2);
        System.out.println("Número de Missões: " + missoes2);
        System.out.println("Rank: " + rank2);
        System.out.printf("\n");

        System.out.println("=== Comparativo Final ===");

        if (nivelPoder1 > nivelPoder2) {
            System.out.println(nome1 + " é mais poderoso que " + nome2 + "!!!");
        } else if (nivelPoder2 > nivelPoder1) {
            System.out.println(nome2 + " é mais poderoso que " + nome1 + "!!! ^.^");
        } else {
            System.out.println(" Ambos possuem o mesmo nível de poder !!!");
        }

        caixaDeTexto.close();
    }

}