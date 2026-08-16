def solution(n, t):
    answer = 0
    a=1
    for i in range(t):
        a*=2
    answer=n*a;
    return answer