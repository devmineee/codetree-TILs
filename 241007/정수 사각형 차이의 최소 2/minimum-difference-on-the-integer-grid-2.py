from collections import deque

INF = 987654321
n = int(input())

board = [0 for _ in range(n)]

for i in range(n):
    board[i] = list(map(int,input().split()))

dp = [[0 for i in range(n)] for j in range(n)]

for i in range(n):
    for j in range(n):
        dp[i][j] = INF #[INF, -INF]

dx = [0,1]
dy = [1,0]

def bfs(cur_y,cur_x, n):

    dp[0][0] = 0

    que = deque()
    que.append((cur_y, cur_x, board[0][0], board[0][0])) # min _ MaX
    # print(f"?? {board[0][0]}")
    while que:
        cur = que.popleft()
        cur_y = cur[0]
        cur_x = cur[1]
        cur_min = cur[2]
        cur_max = cur[3]
        for i in range(2):
            ny = cur_y + dy[i]
            nx = cur_x + dx[i]
            if 0<=ny<n and 0<=nx<n:
                nxt_val = board[ny][nx]
                nxt_min = min(nxt_val,cur_min)
                nxt_max = max(nxt_val,cur_max)
                que.append((ny,nx,nxt_min, nxt_max))
                # print(ny,nx,n)
                dp[ny][nx] = min(nxt_max - nxt_min, dp[ny][nx])
                # print(ny,nx, nxt_max - nxt_min, nxt_min)
bfs(0,0,n)
# for dp1 in board:
#     print(*dp1)

print(dp[n-1][n-1])