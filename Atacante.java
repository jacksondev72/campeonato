public class Atacante extends jogador {
    private int finalizacoes;

    public Atacante(String nome, int idade, int gols, int assistencias, int finalizacoes) {
        super(nome, idade, "Atacante", gols, assistencias);
        this.finalizacoes = finalizacoes;
    }

    @Override
    public void info() {
        System.out.println("Atacante: " + getNome() + ", Gols: " + getGols() +
                ", Assistências: " + getAssistencias() +
                ", Finalizações: " + finalizacoes);
    }
}

