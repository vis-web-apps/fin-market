package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.myapps.finmarket.dto.PromoDto;
import ru.myapps.finmarket.entity.Promo;
import ru.myapps.finmarket.repository.PromoRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PromoService {

    private final PromoRepository promoRepository;

    public List<Promo> getAllPromos() {
        return promoRepository.findAll();
    }

    public void create(PromoDto dto) {
        promoRepository.save(convert(new Promo(), dto));
    }

    @Transactional
    public void edit(PromoDto dto) {
        Promo promo = promoRepository.findById(dto.getId()).orElseThrow(EntityNotFoundException::new);

        promoRepository.save(convert(promo, dto));
    }

    public void delete(Long id) {
        promoRepository.deleteById(id);
    }

    private Promo convert(Promo promo, PromoDto dto) {
        promo.setBank(dto.getBank());
        promo.setPromoName(dto.getPromoName());
        promo.setPromoText(dto.getPromoText());

        return promo;
    }
}
