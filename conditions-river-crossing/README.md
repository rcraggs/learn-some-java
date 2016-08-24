# River crossing

Based on the river crossing game where you have to get a fox, chicken and corn across the river. 

The function `Learn.whoGetsEaten` takes parameters to set the values for `foxIsThere`, `chickenIsThere`, `cornIsThere` and `farmerIsThere`  and returns a string saying who got eaten (Chicken, Corn or Nobody)

Rules

- If the farmer is there "Nobody" gets eaten
- If the fox is left alone with the chicken "Chicken" is eaten (regardless of where the corn is)
- If the chicken is left alone with the corn "Corn" is eaten
- The fox or farmer never get eaten