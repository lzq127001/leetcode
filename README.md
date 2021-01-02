# leetcode
刷题
使用git

* 判断一个链表是否为回文结构 

准备一个栈，遍历链表到栈中，从栈中弹出，和链表一一比较，相同则是回文。

* 荷兰国旗问题可以用去优化快排算法。

因为荷兰国旗问题中间是一堆数确定了位置，而普通的partition只确定了一个位置。

* 自己写一下二叉树的寻找后继节点问题（前驱节点也就类似）。

在初级5 70分钟

* 怎么判断一颗树是否是完全二叉树。

要用层次遍历来，遍历的每个节点都必须顺序经过一下两个判断。
（1）该节点只有右节点没有左节点，直接返回false。
（2）该节点如果是子结点数不全的情况（只有左节点或没有节点），接下来遍历的所有节点都必须是叶节点，否则返回false。（自己画一下图看看，逻辑是这个逻辑，但是不好想。）

* 求一颗完全二叉树的节点个数，要求时间复杂度小于O(N)。初级5 170分钟

先遍历最左节点算出这棵树的总高度h，再求出根节点的右子树的高度，如果等于h，
则左子树为满二叉树，用2^n - 1即为左子树的节点数，再+1就算上了根节点，接下来
只要递归右子树即可。（算法一样）
如果右子树的高度小于h，说明左子树不满，但是右子树是满的，右子树的节点数为2^n - 1,
一样可以求，接着只需要递归左子树即可。