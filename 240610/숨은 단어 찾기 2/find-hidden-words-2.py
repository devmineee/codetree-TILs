def find_lee(x,y):
    global cnt

    if arr[x][y] != 'L': # 시작 문자가 L이 아니면 존재할 수 없음
        return

    # 위
    if i-2 >= 0 and arr[i-1][j] == 'E' and arr[i-2][j] == 'E':
        cnt += 1
    # 우측 위
    if i-2 >= 0 and j+2 < M and arr[i-1][j+1] == 'E' and arr[i-2][j+2] == 'E':
        cnt += 1
    # 우측
    if j+2 < M and arr[i][j+1] == 'E' and arr[i][j+2] == 'E':
        cnt += 1
    # 우측 아래
    if i+2 < N and j+2 < M and arr[i+1][j+1] == 'E' and arr[i+2][j+2] == 'E':
        cnt += 1
    # 아래
    if i+2 < N and arr[i+1][j] == 'E' and arr[i+2][j] == 'E':
        cnt += 1
    # 좌측 아래
    if i+2 < N and j-2 >= 0 and arr[i+1][j-1] == 'E' and arr[i+2][j-2] == 'E':
        cnt += 1
    # 좌측
    if j-2 >= 0 and arr[i][j-1] == 'E' and arr[i][j-2] == 'E':
        cnt += 1
    # 좌측 위
    if i-2 >= 0 and j-2 >= 0 and arr[i-1][j-1] == 'E' and arr[i-2][j-2] == 'E':
        cnt += 1


N, M = map(int, input().split())
arr = []
cnt = 0
for i in range(N):
    arr.append(list(input()))

for i in range(N):
    for j in range(M):
        find_lee(i,j)

print(cnt)