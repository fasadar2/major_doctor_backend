package org.backend.dispatcher.service;

import lombok.RequiredArgsConstructor;
import org.backend.dispatcher.entity.Qualification;
import org.backend.dispatcher.repository.QualificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QualificationService {
    @Autowired
    QualificationRepository qualificationRepository;
    public Qualification GetQualificationById(int id)
    {
        return qualificationRepository.findQualificationById(id);
    }
    public List<Qualification> GetAll(){
        return qualificationRepository.findAll();
    }
}
