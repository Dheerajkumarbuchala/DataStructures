def binarySearch(arr, element):
    l = 0
    h = len(arr) - 1
    while(l <= h):
        mid = (l+h)//2
        if(arr[mid] == element):
            return mid
        elif(arr[mid] > element):
            h = mid - 1
        elif(arr[mid] < element):
            l = mid + 1
    return -1

if __name__ == "__main__":
    arr = list()
    n = int(input("Enter the size of the array : "))
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    element = int(input("Enter the element to be searched : "))
    print("Index of the element to be searched : ", binarySearch(arr, element))