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
    
    /**
     * Returns a new view.
     * @return
     */
    public View getView() {
        return new TextView();
    }
}
