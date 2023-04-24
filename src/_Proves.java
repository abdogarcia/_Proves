// he afegit línia pep
import Teclat.*;
import java.util.logging.Logger;
import java.util.ArrayList;
class kk{
    //kk

    private static final Logger LOG = Logger.getLogger(kk.class.getName());
    
    
    
}
class Cotxe {

    private static final Logger LOGGER = Logger.getLogger(Cotxe.class.getName());

    public void proves() {
        System.out.println("---");
        LOGGER.info("Això és un missatge d'informació.");
        System.out.println("---");
         LOGGER.severe("Això és un missatge d'error.");
        System.out.println("---");
        LOGGER.warning("Això és un missatge d'avís.");
        System.out.println("---");
       

    }
}

class _Proves {

    public static void main(String[] args) {
        Cotxe c1 = new Cotxe();

        c1.proves();
        //final Logger LOG = Logger.getLogger("adf");

    }

}
