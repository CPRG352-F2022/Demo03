package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Load a JSP and forward to the browser
        getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp").forward(request, response);
        return; // IMPORTANT! Stop the code call
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Capture incoming parameters as Strings
        String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        
        int test = testMethod(firstname);
        
        // Set attributes that can be sent to the browser with a requestDispatcher
        request.setAttribute("firstName", firstname);
        request.setAttribute("lastName", lastname);
        
        // validation: check to see if either input is null or blank
        if( firstname == null || firstname.equals("") || lastname == null || lastname.equals("") ){
            String message = "Please enter both your first and last name.";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/helloWorldForm.jsp").forward(request, response);
            return; //IMPORTANT!
        }
        
        // view the output in the console
        //System.out.println("Full Name: " + firstname + " " + lastname);
 
        // load the JSP and forward the request object,
        // which contains our attributes
        getServletContext().getRequestDispatcher("/WEB-INF/sayHello.jsp").forward(request, response);
        return;
        
    }

    
    public int testMethod(String test){
        System.out.println(test);
        return 5;
    }
    
}
