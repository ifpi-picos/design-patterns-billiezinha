import java.util.ArrayList;
import java.util.List;

public class Notificador implements Observer {

    private List<Observer> observadores;

    public Notificador() {
        observadores = new ArrayList<>();
    }

    @Override
    public void atualizar(Vaga vaga) {
        for (Observer observador : observadores) {
            observador.atualizar(vaga);
        }
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

}