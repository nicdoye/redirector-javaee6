package org.worldofnic.redirector;

/**
 * A simple CDI service which is able to generate a redirection
 * 
 * @author Nic Doye
 * @author Pete Muir
 * 
 */
public class RedirectorService {

   String redirectorURL(String servletPath) {
      return "http://www.worldofnic.org" + servletPath ;
   }

   String redirectorURL(String servletPath, String queryString) {
	   return redirectorURL( servletPath + ( ( queryString == null ) ? "" : "?" + queryString ) );
   }
}
