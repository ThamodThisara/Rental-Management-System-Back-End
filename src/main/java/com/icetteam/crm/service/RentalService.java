package com.icetteam.crm.service;

import com.icetteam.crm.model.Rental;

import java.util.List;

public interface RentalService {
    void add(Rental rental);
    List<Rental> getAll();
    void delete(int id);
    Rental getByID(int id);
}
