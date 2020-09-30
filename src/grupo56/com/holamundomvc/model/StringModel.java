/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.model;

/**
 * Model implementation that returns a greeting saved in the model.
 * @author Martin Angulo
 */
public class StringModel implements Model {
    
    private final String greeting;

    /**
     * StringModel constructor, sets greeting to default.
     */
    public StringModel() {
        this.greeting = "Hello World!";
    }
    
    @Override
    public String getGreeting() {
        return greeting;
    }
}
