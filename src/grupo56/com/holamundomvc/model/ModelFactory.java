/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.model;

/**
 * ModelFactory for model creation
 * @author matteo fdez
 * programacion a pares roles:
 * conductor: matteo
 * observador: martin
 */
public class ModelFactory {
    public enum types{TEXT};
    
    //Singleton pattern
    private static ModelFactory instance;
    protected ModelFactory(){}
    public static ModelFactory getInstance(){
         if(instance == null)
            instance = new ModelFactory();
        return instance;
    }
    /*
    * Returns text
    * 
    *
    */
    public Model getModel(types type){
        switch(type){
            case TEXT:
                return new StringModel();
            default:
                return new StringModel();
        }
    }
}
