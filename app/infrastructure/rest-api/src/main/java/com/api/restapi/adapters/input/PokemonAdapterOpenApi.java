package com.api.restapi.adapters.input;

import com.api.restapi.adapters.input.request.FindPokemonRequest;
import com.api.restapi.adapters.input.response.ErroResponse;
import com.api.restapi.adapters.input.response.FindPokemonResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Validated
public interface PokemonAdapterOpenApi {

    @Operation(
            operationId = "find",
            summary = "Search Pokemon by name endpoint.",
            tags = { "Pokemon" },
            responses = {
                    @ApiResponse(responseCode = "204", description = "Values successfully retrieved."),
                    @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErroResponse.class))
                    }),
                    @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErroResponse.class))
                    }),
                    @ApiResponse(responseCode = "404", description = "Not Found", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErroResponse.class))
                    }),
                    @ApiResponse(responseCode = "406", description = "Not Acceptable", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErroResponse.class))
                    }),
                    @ApiResponse(responseCode = "429", description = "Too Many Requests", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErroResponse.class))
                    }),
                    @ApiResponse(responseCode = "default", description = "Unexpected Error", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = ErroResponse.class))
                    })
            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/find",
            produces = { "application/json" }
    )
    default ResponseEntity<FindPokemonResponse> find(@RequestParam("name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
