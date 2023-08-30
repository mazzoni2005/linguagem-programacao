public class ClasseSocial {
    Double salarioMin(Double salario){
        Double calculoSalario = salario / 1045;
        return calculoSalario;
    }

    String classeSocial(Double numSalariosMinimos) {
        if (numSalariosMinimos <= 1.9) {
            return "E";
        } else if (numSalariosMinimos <= 3.9) {
            return "D";
        } else if (numSalariosMinimos <= 9.9) {
            return "C";
        } else if (numSalariosMinimos <= 19.9) {
            return "B";
        } else {
            return "A";
        }
    }
    }