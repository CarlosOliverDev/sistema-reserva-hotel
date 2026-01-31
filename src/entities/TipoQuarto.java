package entities;

public enum TipoQuarto {
    QUARTOBASICO("Quarto Básico", 150.00),
    QUARTOLUXO("Quarto de Luxo", 830.00),
    QUARTOPRESIDENCIAL("Quarto Presidencial", 10000.00);

    private final String nomeQuarto;
    private final double valorQuarto;

    TipoQuarto(String nomeQuarto, double valorQuarto) {
        this.nomeQuarto = nomeQuarto;
        this.valorQuarto = valorQuarto;
    }

    public String getNomeQuarto() {
        return nomeQuarto;
    }

    public double getValorQuarto() {
        return valorQuarto;
    }

    @Override
    public String toString() {
        return "\nTipo Quarto: " + nomeQuarto +
                String.format("\nValor Quarto: R$ %.2f",valorQuarto)  ;
    }
}
