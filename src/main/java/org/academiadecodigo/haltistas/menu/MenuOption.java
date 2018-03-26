package org.academiadecodigo.haltistas.menu;

public enum MenuOption {

    MOVE ("Move"),
    ATTACK ("Attack"),
    DEFEND ("Defend");

    private String option;

    MenuOption(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }


}
