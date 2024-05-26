package org.backend.dispatcher.controller;

import org.backend.dispatcher.entity.Timetable;
import org.backend.dispatcher.entity.User;
import org.backend.dispatcher.repository.OrganisationRepository;
import org.backend.dispatcher.service.TimeTableService;
import org.backend.dispatcher.specification.TimeTableSpecifications;
import org.backend.dispatcher.specification.UserSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time-table")
@CrossOrigin(origins = "http://localhost:4401")
public class TimeTableController {
    @Autowired
    OrganisationRepository organisationRepository;
    @Autowired
    TimeTableService timeTableService;
    @GetMapping(path = "/get-page")
    public Page<Timetable> GetAllUsers(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "10") int size,
                                       @RequestParam int organization_id)
    {
        Specification<Timetable> spec = Specification.where(null);
        spec = spec.and(TimeTableSpecifications.filterOrganization(organisationRepository.getOrganizationById(organization_id)));
        return timeTableService.GetPageTimeTable(spec, PageRequest.of(page,size));
    }
}
