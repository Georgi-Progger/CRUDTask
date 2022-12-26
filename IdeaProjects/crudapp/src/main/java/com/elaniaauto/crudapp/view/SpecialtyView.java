package com.elaniaauto.crudapp.view;

import com.elaniaauto.crudapp.controller.SkillController;
import com.elaniaauto.crudapp.controller.SpecialtyController;
import com.elaniaauto.crudapp.model.Skill;
import com.elaniaauto.crudapp.model.Specialty;

import java.util.Scanner;

public class SpecialtyView {
    Scanner scanner;
    private SpecialtyController specialtyController = new SpecialtyController();

    public void workProgram(){
        while (true){
            writeNewSpecialty();
            updateSpecialty();
            deleteSpecialty();
            getAllSpeciality();
            break;
        }
    }
    private void writeNewSpecialty(){
        scanner = new Scanner(System.in);
        Specialty specialtyToSave = new Specialty();
        System.out.println("Введите название Specialty");
        String nameSpecialty = scanner.nextLine();
        specialtyToSave.setName(nameSpecialty);

        specialtyController.create(specialtyToSave);

    }

    private void updateSpecialty(){
        scanner = new Scanner(System.in);
        System.out.println("Введите id Specialty для обновления ");
        Integer id = scanner.nextInt();
        System.out.println("Введите новое название Specialty");
        String nameSpecialty = scanner.next();
        Specialty specialtyToSave = new Specialty(id, nameSpecialty);

        specialtyController.update(specialtyToSave);
    }

    private void deleteSpecialty(){
        scanner = new Scanner(System.in);
        System.out.println("Введите id Specialty для удаления");
        Integer id = scanner.nextInt();

        specialtyController.delete(id);
    }

    private void getAllSpeciality(){
        specialtyController.readAll();
    }
}
