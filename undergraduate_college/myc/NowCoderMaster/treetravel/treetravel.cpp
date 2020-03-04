#include <stdio.h>
#include <string.h>

struct TreeNode{
    char val;
    TreeNode *lchild;
    TreeNode *rchild;
}Node[54]; // 避免分配空间

int loc;
char preStr[30],inStr[30];

TreeNode *createTreeNode(){
    Node[loc].lchild = Node[loc].rchild = NULL;
    return &Node[loc++];
}

TreeNode* buildTree(int preStart, int preEnd, int inStart, int inEnd){
    TreeNode* root = createTreeNode();
    root->val = preStr[preStart];
    int rootIndex = inStart;
    while(rootIndex <= inEnd){
        if (inStr[rootIndex] == preStr[preStart]){
            break;
        }
        rootIndex ++;
    }
    int leftLength = rootIndex - inStart;
    int rightLength = inEnd - rootIndex;

    if (leftLength > 0){
        root->lchild = buildTree(preStart + 1, preStart + leftLength, inStart, rootIndex - 1);
    }
    if(rightLength > 0){
        root->rchild = buildTree(preStart + leftLength + 1, preEnd, rootIndex + 1, inEnd);
    }
    return root;
}

void postTravel(TreeNode *root){
    if (root -> lchild != NULL){
        postTravel(root ->lchild);
    }
    if (root -> rchild != NULL){
        postTravel(root ->rchild);
    }
    printf("%c", root->val);
}

int main(){
    while(scanf("%s", preStr) != EOF){
        scanf("%s", inStr);
        loc = 0;
        int preLength = strlen(preStr);
        int inLength = strlen(inStr);
        TreeNode *root = buildTree(0, preLength - 1, 0, inLength - 1);
        postTravel(root);
        printf("\n");
    }
}
