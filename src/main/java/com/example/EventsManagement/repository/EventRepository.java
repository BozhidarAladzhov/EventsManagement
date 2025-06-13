package com.example.EventsManagement.repository;

import com.example.EventsManagement.models.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
