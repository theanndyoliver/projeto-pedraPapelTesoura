package model;

public enum Jogada {
    PEDRA,
    PAPEL,
    TESOURA,
    EXIT;


    public boolean venceDe(Jogada adversario) {
        return this.equals(PEDRA) && adversario.equals(TESOURA)
        || this.equals(PAPEL) && adversario.equals(PEDRA) ||
                this.equals(TESOURA) && adversario.equals(PAPEL);
    }
}
