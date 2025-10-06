public class Main {
    public static void main(String[] args) {
        jogador atacante = new jogador("Neymar", 18, "Atacante", 32, 100);

    
        // Exibir informações iniciais
        atacante.info();

        // Jogador marca um gol
        atacante.getGols();
        

        atacante.marcarGol();

        atacante.marcarGol();
        
        // Tentar alterar a idade e os gols
        atacante.setIdade(18);

        

        // Mostrar dados atualizados
        System.out.println("\n--- Dados atualizados ---");
        atacante.info();
    }
}

