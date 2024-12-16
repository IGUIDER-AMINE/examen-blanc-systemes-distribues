package com.enset.conference_service.controllers;

import com.enset.conference_service.entities.Conference;
import com.enset.conference_service.entities.Review;
import com.enset.conference_service.services.ConferenceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/api/conferences")
//@AllArgsConstructor
public class ConferenceController {
    private ConferenceService conferenceService;

    @GetMapping
    public List<Conference> getAllConferences() {
        return conferenceService.getAllConferences();
    }

    @GetMapping("/{id}")
    public Conference getConference(@PathVariable Long id) {
        return conferenceService.getConference(id);
    }

    @PostMapping
    public Conference saveConference(@RequestBody Conference conference) {
        return conferenceService.saveConference(conference);
    }

    @PostMapping("/{id}/reviews")
    public Conference addReview(@PathVariable Long id, @RequestBody Review review) {
        return conferenceService.addReview(id, review);
    }
}