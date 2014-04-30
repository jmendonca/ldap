package com.apress.pss.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/operador/hello"})
public class OperadorServlet extends HttpServlet {

	private static final long serialVersionUID = 2218168052197231866L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		try {
			response.getWriter().write("Perfil [ Operador ]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
