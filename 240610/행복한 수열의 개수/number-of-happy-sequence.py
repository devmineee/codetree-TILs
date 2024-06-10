n, m = map(int, input().split())
cnt = 0
arr = [list(map(int, input().split())) for _ in range(n)]

for i in range(n):
    for j in range(n-m+1):

        start_num = arr[i][j]
        for k in range(1,m):
            if arr[i][j+k] != start_num:
                break
        else:
            cnt += 1
            break

for j in range(n):
    for i in range(n-m+1):
        start_num = arr[i][j]
        for k in range(1,m):
            if arr[i+k][j] != start_num:
                break
        else:
            cnt += 1
            break

print(cnt)