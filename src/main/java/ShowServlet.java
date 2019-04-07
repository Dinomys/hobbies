import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/show1")
public class ShowServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] hobbies = req.getParameterValues("hobby");

        if (req.getParameterValues("hobby") == null || hobbies.length == 0)
            req.getRequestDispatcher("showError.jsp").forward(req, resp);

        HttpSession session = req.getSession();

        req.getRequestDispatcher("show.jsp").forward(req, resp);
    }
}
