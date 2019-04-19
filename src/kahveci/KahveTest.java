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
public class KahveTest {

    public static void main(String[]args){
        
        KatmaDeger katmaDegerObject = KatmaDeger.getInstance();
        IKahve kahve = new Kahve();
        Sut sut = new Sut(kahve);
        Krema krema = new Krema(sut);
        System.out.println(krema.aciklama()+"'ın fiyatı: "+krema.ucret()+"\nKDV (%8) Dahil Ücreti: "+katmaDegerObject.getVergi(krema.ucret())+" TL");
    }

}
