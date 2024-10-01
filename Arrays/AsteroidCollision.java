import java.util.*;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] arr) 
        int n = arr.length;
        for(int i=1; i<n; i++){
            for(int j=i; j>0; j--){
                if(arr[j-1]>-1 && arr[i]<0){
                    if(Math.abs(arr[j-1])<Math.abs(arr[i])){
                        arr[j-1] = 0;
                    }
                    else if(Math.abs(arr[j-1]) == Math.abs(arr[i])){
                        arr[j-1]=0;
                        arr[i]=0;
                        break;
                    }
                    else{
                        arr[i]=0;
                        break;
                    }
                }
                else{
                    break;
                }
            }
        }
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                newArr.add(arr[i]);
            }
        }


        int ans[] = new int[newArr.size()];
        for(int i=0; i<newArr.size(); i++){
            if(newArr.get(i) != 0){
                ans[i]=newArr.get(i);
            }
        }

        return ans;
    }
}
