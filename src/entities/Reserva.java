package entities;

public class Reserva {
    private final Hospede hospede;
    private final TipoQuarto tipoQuarto;
    private final int quantidadeDias;
    private final double valorTotalHospedagem;

    public Reserva(Hospede hospede, TipoQuarto tipoQuarto, int quantidadeDias) {
        this.hospede = hospede;
        this.tipoQuarto = tipoQuarto;
        this.quantidadeDias = quantidadeDias;
        this.valorTotalHospedagem = tipoQuarto.getValorQuarto() * quantidadeDias;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public double getValorTotalHospedagem() {
        return valorTotalHospedagem;
    }

    public void informarHospede() {
        System.out.println(hospede);
    }

    public String toString() {
        return  this.hospede +
                "\nQuarto Escolhido: " +
                this.tipoQuarto.getNomeQuarto() +
                "\nQuantidade de Dias Reservados: " +
                getQuantidadeDias() +
                "\nValor Total da Hospedagem: R$ " +
                String.format("%.2f",getValorTotalHospedagem()) ;
    }
}
