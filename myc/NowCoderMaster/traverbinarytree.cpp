#include <iostream>

using namespace std;
int index;

struct TreeNode{
    char val;
    struct TreeNode * left, *right;
    TreeNode(char c) : val(c), left(NULL), right(NULL){}
};

TreeNode* createTree(string str){
    char c = str[index++];
    if (c == '#') {
        return NULL;
    }
    TreeNode *root = new TreeNode(c);
    root->left = createTree(str);
    root->right = createTree(str);
    return root;
}

void inOrderTraversal(TreeNode* root){
    if (root == NULL){
        return;
    }
    inOrderTraversal(root->left);
    cout << root->val << " ";
    inOrderTraversal(root->right);
}

int main(){
    string str;
    index = 0;
    while (cin >> str){
        TreeNode *root = createTree(str);
        inOrderTraversal(root);
        cout << endl;
    }
}
