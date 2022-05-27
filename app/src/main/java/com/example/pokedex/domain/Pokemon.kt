package com.example.pokedex.domain

data class Pokemon(
    val imageURl : String,
    val number: Int,
    val name: String,
    val types: List<PokemonType>
){
    val formattedNumber = number.toString().padStart(3, '0')
}

