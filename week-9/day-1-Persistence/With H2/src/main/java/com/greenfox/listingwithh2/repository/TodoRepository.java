package com.greenfox.listingwithh2.repository;

import com.greenfox.listingwithh2.repository.Entity.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {


}
