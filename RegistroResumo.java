public class RegistroResumo {
    // Declaraçao dos atributos privados da classe.
    private int limiteResumos;
    private String[] temas;
    private String[] conteudos;
    private int quantidadeAtual;
    private int indiceSubstituicao;
    private resumo[] resumos;



    // evoluicao
    public RegistroResumo(int quantidade){
        this.resumos = new resumo[quantidade ];
    }

    // Construtor: indica o numero de resumos e também este é aproveitado para inicializar outros arrays.
    // também foram criados os arrays que dantes so declaramos.
    public RegistroResumos(int numeroDeResumos) {
        this.limiteResumos = numeroDeResumos;
        this.temas = new String[numeroDeResumos];
        this.conteudos = new String[numeroDeResumos];
        this.quantidadeAtual = 0;
        this.indiceSubstituicao = 0;
    }
    // Adiciona um resumo. Se o tema já existir, atualiza o conteúdo.
    // Se estiver cheio, substitui o resumo mais antigo sequencialmente.
        public void adicionaResumo(String tema, String conteudo) {

        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.temas[i].equals(tema)) {
                this.conteudos[i] = conteudo;
                return;
            }
        }

        // Se não existir e ainda houver espaço na lista
        if (this.quantidadeAtual < this.limiteResumos) {
            this.temas[this.quantidadeAtual] = tema;
            this.conteudos[this.quantidadeAtual] = conteudo;
            this.quantidadeAtual++;
        } else {
            // Se atingiu o limite, substitui de forma circular/sequencial
            this.temas[this.indiceSubstituicao] = tema;
            this.conteudos[this.indiceSubstituicao] = conteudo;

            // Avança o índice e volta para 0 se passar do limite (Fila Circular)
            this.indiceSubstituicao = (this.indiceSubstituicao + 1) % this.limiteResumos;
        }
    }

    // Retorna um array de Strings formatado como "Tema: Conteúdo"
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidadeAtual];
        for (int i = 0; i < this.quantidadeAtual; i++) {
            resultado[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resultado;
    }

    // Retorna uma String com o cabeçalho e a lista de todos os temas cadastrados
    public String imprimeResumos() {
        String listagem = "";
        for (int i = 0; i < this.quantidadeAtual; i++) {
            listagem += this.temas[i];
            if (i < this.quantidadeAtual - 1) {
                listagem += " | ";
            }
        }
        return "- " + this.quantidadeAtual + " resumo(s) cadastrado(s)\n- " + listagem;
    }

    // Retorna a quantidade de resumos armazenados atualmente
    public int contaResumos() {
        return this.quantidadeAtual;
    }

    // Verifica se um tema específico já foi cadastrado
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidadeAtual; i++) {
            if (this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
