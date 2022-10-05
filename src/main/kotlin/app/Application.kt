package app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class DmpKeyManagerApplication

fun main(args: Array<String>) {
    runApplication<DmpKeyManagerApplication>(*args)
}
