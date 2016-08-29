
import math
from itertools import product, takewhile

#print(math.sqrt(50000000))


def primelist():
    lst = [2]
    for i in range(3, 7071):
        if i % 2 == 0:
            continue
        else:
            res = True
            for j in range(3, int(math.sqrt(i)) + 1, 2):
                if i % j == 0:
                    res = False
                    break
            if res:
                lst.append(i)
    return lst


def main():
    bound = 50000000
    primes = primelist()
    squares = takewhile(lambda x: x < bound, (prime**2 for prime in primes))
    cubes = takewhile(lambda x: x < bound, (prime**3 for prime in primes))
    biquadratic = takewhile(lambda x: x < bound, (prime**4 for prime in primes))
    print((len(set(s + c + t for (s, c, t) in product(squares, cubes, biquadratic) if s + c + t < bound))))


if __name__ == "__main__":
    main()












