package com.bank.antifraud.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "suspicious_account_transfers", schema = "anti_fraud")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuspiciousAccountTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account_transfer_id", unique = true)
    @NotNull
    private Long accountTransferId;

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
