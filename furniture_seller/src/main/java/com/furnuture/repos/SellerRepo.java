package com.furnuture.repos;


import com.furnuture.controlers.domain.Tickets;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SellerRepo extends CrudRepository<Tickets,Long> {

    List<Tickets> findByTag(String tag);

}
