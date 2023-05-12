def secondLargestElementInTheArray(arr):
    temp = -1
    res = -2
    for i in range(len(arr)):
        if(temp < arr[i]):
            res = temp
            temp = arr[i]
        elif(res < arr[i]):
            res = arr[i]
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Largest element in the array : %d " % secondLargestElementInTheArray(arr))