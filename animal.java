public abstract class animal {
    private String nome;
    private int peso;
    private String especie;
    private int valorConsulta = 100;
    private int valorDoExame = 50;

    public animal(String especie, String nome, int peso) {
        this.especie = especie;
        this.nome = nome;
        this.peso = peso;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    public int getValorConsulta() {
        return valorConsulta;
    }

    public int getValorDoExame() {
        return valorDoExame;
    }

    @Override
    public String toString() {
        return "Animal - " + '\n' +
                "nome=" + nome + '\n' +
                "peso=" + peso + '\n' +
                "especie=" + especie + '\n' +
                "valorConsulta=" + getValorConsulta() + '\n' +
                "valorDoExame=" + getValorDoExame() + '\n' +
                '}';
    }
}
