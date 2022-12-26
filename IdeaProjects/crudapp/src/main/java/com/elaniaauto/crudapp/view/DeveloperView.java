package com.elaniaauto.crudapp.view;

import com.elaniaauto.crudapp.controller.DeveloperController;
import com.elaniaauto.crudapp.controller.SkillController;
import com.elaniaauto.crudapp.model.Developer;
import com.elaniaauto.crudapp.model.Skill;

import java.util.Scanner;

public class DeveloperView {
    Scanner scanner;
    private DeveloperController developerController = new DeveloperController();

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

        System.out.println("Введите id List для Developer");


        developerController.create(developerToSave);
    }

    private void updateDeveloper(){
        scanner = new Scanner(System.in);

        System.out.println("Введите id Skill для обновления ");
        Integer id = scanner.nextInt();

        System.out.println("Введите новое название Skill");
        String nameSkill = scanner.next();

        Developer developerToSave = new Developer(id, nameSkill, );

        developerController.update(skillToSave);
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
}
