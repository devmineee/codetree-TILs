N = int(input())
minDist = N*1000
personArr = [0] * N
for i in range(N):
    personArr[i] = int(input())

for i in range(N):
    sumDist = 0
    for j in range(N):
        if j-i < 0:
            sumDist += (N+(j-i))*personArr[j]
        else:
            sumDist += (j-i)*personArr[j]
    minDist = min(minDist, sumDist)

print(minDist)