package models;

public class Quarto {

    private long quartoId;
    private String descricao;

    public long getQuartoId() {
        return quartoId;
    }

    public void setQuartoId(long quartoId) {
        this.quartoId = quartoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (int) (this.quartoId ^ (this.quartoId >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quarto other = (Quarto) obj;
        if (this.quartoId != other.quartoId) {
            return false;
        }
        return true;
    }
}
