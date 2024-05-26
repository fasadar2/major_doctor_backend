package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QualificationRepository extends JpaRepository<Qualification, Integer>, JpaSpecificationExecutor<Qualification> {
    Qualification findQualificationById(int id);
}
