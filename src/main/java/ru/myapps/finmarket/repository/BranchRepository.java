package ru.myapps.finmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.myapps.finmarket.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {
}
