#include <iostream>

long sum(long maxiter, int start, int mult)
{
    long s = 0;
    int n = start;
    while (n <= maxiter)
    {
        s += n*mult;
        n++;
    }
    return s;
}

int main()
{
    long s = sum(10000,1,2);
    std::cout << s;
    return 0;
}
