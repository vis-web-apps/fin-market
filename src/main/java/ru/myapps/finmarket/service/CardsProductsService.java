package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.myapps.finmarket.dto.CardProductDto;
import ru.myapps.finmarket.entity.CardsProduct;
import ru.myapps.finmarket.repository.CardsProductsRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CardsProductsService {

    private final CardsProductsRepository repository;

    public List<CardsProduct> getAllCardsProducts() {
        return repository.findAll();
    }

    public void create(CardProductDto dto) {
        CardsProduct cardsProduct = new CardsProduct();

        repository.save(convert(cardsProduct, dto));
    }

    @Transactional
    public void edit(CardProductDto dto) {
        CardsProduct cardsProduct = repository.findById(dto.getId()).orElseThrow(EntityNotFoundException::new);

        repository.save(convert(cardsProduct, dto));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    private CardsProduct convert(CardsProduct cardsProduct, CardProductDto dto) {
        cardsProduct.setName(dto.getName());
        cardsProduct.setBank(dto.getBank());
        cardsProduct.setWebsiteLink(dto.getInfoUrl());
        cardsProduct.setCashback(dto.isCashback());
        cardsProduct.setMiles(dto.isMile());
        cardsProduct.setPoints(dto.isPoint());
        cardsProduct.setServiceFree(dto.isFree());

        return cardsProduct;
    }
}
