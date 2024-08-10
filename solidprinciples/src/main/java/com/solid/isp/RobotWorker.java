package com.solid.isp;

/**
 * Clase que representa a un robot que solo trabaja.
 * 
 * author Andres Orozco
 */
public class RobotWorker implements Workable {

    @Override
    public void startWork() {
        System.out.println("El robot comienza a trabajar.");
    }

    @Override
    public void stopWork() {
        System.out.println("El robot deja de trabajar.");
    }
}