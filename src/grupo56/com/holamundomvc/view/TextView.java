/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.view;

/**
 * View impementation that shows a greeting on console.
 * @author Martin Angulo
 */
public class TextView implements View {
    /**
     * Shows a greeting in the UI.
     * @param greeting A String containing the greeting to show.
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
