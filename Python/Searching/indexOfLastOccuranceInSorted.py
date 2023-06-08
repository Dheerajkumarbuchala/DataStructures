def indexOfLastOccuranceRecursive(arr, l, h, k):
    if(l > h):
        return -1
    mid = (l+h)//2
    if(arr[mid] > k):
        return indexOfLastOccuranceRecursive(arr, l, mid-1, k)
    elif(arr[mid] < k):
        return indexOfLastOccuranceRecursive(arr, mid+1, h, k)
    else:
        n = len(arr)
        if(mid == n-1 or arr[mid+1] != arr[mid]):
            return mid
        else:
            return indexOfLastOccuranceRecursive(arr, mid+1, h, k)


def indexOfLastOccuranceIterative(arr, l, h, k):
    n = len(arr)
    while(l <= h):
        mid = (l+h)//2
        if(arr[mid] > k):
            h = mid - 1
        elif(arr[mid] < k):
            l = mid + 1
        else:
            if(mid == n-1 or arr[mid+1] != arr[mid]):
                return mid
            else:
                l = mid + 1

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(n):
        k = int(input())
        arr.append(k)
    k = int(input("Enter the element to find the index of last occurance : "))
    print("Index of the last occurance of the element is : ", indexOfLastOccuranceRecursive(arr, 0, n-1, k))
    print("Index of the last occurance of the element is : ", indexOfLastOccuranceIterative(arr, 0, n-1, k))