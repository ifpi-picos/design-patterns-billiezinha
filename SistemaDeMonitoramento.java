public class SistemaDeMonitoramento implements Observer {

    @Override
    public void atualizar(Vaga vaga) {
        if (vaga.getStatus().equals("Ocupada")) {
            System.out.println("O estacionamento está cheio.");
        } else {
            System.out.println("O estacionamento está com vagas disponíveis.");
        }
    }

}