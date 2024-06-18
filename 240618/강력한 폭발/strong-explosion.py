import copy
n = int(input())
arr = [list(map(int, input().split())) for _ in range(n)]
bomb_position = []
max_cnt = 0

# 폭탄이 떨어질 곳을 찾아서 리스트에 추가
for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            bomb_position.append((i,j))

bomb_num = len(bomb_position)

def find_max_explosion(idx, lst):

    global max_cnt

    # 다 터뜨렸을 경우
    if idx == bomb_num:
        cnt = 0
        for i in range(n):
            for j in range(n):
                if lst[i][j] == 3:
                    cnt += 1

        max_cnt = max(max_cnt, cnt)
        return


    r,c = bomb_position[idx]

    # 1번을 터뜨려 봄
    dx = [-2,-1,0,1,2]
    dy = [0,0,0,0,0]

    new_arr = copy.deepcopy(lst)
    
    for i in range(5):
        if 0<=r+dx[i]<n and 0<=c+dy[i]<n:
            new_arr[r+dx[i]][c+dy[i]] = 3
    
    # 다음 위치 폭탄 터뜨려보기
    find_max_explosion(idx + 1, new_arr)

    # 2번을 터뜨려 봄
    dx = [-1,1,0,0,0]
    dy = [0,0,0,-1,1]

    new_arr = copy.deepcopy(lst)

    for i in range(5):
        if 0<=r+dx[i]<n and 0<=c+dy[i]<n:
            new_arr[r+dx[i]][c+dy[i]] = 3
    
    # 다음 위치 폭탄 터뜨려보기
    find_max_explosion(idx + 1, new_arr)

    # 3번을 터뜨려 봄
    dx = [-1,1,1,-1,0]
    dy = [-1,-1,1,1,0]

    new_arr = copy.deepcopy(lst)

    for i in range(5):
        if 0<=r+dx[i]<n and 0<=c+dy[i]<n:
            new_arr[r+dx[i]][c+dy[i]] = 3
    
    # 다음 위치 폭탄 터뜨려보기
    find_max_explosion(idx + 1, new_arr)
    

find_max_explosion(0, arr)
print(max_cnt)