import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class VagaObservable {
    private String status;
    private int numero;
    private Carro carroEstacionado;
    private PropertyChangeSupport support;

    public VagaObservable(int numero, String status) {
        this.numero = numero;
        this.status = status;
        this.support = new PropertyChangeSupport(this);
    }

    // getters e setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        support.firePropertyChange("status", oldStatus, status);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        int oldNumero = this.numero;
        this.numero = numero;
        support.firePropertyChange("numero", oldNumero, numero);
    }

    public Carro getCarroEstacionado() {
        return carroEstacionado;
    }

    public void setCarroEstacionado(Carro carro) {
        Carro oldCarro = this.carroEstacionado;
        this.carroEstacionado = carro;
        support.firePropertyChange("carroEstacionado", oldCarro, carro);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
