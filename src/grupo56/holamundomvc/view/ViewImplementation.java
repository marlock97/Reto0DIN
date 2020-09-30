/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.holamundomvc.view;

/**
 * implementa la view en interfaz tipo texto
 *
 * @author Lorena Fernández Íñigo
 */
public class ViewImplementation implements View {

    /**
     * Enseña el greeting por pantalla
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }

}
