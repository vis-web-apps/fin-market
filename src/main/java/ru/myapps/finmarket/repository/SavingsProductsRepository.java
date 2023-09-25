package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.SavingsProduct;

@Repository
public interface SavingsProductsRepository extends JpaRepository<SavingsProduct, Long> {

}
