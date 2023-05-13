def rotate(arr, l, h):
    temp = 0
    while(l < h):
        temp = arr[l]
        arr[l] = arr[h]
        arr[h] = temp
        l = l + 1
        h = h - 1

def leftRotateByD(arr, d):
    rotate(arr, 0, d-1)
    rotate(arr, d, len(arr)-1)
    rotate(arr, 0, len(arr)-1)

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Enter the no of places to rotate : ")
    d = int(input())
    d = d % n
    leftRotateByD(arr, d)
    print("Array after rotation : ", arr)