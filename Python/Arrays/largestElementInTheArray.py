def largestElementInTheArray(arr):
    res = -1
    for i in range(len(arr)):
        if(res < arr[i]):
            res = arr[i]
    return res 

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Largest element in the array : %d " % largestElementInTheArray(arr))