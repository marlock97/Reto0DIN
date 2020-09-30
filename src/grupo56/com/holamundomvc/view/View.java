/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.view;

/**
 * Contains the showGreeting method to be used by a controller.
 * @author Martin Angulo
 */
public interface View {
    
    /**
     * Shows a greeting in the UI.
     * @param greeting A String containing the greeting to show.
     */
    public void showGreeting(String greeting);
}
