package org.backend.dispatcher.service;

import lombok.RequiredArgsConstructor;
import org.backend.dispatcher.dto.request.UserRequestDTO;
import org.backend.dispatcher.entity.User;
import org.backend.dispatcher.repository.OrganisationRepository;
import org.backend.dispatcher.repository.RoleRepository;
import org.backend.dispatcher.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EngineerService {
    @Autowired
    UserRepository userRepository;
    QualificationService qualificationService;
    OrganisationRepository organisationRepository;
    RoleRepository roleRepository;

    public Page<User> GetPageUser(Specification<User> spec, Pageable pagable)
    {
        return userRepository.findAll(spec,pagable);
    }

    public User AddNewEngineer(UserRequestDTO userRequestDTO) {
        User user = new User();

        user.setQualificationByQualificationId(qualificationService.GetQualificationById(userRequestDTO.getQualification_id()));
        user.setOrganizationByOrganizationId(organisationRepository.getOrganizationById(userRequestDTO.getOrganization_id()));
        user.setRoleByRoleId(roleRepository.findRoleById(userRequestDTO.getRole_id()));

        user.setLogin(userRequestDTO.getLogin());
        user.setPassword(userRequestDTO.getPassword());
        user.setFirstName(userRequestDTO.getFirst_name());
        user.setSecondName(userRequestDTO.getSecond_name());
        user.setThirdName(userRequestDTO.getThird_name());
        user.setPhone(userRequestDTO.getPhone());

        userRepository.save(user);
        return user;
    }
}
