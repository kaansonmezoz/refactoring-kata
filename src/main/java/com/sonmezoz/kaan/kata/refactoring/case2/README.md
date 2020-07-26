#### Introduction 

This case is taken from https://kata-log.rocks/bugs-zero-kata. Legacy code can be found on https://github.com/caradojo/trivia

Code example is in the ```example``` package. You can find refactored version of example in the ```solution``` package.

Code has some defects. There are some cases which are not handled. They can be on [here](https://github.com/martinsson/BugsZero-Kata/blob/master/instructions-intermediate.md#existing-bugs-and-weaknesses-in-trivia)

It's expected not only make design better - in terms of tolerating the change i.e flexibility, readability, understandability -
but also handle those defects.

#### Analysis
Since code is a bit complex, let's first analyze it here. Address the problems and how to fix via refactoring.

- SoC (Seperation of Concerns): Everything is done in Game.class
- Strings are evil!
  - You can pass anythin as string. It's a joker in Java. You just turn type strict language into non-strict.