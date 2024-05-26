package org.backend.dispatcher.controller;

import org.backend.dispatcher.entity.Qualification;
import org.backend.dispatcher.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/qualification")
@CrossOrigin(origins = "http://localhost:4401")
public class QualificationController {
    @Autowired
    QualificationService qualificationService;
    @GetMapping(path = "/get-all")
    public List<Qualification> GetAllQualification()
    {
        return qualificationService.GetAll();
    }
}
