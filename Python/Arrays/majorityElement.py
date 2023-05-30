def majorityElement(arr):
    res = 0
    count = 1
    n = len(arr)
    for i in range(1, n):
        if(arr[res] == arr[i]):
            count = count + 1
        else:
            count = count - 1
        if(count == 0):
            res = i
            count = 1
    
    count = 0
    for i in range(0, n):
        if(arr[res] == arr[i]):
            count =  count + 1
    if(count <= n/2):
        res = -1
    return res

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    print("Position of majority element in the array : ", majorityElement(arr))