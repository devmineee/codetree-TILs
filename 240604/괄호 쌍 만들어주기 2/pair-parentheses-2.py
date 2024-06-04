string = list(input())
l = len(string)
cnt = 0
for i in range(l-3):
    if string[i] != '(' or string[i+1] != '(' :
        continue
    
    for j in range(i+2, l-1):
        if string[j] == ')' and string[j+1] == ')' :
            cnt += 1

print(cnt)