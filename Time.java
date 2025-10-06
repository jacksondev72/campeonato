public class Time {

    String nome;
    String dono;
    int anoFundado;

    Time (String nome, String dono, int anoFundado) {
        this.nome = nome;
        this.dono = dono;
        this.anoFundado = anoFundado;
    }

    String mostrarNome(){
        return nome;
    }

    void mostrarAno(){
        if(anoFundado > 0 && anoFundado < 2025) {System.out.println("O ano fundado é" + anoFundado);}

        else { System.out.println("Invalido.");  }
    }


}

