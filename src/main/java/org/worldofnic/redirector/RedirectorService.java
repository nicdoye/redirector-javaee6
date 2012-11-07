package org.worldofnic.redirector;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * A simple CDI service which is able to generate a redirection
 * 
 * @author Nic Doye
 * @author Pete Muir
 * 
 */
public class RedirectorService {

	static String DEFAULT_HOSTNAME = "example.com";
	static String DEFAULT_PROTOCOL = "http://";

	String hostnameinator(String urlString) {
		String hostname;
		try {
			URL url = new URL(urlString);
			hostname = url.getHost();
		} catch (MalformedURLException e) {
			hostname = DEFAULT_HOSTNAME;
		}
		return hostname;
	}

	String redirectorURL(String urlString, String servletPath) {
		return DEFAULT_PROTOCOL + wwwinator(urlString) + servletPath;
	}

	String wwwinator(String urlString) {
		return "www." + hostnameinator(urlString);
	}

	String redirectorURL(String urlString, String servletPath,
			String queryString) {
		return redirectorURL(urlString, servletPath
				+ ((queryString == null) ? "" : "?" + queryString));
	}
}
