package com.enset.conference_service.services;

import com.enset.conference_service.entities.Conference;
import com.enset.conference_service.entities.Review;
import com.enset.conference_service.repository.ConferenceRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ConferenceService {
    private ConferenceRepository conferenceRepository;

    public List<Conference> getAllConferences() {
        return conferenceRepository.findAll();
    }

    public Conference getConference(Long id) {
        return conferenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conference not found"));
    }

    public Conference saveConference(Conference conference) {
        return conferenceRepository.save(conference);
    }

    public Conference addReview(Long conferenceId, Review review) {
        Conference conference = getConference(conferenceId);
        conference.getReviews().add(review);
        return conferenceRepository.save(conference);
    }
}