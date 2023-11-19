package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.Promo;

@Repository
public interface PromoRepository extends JpaRepository<Promo, Long> {

}
