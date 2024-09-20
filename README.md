# unit 5-4-assignment

## DistanceFormula
Write a method that takes 2 coordinates in a 2D plane (x, y coordinates) and computes the distance between these two points, according to the distance formula, which is as follows:

$$D = \sqrt{\left(x_2-x_1\right)^2 + \left(y_2-y_1\right)^2} $$

This method must be named `distance()` and it must have 4 int parameters. The first parameter will be the x-coordinate of the first point,
 the second parameter will be the y-coordinate of the first point,
 the third parameter will be the x-coordinate of the second point,
 and the fourth parameter will be the y-coordinate of the second point. This method must return a double.

Calling `distance(0, 5, 0, 0)` would return `5.0`.

Note: To use the square root, use `Math.sqrt(x)`, where `x` is your input.  To square something, just multiply it by itself.

## Quadratic Formula
Write a method that takes in three doubles - `a`, `b`, and `c` - that represent the coefficients of a parabola
$$ ax^2 + bx + c $$

Assume that `a` is never 0.  Program the quadratic formula.  Make two methods, one that returns one solution, and another that returns the other solution.

In other words, make a method that returns the solution

$$ x = \dfrac{-b+\sqrt{b^2-4ac}}{2a} $$

and another that returns 

$$ x = \dfrac{-b-\sqrt{b^2-4ac}}{2a} $$

Use `Math.sqrt()` for the square root function.
