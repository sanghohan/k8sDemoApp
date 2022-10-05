package app.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller() {

    @RequestMapping(path = ["/tester"], method = [RequestMethod.GET])
    fun tester(): String {

        return "test success!!"
    }
}
