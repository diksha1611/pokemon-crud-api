package com.pokemon.pokemon.services;

import java.util.List;

import com.pokemon.pokemon.entities.Pokemon;


public interface PokemonService {
	
	public List<Pokemon> fetchPokemon();

	public Pokemon getPokemon(long pokemonId);

	public Pokemon addPokemon(Pokemon pokemon);

	public Pokemon updatePokemon(Pokemon pokemon);

	public void deletePokemon(long pokemonId);


}
