package padroescriacao.factorymethod;

public class MusicaFactory {

    public static IMusica obterMusica(String tipo) {
        IMusica musica = null;

        if (tipo.equals("Rap")) {
            musica = new MusicaRap();
        }

        if (tipo.equals("Trap")) {
            musica = new MusicaTrap();
        }

        if (tipo.equals("Anime")) {
            musica = new MusicaAnime();
        }
        if (musica == null) {
            throw new IllegalArgumentException("Tipo de música inválido");
        }

        return musica;
    }

}