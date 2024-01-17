public class Vaga {
    private String status;
    private int numero;
    private Carro carroEstacionado;

    public Vaga(int numero, String status) {
        this.numero = numero;
        this.status = status;
    }

    // getters e setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Carro getCarroEstacionado() {
        return carroEstacionado;
    }

    public void setCarroEstacionado(Carro carro) {
        this.carroEstacionado = carro;
    }

    // Ocupa a vaga, marcando-a como "Ocupada"
    public void ocuparVaga() {
        if (status.equalsIgnoreCase("Disponível")) {
            status = "Ocupada";
            System.out.println("Vaga " + numero + " ocupada.");
        } else {
            System.out.println("A vaga " + numero + " não está disponível para ocupação.");
        }
    }

    // Libera a vaga, marcando-a como "Disponível"
    public void liberarVaga() {
        if (status.equalsIgnoreCase("Ocupada")) {
            status = "Disponível";
            carroEstacionado = null;
            System.out.println("Vaga " + numero + " liberada.");
        } else {
            System.out.println("A vaga " + numero + " já está disponível.");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Vaga [numero = " + numero + ", status = " + status);
    
        if (status.equals("Ocupada")) {
            Carro carroEstacionado = (Carro) getCarroEstacionado();
            result.append(", carro = ").append(carroEstacionado != null ? carroEstacionado.toString() : "null");
        }
    
        result.append("]");
    
        return result.toString();
    }

    public void adicionarObservador(SistemaDeMonitoramento sistemaDeMonitoramento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarObservador'");
    }
}
