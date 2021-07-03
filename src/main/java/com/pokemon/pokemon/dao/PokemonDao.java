package com.pokemon.pokemon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokemon.pokemon.entities.Pokemon;


public interface PokemonDao extends JpaRepository<Pokemon, Long>{

}
