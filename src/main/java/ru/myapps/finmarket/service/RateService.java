package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.myapps.finmarket.dto.RateDto;
import ru.myapps.finmarket.entity.Bank;
import ru.myapps.finmarket.entity.Currency;
import ru.myapps.finmarket.entity.Rate;
import ru.myapps.finmarket.repository.RateRepository;

import java.math.BigDecimal;
import java.util.*;

@Service
@RequiredArgsConstructor
public class RateService {

    private final RateRepository repository;
    private final BankService bankService;
    private final CurrencyService currencyService;

    public List<Rate> getAllRates() {
        return repository.findAllByOrderByStartDateTimeDesc();
    }

    public void createRate(Long bankId, Long currencyId, BigDecimal rateBuySum, BigDecimal rateSaleSum) {
        Bank bank = bankService.getById(bankId);
        Currency basedCurrency = currencyService.getCurrencyById(currencyId);
        Currency quoteCurrency = currencyService.getCurrencyByIsoLat3("RUB");

        Rate rate = new Rate();
        rate.setBank(bank);
        rate.setBasedCurrency(basedCurrency);
        rate.setQuoteCurrency(quoteCurrency);
        rate.setBuyRate(false);
        rate.setRate(rateSaleSum);
        rate.setLimitFrom(null);
        rate.setLimitTo(null);
        rate.setStartDateTime(new Date());

        Rate buyRate = new Rate();
        buyRate.setBank(bank);
        buyRate.setBasedCurrency(basedCurrency);
        buyRate.setQuoteCurrency(quoteCurrency);
        buyRate.setBuyRate(true);
        buyRate.setRate(rateBuySum);
        buyRate.setLimitFrom(null);
        buyRate.setLimitTo(null);
        buyRate.setStartDateTime(new Date());

        repository.save(rate);
        repository.save(buyRate);
    }

    public void editRate(Long bankId, String currencyName, BigDecimal rateBuySum, BigDecimal rateSaleSum) {
        repository.getRubRates("RUB", "").stream()
                .filter(rate -> rate.getBank().getId().equals(bankId) && rate.getBasedCurrency().getIsoLat3().equals(currencyName))
                .forEach(rate -> {
                    if (rate.isBuyRate()) {
                        rate.setRate(rateBuySum);
                    } else {
                        rate.setRate(rateSaleSum);
                    }
                    repository.save(rate);
                });
    }

    public void deleteRate(Long bankId, String currencyName) {
        repository.getRubRates("RUB", "").stream()
                .filter(rate -> rate.getBank().getId().equals(bankId) && rate.getBasedCurrency().getIsoLat3().equals(currencyName))
                .forEach(repository::delete);
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
            Optional<RateDto> optionalRateDto = rateDtoList.stream()
                    .filter(dto ->
                            dto.getBankName().equals(rate.getBank().getName()) &&
                            dto.getCurrencyName().equals(rate.getBasedCurrency().getIsoLat3()))
                    .findFirst();

            if (optionalRateDto.isPresent()) {
                RateDto rateDto = optionalRateDto.get();

                if (rate.isBuyRate()) {
                    rateDto.setBuySum(rate.getRate().toString());
                } else {
                    rateDto.setSaleSum(rate.getRate().toString());
                }

                rateDtoList.set(rateDtoList.indexOf(optionalRateDto.get()), rateDto);
            } else {
                RateDto rateDto = new RateDto(rate.getId(), rate.getBank().getId(), rate.getBank().getName(), rate.getBasedCurrency().getIsoLat3());

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
