package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResultRepository extends JpaRepository<Result, Integer>, JpaSpecificationExecutor<Result> {
}
