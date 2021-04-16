package com.example.apppet


interface ApiPets {

    @GET ("Pets")
    fun get(): Call<List<Pet>>
}