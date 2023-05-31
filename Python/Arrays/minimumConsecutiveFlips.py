def minConsecutiveFlips(arr):
    n = len(arr)
    for i in range(0, n):
        if(arr[i] != arr[i-1]):
            if(arr[i] != arr[0]):
                print("From ", i, " to ", end="")
            else:
                print(i-1)
    if(arr[n-1] != arr[0]):
        print(n-1)

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    minConsecutiveFlips(arr)