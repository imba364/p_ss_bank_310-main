package com.bank.antifraud.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "audit", schema = "anti_fraud")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "entity_type", length = 40)
    @NotNull
    private String entityType;

    @Column(name = "operation_type", length = 255)
    @NotNull
    private String operationType;

    @Column(name = "created_by", length = 255)
    @NotNull
    private String createdBy;

    @Column(name = "modified_by", length = 255)
    private String modifiedBy;

    @Column(name = "created_at")
    @NotNull
    private LocalDateTime createdAt;

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

    @Column(name = "new_entity_json", columnDefinition = "text")
    private String newEntityJson;

    @Column(name = "entity_json", columnDefinition = "text")
    @NotNull
    private String entityJson;

}
