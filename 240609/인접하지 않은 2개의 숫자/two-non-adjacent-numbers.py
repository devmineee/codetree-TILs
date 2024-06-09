n = int(input())
arr = list(map(int, input().split()))
max_sum = 0
for i in range(n): # 대상 인덱스
    for j in range(n): # 비교할 인덱스
        if j == i: continue # 자기 자신과 비교 불가
        if j == i-1 : continue # 이전 인덱스
        if j == i+1 : continue # 이후 인덱스

        max_sum = max(max_sum, arr[i]+arr[j])

print(max_sum)