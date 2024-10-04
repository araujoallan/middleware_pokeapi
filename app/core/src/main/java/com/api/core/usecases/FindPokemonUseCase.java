package com.api.core.usecases;

import com.api.domain.entity.Pokemon;

public interface FindPokemonUseCase {
    Pokemon find(Pokemon pokemon);
}
