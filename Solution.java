class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>(n);
        for(int i=0;i<n;i++)
            res.add(-1);
        Stack<Integer> st=new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            if(!st.isEmpty())
                res.set(i,st.peek());
            else
                res.set(i,-1);
            st.push(arr[i]);
        }
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            if(!st.isEmpty())
                res.set(i,st.peek());
            else
                res.set(i,-1);
            st.push(arr[i]);
        }
        return res;
    }
}