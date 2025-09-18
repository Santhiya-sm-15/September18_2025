# September18_2025
The problem that I solved today

Given a circular integer array arr[], the task is to determine the next greater element (NGE) for each element in the array.

The next greater element of an element arr[i] is the first element that is greater than arr[i] when traversing circularly. If no such element exists, return -1 for that position.

Note: Since the array is circular, after reaching the last element, the search continues from the beginning until we have looked at all elements once.

Code:
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
