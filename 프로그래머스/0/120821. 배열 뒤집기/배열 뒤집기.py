def solution(num_list):
    answer = []
    idx=len(num_list)-1
    while idx>=0:
        answer.append(num_list[idx])
        idx-=1
    return answer