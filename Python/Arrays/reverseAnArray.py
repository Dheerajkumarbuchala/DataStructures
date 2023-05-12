def reverse(arr):
    l = 0
    h = len(arr) - 1
    while(l < h):
        arr[h], arr[l] = arr[l], arr[h]
        l = l + 1
        h = h - 1

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    reverse(arr)
    print(arr)