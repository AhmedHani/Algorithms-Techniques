dp1 = [-1 for i in range(500)]
dp2 = [[-1 for i in range(500)] for i in range(500)]
def fibo(number):
    if dp1[number] != -1:
        return dp1[number]
    if number <= 1:
        dp1[number] = number
    else:
        dp1[number] = fibo(number - 1) + fibo(number - 2)

    return dp1[number]

def LCS(first, second):
    for i in range(0, len(first) + 1):
        for j in range(0, len(second) + 1):
            if i == 0 or j == 0:
                dp2[i][j] = 0
            elif first[i - 1] == second[j - 1]:
                dp2[i][j] = dp2[i - 1][j - 1] + 1
            else: dp2[i][j] = max(dp2[i - 1][j], dp2[i][j - 1])
    return dp2[len(first)][len(second)]

def RodCutting(prices, number):
    dpCut = [-1 for ii in range(number + 1)]
    dpCut[0] = 0

    for i in range(1, number + 1):
        maxValue = -(1 << 25)
        for j in range(0, i):
            maxValue = max(maxValue, prices[j] + dpCut[i - j - 1])
        dpCut[i] = maxValue

    return dpCut[number]

def KnapSack(Weight, weights, values, Size):
    '''if dp2[Weight][Size] != -1: return dp2[Weight][Size]
    if Size == 0 or Weight == 0:
        return 0
    if weights[Size - 1] > Weight:
        dp2[Weight][Size] = KnapSack(Weight, weights, values, Size - 1)
        return dp2[Weight][Size]
    else:
        dp2[Weight][Size] = max(KnapSack(Weight, weights, values, Size - 1),
                    values[Size - 1] + KnapSack(Weight - weights[Size - 1], weights, values, Size - 1))
        return dp2[Weight][Size] '''
    for i in range(0, Size + 1):
        for j in range(0, Weight + 1):
            if i == 0 or j == 0:
                dp2[i][j] = 0
            elif weights[i - 1] > j:
                dp2[i][j] = dp2[i - 1][j]
            else:
                dp2[i][j] = max(dp2[i - 1][j], dp2[i - 1][j - weights[i - 1]] + values[i - 1])
    return dp2[Size][Weight]


def main():
    #arr = [1, 5, 8, 9, 10, 17, 17, 20]
    val = [60, 100, 120]
    wt = [10, 20, 30]
    W = 50
    print(KnapSack(W, wt, val, val.__len__()))

main()


