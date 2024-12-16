package com.enset.conference_service.repository;

import com.enset.conference_service.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}