/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsfCalculator;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author User
 */
@Named(value = "jSFManagedBean")
@RequestScoped
public class JSFManagedBean {

    private double parameter1;
    private double parameter2;
    private String result;
    public JSFManagedBean() {
    }

    public double getParameter1() {
        return parameter1;
    }

    public void setParameter1(double parameter1) {
        this.parameter1 = parameter1;
    }

    public double getParameter2() {
        return parameter2;
    }

    public void setParameter2(double parameter2) {
        this.parameter2 = parameter2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    public void add(){
        result = Double.toString(parameter1 + parameter2);
        
    }

    public void subtract(){
        result = Double.toString(parameter1 - parameter2);
    }

    public void multiply(){
        result = Double.toString(parameter1 * parameter2);
    }

    public void divide(){
        result = parameter2 == 0 ? "Divide by zero Error" : Double.toString(parameter1 / (double)parameter2);
    
    }
}
