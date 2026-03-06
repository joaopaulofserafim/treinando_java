public class main {
    public static void main(String[] args) {

        clinica c = new clinica();

        animal a1  = new cachorro("Rex", 20);
        animal a2 = new gato("Mia", 5);

        a1.emitirSom();
        a2.emitirSom();
        
        c.fazOrcamento(a1, true);
        c.fazOrcamento(a2);

        animal [] animais = {
            a1,
            a2,
            new cachorro("Bob", 30),
            new gato("Luna", 3),
            new viraLata("Max", 10),
            new gato("Jota", 20),
            new cachorro("Thor", 40)
        };
        c.fazOrcamento(animais, true);
    }
}
