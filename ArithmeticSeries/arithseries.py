def calc(maxiter, start, mult):
    sum = 0
    n = start
    while n <= maxiter:
        sum += n*mult
        n += 1
    return sum

s = calc(10000.,1,2)

print(f"Sum :: {s}")
