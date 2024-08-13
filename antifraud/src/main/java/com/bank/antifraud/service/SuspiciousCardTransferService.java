package com.bank.antifraud.service;

import com.bank.antifraud.model.SuspiciousAccountTransfer;
import com.bank.antifraud.model.SuspiciousCardTransfer;
import com.bank.antifraud.repository.SuspiciousCardTransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuspiciousCardTransferService {

    private final SuspiciousCardTransferRepository repository;

    @Autowired
    public SuspiciousCardTransferService(SuspiciousCardTransferRepository repository) {
        this.repository = repository;
    }

    /**
     * Создает новую запись подозрительной транзакции карты в базе данных.
     *
     * @param transfer объект подозрительной транзакции карты, который будет сохранен
     * @return сохраненный объект подозрительной транзакции карты
     */
    public SuspiciousCardTransfer createSuspiciousCardTransfer(SuspiciousCardTransfer transfer) {
        return repository.save(transfer);
    }

    /**
     * Читает запись подозрительной транзакции карты по идентификатору из базы данных.
     *
     * @param id идентификатор записи подозрительной транзакции карты
     * @return запись подозрительной транзакции карты, соответствующая указанному идентификатору, или null, если запись не найдена
     */
    public SuspiciousCardTransfer readSuspiciousCardTransfer(Long id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * Обновляет запись подозрительной транзакции карты по идентификатору из базы данных.
     *
     * @param transfer объект обновленной подозрительной транзакции карты, который будет сохранен
     * @return сохраненный объект подозрительной транзакции карты
     */
    public SuspiciousCardTransfer updateSuspiciousCardTransfer(SuspiciousCardTransfer transfer) {
        return repository.save(transfer);
    }

    /**
     * Удаляет запись подозрительной транзакции карты по идентификатору из базы данных.
     *
     * @param id идентификатор записи подозрительной транзакции карты
     * @return запись подозрительной транзакции карты, соответствующая указанному идентификатору, которая будет удалена, или null, если запись не найдена
     */
    public void deleteSuspiciousCardTransfer(Long id) {
        repository.deleteById(id);
    }

    /**
     * Возвращает список всех записей подозрительных транзакций карты из базы данных.
     *
     * @return список записей подозрительных транзакций карты
     */
    public List<SuspiciousCardTransfer> getAllSuspiciousCardTransfers() {
        return repository.findAll();
    }
}
