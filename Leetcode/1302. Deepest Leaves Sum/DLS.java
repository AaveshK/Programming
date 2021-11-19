class Solution
{
    public int deepestLeavesSum(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        while(!q.isEmpty())
        {
            sum = 0;
            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode current = q.poll();
                sum += current.val;
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
            }
        }
        return sum;
    }
}