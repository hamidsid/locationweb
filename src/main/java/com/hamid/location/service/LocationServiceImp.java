package com.hamid.location.service;

import com.hamid.location.entities.Location;
import com.hamid.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImp implements LocationService {

    @Autowired
    private LocationRepository repository;

    @Override

    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);
    }

    @Override
    public Location getLocation(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return repository.findAll();
    }

    public LocationRepository getRepository() {
        return repository;
    }

    public void setRepository(LocationRepository repository) {
        this.repository = repository;
    }
}
