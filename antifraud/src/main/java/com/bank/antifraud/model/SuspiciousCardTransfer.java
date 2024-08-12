package com.bank.antifraud.model;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

import lombok.*;

@Entity
@Table(name = "suspicious_card_transfer", schema = "anti_fraud")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SuspiciousCardTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_transfer_id", unique = true)
    @NotNull
    private Long cardTransferId;

    @Column(name = "is_blocked")
    @NotNull
    private Boolean isBlocked;

    @Column(name = "is_suspicious")
    @NotNull
    private Boolean isSuspicious;

    @Column(name = "blocked_reason", columnDefinition = "text")
    private String blockedReason;

    @Column(name = "suspicious_reason", columnDefinition = "text")
    @NotNull
    private String suspiciousReason;

}
