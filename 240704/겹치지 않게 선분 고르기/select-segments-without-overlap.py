n = int(input())
arr = [ list(map(int, input().split())) for _ in range(n) ]
max_line = 0
def cal_line(i, lst):
    global max_line
    if i == n:
        max_line = max(max_line, len(lst))
        return

    for idx in range(i, n):
        x1, x2 = arr[idx]

        for y1, y2 in lst:
            
            if y2 < x1 or y1 > x2 :
                pass
            else:
                cal_line(i+1, lst)
                break
        else:
            lst.append([x1,x2])
            cal_line(i+1, lst)
            lst.pop()


cal_line(0, [])
print(max_line)