package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrganisationRepository extends JpaRepository<Organization, Integer>, JpaSpecificationExecutor<Organization> {
    Organization getOrganizationById(int id);
}
