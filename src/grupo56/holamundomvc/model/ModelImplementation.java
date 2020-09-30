/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.holamundomvc.model;

/**
 *
 * @author lorena
 */
public class ModelImplementation implements Model {
    private final String greeting;

    public ModelImplementation() {
        this.greeting = "Hello World!";
    }
    
    @Override
    public String getGreeting() {
        return greeting;
    }
}
