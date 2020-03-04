#include <stdio.h>

struct Node{
    int val;
    Node *lchild;
    Node *rchild;
}nodes[100];

int loc;

Node *create(){
    nodes[loc].lchild = nodes[loc].rchild = NULL;
    return &nodes[loc++];
}


Node *insert(Node *root, int x){
    if (root == NULL){
        root = create();
        root->val = x;
    }
    else{
        if(x < root->val){
            root->lchild = insert(root->lchild, x);
        }
        else if (x <= root->val){
            root->rchild = insert(root->rchild, x);
        }
    }
    return T;
}

void perOrder(Node *root){
    printf("%d", root->val);
    if (root->lchild != NULL){
        preOrder(root->lchild);
    }
    if (root->rchild != NULL){

    }
}


int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        loc = 0;
        Node *root = NULL;
        for(int i = 0; i < n; i++){
            int x;
            scanf("%d", &x);
            root = insert(root, x);
        }
    }
}
