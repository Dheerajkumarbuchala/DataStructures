def getSum(arr, l , r):
    pSum = list()
    pSum.append(arr[0])
    for i in range(1, n):
        pSum.append(pSum[i-1] + arr[i])
    if(l == 0):
        return pSum[r]
    else:
        return pSum[r] - pSum[l-1]

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    l = int(input("Enter the lower bound to find the sum : "))
    r = int(input("Enter the upper bound to find the sum : "))
    print(getSum(arr, l, r))