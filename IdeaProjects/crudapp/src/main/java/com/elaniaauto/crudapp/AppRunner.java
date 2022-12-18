package com.elaniaauto.crudapp;

import com.elaniaauto.crudapp.model.Skill;
import com.elaniaauto.crudapp.repository.SkillRepository;
import com.elaniaauto.crudapp.repository.gson.GsonSkillRepositoryImpl;

import java.util.List;

public class AppRunner {
    public static void main(String[] args) {
        SkillRepository skillRepository = new GsonSkillRepositoryImpl();

        Skill skillToSave = new Skill();
        skillToSave.setName("TEST_NAME");

        Skill createdSkill = skillRepository.save(skillToSave);
        System.out.println(createdSkill);
    }
}
