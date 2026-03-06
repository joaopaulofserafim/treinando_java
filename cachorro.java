public class cachorro extends animal {

    public cachorro(String nome, int peso) {
        super("Cachorro", nome, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public int getValorConsulta() {
        if (getPeso() > 25) {
            return super.getValorConsulta() + 30;
        }
        return super.getValorConsulta();
    }
    
    @Override
    public int getValorDoExame() {
        if (getPeso() > 25) {
            return super.getValorDoExame() + 2 * getPeso();
        }
        return super.getValorDoExame();
    }
}