package com.sincere.candy.service;

import com.sincere.candy.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface PetService {

    List<Pet> getAllPets();
}

