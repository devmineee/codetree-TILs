arr = list(input())
n = len(arr)
cnt = 0
while arr[0] == arr[n-1] and cnt < n:
    temp = arr[n-1]
    for i in range(n-1, 0, -1):
        arr[i] = arr[i-1]
    arr[0] = temp
    cnt += 1

if cnt == n:
    if cnt == 10:
        print(3)
    else:
        print(2)
else:
    i = 0
    cnt = 0
    while i < n-1:
        if arr[i] != arr[i+1]:
            cnt += 1
        i += 1
    cnt += 1
    print(cnt*2)