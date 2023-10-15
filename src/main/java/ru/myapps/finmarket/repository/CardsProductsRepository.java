package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.CardsProduct;

@Repository
public interface CardsProductsRepository extends JpaRepository<CardsProduct, Long> {
}
