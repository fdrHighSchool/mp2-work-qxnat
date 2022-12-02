# FizzBuzz
#### Respond to the following:

1. Fill out the following truth table:

| P  | Q  | P && Q | P \|\| Q |
|:--:|:--:|:------:|:--------:|
| T  | T  |   T    |    T     |
| T  | F  |   F    |    T     |
| F  | T  |   F    |    T     |
| F  | F  |   F    |    F     |


2. Prove a version of DeMorgan's Law:

| P  | Q  | P \|\| Q | ! (P \|\| Q) | !P | !Q | !P && !Q |
|:--:|:--:|:--------:|:------------:|:--:|:--:|:--------:|
| T  | T  |    T     |       F      |  F | F  |     T    |
| T  | F  |    T     |       F      |  F | T  |     F    |
| F  | T  |    T     |       F      |  T | F  |     F    |
| F  | F  |    F     |       T      |  T | T  |     F    |

3. What does DeMorgan's state and how did you prove it for the case above?
  * DeMorgans law states !(P || Q) is equal to !P && !Q. its proven when P and Q are made to be !P & !Q and when used in (!P && !Q)
