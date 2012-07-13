import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet

/**
 * @author wolfs
 */
class RunJetty {

  static main(args) {
    def springContext = new AnnotationConfigWebApplicationContext(annotatedClasses: [AppContext])
    def servlet = new DispatcherServlet(springContext)

    def server = new Server(8080)
    def servletHandler= new ServletContextHandler()
    def holder = new ServletHolder(name: 'spring', servlet: servlet)
    servletHandler.addServlet(holder, '/spring/*')
    server.handler = servletHandler

    server.start()
  }
}
