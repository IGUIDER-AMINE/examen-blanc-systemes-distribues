package com.enset.keynote_service.repository;

import com.enset.keynote_service.entities.Keynote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@Repository
@RepositoryRestResource
public interface KeynoteRepository extends JpaRepository<Keynote, Long> {
}