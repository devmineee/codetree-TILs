N = int(input())
arr = [0]*N
for i in range(N):
    arr[i] = input()

maxDist = 0
allDist = 0

for i in range(1,N-1):

    x_back, y_back = map(int, arr[i-1].split())
    x_this, y_this = map(int, arr[i].split())
    x_next, y_next = map(int, arr[i+1].split())

    # 일단 총 거리부터 계산
    allDist += abs(x_back-x_this) + abs(y_back-y_this)
    

    # 이득 본 거리 = 나를 포함 했을 때 거리 - 나를 건너 뛰었을 때 거리
    
    # 나를 포함 했을 때 거리
    includeDist = abs(x_back-x_this) + abs(y_back-y_this) + abs(x_this-x_next) + abs(y_this - y_next)
    # 나를 건너 뛰었을 때 거리
    excludeDist = abs(x_back-x_next) + abs(y_back-y_next)

    maxDist = max(maxDist, includeDist - excludeDist)

# 마지막은 계산 안 되었으니 수동으로 더해주자
x_this, y_this = map(int, arr[N-2].split())
x_next, y_next = map(int, arr[N-1].split())

allDist += abs(x_this - x_next) + abs(y_this-y_next)

result = allDist - maxDist
print(result)

    # 이득 본 거리가 MAX 가 된 거리가 최대 거리
    # 총 거리도 계산해야 함