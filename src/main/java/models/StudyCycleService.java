package models;

import org.springframework.stereotype.Service;

@Service
public class StudyCycleService {
    private StudyCycleRepository studyCycleRepository;

    public StudyCycleService(StudyCycleRepository repository){
        this.studyCycleRepository = repository;
    }
}
