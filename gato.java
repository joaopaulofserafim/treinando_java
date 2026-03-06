public class gato extends animal {

    public gato(String nome, int peso) {
        super("Gato", nome, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public int getValorDoExame() {
        return super.getValorDoExame() - 20;
    }
}
