def rainWater(arr):
    n = len(arr)
    res = 0
    for i in range(1, n-1):
        lmax = arr[i]
        for j in range(0,i):
            lmax = max(lmax, arr[j])
        rmax = arr[i]
        for j in range(i+1, n):
            rmax = max(rmax, arr[j])
        res = res + min(lmax, rmax) - arr[i]
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Rain water trapped : ", rainWater(arr))