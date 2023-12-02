public class Quarto {
    private int id;
    private String nomeQuarto;
    private int qtdeCamas;
    private boolean temBanheiro;
    private String descricao;

    //construtor
    public Quarto(int id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
        this.id = id;
        this.nomeQuarto = nomeQuarto;
        this.qtdeCamas = qtdeCamas;
        this.temBanheiro = temBanheiro;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(String nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public int getQtdeCamas() {
        return qtdeCamas;
    }

    public void setQtdeCamas(int qtdeCamas) {
        this.qtdeCamas = qtdeCamas;
    }

    public boolean temBanheiro() {
        return temBanheiro;
    }

    public void setTemBanheiro(boolean temBanheiro) {
        this.temBanheiro = temBanheiro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //método toString para imprimir informações do quarto
    @Override
    public String toString() {
        return "Quarto{" +
                "id=" + id +
                ", nomeQuarto='" + nomeQuarto + '\'' +
                ", qtdeCamas=" + qtdeCamas +
                ", temBanheiro=" + temBanheiro +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
