import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private int capacidade;
    private int horarioFuncionamento;
    private String endereco;
    private List<Vaga> vagas;

    public Estacionamento(int capacidade, int horarioFuncionamento, String endereco) {
        this.capacidade = capacidade;
        this.horarioFuncionamento = horarioFuncionamento;
        this.endereco = endereco;
        this.vagas = new ArrayList<>();
        inicializarVagas();
    }

    // getters e setters

    public int getVagasRestantes() {
        return vagasDisponiveis();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    // Inicializa as vagas do estacionamento com status "Disponível"
    private void inicializarVagas() {
        for (int i = 1; i <= capacidade; i++) {
            vagas.add(new Vaga(i, "Disponível"));
        }
    }

    // Retorna a quantidade de vagas disponíveis
    public int vagasDisponiveis() {
        int count = 0;
        for (Vaga vaga : vagas) {
            if (vaga.getStatus().equals("Disponível")) {
                count++;
            }
        }
        return count;
    }

    // Método para estacionar um carro em uma vaga específica
    public boolean estacionarCarro(int numeroVaga, Carro carro) {
        if (numeroVaga >= 1 && numeroVaga <= vagas.size()) {
            Vaga vaga = vagas.get(numeroVaga - 1);
            if (vaga.getStatus().equals("Disponível")) {
                vaga.setCarroEstacionado(carro);
                vaga.setStatus("Ocupada");
                return true;
            }
        }
        return false;
    }

    public boolean adicionarCarro(Carro carro) {
        if (carro != null && vagasDisponiveis() > 0) {
            for (Vaga vaga : vagas) {
                if (vaga.getStatus().equals("Disponível")) {
                    estacionarCarro(vaga.getNumero(), carro);
                    return true;
                }
            }
        }
        return false;
    }

    // Libera uma vaga ocupada
    public boolean liberarVaga(int numeroVaga) {
        if (numeroVaga >= 1 && numeroVaga <= vagas.size()) {
            Vaga vaga = vagas.get(numeroVaga - 1);
            if (vaga.getStatus().equals("Ocupada")) {
                vaga.liberarVaga();
                return true;
            }
        }
        return false;
    }

    // Método para obter a lista de carros presentes no estacionamento
    public List<Carro> carrosNoEstacionamento() {
        List<Carro> carrosEstacionados = new ArrayList<>();
        for (Vaga vaga : vagas) {
            if (vaga.getStatus().equals("Ocupada")) {
                Carro carroEstacionado = vaga.getCarroEstacionado();
                if (carroEstacionado != null) {
                    carrosEstacionados.add(carroEstacionado);
                }
            }
        }
        return carrosEstacionados;
    }

    public void exibirCarrosEstacionados() {
        System.out.println("Carros no Estacionamento:");
        for (Vaga vaga : vagas) {
            if (vaga.getStatus().equals("Ocupada")) {
                Carro carroEstacionado = vaga.getCarroEstacionado();
                if (carroEstacionado != null) {
                    System.out.println(carroEstacionado);
                }
            }
        }
    }

    public void exibirVagas() {
        System.out.println("Situação das Vagas:");
        for (Vaga vaga : vagas) {
            System.out.println(vaga);
        }
    }
}
