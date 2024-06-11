n, t = map(int, input().split())
arr = list(input().split())
arr.extend(list(input().split()))
arr.extend(list(input().split()))

for _ in range(t):
    temp = arr[3*n-1]
    for i in range(3*n-1, 0, -1):
        arr[i] = arr[i-1]
    arr[0] = temp


for i in range(n):
    print(arr[i], end=" ")
print()
for i in range(n):
    print(arr[n+i], end=" ")
print()
for i in range(n):
    print(arr[2*n+i], end=" ")