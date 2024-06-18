def func(K, N, lst):

    if len(lst) == N:
        for i in lst:
            print(i, end=" ")
        print()
        return

    for i in range(1,K+1):
        lst.append(i)
        func(K, N, lst)
        lst.pop()





K, N = map(int, input().split())
lst = []
func(K, N, lst)