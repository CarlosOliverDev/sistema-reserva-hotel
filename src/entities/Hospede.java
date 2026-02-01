package entities;

public class Hospede {
    private String nomeHospede;
    private int idadeHospede;
    private String identidadeHospede;

    public Hospede(String nomeHospede, int idadeHospede, String identidadeHospede) {
        this.nomeHospede = nomeHospede;
        this.idadeHospede = idadeHospede;
        this.identidadeHospede = identidadeHospede;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public int getIdadeHospede() {
        return idadeHospede;
    }

    public String getIdentidadeHospede() {
        return identidadeHospede;
    }

    @Override
    public String toString() {
        return "Hóspede - Nome: " + nomeHospede +
                ", Idade: " + idadeHospede +
                ", Identidade: " + identidadeHospede;
    }
}
