/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.controller;

import grupo56.com.holamundomvc.model.Model;
import grupo56.com.holamundomvc.view.View;

/**
 *
 * @author Martin programacion a pares roles: conductor: lorena observador:
 * martin
 */
public class Controller {

    /*
     * shows the greeting from the model
     * @param model model to use
     * @param view view to use
     */
    
    public void run(Model model, View view) {
        view.showGreeting(model.getGreeting());
    }

}
