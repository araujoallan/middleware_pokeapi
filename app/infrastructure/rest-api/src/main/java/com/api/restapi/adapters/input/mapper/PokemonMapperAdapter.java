package com.api.restapi.adapters.input.mapper;


import com.api.domain.entity.Pokemon;
import com.api.restapi.adapters.input.PokemonAdapter;
import com.api.restapi.adapters.input.response.FindPokemonResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PokemonMapperAdapter {

    FindPokemonResponse toResponse(Pokemon pokemon);
}
