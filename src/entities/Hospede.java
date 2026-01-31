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
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getIdadeHospede() {
        return idadeHospede;
    }
    public void setIdadeHospede(int idadeHospede) {
        this.idadeHospede = idadeHospede;
    }

    public String getIdentidadeHospede() {
        return identidadeHospede;
    }
    public void setIdentidadeHospede(String identidadeHospede) {
        this.identidadeHospede = identidadeHospede;
    }

    @Override
    public String toString() {
        return "Hospede:\n" +
                "Nome: " + nomeHospede +
                ", Idade: " + idadeHospede +
                ", Identidade: " + identidadeHospede +
                '\n';
    }
}
