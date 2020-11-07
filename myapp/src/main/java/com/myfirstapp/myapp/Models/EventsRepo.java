package com.myfirstapp.myapp.Models;

import org.springframework.data.repository.CrudRepository;


public interface EventsRepo extends CrudRepository<Events, String> {
}