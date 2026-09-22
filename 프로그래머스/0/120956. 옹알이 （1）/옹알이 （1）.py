def solution(babbling):
    answer = 0
    for i in range (len(babbling)):
        babbling[i]=babbling[i].replace('aya','*');
        babbling[i]=babbling[i].replace('ye','*');
        babbling[i]=babbling[i].replace('woo','*');
        babbling[i]=babbling[i].replace('ma','*');
    for string in babbling:
        string=string.replace('*','')
        if string=='':
            answer+=1
    return answer