package com.pokemon.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pokemon.pokemon.entities.Pokemon;
import com.pokemon.pokemon.services.PokemonService;

@RestController
public class MyController {
	
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/pokemon")
	public List<Pokemon> fetchPokemon() {
		return this.pokemonService.fetchPokemon();
	}
	
	@GetMapping("/pokemon/{pokemonId}")
	public Pokemon getPokemon(@PathVariable String pokemonId) {
		return this.pokemonService.getPokemon(Long.parseLong(pokemonId));
	}
	
	@PostMapping("/pokemon")
	public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
		return this.pokemonService.addPokemon(pokemon);
	}
	
	@PutMapping("/pokemon")
	public Pokemon updatePokemon(@RequestBody Pokemon pokemon) {
		return this.pokemonService.updatePokemon(pokemon);
	}
	
	@DeleteMapping("/pokemon/{pokemonId}")
	public ResponseEntity<HttpStatus> deletePokemon(@PathVariable String pokemonId){
		try {
			this.pokemonService.deletePokemon(Long.parseLong(pokemonId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
