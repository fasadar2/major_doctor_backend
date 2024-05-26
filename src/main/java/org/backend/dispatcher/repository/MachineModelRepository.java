package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MachineModelRepository extends JpaRepository<Model, Integer>, JpaSpecificationExecutor<Model> {
    Model getModelById(int id);
}