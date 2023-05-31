def maxAppearingElement(arr1, arr2):
    arrPos = [0]*100
    for i in range(0, len(arr1)):
        arrPos[arr1[i]] = arrPos[arr1[i]] + 1
        arrPos[arr2[i] + 1] = arrPos[arr2[i] + 1] - 1
    pSum = list()
    pSum.append(arrPos[0])
    res = 0
    curr = arrPos[0]
    for i in range(1, len(arrPos)):
        k = pSum[i-1] + arrPos[i]
        pSum.append(k)
        if(k > curr):
            curr = k
            res = i
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr1 = list()
    arr2 = list()
    print("Enter the lower bounds and upper bounds of the array : ")
    for i in range(0, n):
        l = int(input())
        u = int(input())
        arr1.append(l)
        arr2.append(u)
    print("Maximum appearing element is : ", maxAppearingElement(arr1, arr2))