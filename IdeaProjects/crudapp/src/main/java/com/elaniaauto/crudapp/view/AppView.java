package com.elaniaauto.crudapp.view;

import com.elaniaauto.crudapp.model.Developer;
import com.elaniaauto.crudapp.model.Skill;
import com.elaniaauto.crudapp.model.Specialty;

public class AppView {

    SkillView skillView = new SkillView();
    SpecialtyView specialtyView = new SpecialtyView();
    DeveloperView developerView = new DeveloperView();
    public void mainWorkProgram(){
        skillView.workProgram();
        specialtyView.workProgram();
        developerView.workProgram();
    }
}
