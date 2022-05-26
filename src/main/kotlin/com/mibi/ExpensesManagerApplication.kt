package com.mibi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExpensesManagerApplication

fun main(args: Array<String>) {
    runApplication<ExpensesManagerApplication>(*args)
}
