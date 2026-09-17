def solution(nums):
    dic={}
    for key in nums:
        if key in dic:
            dic[key]=dic[key]+1
        else:
            dic[key]=1
    return len(dic) if len(dic)<len(nums)/2 else len(nums)/2