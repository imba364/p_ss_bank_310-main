package com.bank.antifraud.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "suspicious_phone_transfers", schema = "anti_fraud")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuspiciousPhoneTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_transfer_id", unique = true)
    @NotNull
    private Long phoneTransferId;

    @Column(name = "is_blocked")
    @NotNull
    private Boolean isBlocked;

    @Column(name = "is_suspicious", nullable = false)
    @NotNull
    private Boolean isSuspicious;

    @Column(name = "blocked_reason", columnDefinition = "text")
    private String blockedReason;

    @Column(name = "suspicious_reason", columnDefinition = "text")
    @NotNull
    private String suspiciousReason;
}
