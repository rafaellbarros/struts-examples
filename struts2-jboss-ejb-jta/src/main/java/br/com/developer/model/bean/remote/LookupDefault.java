package br.com.developer.model.bean.remote;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface LookupDefault<T> {

    default T lookupDefaultBean(String lookup) {
        try {
            InitialContext ic = new InitialContext();
            return (T) ic.lookup(lookup);
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
