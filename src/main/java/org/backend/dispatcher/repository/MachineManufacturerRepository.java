package org.backend.dispatcher.repository;

import org.backend.dispatcher.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MachineManufacturerRepository extends JpaRepository<Manufacturer, Integer>, JpaSpecificationExecutor<Manufacturer> {
Manufacturer getManufacturerById(int id);
}
