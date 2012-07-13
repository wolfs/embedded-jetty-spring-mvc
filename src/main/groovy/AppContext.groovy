import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.context.annotation.ComponentScan

/**
 * @author wolfs
 */
@Configuration
@EnableWebMvc
@ComponentScan('controller')
class AppContext {
}
