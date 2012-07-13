import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc

/**
 * @author wolfs
 */
@Configuration
@EnableWebMvc
@ComponentScan('controller')
class AppContext {
}
