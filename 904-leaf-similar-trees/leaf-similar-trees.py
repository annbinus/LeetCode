# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def leafSimilar(self, root1, root2):
        """
        :type root1: Optional[TreeNode]
        :type root2: Optional[TreeNode]
        :rtype: bool
        """
        leaves1 = []
        leaves2 = []

        def getnode(node, leaves):
            if not node:
                return
            if not node.left and not node.right:
                leaves.append(node.val)
            getnode(node.left, leaves)
            getnode(node.right, leaves)

        getnode(root1, leaves1)
        getnode(root2, leaves2)

        return leaves1 == leaves2
