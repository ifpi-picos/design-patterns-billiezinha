public class Main {
    public static void main(String[] args) {
        // Criando um estacionamento com capacidade de 10 vagas
        Estacionamento estacionamento = new Estacionamento(10, 24, "Rua Principal");

        // Criando carros
        Carro carro1 = new Carro("Modelo1", "Cor1", "ABC123", "Emylle", "12345678910");
        Carro carro2 = new Carro("Modelo2", "Cor2", "XYZ789", "Leticia", "40028922");
        Carro carro3 = new Carro("Modelo3", "Cor3", "LMN456", "kedna", "45621387900");

        // Estacionando carros em vagas específicas
        estacionamento.estacionarCarro(1, carro1);
        estacionamento.estacionarCarro(2, carro2);
        estacionamento.estacionarCarro(3, carro3);

        // Exibindo informações dos carros estacionados e vagas ocupadas
        System.out.println("Informações dos carros no estacionamento:");
        estacionamento.exibirCarrosEstacionados();

        // Exibindo a situação das vagas
        System.out.println("\nSituação das Vagas após estacionamento:");
        estacionamento.exibirVagas();

        // Liberando vagas ocupadas
        estacionamento.liberarVaga(1);
        estacionamento.liberarVaga(2);
        estacionamento.liberarVaga(3);

        // Exibindo a situação das vagas após liberação
        System.out.println("\nSituação das Vagas após liberação:");
        estacionamento.exibirVagas();

        // Cria um sistema de monitoramento
        SistemaDeMonitoramento sistemaDeMonitoramento = new SistemaDeMonitoramento();

        // Cria uma vaga
        Vaga vaga = new Vaga(1, "Disponível");

        // Adiciona o sistema de monitoramento como observador
        vaga.adicionarObservador(sistemaDeMonitoramento);

        // Ocupa a vaga
        vaga.ocuparVaga();
    }
}
