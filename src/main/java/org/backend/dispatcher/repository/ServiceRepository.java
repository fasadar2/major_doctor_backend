package org.backend.dispatcher.repository;
import org.backend.dispatcher.entity.Repair;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ServiceRepository extends JpaRepository<Repair, Integer>, JpaSpecificationExecutor<Repair> {
//    long countAll();
    Page<Repair> findAllByRepairOutFalse(Pageable pageable);
    long countAllByRepairOutFalse();
}
