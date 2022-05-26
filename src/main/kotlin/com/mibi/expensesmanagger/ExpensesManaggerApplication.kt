package com.mibi.expensesmanagger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExpensesManaggerApplication

fun main(args: Array<String>) {
    runApplication<ExpensesManaggerApplication>(*args)
}
