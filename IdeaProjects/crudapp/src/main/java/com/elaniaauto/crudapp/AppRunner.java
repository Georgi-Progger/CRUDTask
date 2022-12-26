package com.elaniaauto.crudapp;

import com.elaniaauto.crudapp.model.Developer;
import com.elaniaauto.crudapp.model.Skill;
import com.elaniaauto.crudapp.model.Specialty;
import com.elaniaauto.crudapp.model.Status;
import com.elaniaauto.crudapp.repository.DeveloperRepository;
import com.elaniaauto.crudapp.repository.SkillRepository;
import com.elaniaauto.crudapp.repository.SpecialtyRepository;
import com.elaniaauto.crudapp.repository.gson.GsonDeveloperImpl;
import com.elaniaauto.crudapp.repository.gson.GsonSkillRepositoryImpl;
import com.elaniaauto.crudapp.repository.gson.GsonSpecialtyImpl;
import com.elaniaauto.crudapp.view.AppView;

import java.util.List;

public class AppRunner {
    public static void main(String[] args) {

        AppView appView = new AppView();
        appView.mainWorkProgram();







//
//        DeveloperRepository developerRepository = new GsonDeveloperImpl();
//
//        Developer developerToSave = new Developer();
//        developerToSave.setLastName("Mihail");
//        developerToSave.setFirstName("Huga");
//        developerToSave.setSkills(skillRepository.getAll());
//        developerToSave.setStatus(Status.ACTIVE);
//
//        Developer createdDevelopers = developerRepository.save(developerToSave);
    }
}
