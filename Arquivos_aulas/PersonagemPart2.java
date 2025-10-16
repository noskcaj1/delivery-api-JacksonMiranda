// Part2 - Trabalhando com as condicionais - lógicas.
public class PersonagemPart2 {
    /*
     * Gennin
     * Chunnin
     * Jounin
     * 
     * Objetivo - Criar classe e criar condição utilizando o nivelPoder e o ranking
     */
    public static void main(String[] args) { // Método principal

        int nivelPoder = 5; // Atributo
        short numeroDeMissoes = 8; // Atributo

        if (numeroDeMissoes == 10 && nivelPoder < 15) { // Condição composta

            System.out.println("Ranking: Chunnin"); // Saída
        }
        else if (numeroDeMissoes >= 20) // Condição simples

            System.out.println("Ranking: Jounin"); // Saída

        else { // Condição simples

            System.out.println("Ranking: Genin"); // Saída
        }

    }

}
