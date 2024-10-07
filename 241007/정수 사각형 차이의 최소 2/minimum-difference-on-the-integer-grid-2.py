from collections import deque

n = int(input())
board = [list(map(int, input().split())) for _ in range(n)]

# BFS로 주어진 최댓값과 최솟값의 차이로 목표 지점까지 도달 가능한지 확인
def bfs(min_val, max_val):
    if board[0][0] < min_val or board[0][0] > max_val:
        return False
    
    # BFS 시작
    queue = deque([(0, 0)])
    visited = [[False] * n for _ in range(n)]
    visited[0][0] = True
    
    # 방향: 오른쪽, 아래쪽
    dx = [0, 1]
    dy = [1, 0]
    
    while queue:
        x, y = queue.popleft()
        
        # 목표 지점에 도달하면 성공
        if x == n - 1 and y == n - 1:
            return True
        
        for i in range(2):
            nx, ny = x + dx[i], y + dy[i]
            if 0 <= nx < n and 0 <= ny < n and not visited[nx][ny]:
                if min_val <= board[nx][ny] <= max_val:
                    visited[nx][ny] = True
                    queue.append((nx, ny))
    
    return False

# 이진 탐색
def solve():
    left, right = 0, 100  # 값의 범위는 1 ~ 100으로 주어졌으므로 0~100 범위
    result = right
    
    # 이진 탐색으로 가능한 최소 차이를 찾음
    while left <= right:
        mid = (left + right) // 2
        
        # min_val 범위를 설정해서 각 경우에 대해 BFS를 실행
        found = False
        for min_val in range(1, 101 - mid):
            if bfs(min_val, min_val + mid):
                found = True
                break
        
        if found:
            result = mid
            right = mid - 1
        else:
            left = mid + 1
    
    return result

# 결과 출력
print(solve())