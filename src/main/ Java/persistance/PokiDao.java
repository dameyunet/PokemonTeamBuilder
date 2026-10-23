package persistance;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.poki.Pokemon;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class PokiDao {

    Pokemon getPokemon() {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("https://pokeapi.co/api/v2/pokemon/ditto");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        Pokemon pokemon = null;

        {
            try {
                pokemon = mapper.readValue(response, Pokemon.class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        return pokemon;
    }
}
