def evenOddSubArray(arr):
    n = len(arr)
    res = 1
    curr = 1
    for i in range(1,n):
        if((arr[i-1]%2==0 and arr[i]%2!=0) or (arr[i-1]%2!=0 and arr[i]%2==0)):
            curr = curr + 1
            res = max(res, curr)
        else:
            curr = 1
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Length of the longest even odd subarray : ", evenOddSubArray(arr))