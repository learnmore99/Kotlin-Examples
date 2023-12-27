package com.example.kotlinprograms1

import java.util.Scanner
import kotlin.system.exitProcess

fun main() {
    while (true) {
        val scanner = Scanner(System.`in`)
        print ("Enter your Choice\nPress: \n1 - Rock \n2 - Paper \n3- Scissor\n")
        val yourChoice = readlnOrNull()
        val computerChoiceNum = (1..3).random()
        var computerChoice = ""
        when (computerChoiceNum) {
            1 -> {
                computerChoice = "Rock"
                println ("Computer has chosen for Rock\n")
            }
            2 -> {
                computerChoice = "Paper"
                println ("Computer has chosen for Paper\n")
            }
            3 -> {
                computerChoice = "Scissor"
                println ("Computer has chosen for Scissor\n")
            }
        }
        val winner = when {
            yourChoice == computerChoice -> "Tie"
            yourChoice == "Rock" && computerChoice == "Scissor" -> "Player"
            yourChoice == "Scissor" && computerChoice == "Paper" -> "Player"
            yourChoice == "Paper" && computerChoice == "Rock" -> "Player"
            else -> "Computer"
        }
        if (winner == "Player") println("Congratulation! You won the game")
        else if (winner == "Tie") println("Match is Tied")
        else println("Uff! You lost the game\n")
        while (true) {
            println("Please press : \nY for Replay\nN for Exit")
            val input = scanner.nextLine()
            if (input.equals("Y", ignoreCase = true)) {
                println("Replaying Game.... \n")
                break
            } else if (input.equals("N", ignoreCase = true)) {
                println("Exiting Game....")
                exitProcess (0)
            } else println("$input is Not a valid Input, Please Re Enter")
        }
    }
}
