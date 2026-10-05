public class Descanso {
    // Atributos privados para armazenar os dados do aluno
    private int horasDescanso;
    private int numeroSemanas;

    // Define a quantidade de horas de descanso acumuladas
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    // Define o número de semanas decorridas
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    // Avalia o estado do aluno e retorna "cansado" ou "descansado"
    public String getStatusGeral() {
        if (this.numeroSemanas <= 0|| horasDescanso <= 0) {
            return "cansado";
        }

        // Calcula a média de descanso por semana
        double mediaDescanso = (bouble)this.horasDescanso / this.numeroSemanas;

        // Verifica se a média atinge o critério mínimo de 26 horas
        if (mediaDescanso >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }







}
