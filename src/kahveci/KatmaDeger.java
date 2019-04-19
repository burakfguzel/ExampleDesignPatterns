/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kahveci;

public class KatmaDeger {

    private static KatmaDeger instance = new KatmaDeger();

    private KatmaDeger() {
    }

    public static KatmaDeger getInstance() {
        return instance;
    }

    public double getVergi(double fiyat) {
        return fiyat+(fiyat*8/100);
    }
}
