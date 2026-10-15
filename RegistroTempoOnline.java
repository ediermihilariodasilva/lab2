public class RegistroTempoOnline {
    // Atributos privados da classe
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoOnlineUsado;

    // Construtor 1: Recebe apenas o nome. Define por padrão 60h de disciplina (120h online esperadas).
    // Isto é caso o aluno vai usar o padrão que é de 60 horas.
    public ResgistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120; // Padrão: o dobro de 60 horas
        this.tempoOnlineUsado = 0;
    }

    // Construtor 2: Recebe o nome e o tempo online esperado customizado de forma direta.
    // isto é caso o aluno vai utilizar um ouro padrão que seja diferente de 60 horas.
    public ResgistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
        this.tempoOnlineUsado = 0;
    }

    // Adiciona novas horas de tempo online, permitindo acumular mesmo após atingir a meta
    public void adicionaTempoOnline(int tempo) {
        if (tempo > 0) {
            this.tempoOnlineUsado += tempo;
        }
    }

    // Verifica se o tempo online usado é maior ou igual à meta estabelecida
    public boolean atingiuMetaTempoOnline() {
         if(this.tempoOnlineUsado >= this.tempoOnlineEsperado){
             return true ;
        }
    }

    // Retorna a representação textual do objeto
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnlineUsado + "/" + this.tempoOnlineEsperado;
    }
}
