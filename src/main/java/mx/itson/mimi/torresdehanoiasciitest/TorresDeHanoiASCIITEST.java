/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.mimi.torresdehanoiasciitest;

/**
 *
 * @author Propietario
 */
import java.util.ArrayList;
import java.util.List;

public class TorresDeHanoiASCIITEST {

    private List<Integer>[] torres;  
    private int numDiscos;

    public TorresDeHanoiASCIITEST(int numDiscos) {
        this.numDiscos = numDiscos;
        torres = new ArrayList[3];
        for (int i = 0; i < 3; i++) torres[i] = new ArrayList<>();
        for (int i = numDiscos; i > 0; i--) torres[0].add(i);
        dibujarTorres();
    }

    public void resolverHanoi(int n, int origen, int destino, int auxiliar) {
        if (n == 1) moverDisco(origen, destino);
        else {
            resolverHanoi(n - 1, origen, auxiliar, destino);
            moverDisco(origen, destino);
            resolverHanoi(n - 1, auxiliar, destino, origen);
        }
    }

    private void moverDisco(int origen, int destino) {
        torres[destino].add(torres[origen].remove(torres[origen].size() - 1));
        dibujarTorres();
    }

    private void dibujarTorres() {
        System.out.println("Torres de Hanoi:");
        for (int i = numDiscos; i > 0; i--) {
            for (int j = 0; j < 3; j++) {
                if (torres[j].size() >= i) {
                    int disco = torres[j].get(i - 1);
                    System.out.print(" ".repeat(numDiscos - disco) + "=".repeat(disco * 2) + " ".repeat(numDiscos - disco));
                } else {
                    System.out.print(" ".repeat(numDiscos) + "|" + " ".repeat(numDiscos));
                }
            }
            System.out.println();
        }
        System.out.println("-".repeat(numDiscos * 2 + 1) + "   ".repeat(3));
    }

    public static void main(String[] args) {
        TorresDeHanoiASCIITEST hanoi = new TorresDeHanoiASCIITEST(3);
        hanoi.resolverHanoi(3, 0, 2, 1);
    }
}
