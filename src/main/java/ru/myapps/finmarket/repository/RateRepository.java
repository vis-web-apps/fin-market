package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.Rate;

import java.util.List;

@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {

    public List<Rate> findAllByOrderByStartDateTimeDesc();
}
