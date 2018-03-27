package menu;

import org.academiadecodigo.haltistas.Controller;
import org.academiadecodigo.haltistas.menu.Menu;

public class MenuTest {

    public static void main(String[] args) {

       Menu menu = new Menu();
       menu.init();
       new Controller(menu).init();
    }
}
