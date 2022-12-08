package _01_mvc;

import _01_mvc.controller.MainController;

public class MainApp
{
    static MainController controller = new MainController();
    public static void main( String[] args ) {
        controller.personErfassen();
    }
}
