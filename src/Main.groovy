import static Square.square
import static Division.divide
import static Subtract.subtract
import static Sum.sum

def name = "Manfred"
int programmingPoints = 3399

println "Hello ${name}. Hola in Spanish"

println "${name} has at least ${programmingPoints} programming points."
println "${programmingPoints} squared is ${square(programmingPoints)}"
println "${programmingPoints} divided by 2 bonus points is ${divide(programmingPoints, 2)}"
println "${programmingPoints} minus 7 bonus points is ${subtract(programmingPoints, 7)}"
println "${programmingPoints} plus 3 bonus points is ${sum(programmingPoints, 3)}"

def infiniteLevels = true
