package br.ufg.inf.jogoVelha.jogodavelha.ui.model;

public enum PlayerSign {
    X("X"),
    O("O"),
    NONE(" ");

    private final String SIGN;

    PlayerSign(final String SIGN) {
        this.SIGN = SIGN;
    }

    public boolean compare(final PlayerSign SIGN) {
        return this.SIGN.equals(SIGN.toString());
    }

    public String toString() {
        return this.SIGN;
    }
}