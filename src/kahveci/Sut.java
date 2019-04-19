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
public class Sut implements IKahve {

    IKahve _kahve ;

    public Sut (IKahve kahve) {
        _kahve = kahve;
    }

    @Override
    public double ucret() {
        
        return 2.00+_kahve.ucret();
    }

    @Override
    public String aciklama() {
        return "sutlu "+_kahve.aciklama();
    }

}
