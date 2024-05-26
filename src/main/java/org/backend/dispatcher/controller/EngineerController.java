package org.backend.dispatcher.controller;

import org.backend.dispatcher.dto.request.UserRequestDTO;
import org.backend.dispatcher.entity.User;
import org.backend.dispatcher.repository.OrganisationRepository;
import org.backend.dispatcher.repository.RoleRepository;
import org.backend.dispatcher.service.EngineerService;
import org.backend.dispatcher.specification.UserSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/engineer")
@CrossOrigin(origins = "http://localhost:4401")
public class EngineerController {
    @Autowired
    EngineerService engineerService;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    OrganisationRepository organisationRepository;
    @GetMapping(path = "/get-page")
    public Page<User> GetAllUsers(@RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size,
                                  @RequestParam int organization_id)
    {
        Specification<User> spec = Specification.where(null);
        spec = spec.and(UserSpecifications.filterOrganization(organisationRepository.getOrganizationById(organization_id)));
        spec = spec.and(UserSpecifications.filterRoleId(roleRepository.findRoleById(2)));
        return engineerService.GetPageUser(spec, PageRequest.of(page,size));
    }
    @PostMapping(path="/add-new", produces = MediaType.APPLICATION_JSON_VALUE)
    public User AddNewUser(@RequestBody UserRequestDTO userRequestDTO)
    {
        return engineerService.AddNewEngineer(userRequestDTO);
    }
}
