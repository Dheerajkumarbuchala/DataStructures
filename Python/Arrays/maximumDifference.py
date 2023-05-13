def maximumDifference(arr):
    res = arr[1] - arr[0]
    minValue = arr[0]
    for i in range(1, len(arr)):
        res = max(res, arr[i]-minValue)
        minValue = min(minValue, arr[i])
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Maximum difference : ", maximumDifference(arr))