from random import random, seed


def associativity_test() -> bool:
    x = random()
    y = random()
    z = random()

    return x + (y + z) == (x + y) + z


def proportion(number: int) -> float:
    ok = 0
    for _ in range(number):
        ok += associativity_test()

    return ok * 100 / number


if __name__ == '__main__':
    seed(int(input('Seed: ')))
    print(str(proportion(1000)) + '%')
