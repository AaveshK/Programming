class Solution
{
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> level= new ArrayList<>();
            for(int i = 0; i < size; i++)
            {
                TreeNode current = q.poll();
                level.add(current.val);
                if(current.left != null)
                    q.offer(current.left);
                if(current.right != null)
                    q.offer(current.right);
            }
            list.add(level);
        }
        return list;
    }
}