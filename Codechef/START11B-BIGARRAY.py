t = int(input())
for i in range(t):
    n,s = [int(x) for x in input().split(' ')]
    ret = 0
    ret = int(n * (n+1) // 2)
    if ret > s:
        ret = ret - s
    if ret >= 1 and ret <= n:
        print(ret)
    else:
        print('-1')