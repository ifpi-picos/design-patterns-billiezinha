public class Anunciante implements Observador {

    @Override
    public void musicaAdicionada(Musica musica) {
        System.out.println("Nova música adicionada: " + musica.getNome());
    }

}