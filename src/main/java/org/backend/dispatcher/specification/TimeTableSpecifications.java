package org.backend.dispatcher.specification;

import org.backend.dispatcher.entity.Organization;
import org.backend.dispatcher.entity.Timetable;
import org.backend.dispatcher.entity.User;
import org.backend.dispatcher.repository.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class TimeTableSpecifications {
    public static Specification<Timetable> filterOrganization(Organization organization_id)
    {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("organizationId"),organization_id));
    }
}
