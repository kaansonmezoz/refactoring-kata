This case is taken from [William Wake's Refactoring Workbook](https://www.amazon.com/Refactoring-Workbook-William-C-Wake/dp/0321109295).

```report() in Report.class``` reporting two things:
- Machine
- Robot

1.We can apply [Split Phase](https://refactoring.com/catalog/splitPhase.html) to extract two different behaviours into its own methods.
- reportMachine
- reportRobot

2.Also the behaviour below is pretty much repeated in the report(). So Extract Method should be applied.

````java
if (machine.bin() != null)
    out.write(" bin=" + machine.bin());
```` 

3. I don't know which version of Java it was used to code this but we can use foreach instead of using Iterator.