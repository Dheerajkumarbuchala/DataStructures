def indexOfFirstOccuranceRecursion(arr, l, h, k):
    if(l > h):
        return -1
    mid = (l+h)//2
    if(arr[mid] > k):
        return indexOfFirstOccuranceRecursion(arr, l, mid-1, k)
    elif(arr[mid] < k):
        return indexOfFirstOccuranceRecursion(arr, mid+1, h, k)
    else:
        if((mid == 0) or (arr[mid] != arr[mid-1])):
            return mid
        else:
            return indexOfFirstOccuranceRecursion(arr, l, mid-1, k)

def indexOfFirstOccuranceIterative(arr, l, h, k):
    while(l <= h):
        mid = (l+h)//2
        if(arr[mid] > k):
            h = mid - 1
        elif(arr[mid] < k):
            l = mid + 1
        else:
            if((mid == 0) or (arr[mid] != arr[mid-1])):
                return mid
            else:
                h = mid - 1
    return -1


if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array in sorted order : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    k = int(input("Enter the element to get the index of first occurance : "))
    print("The index of first occurance (using recursion) : ", indexOfFirstOccuranceRecursion(arr, 0, n-1, k))
    print("The index of first occurance (using iterative method) : ", indexOfFirstOccuranceIterative(arr, 0, n-1, k))