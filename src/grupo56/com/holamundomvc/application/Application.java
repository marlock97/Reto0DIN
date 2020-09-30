/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.application;

import grupo56.com.holamundomvc.model.Model;
import grupo56.com.holamundomvc.model.StringModel;
import grupo56.com.holamundomvc.view.View;
import grupo56.com.holamundomvc.view.ViewFactory;

/**
 * Application class with the main function.
 * @author Martin Angulo
 */
public class Application {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        View v = ViewFactory.getInstance().getView(ViewFactory.types.TEXT);
        Model m = new StringModel();
        
        v.showGreeting(m.getGreeting());
    }
}
