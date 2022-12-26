package com.elaniaauto.crudapp.view;

import com.elaniaauto.crudapp.controller.SkillController;
import com.elaniaauto.crudapp.model.Skill;
import com.elaniaauto.crudapp.model.Status;

import java.util.Scanner;

public class  SkillView {
    Scanner scanner;
    private SkillController skillController = new SkillController();

    public void workProgram(){
        while (true){
            writeNewSkill();
            updateSkill();
            deleteSkill();
            getAllSkill();
            break;
        }
    }
    private void writeNewSkill(){
        scanner = new Scanner(System.in);
        Skill skillToSave = new Skill();
        System.out.println("Введите название Skill");
        String nameSkill = scanner.nextLine();
        skillToSave.setName(nameSkill);

        skillController.create(skillToSave);
    }

    private void updateSkill(){
        scanner = new Scanner(System.in);
        System.out.println("Введите id Skill для обновления ");
        Integer id = scanner.nextInt();
        System.out.println("Введите новое название Skill");
        String nameSkill = scanner.next();
        Skill skillToSave = new Skill(id, nameSkill);

        skillController.update(skillToSave);
    }

    private void deleteSkill(){
        scanner = new Scanner(System.in);
        System.out.println("Введите id Skill для удаления");
        Integer id = scanner.nextInt();

        skillController.delete(id);
    }

    private void getAllSkill(){
        skillController.readAll();
    }
}
