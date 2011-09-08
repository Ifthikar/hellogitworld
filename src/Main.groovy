import static Square.square
import static Division.divide
import static Subtract.subtract
import static Sum.sum

def name = "Kristian"
int programmingPoints = 2000

println "Hello ${name}"
println "${name} has at least ${programmingPoints} programming points."
println "${programmingPoints} squared is ${square(programmingPoints)}"
println "${programmingPoints} divided by 2 bonus points is ${divide(programmingPoints, 2)}"
println "${programmingPoints} minus 7 bonus points is ${subtract(programmingPoints, 7)}"
println "${programmingPoints} plus 3 bonus points is ${sum(programmingPoints, 3)}"
//New feature!
println "${programmingPoints} plus 5 bonus points is ${sum(programmingPoints, 5)}"
//New feature 2
println "${programmingPoints} plus 6 bonus points is ${sum(programmingPoints, 6)}"