def checkStatus(arr):
    for i in range(len(arr)-1):
        if(arr[i] > arr[i+1]):
            return False
    return True

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    res = checkStatus(arr)
    if(res):
        print("Array is sorted")
    else:
        print("Array is not sorted")
