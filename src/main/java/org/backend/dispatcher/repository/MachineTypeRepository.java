package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.MachineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MachineTypeRepository extends JpaRepository<MachineType, Integer>, JpaSpecificationExecutor<MachineType> {
    MachineType getMachineTypeById(int id);

}