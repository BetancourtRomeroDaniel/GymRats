package proyecto;

public class CalcularImc {

    public String calcularIMC(double peso, double estatura) {
        double imc = peso / (estatura * estatura);
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            return "Obesidad moderada";
        } else if (imc >= 35 && imc < 39.9) {
            return "Obesidad grave";
        } else {
            return "Obesidad mórbida";
        }
    }

    public String generarRutina(String nivel, String grupoMuscular) {
        // Ejemplo básico de rutina por nivel y grupo muscular
        String rutina = "";
        switch (nivel.toLowerCase()) {
            case "principiante":
                rutina = grupoMuscular + ": 3 series de 10 repeticiones. Descanso: 60 segundos.";
                break;
            case "medio":
                rutina = grupoMuscular + ": 4 series de 12 repeticiones. Descanso: 45 segundos.";
                break;
            case "experto":
                rutina = grupoMuscular + ": 5 series de 15 repeticiones. Descanso: 30 segundos.";
                break;
            default:
                rutina = "Nivel desconocido.";
                break;
        }
        return rutina;
    }
}