def moveZeros(arr):
    res = 0
    for i in range(len(arr)):
        if(arr[i] != 0):
            arr[res] = arr[i]
            arr[i] = 0
            res = res + 1

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    moveZeros(arr)
    print("Array after moving zeros : ", arr)