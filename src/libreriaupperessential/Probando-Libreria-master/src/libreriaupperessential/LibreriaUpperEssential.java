/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaupperessential;
import Vista.Inicio;
import UpperEssential.UpperEssentialLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class LibreriaUpperEssential {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
       
        
        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel());
//        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\OmarGuevara\\Documents\\NetBeansProjects\\LibreriaUpperEssential\\Librerias\\darwinomarticsblack2.theme"));
//        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\OmarGuevara\\Documents\\NetBeansProjects\\LibreriaUpperEssential\\Librerias\\darwinomarticsblack1.theme"));
//        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\OmarGuevara\\Documents\\NetBeansProjects\\LibreriaUpperEssential\\Librerias\\Chocolate.theme"));
//        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\OmarGuevara\\Documents\\NetBeansProjects\\LibreriaUpperEssential\\Librerias\\Monica.theme"));
//        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\OmarGuevara\\Documents\\NetBeansProjects\\LibreriaUpperEssential\\Librerias\\Veronica.theme"));
//        UIManager.setLookAndFeel(new UpperEssentialLookAndFeel("C:\\Users\\OmarGuevara\\Documents\\NetBeansProjects\\LibreriaUpperEssential\\Librerias\\probando2.theme"));
        
        
        Inicio lib = new Inicio();
        lib.setLocationRelativeTo(null);
        lib.setVisible(true);
    }
}
