N = int(input())
string = list(input())
cnt = 0

for i in range(N-2):
    if string[i] == 'C':

        for j in range(i+1, N-1):
            if string[j] == 'O':

                for k in range(j+1, N):
                    if string[k] == 'W':
                        cnt += 1

print(cnt)