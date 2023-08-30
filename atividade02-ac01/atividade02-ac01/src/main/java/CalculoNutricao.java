public class CalculoNutricao {
    void calculaIMC (Double peso, Double altura){
        Double imc = peso / (altura * altura);
        System.out.println(String.format("O IMC é %.2f", imc));
    }
}
