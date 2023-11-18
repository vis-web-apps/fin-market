package ru.myapps.finmarket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.myapps.finmarket.dto.BranchDto;
import ru.myapps.finmarket.entity.Branch;
import ru.myapps.finmarket.repository.BranchRepository;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class BranchService {

    private final BranchRepository branchRepository;

    public void create(BranchDto dto) {
        branchRepository.save(convert(new Branch(), dto));
    }

    @Transactional
    public void edit(BranchDto dto) {
        Branch branch = branchRepository.findById(dto.getId()).orElseThrow(EntityNotFoundException::new);

        branchRepository.save(convert(branch, dto));
    }

    public void delete(Long id) {
        branchRepository.deleteById(id);
    }

    private Branch convert(Branch branch, BranchDto branchDto) {

        branch.setName(branchDto.getName());
        branch.setBic(branchDto.getBic());
        branch.setBank(branchDto.getBank());
        branch.setAddress(branchDto.getAddress());
        branch.setSchedule(branchDto.getSchedule());
        branch.setContactPhone(branchDto.getContactPhone());
        branch.setContactEmail(branchDto.getContactEmail());

        return branch;
    }
}
