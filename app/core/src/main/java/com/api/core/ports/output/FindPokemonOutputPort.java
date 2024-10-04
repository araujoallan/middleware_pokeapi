package com.api.core.ports.output;

import com.api.domain.entity.Pokemon;
import org.springframework.stereotype.Component;

@Component
public interface FindPokemonOutputPort {

    Pokemon findPokemon(String name);
}
