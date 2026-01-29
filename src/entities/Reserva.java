package entities;

public class Reserva {
    private String nomeHospede;
    private String quartoHotel;
    private int quantidadeDias;
    private final double valorTotalHospedagem;

    public Reserva(String nomeHospede, String quartoHotel, int quantidadeDias, double valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.quartoHotel = quartoHotel;
        this.quantidadeDias = quantidadeDias;
        this.valorTotalHospedagem = calcularValorTotal(valorDiaria, quantidadeDias);
    }

    public String getNomeHospede() {
        return nomeHospede;
    }
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String getQuartoHotel() {
        return quartoHotel;
    }
    public void setQuartoHotel(String quartoHotel) {
        this.quartoHotel = quartoHotel;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }
    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public double getValorTotalHospedagem() {
        return valorTotalHospedagem;
    }

    public double calcularValorTotal(double valorDiaria, int quantidadeDias) {
        return valorDiaria * (double) quantidadeDias;
    }

    public String toString() {
        return "\nNome do Hóspede: " +
                getNomeHospede() +
                "\nQuarto Escolhido: " +
                getQuartoHotel() +
                "\nQuantidade de Dias Reservados: " +
                getQuantidadeDias() +
                "\nValor Total da Hospedagem: R$ " +
                String.format("%.2f",getValorTotalHospedagem()) ;
    }
}
