#include <stdio.h>

struct TreeNode{
    int val;
    TreeNode *lChild;
    TreeNode *rChild;
}Node[100];

int loc;

TreeNode* createTreeNode(){
    Node[loc].lChild = Node[loc].rChild = NULL;
    return &Node[loc];
}


TreeNode* buildBSTree(TreeNode *root, int val){
    TreeNode *pre = root;
    TreeNode *newNode = createTreeNode();
    newNode->val = val;
    while (pre != NULL){
        if (pre->val >= val){
            if (pre->rChild == NULL){
                pre ->rChild = newNode;
                break;
            }
            else{
                pre = pre->rChild;
            }
        }
        else{
            if (pre->lChild == NULL){
                pre->lChild = newNode;
                break;
            }
            else{
                pre = pre->lChild;
            }
        }
    }

    return root;
}

void preTravel(TreeNode *root){
    if (root != NULL){
        printf("%d ", root->val);
    }
    if (root ->lChild != NULL){
        preTravel(root->lChild);
    }
    if (root ->rChild != NULL){
        preTravel(root->rChild);
    }
}

int main(){
    int n;
    while(scanf("%d", &n)){
        int nums[n];
        for(int i = 0; i < n; i++){
            scanf("%d", &nums[i]);
        }
        TreeNode* root = createTreeNode();
        root->val = nums[0];
        for(int i = 1; i < n; i++){
            root = buildBSTree(root, nums[i]);
        }
        preTravel(root);
        printf("Hello World!\n");
    }
}
