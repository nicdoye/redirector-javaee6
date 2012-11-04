package org.worldofnic.redirector;

/**
 * A simple CDI service which is able to say hello to someone
 * 
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
