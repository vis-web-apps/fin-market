package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.Bank;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    @Query("SELECT b FROM Bank b WHERE " +
            "(:query IS NULL OR :query='' OR LOWER(b.name) like LOWER(CONCAT('%', :query, '%'))) OR " +
            "(:query IS NULL OR :query='' OR LOWER(b.bic) like LOWER(CONCAT('%', :query, '%')))")
    List<Bank> findAll(String query);

}
