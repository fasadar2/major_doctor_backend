package org.backend.dispatcher.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
public class Result {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "result_type", nullable = false, length = 50)
    private String resultType;
    @Basic
    @Column(name = "description", nullable = false, length = -1)
    private String description;

}
