package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.Error;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ErrorRepository extends JpaRepository<Error, Integer>, JpaSpecificationExecutor<Error> {
}
