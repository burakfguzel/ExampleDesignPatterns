/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kahveci;

/**
 *
 * @author BurakFircasiguzel
 */
public class Krema implements IKahve {

    IKahve _kahve ;

    public Krema (IKahve kahve) {
        _kahve = kahve;
    }

    @Override
    public double ucret() {
        
        return 3.00+_kahve.ucret();
    }

    @Override
    public String aciklama() {
        return "kremalı "+_kahve.aciklama();
    }

}
