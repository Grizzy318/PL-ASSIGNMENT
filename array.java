int[] arr = new int[100];
int n = 5;

void insert(int[] arr, int n, int pos, int value) {
    for (int i = n; i > pos; i--)
        arr[i] = arr[i - 1];
    arr[pos] = value;
}

void delete(int[] arr, int n, int pos) {
    for (int i = pos; i < n - 1; i++)
        arr[i] = arr[i + 1];
}

int search(int[] arr, int n, int value) {
    for (int i = 0; i < n; i++)
        if (arr[i] == value) return i;
    return -1;
}
