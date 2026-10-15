impot java.util.Arrays;
public class Disciplina {
    // declaracao de atributos privados da classe.
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int numeroNotas ;
    private String nomeDisciplina;
    private int[] pesos;

    public Disciplina(int numeroNotas ){
        thi.numeroNotas = numeroNotas;
    }

    public Disciplina(String nomeDisciplina, int[]  pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.pesos = pesos;

    }
    // Construtor: Inicializa a disciplina com nome, 0 horas e as 4 notas zeradas por padrao
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4]; // Índices de 0 a 3 correspondentes às notas 1 a 4
    }
    // Acumula as horas de estudo às previamente cadastradas
    public void cadastraHoras(int horas) {
        if (horas > 0) {
            this.horasEstudo += horas;
        }
    }

    // Cadastra ou substitui uma nota específica (1, 2, 3 ou 4)
    public void cadastraNota(int nota, double valorNota) {
        // Valida se a nota informada está no intervalo correto (1 a 4)
        if (nota >= 1 && nota <= 4) {
            this.notas[nota - 1] = valorNota; // Ajusta para o índice do array (0 a 3)
        }
    }
    // Calcula a média aritmética interna das 4 notas
    private double calculaMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / 4.0;
    }

      // Verifica se o aluno atingiu a média mínima de 7.0 para aprovação
        public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    // Retorna a representação textual com nome, horas, média e o array de notas
      @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
     }

        }
