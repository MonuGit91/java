package com.basicCrudOperation.dao.repositories;

import com.basicCrudOperation.dao.models.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends JpaRepository<Url, Integer> {
//    @Query(value = "select domain_name from url", nativeQuery = true)
//    List<Url> getDomains();
}
