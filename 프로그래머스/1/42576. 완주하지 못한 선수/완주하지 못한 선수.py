def solution(participant, completion):
    d={}
    for key in participant:
        if key in d:
            d[key]=d[key]+1
        else:
            d[key]=1
            
    for key in completion:
        d[key]=d[key]+1
    for key, value in d.items():
        if value%2==1:
            return key
        
    return ''