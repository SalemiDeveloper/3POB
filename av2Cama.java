public class Cama {
    private int id;
    private String codigoCama;
    private boolean ehBeliche;
    private String posicao;
    private String descricao;

    //construtor
    public Cama(int id, String codigoCama, boolean ehBeliche, String posicao, String descricao) {
        this.id = id;
        this.codigoCama = codigoCama;
        this.ehBeliche = ehBeliche;
        this.posicao = posicao;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getCodigoCama() {
        return codigoCama;
    }

    public void setCodigoCama(String codigoCama) {
        this.codigoCama = codigoCama;
    }

    public boolean isEhBeliche() {
        return ehBeliche;
    }

    public void setEhBeliche(boolean ehBeliche) {
        this.ehBeliche = ehBeliche;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //método toString para imprimir as informações da cama
    @Override
    public String toString() {
        return "Cama{" +
                "id=" + id +
                ", codigoCama='" + codigoCama + '\'' +
                ", ehBeliche=" + ehBeliche +
                ", posicao='" + posicao + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
