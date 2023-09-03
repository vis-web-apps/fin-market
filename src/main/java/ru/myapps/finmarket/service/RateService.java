package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.myapps.finmarket.dto.RateDto;
import ru.myapps.finmarket.entity.Rate;
import ru.myapps.finmarket.repository.RateRepository;

import java.util.*;

@Service
@RequiredArgsConstructor
public class RateService {

    private final RateRepository repository;

    public List<Rate> getAllRates() {
        return repository.findAllByOrderByStartDateTimeDesc();
    }

    public Map<String, List<RateDto>> getRubRates2(String query) {
        List<RateDto> dtos = getRateDtoList(query);
        Map<String, List<RateDto>> result = new HashMap<>();

        dtos.forEach(dto -> {
            if (result.containsKey(dto.getBankName())){
                result.get(dto.getBankName()).add(dto);
            } else {
                List<RateDto> dtoList= new ArrayList<>();
                dtoList.add(dto);

                result.put(dto.getBankName(), dtoList);
            }
        });

        return result;
    }

    private List<RateDto> getRateDtoList(String query) {
        List<RateDto> rateDtoList = new ArrayList<>();

        List<Rate> rates = repository.getRubRates("RUB", query);

        rates.forEach(rate -> {
            Optional<RateDto> optionalRateDto = rateDtoList.stream().filter(dto -> dto.getBankName().equals(rate.getBank().getName()) &&
                    dto.getCurrencyName().equals(rate.getBasedCurrency().getIsoLat3())).findFirst();

            if (optionalRateDto.isPresent()) {
                RateDto rateDto = optionalRateDto.get();

                if (rate.isBuyRate()) {
                    rateDto.setBuySum(rate.getRate().toString());
                } else {
                    rateDto.setSaleSum(rate.getRate().toString());
                }

                rateDtoList.set(rateDtoList.indexOf(optionalRateDto.get()), rateDto);
            } else {
                RateDto rateDto = new RateDto(rate.getBank().getName(), rate.getBasedCurrency().getIsoLat3());

                if (rate.isBuyRate()) {
                    rateDto.setBuySum(rate.getRate().toString());
                } else {
                    rateDto.setSaleSum(rate.getRate().toString());
                }

                rateDtoList.add(rateDto);
            }

        });

        return rateDtoList;
    }
}
