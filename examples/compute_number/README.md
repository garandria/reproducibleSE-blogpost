This is an example explaining the influence of the python version on reproducibility. The same python script launched with two different versions of python, namely python v2 and python v3, can give different results. 

Here is the content of the *compute_number.py* script: 

```
import sys
print("Current version of Python is ", sys. version)
print('3 / 2 =', 3 / 2)
print('Type of results', type(3/2))
```

When launched with a python v2.7.18 environment with the command line `python compute_number.py`, since 3 and 2 are two integers, the last line `print('3 / 2 =', 3 / 2)` computes the integer part of $3/2$, which is 1.

Content of the output for python 2:
```
('Current version of Python is ', '2.7.18 |Anaconda, Inc.| (default, Jun  4 2021, 14:47:46) \n[GCC 7.3.0]')
('3 / 2 =', 1)
('Type of results', <type 'int'>)
```
When launched with a python v3.8.10 environment with the command line `python3 compute_number.py`, the last line `print('3 / 2 =', 3 / 2)` converts the result to a float and computes the actual result of $3/2$, which is $1.5$.

```
Current version of Python is  3.8.10 (default, Mar 15 2022, 12:22:08) 
[GCC 9.4.0]
3 / 2 = 1.5
Type of results <class 'float'>
```

Source: [here](https://www.w3schools.blog/python-3-vs-python-2-differences)
