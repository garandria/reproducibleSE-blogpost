# Concrete examples of reproducibility threats

## 1. Unspecified behaviors

The first idea is to propose pieces of code leading to unreproductible results. By changing just one element of the environment, the execution of the code will give different results. These changes can involve:
- the version of the interpreter/compiler
- a dependency of your operating system 
- an update in a driver (hardware)
- ...
Now, imagine that your experiment includes a subtle combination of all these examples. Will the conclusions of your experiment hold when one tries to reproduce it?

### a-] Organization
 
Each sub-directory contains an example of environment change as well as :
- a piece of code illustrating the example
- a README.md file with detailed explanations about the different results obtained before and after this change

### b-] Examples

We list hereafter different examples:

- **associativity** contains a simple example to illustrate the problem, concentrating on floating point numbers even if uncertainty problems go well beyond that. 

- **compute_number** shows how the python version can influence the results of a computation.

- **string_equals** is a java example showing the diversity of results depending on the way you instantiate (and compare) your variables. 

- **...**

Feel free to PR your own example!

## 2. Prototype of an experiment with multiple variability levels

TODO

