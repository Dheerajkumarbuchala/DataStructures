def printLeaders(arr):
    temp = arr[len(arr)-1]
    print(temp)
    for i in range(len(arr)-2, -1, -1):
        if(arr[i] > temp):
            temp = arr[i]
            print(temp)

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    printLeaders(arr)