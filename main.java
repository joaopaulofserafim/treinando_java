public class main {
    public static void main(String[] args) {

        clinica c = new clinica();

        animal a1  = new cachorro("Rex", 20);
        animal a2 = new gato("Mia", 5);

        a1.emitirSom();
        a2.emitirSom();
        
        c.fazOrcamento(a1, true);
        c.fazOrcamento(a2);

        
    
    }
}
