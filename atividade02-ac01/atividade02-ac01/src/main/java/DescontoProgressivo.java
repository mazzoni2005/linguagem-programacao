public class DescontoProgressivo {
    Double calculoDesconto(Double preco, Integer quantidade){
        Double precoTotal = preco * quantidade;
        if(quantidade >= 3){
            precoTotal *= 0.7;
        } else if(quantidade == 2){
            precoTotal *= 0.8;
        } else if (quantidade == 1) {
            precoTotal *= 0.9;
        }
        return precoTotal;
    }

    void exibirNotaFiscal(Double preco, Integer quantidade, Double descontoTotal){
        System.out.println("---------------------------------------");
        System.out.println("Valor do produto:   " + preco);
        System.out.println("Quantidade:  " + quantidade);
        System.out.println("---------------------------------------");
        System.out.println("Valor com desconto:  " + descontoTotal);
    }
}
