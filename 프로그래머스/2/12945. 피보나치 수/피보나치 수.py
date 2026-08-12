def solution(n):
    list=[0,1]
    for i in range(n):
        list.append((list[i]+list[i+1])%1234567)
    return list[n]