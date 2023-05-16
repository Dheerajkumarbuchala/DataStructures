def maxConsecutiveOnes(arr):
    n = len(arr)
    res = 0
    count = 0
    for i in range(0, n):
        if(arr[i] == 0):
            count = 0
        else:
            count = count + 1
            res = max(res, count)
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Max consecutive 1's in the given binary array are : ", maxConsecutiveOnes(arr))