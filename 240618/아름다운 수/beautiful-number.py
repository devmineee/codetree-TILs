def find_beauty(num_char):
    global cnt
    if len(num_char) == n:
        cnt += 1
        return
    elif len(num_char) > n:
        return



    for beauty_num in beauty_lst:
        find_beauty(num_char + beauty_num)




n = int(input())
cnt = 0
beauty_lst = ['1', '22', '333', '4444']

find_beauty('')
print(cnt)