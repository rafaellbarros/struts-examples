package br.com.developer.util;

import lombok.extern.log4j.Log4j2;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Log4j2
public class LogUtil {

    public static void info(String msg) {
        log.info("*** ### ************************* "+ msg +" ************************* ### ***");
    }
}
