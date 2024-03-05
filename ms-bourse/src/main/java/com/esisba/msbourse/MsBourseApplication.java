package com.esisba.msbourse;

import com.esisba.msbourse.Entities.Etudiant;
import com.esisba.msbourse.Entities.Virement;
import com.esisba.msbourse.Repositories.EtudiantRepository;
import com.esisba.msbourse.Repositories.VirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.Date;

@SpringBootApplication
@EnableFeignClients
public class MsBourseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MsBourseApplication.class, args);
    }
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    VirementRepository virementRepository;

    @Override
    public void run(String... args) throws Exception {
        Etudiant etudiant1 = new Etudiant(null, 123456789L, 1000.0f, true, null);
        Etudiant etudiant2 = new Etudiant(null, 987654321L, 2000.0f, false, null);
        etudiantRepository.save(etudiant1);
        etudiantRepository.save(etudiant2);
        Virement virement1 = new Virement(null, 100.0f, new Date(), etudiant1);
        Virement virement2 = new Virement(null, 200.0f, new Date(), etudiant2);

        virementRepository.save(virement1);
        virementRepository.save(virement2);

    }
}
