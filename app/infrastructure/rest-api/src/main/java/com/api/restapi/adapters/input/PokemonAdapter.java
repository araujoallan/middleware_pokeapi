package com.api.restapi.adapters.input;

import com.api.core.usecases.FindPokemonUseCase;
import com.api.domain.entity.Pokemon;
import com.api.restapi.adapters.input.mapper.PokemonMapperAdapter;
import com.api.restapi.adapters.input.response.FindPokemonResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/pokemon-api/v1")
public class PokemonAdapter implements PokemonAdapterOpenApi {

    private final FindPokemonUseCase findPokemonUseCase;

    private final PokemonMapperAdapter pokemonMapperAdapter;

    @Override
    public ResponseEntity<FindPokemonResponse> find(String name) {

        Pokemon pokemon = Pokemon.builder()
            .name(name)
            .build();
        return ResponseEntity.ok(pokemonMapperAdapter.toResponse(findPokemonUseCase.find(pokemon)));
    }
}
