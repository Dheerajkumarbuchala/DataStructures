def subArrayWithSum(arr, s):
    n = len(arr)
    curr = 0
    k = 0
    for i in range(0, n):
        curr = curr + arr[i]
        while(s < curr):
            curr = curr - arr[k]
            k = k + 1
        if(curr == s):
            return True
    return False

if __name__ == "__main__":
    n = int(input("Enter the size of the array : "))
    arr = list()
    print("Enter the elements of the array : ")
    for i in range(0, n):
        k = int(input())
        arr.append(k)
    s = int(input("Enter the targeted sum : "))
    print(subArrayWithSum(arr, s))