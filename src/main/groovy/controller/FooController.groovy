package controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import groovy.json.JsonBuilder

/**
 * @author wolfs
 */
@Controller
final class FooController{

  @RequestMapping( value = "foo",method = RequestMethod.GET )
  @ResponseBody
  public final String getAll(){
    new JsonBuilder()(['Test1', 'Test2']).toString()
  }
}
