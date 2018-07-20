#include <stdio.h>
#include <string.h>


struct TreeNode{
    char ch;
    TreeNode *left;
    TreeNode *right;
}nodes[54];

char chs1[26];
char chs2[26];
int nodeNum;

TreeNode* Create(){
    nodes[nodeNum].left = nodes[nodeNum].right = NULL;
    return &nodes[nodeNum++];
}

TreeNode* rebuildTree(int left1, int right1, int left2, int right2){
    TreeNode* root = Create();
    root->ch = chs1[left1];
    int rootIndex = left2;
    for(int i = left2; i <= right2; i++){
        if (chs2[i] == chs1[left1]){
            rootIndex == i;
            break;
        }
    }

    int leftLength = rootIndex - left2;
    int rightLength = right2 - rootIndex;
    if (leftLength > 0){
        //printf("Left\n");
        root->left = rebuildTree(left1 + 1, left1 + leftLength, left2, rootIndex - 1);
    }
    if (rightLength > 0){
        //printf("Right\n");
        root->right = rebuildTree(left1 + leftLength + 1, right1, rootIndex + 1, right2);
    }
    return root;
}

void travelBinary(TreeNode* root){
    if(root == NULL)
        return;
    if (root->left != NULL){
        travelBinary(root->left);
    }
    if (root->right != NULL){
        travelBinary(root->right);
    }
    printf("%c", root->ch);
}

int main(){
    printf("Hello World\n");
    while(scanf("%s%s", chs1, chs2) != EOF){
        nodeNum = 0;
        int right1 = strlen(chs1) - 1;
        int right2 = strlen(chs2) - 1;
        TreeNode *root = rebuildTree(0, right1, 0, right2);
        travelBinary(root);
        printf("\n");
    }
    return 0;
}

