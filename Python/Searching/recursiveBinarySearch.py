def binarySearch(arr, l, h, k):
    if(l > h):
        return -1
    mid = (l+h)//2
    if(arr[mid] == k):
        return mid
    elif(arr[mid] > k):
        return binarySearch(arr, l, mid-1, k)
    elif(arr[mid] < k):
        return binarySearch(arr, mid+1, h, k)

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array in sorted order : ")
    for i in range(n):
        k  = int(input())
        arr.append(k)
    k = int(input("Enter the element to get the position : "))
    print("The element is present at position : ", binarySearch(arr, 0, n-1, k))