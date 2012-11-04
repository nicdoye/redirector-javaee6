package org.worldofnic.redirector;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * A simple servlet taking advantage of features added in 3.0.
 * </p>
 * 
 * <p>
 * The servlet is registered and mapped to /HelloServlet using the {@linkplain WebServlet
 * @HttpServlet}. The {@link RedirectorService} is injected by CDI.
 * </p>
 * 
 * @author Pete Muir
 * 
 */
@SuppressWarnings("serial")
@WebServlet("/")
public class RedirectorServlet extends HttpServlet {

   @Inject
   RedirectorService redirectorService;

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   resp.sendRedirect( redirectorService.redirectorURL( req.getServletPath(), req.getQueryString()));
   }

}
