import java.util.*;

class commonElemnt
{
   ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3)
   {
       // code here
       ArrayList<Integer> ans;
       Set<Integer> st;
       int i,j,k;
       i=j=k=0;
       while(i<n1 && j<n2 && k<n3){
           if(a[i]==b[j] && b[j]==c[k]){
               st.add(a[i]);
               i++;j++;k++;
           }
           else if(a[i]<b[j]){
               i++;
           }
           else if(b[j]<c[k]){
               j++;
           }
           else{
               k++;
           }
       }
       for(int i=0 i<st,size(); i++){
                           ans.add(i);

       }

       for(Integer i:st){
           ans.add(i);
       }
       return ans;
   }
}
