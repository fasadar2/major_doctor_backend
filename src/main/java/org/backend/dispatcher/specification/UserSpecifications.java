package org.backend.dispatcher.specification;

import org.backend.dispatcher.entity.Organization;
import org.backend.dispatcher.entity.Role;
import org.backend.dispatcher.entity.User;
import org.backend.dispatcher.repository.OrganisationRepository;
import org.backend.dispatcher.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class UserSpecifications {
    @Autowired
    static OrganisationRepository organisationRepository;
    @Autowired
    static RoleRepository roleRepository;
    public static Specification<User> filterOrganization(Organization organization_id)
    {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("organizationByOrganizationId"),organization_id));
    }
    public static Specification<User> filterRoleId(Role role_id)
    {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("roleByRoleId"),role_id));
    }
}
