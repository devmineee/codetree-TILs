def find_carry(num_A, num_B, num_C):

    while num_A != 0 and num_B != 0 and num_C != 0:
        if num_A % 10 + num_B % 10 + num_C % 10 >= 10:
            return False

        num_A /= 10
        num_B /= 10
        num_C /= 10
    
    return True


n = int(input())
max_sum = -1
arr = [0]*n
for i in range(n):
    arr[i] = int(input())

for i in range(n-2):

    for j in range(i+1, n-1):

        for k in range(j+1, n):

            if find_carry(arr[i], arr[j], arr[k]):
                max_sum = max(max_sum, arr[i]+arr[j]+arr[k])

print(max_sum)