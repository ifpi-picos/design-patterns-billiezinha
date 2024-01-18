public class Principal {

    public static void main(String[] args) {

        Musica musica1 = new Musica("Musica 1");
        Musica musica2 = new Musica("Musica 2");

        Anunciante anunciante = new Anunciante();

        musica1.adicionarObservador(anunciante);
        musica2.adicionarObservador(anunciante);

        musica1.setNome("Nova música - Lost Cause by Billie Eilish");
        musica2.setNome("Nova música - my strange addiction by Billie Eilish");

    }

}
