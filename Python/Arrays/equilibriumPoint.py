def equilibriumPoint(arr):
    lsum = 0
    rsum = 0
    for i in range(0, n):
        lsum = lsum + arr[i]
    for i in range(0, n):
        lsum = lsum - arr[i]
        if(lsum == rsum):
            return True
        rsum = rsum + arr[i]
    return False

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Equilibrium point exists at index : ", equilibriumPoint(arr))