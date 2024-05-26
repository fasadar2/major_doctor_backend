package org.backend.dispatcher.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
public class Part {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @ManyToOne
    @JoinColumn(name = "machine_type_id", referencedColumnName = "id", nullable = false)
    private MachineType machineTypeByMachineTypeId;
    @ManyToOne
    @JoinColumn(name = "machine_model_id", referencedColumnName = "id", nullable = false)
    private Model modelByMachineModelId;
}
