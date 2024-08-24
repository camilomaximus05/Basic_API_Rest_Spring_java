package com.riwi.tallerRestapi.services;

import com.riwi.tallerRestapi.Models.Event;
import com.riwi.tallerRestapi.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EventService implements IEventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void deleteById(UUID id) {

        eventRepository.deleteById(id);

    }

    @Override
    public List<Event> readAll() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<Event> readById(UUID id) {
        return eventRepository.findById(id);
    }


    @Override
    public Event save(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event update(UUID id, Event event) {
        if (eventRepository.existsById(id)) {
            event.setId(id);
            return eventRepository.save(event);
        }
        return null;
    }
}
