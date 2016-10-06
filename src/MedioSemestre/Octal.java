/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedioSemestre;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author Qyo_J
 */
public class Octal implements Runnable {

    int Tamano;
    int[] a;
    int x;

    Octal(int i, CyclicBarrier barrera2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {

        for (int i = 0; i < Tamano; i++) {

            a[i] = 0;

        }

        int j = 0;

        while (0 != x) {

            if (0 != x % 8) {

                a[j++] = x % 8;

                x -= x % 8;

                x /= 8;

            } else {

                a[j++] = 0;

                x /= 8;

            }

        }

    }

}
