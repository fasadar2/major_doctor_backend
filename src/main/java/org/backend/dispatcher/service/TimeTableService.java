package org.backend.dispatcher.service;

import lombok.RequiredArgsConstructor;
import org.backend.dispatcher.entity.Timetable;
import org.backend.dispatcher.entity.User;
import org.backend.dispatcher.repository.TimeTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeTableService {
    @Autowired
    TimeTableRepository timeTableRepository;
    public Page<Timetable> GetPageTimeTable(Specification<Timetable> spec, Pageable pagable)
    {
        return timeTableRepository.findAll(spec,pagable);
    }
}
