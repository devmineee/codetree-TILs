n, m = map(int, input().split())
max_sum = 0
arr = [list(map(int, input().split())) for _ in range(n)]

for i in range(n):
    for j in range(m):

        if i-1 > 0 and i+1 < n: # 세로 블럭
            max_sum = max(max_sum, arr[i-1][j] + arr[i][j] + arr[i+1][j])
        if j-1 > 0 and j+1 < m: # 가로 블럭
            max_sum = max(max_sum, arr[i][j-1] + arr[i][j] + arr[i][j+1])
        if i-1 > 0 and j+1 < m :
            max_sum = max(max_sum, arr[i-1][j] + arr[i][j] + arr[i][j+1])
        if i-1 > 0 and j-1 > 0 :
            max_sum = max(max_sum, arr[i-1][j] + arr[i][j] + arr[i][j-1])
        if i+1 < n and j-1 > 0 :     
            max_sum = max(max_sum, arr[i+1][j] + arr[i][j] + arr[i][j-1])
        if i+1 < n and j+1 < m:
            max_sum = max(max_sum, arr[i+1][j] + arr[i][j] + arr[i][j+1])

print(max_sum)