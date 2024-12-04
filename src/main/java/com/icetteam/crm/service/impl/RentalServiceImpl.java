package com.icetteam.crm.service.impl;

import com.icetteam.crm.entity.RentalEntity;
import com.icetteam.crm.model.Rental;
import com.icetteam.crm.repository.RentalRepository;
import com.icetteam.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentalServiceImpl implements RentalService {
    final RentalRepository repository;
    final ModelMapper mapper;
    @Override
    public void add(Rental rental) {
        repository.save(mapper.map(rental, RentalEntity.class));
    }

    @Override
    public List<Rental> getAll() {
        ArrayList<Rental> rentals = new ArrayList<>();
        repository.findAll().forEach(entity -> {
            rentals.add(mapper.map(entity, Rental.class));
        });
        return rentals;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Rental getByID(int id) {
        return mapper.map(repository.findById(id), Rental.class);
    }
}
