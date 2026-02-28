#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* insert(struct Node* head, int val) {
    struct Node* n = malloc(sizeof(struct Node));
    n->data = val;
    n->next = head;
    return n;
}

struct Node* delete(struct Node* head, int val) {
    if (!head) return NULL;
    if (head->data == val) return head->next;

    struct Node* cur = head;
    while (cur->next && cur->next->data != val)
        cur = cur->next;

    if (cur->next)
        cur->next = cur->next->next;

    return head;
}

int search(struct Node* head, int val) {
    while (head) {
        if (head->data == val) return 1;
        head = head->next;
    }
    return 0;
}
