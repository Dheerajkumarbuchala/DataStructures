def maxSubArraySum(arr):
    n = len(arr)
    res = arr[0]
    curr = arr[0]
    for i in range(1, n):
        curr = max(curr + arr[i], arr[i])
        res = max(curr, res)
    return res

def circularSubArraySum(arr):
    n = len(arr)
    subArraySum = maxSubArraySum(arr)
    if(subArraySum < 0):
        return subArraySum
    else:
        arr_sum = sum(arr)
        for i in range(n):
            arr[i] = -arr[i]
        circularSubArraySum = arr_sum + maxSubArraySum(arr)
        return max(subArraySum, circularSubArraySum)

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Max cicular subarray sum : ", circularSubArraySum(arr))