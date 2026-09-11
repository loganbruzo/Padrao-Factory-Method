package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MusicaFactoryTest {
    @Test
    void deveCriarMusicaRap() {
        IMusica musica = MusicaFactory.obterMusica("Rap");
        assertNotNull(musica);
        assertTrue(musica instanceof MusicaRap);
    }
    @Test
    void deveCriarMusicaTrap() {
        IMusica musica = MusicaFactory.obterMusica("Trap");
        assertNotNull(musica);
        assertTrue(musica instanceof MusicaTrap);
    }
    @Test
    void deveCriarMusicaAnime() {
        IMusica musica = MusicaFactory.obterMusica("Anime");
        assertNotNull(musica);
        assertTrue(musica instanceof MusicaAnime);
    }

    @Test
    void deveRetornaMusicaInvalida() {
        assertThrows(
                IllegalArgumentException.class,
                () -> MusicaFactory.obterMusica("Invalida")
        );
    }
}