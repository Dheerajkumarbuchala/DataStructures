def removeDuplicates(arr):
    res = 1
    for i in range(1, len(arr)):
        if(arr[i-1]!=arr[i]):
            arr[res] = arr[i]
            res = res + 1
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    n = removeDuplicates(arr)
    print("Array after rmoving the duplicates from the sorted array : ")
    for i in range(n):
        print(arr[i])