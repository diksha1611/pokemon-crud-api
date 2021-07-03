package com.pokemon.pokemon.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pokemon.pokemon.dao.PokemonDao;
import com.pokemon.pokemon.entities.Pokemon;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	private PokemonDao pokemonDao;
	
	public PokemonServiceImpl() {
		
	}
	
	@Override
	public List<Pokemon> fetchPokemon() {
		return pokemonDao.findAll();
	}

	@Override
	public Pokemon getPokemon(long pokemonId) {
		return pokemonDao.getById(pokemonId);
	}

	@Override
	public Pokemon addPokemon(Pokemon pokemon) {
		pokemonDao.save(pokemon);
		return pokemon;
	}

	@Override
	public Pokemon updatePokemon(Pokemon pokemon) {
		pokemonDao.save(pokemon);
		return pokemon;
	}

	@Override
	public void deletePokemon(long pokemonId) {
		pokemonDao.delete(pokemonDao.getById(pokemonId));

	}

}
