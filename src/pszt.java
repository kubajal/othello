import view.*;
import controller.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pszt {

    public static void main(String[] args){

        System.out.println("test");
        MainWindow mainWindow = new MainWindow();
        Controller controller = new Controller(mainWindow);
    }
}
