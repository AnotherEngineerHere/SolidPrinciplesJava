package com.solid.isp;

/**
 * Clase que representa a un empleado humano que trabaja y come.
 * 
 * author Andres Orozco
 */
public class HumanWorker implements Workable, Eatable {

    @Override
    public void startWork() {
        System.out.println("El empleado humano comienza a trabajar.");
    }

    @Override
    public void stopWork() {
        System.out.println("El empleado humano deja de trabajar.");
    }

    @Override
    public void startEating() {
        System.out.println("El empleado humano comienza a comer.");
    }
}