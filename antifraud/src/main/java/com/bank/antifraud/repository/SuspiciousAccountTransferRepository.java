package com.bank.antifraud.repository;

import com.bank.antifraud.model.SuspiciousAccountTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuspiciousAccountTransferRepository extends JpaRepository<SuspiciousAccountTransfer, Long> {
}
