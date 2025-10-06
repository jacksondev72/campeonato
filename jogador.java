public class jogador extends Pessoa {
    private String posicao;
    private int gols;
    private int assistencias;

    public jogador(String nome, int idade, String posicao, int gols, int assistencias) {
        super(nome, idade); 
        this.posicao = posicao;
        this.gols = gols;
        this.assistencias = assistencias;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getGols() {
        return gols;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setIdade(int idade) {
        if (idade < 16) {
            System.out.println(nome + " não pode participar do campeonato!");
        } else {
            this.idade = idade;
        }
    }

    public void setAssistencias(int assistencias) {
        if (assistencias >= 0)
            this.assistencias = assistencias;
        else
            System.out.println(nome + " não pode ter menos de 0 assistências!");
    }

    public void setGols(int gols) {
        if (gols >= 0)
            this.gols = gols;
        else
            System.out.println(nome + " não pode ter menos de 0 gols!");
    }
    public void marcarGol() {
        gols++;
        System.out.println(nome + " marcou um gol! Total de gols: " + gols);
    }


    public void info() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, jogo como " + posicao +", marquei " + gols + " gols e dei " + assistencias + " assistências.");
    }
}
