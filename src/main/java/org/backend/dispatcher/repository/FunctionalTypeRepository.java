package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.FunctionalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FunctionalTypeRepository extends JpaRepository<FunctionalType, Integer>, JpaSpecificationExecutor<FunctionalType> {
    FunctionalType getFunctionalTypeById(int id);
}