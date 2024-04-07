/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataHandling;
import java.io.Serializable;

/**
 *
 * @author jarlc
 */
public class Florist implements Serializable{
    private String name;
    private float cost;

    public Florist(String name, float cost) {
        this.name = name;
        this.cost = cost;
    }

    public Florist() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
}
