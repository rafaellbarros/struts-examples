package br.com.developer.config;

import org.apache.struts2.dispatcher.servlet.StrutsServlet;

import javax.servlet.annotation.WebServlet;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@WebServlet(urlPatterns = { "*.action" })
public class Struts2AppServlet extends StrutsServlet {

    private static final long serialVersionUID = 4919365268043339311L;

}
