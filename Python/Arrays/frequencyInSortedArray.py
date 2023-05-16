def printFrequencies(arr):
    n = len(arr)
    i = 1
    freq = 1
    while(i < n):
        while((i < n) and (arr[i] == arr[i-1])):
            i = i + 1
            freq = freq + 1
        print(arr[i-1], freq)
        i = i + 1
        freq = 1
    if((n==1) or (arr[n-1] != arr[n-2])):
        print(arr[n-1], 1)

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    printFrequencies(arr)