#include <stdio.h>

struct Tree{
    int val;
    Tree* left;
    Tree* right;
}tree[100];

int treeNum;

Tree *create(){
    tree[treeNum].left = tree[treeNum].right = NULL;
    return &tree[treeNum++];
}

Tree* insertNum(Tree* root, int num){
    if (root == NULL){
        root = create();
        root->val = num;
    }
    else{
        if (num < root->val){
            root->left = insertNum(root->left, num);
        }
        else if (num > root -> val){
            root->right = insertNum(root->right, num);
        }
    }
    return root;
}

void preTravel(Tree* root, int& num, int n){
    num++;
    if (num != n)
        printf("%d ", root->val);
    else{
        printf("%d\n", root->val);
    }
    if (root -> left != NULL){
        preTravel(root->left, num, n);
    }
    if (root->right != NULL){
        preTravel(root->right, num, n);
    }
}

void inTravel(Tree* root, int& num, int n){
    if (root -> left != NULL){
        inTravel(root->left, num, n);
    }
    num++;
    if (num != n)
        printf("%d ", root->val);
    else{
        printf("%d\n", root->val);
    }
    if (root->right != NULL){
        inTravel(root->right, num, n);
    }
}

void postTravel(Tree* root, int& num, int n){
    if (root -> left != NULL){
        postTravel(root->left, num, n);
    }
    if (root->right != NULL){
        postTravel(root->right, num, n);
    }
    num++;
    if (num != n)
        printf("%d ", root->val);
    else{
        printf("%d\n", root->val);
    }
}

int main(){
    int n;
    while(scanf("%d", &n) != EOF){
        treeNum = 0;
        Tree* root = NULL;
        int tempNum;
        for(int i = 0; i < n; i++){
            scanf("%d", &tempNum);
            root = insertNum(root, tempNum);
        }

        int numCount = 0;
        preTravel(root, numCount, n);
        numCount = 0;
        inTravel(root,numCount, n);
        numCount = 0;
        postTravel(root, numCount, n);
    }

    return 0;
}
