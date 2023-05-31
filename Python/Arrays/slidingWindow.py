def slidingWindow(arr, s):
    res = 0
    curr = 0
    for i in range(0, s):
        curr = curr + arr[i]
    for i in range(s, n):
        curr = curr + arr[i] - arr[i-s]
        res = max(res, curr)
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    s = int(input("Enter the size of the window : "))
    print("Maximum sum for the window size ", s , " is : ", slidingWindow(arr, s))