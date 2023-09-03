package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.Rate;

import java.util.List;

@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {

    List<Rate> findAllByOrderByStartDateTimeDesc();

    @Query("SELECT r FROM Rate r WHERE " +
            "r.quoteCurrency.isoLat3=:currency AND " +
            ":query IS NULL OR :query='' OR LOWER(r.bank.name) like LOWER(CONCAT('%', :query, '%'))")
    List<Rate> getRubRates(String currency, String query);
}
