/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 */
public class Figure {

    private String name;
    private String identifier;

    public Figure(String identifier, String name) {

        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    @Override
    public String toString() {
        return identifier + ": " + name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Figure)){
            return false;
        }
        
        Figure comparedFigure = (Figure) compared;
        
        return identifier.equals(comparedFigure.identifier);
        
        
        
    

}
}

