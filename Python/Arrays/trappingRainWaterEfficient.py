def rainWater(arr):
    n = len(arr)
    res = 0
    lmax = [0] * n
    rmax = [0] * n
    lmax[0] = arr[0]
    rmax[n-1] = arr[n-1]
    for i in range(1, n):
        lmax[i] = max(lmax[i-1], arr[i])
    for i in range(n-2, -1, -1):
        rmax[i] = max(rmax[i+1], arr[i])
    for i in range(0, n):
        res = res + min(lmax[i], rmax[i]) - arr[i]
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Rain water trapped : ", rainWater(arr))