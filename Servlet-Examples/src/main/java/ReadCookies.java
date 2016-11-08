import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * @author Xavi Torrens
 */
public class ReadCookies extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {


        List<CookieContainer> cookienames = new ArrayList<CookieContainer>();
        // Get an array of Cookies associated with this domain
        for (Cookie cookie : request.getCookies()){
            CookieContainer cookieCt = new CookieContainer(cookie.getName(),cookie.getValue());

            cookienames.add(cookieCt);

        }

        request.setAttribute("cookiesArray",cookienames);

        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/cookiesView.jsp");
        rd.forward(request,response);

    }
}
