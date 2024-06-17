n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
r, c, m1, m2, m3, m4, di = map(int, input().split())

# r과 c는 0행 0열 부터 시작해야 하므로 하나씩 감소시켜주기
r -= 1
c -= 1

# 직사각형 번호 정보를 저장할 리스트 초기화
square_arr = [0] * 2*(m1+m2) 

square_arr[0] = arr[r][c]

# 1번 방향 저장
for i in range(1,m1+1):
    square_arr[i] = arr[r-i][c+i]

# 2번 방향 저장
for i in range(1,m2+1):
    square_arr[m1+i] = arr[r-m1-i][c+m1-i]

# 3번 방향 저장
for i in range(1,m3+1):
    square_arr[m1+m2+i] = arr[r-m1-m2+i][c+m1-m2-i]

# 4번 방향 저장
for i in range(1,m4): 
    square_arr[m1+m2+m3+i] = arr[r-m1-m2+m3+i][c+m1-m2-m3+i]

if di == 0:
    temp = square_arr[2*(m1+m2)-1]
    for i in range(2*(m1+m2)-1, 0, -1):
        square_arr[i] = square_arr[i-1]
    square_arr[0] = temp

elif di == 1 :
    temp = square_arr[0]
    for i in range(2*(m1+m2)-1):
        square_arr[i] = square_arr[i+1]
    square_arr[2*(m1+m2)-1] = temp

# 1번 방향 저장
for i in range(m1+1):
    arr[r-i][c+i] = square_arr[i]

# 2번 방향 저장
for i in range(1,m2+1):
    arr[r-m1-i][c+m1-i] = square_arr[m1+i]

# 3번 방향 저장
for i in range(1,m3+1):
    arr[r-m1-m2+i][c+m1-m2-i] = square_arr[m1+m2+i]

# 4번 방향 저장
for i in range(1,m4): 
    arr[r-m1-m2+m3+i][c+m1-m2-m3+i] = square_arr[m1+m2+m3+i]

for i in range(n):
    for j in range(n):
        print(arr[i][j], end=" ")
    print()