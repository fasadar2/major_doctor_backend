package org.backend.dispatcher.repository;


import org.backend.dispatcher.entity.Diagnostic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DiagnosticRepository extends JpaRepository<Diagnostic, Integer>, JpaSpecificationExecutor<Diagnostic> {
    long countAllByDiagnosticOutFalse();
    Page<Diagnostic> findAllByDiagnosticOutFalse(Pageable pageable);
    Diagnostic findDiagnosticById(int diagnosticId);
}
