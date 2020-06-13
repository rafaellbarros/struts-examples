package br.com.developer.action;

import com.ibm.icu.text.CharsetDetector;
import com.ibm.icu.text.CharsetMatch;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@Component
@Getter
@Setter
public class HelloWorldAction extends ActionSupport {

    private static final long serialVersionUID = 7475177902802386554L;

    private String param;
    private String titulo;
    private String showParam;

    @Override
    public String execute() throws Exception {

        String str = "Olá";
        setTitulo(str);
        System.out.println(str);

        CharsetDetector charsetDetector = new CharsetDetector();
        charsetDetector.setText(str.getBytes()); // Aqui você seta sua String
        CharsetMatch detect = charsetDetector.detect();

        System.out.println("chareset str => "+ detect.getName());

        if (Objects.nonNull(param)) {

            CharsetDetector charsetDetector1 = new CharsetDetector();
            String decodedToUTF8 = new String(param.getBytes("UTF-8"), "UTF-8");

            charsetDetector1.setText(decodedToUTF8.getBytes()); // Aqui você seta sua String
            CharsetMatch detect1 = charsetDetector1.detect();
            System.out.println("Param => " + decodedToUTF8);
            System.out.println("chareset Param => " + detect1.getName());
            setShowParam(decodedToUTF8);
        }

	    return SUCCESS;
    }

}
