package DynamicProgramming;

public class UniqueTrees {
    public int numTrees(int n) {
        int[] tree  = new int[n+1];
        tree[0] = 1;
        tree[1] =1;

        for(int i=2;i<=n;i++){
            int toal = 0;
            for(int j=2;j<=n;j++){
                int l = i -1;
                int r = n - i;
                toal += tree[l] * tree[r];
            }
            tree[i] = toal;
        }
        return tree[n];
    }
}
