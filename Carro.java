public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private String nomeCliente;
    private String cpfCliente;

    // Construtor
    public Carro(String modelo, String cor, String placa, String nomeCliente, String cpfCliente) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }

    // Getters e Setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Placa: " + placa);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("CPF do Cliente: " + cpfCliente);
    }


    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", cor=" + cor + ", placa=" + placa + ", nomeCliente=" + nomeCliente + ", cpfCliente=" + cpfCliente + "]";
    }
}