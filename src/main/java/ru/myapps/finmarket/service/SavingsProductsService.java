package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.myapps.finmarket.dto.SavingsProductDto;
import ru.myapps.finmarket.entity.SavingsProduct;
import ru.myapps.finmarket.repository.SavingsProductsRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SavingsProductsService {

    private final SavingsProductsRepository repository;

    public List<SavingsProduct> getAllSavingsProducts() {
        return repository.findAll();
    }

    public void create(SavingsProductDto dto) {
        SavingsProduct product = new SavingsProduct();

        repository.save(convert(product, dto));
    }

    @Transactional
    public void edit(SavingsProductDto dto) {
        SavingsProduct product = repository.findById(dto.getId()).orElseThrow(EntityNotFoundException::new);

        repository.save(convert(product, dto));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private SavingsProduct convert(SavingsProduct product, SavingsProductDto dto) {
        product.setName(dto.getName());
        product.setPromoInfo(dto.getPromo());
        product.setBank(dto.getBank());
        product.setCurrency(dto.getCurrency());
        product.setSum(dto.getSum());
        product.setRate(dto.getRate());

        return product;
    }
}
