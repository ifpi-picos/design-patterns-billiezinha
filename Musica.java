import java.util.ArrayList;
import java.util.List;

public class Musica {

    private String nome;
    private List<Observador> observadores;

    public Musica(String nome) {
        this.nome = nome;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : this.observadores) {
            observador.musicaAdicionada(this);
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        this.notificarObservadores();
    }

}
