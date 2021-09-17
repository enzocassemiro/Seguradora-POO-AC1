
public class Apolice {
    //Variaveis
    private String nomeSegurado;
    private int idade;
    private double valorPremio;

    //Construtores
    public Apolice(String nomeSegurado, int idade,double valorPremio) {
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public Apolice(){
        nomeSegurado = "";
        idade = 0;
        valorPremio = 0;
    }

    // Gets and sets
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    // Metodos
    public String imprimirDadosApolice() {
        return("Nome: " + nomeSegurado + "\nIdade: " + idade + "\nValor Apolice: " + valorPremio);
    }

    public double calculaValorApoliceIdade() {
        if (idade >= 18 && idade <= 25) {
            valorPremio = valorPremio + (valorPremio * 0.20);
        }
        if (idade > 25 && idade <= 36) {
            valorPremio = valorPremio + (valorPremio * 0.15);
        }
        if (idade > 36){
            valorPremio = valorPremio + (valorPremio * 0.10);
        }
        return(valorPremio);
    }

    public void calculaDescontoCidade(String cidade) {
        if (cidade.equalsIgnoreCase("curitiba")) {
            valorPremio = valorPremio - (valorPremio * 0.20);
        }
        else if (cidade.equalsIgnoreCase("rio de janeiro")) {
            valorPremio = valorPremio - (valorPremio * 0.15);
        }
        else if (cidade.equalsIgnoreCase("sao paulo")) {
            valorPremio = valorPremio - (valorPremio * 0.10);
        }
        else if (cidade.equalsIgnoreCase("são paulo")) {
            valorPremio = valorPremio - (valorPremio * 0.10);
        }
        else if (cidade.equalsIgnoreCase("belo horizonte")) {
            valorPremio = valorPremio - (valorPremio * 0.5);
        }
    }
}
