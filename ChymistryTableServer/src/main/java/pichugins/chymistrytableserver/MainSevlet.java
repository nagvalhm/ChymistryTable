/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pichugins.chymistrytableserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONObject;

import pichugins.chymistrytableserver.dataObjects.RequestMessage;

/**
 *
 * @author Никита
 */
public class MainSevlet extends HttpServlet{
   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
        String query = req.getParameter("number");    
        
        PrintWriter out = resp.getWriter();
        out.print("<h1>input number = "+query+"</h1>");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
