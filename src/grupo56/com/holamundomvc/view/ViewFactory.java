/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.view;

/**
 * View factory to create different views.
 * @author Martin Angulo
 */
public class ViewFactory {
    public enum types{TEXT, WINDOW};
    
    //Singleton pattern
    private static ViewFactory instance;
    protected ViewFactory(){}
    public static  ViewFactory getInstance() {
        if(instance == null)
            instance = new ViewFactory();
        return instance;
    }
    //Singleton pattern
    
    /**
     * Returns a new view from the specified type.
     * @param type Type of the view to create.
     * @return The new view of the specified type.
     */
    public View getView(types type) {
        switch(type) {
            case TEXT:
                return new TextView();
            case WINDOW:
                return new WindowView();
            default:
                return new TextView();
        }
    }
}
