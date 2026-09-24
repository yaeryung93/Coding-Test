def solution(picture, k):
    answer = []
    for pic in picture:
        temp=''
        for j in range(len(pic)):
            for l in range(k):
                temp+=pic[j]
        for j in range(k):
            answer.append(temp)
    return answer