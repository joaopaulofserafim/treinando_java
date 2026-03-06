public class clinica  {

    public void  fazOrcamento(animal a, boolean temExame) {
        System.out.println(a.toString());
        a.emitirSom();

        int valorTotal = a.getValorConsulta();
        if (temExame) {
            valorTotal += a.getValorDoExame();
        }
        System.out.println("Valor total: R$" + valorTotal + ",00");
    }
    public void fazOrcamento(animal a) {
        fazOrcamento(a, false);
    }
    
    public void fazOrcamento(animal [] animais, boolean temExame) {
        int total = 0;
        for (animal a : animais) {
            fazOrcamento(a, temExame);
            total += a.getValorConsulta();
            if (temExame) {
                total += a.getValorDoExame();
            }
            System.out.println("-----------------------------");
        }
        System.out.println("Valor total: R$" + total + ",00");
    }

    public void fazOrcamento(animal [] animais) {
        fazOrcamento(animais, false);
}
}
