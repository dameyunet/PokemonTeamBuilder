package persistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokiDaoTest {

    @Test
    void getPokemonSuccess() {
        PokiDao dao = new PokiDao();
        assertEquals("ditto", dao.getPokemon().getName());
    }
}