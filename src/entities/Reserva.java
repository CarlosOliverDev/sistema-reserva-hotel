package entities;

public class Reserva {

    private String nomeHospede;
    private String quartoHotel;
    private int quantidadeDias;
    private double valorTotalHospedagem;

    public Reserva(String nomeHospede, String quartoHotel, int quantidadeDias) {
        this.nomeHospede = nomeHospede;
        this.quartoHotel = quartoHotel;
        this.quantidadeDias = quantidadeDias;
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

    public void calcularValorTotal() {
    }

    public String toString() {
        return "\nNome Hóspede: " +
                getNomeHospede() +
                "\nQuarto Escolhido: " +
                getQuartoHotel() +
                "\nQuantidade de Dias Reservado: " +
                getQuantidadeDias() +
                "\nValor Total da Hospedagem: " +
                getValorTotalHospedagem();
    }
}
