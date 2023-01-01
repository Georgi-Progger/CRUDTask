package com.elaniaauto.crudapp.view;

import com.elaniaauto.crudapp.controller.DeveloperController;
import com.elaniaauto.crudapp.controller.SkillController;
import com.elaniaauto.crudapp.controller.SpecialtyController;
import com.elaniaauto.crudapp.model.Developer;
import com.elaniaauto.crudapp.model.Skill;
import com.elaniaauto.crudapp.model.Specialty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeveloperView {
    Scanner scanner;
    private DeveloperController developerController = new DeveloperController();
    private SkillController skillController = new SkillController();
    private SpecialtyController specialtyController = new SpecialtyController();

    public void workProgram(){
        while (true){
            writeNewDeveloper();
            updateDeveloper();
            deleteDeveloper();
            getAllDeveloper();
            break;
        }
    }
    private void writeNewDeveloper(){
        scanner = new Scanner(System.in);

        Developer developerToSave = new Developer();

        System.out.println("Введите firstName для Developer");
        String firstNameDeveloper = scanner.nextLine();
        developerToSave.setFirstName(firstNameDeveloper);

        System.out.println("Введите lastName для Developer");
        String lastNameDeveloper = scanner.nextLine();
        developerToSave.setFirstName(lastNameDeveloper);

        System.out.println("Введите Id Skill для Developer");
        List<Skill> skill = skillRead();
        developerToSave.setSkills(skill);

        System.out.println("Введите Id Specialty для Developer");
        Specialty specialty = specialtyRead();
        developerToSave.setSpecialty(specialty);

        developerController.create(developerToSave);
    }

    private void updateDeveloper(){
        scanner = new Scanner(System.in);

        System.out.println("Введите id Developer для обновления ");
        Integer id = scanner.nextInt();

        System.out.println("Введите новое firstName Developer");
        String firstNameDeveloper = scanner.next();

        System.out.println("Введите новое lastName Developer");
        String lastNameDeveloper = scanner.next();

        System.out.println("Введите новое Id Skill для Developer");
        List<Skill>  skillDeveloper = skillRead();

        System.out.println("Введите новое название Developer");
        Specialty specialtyDeveloper = specialtyRead();
        
        Developer developerToSave = new Developer(id, firstNameDeveloper, lastNameDeveloper, skillDeveloper, specialtyDeveloper);

        developerController.update(developerToSave);
    }

    private void deleteDeveloper(){
        scanner = new Scanner(System.in);
        System.out.println("Введите id Developer для удаления");
        Integer id = scanner.nextInt();

        developerController.delete(id);
    }

    private void getAllDeveloper(){
        developerController.readAll();
    }

    private List<Skill> skillRead(){
        scanner = new Scanner(System.in);

        List<Skill> currentDeveloperSkills = new ArrayList<>();

        while (true) {
            System.out.println("Введите id Skill");
            System.out.println(skillController.readAll());
            final int skillId = scanner.nextInt();
            currentDeveloperSkills.add(skillController.read(skillId));
            break;
            }
        return currentDeveloperSkills;
    }

    private Specialty specialtyRead(){
        scanner = new Scanner(System.in);


        System.out.println("Введите Id Specialty");
        System.out.println(specialtyController.readAll());
        final int specialtyId = scanner.nextInt();

        return specialtyController.read(specialtyId);
    }
}
