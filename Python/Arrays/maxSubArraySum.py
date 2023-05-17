def maxSubarraySum(arr):
    n = len(arr)
    res = arr[0]
    curr = arr[0]
    for i in range(1, n):
        curr = max(arr[i], curr + arr[i])
        res = max(curr, res)
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Max subarray sum : ", maxSubarraySum(arr))