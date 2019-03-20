package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 吴亚斌
 * create : 2019-03-20 20:54
 * description
 */
class Solution {
    public static List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public static boolean[] visit = new boolean[100];//标记是否访问过

    //[1,2,2]
    //[2,2,2,2,2]
    //[10] [1100]
    //[111] [000]
    //[0,1]不合法

    public void robot (int index, int[] nums){
        if(index>=nums.length){
            //record ans
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i =0;i<nums.length;i++){
                if(visit[i]){
                    tmp.add(nums[i]);
                }

            }
            ans.add(tmp);
            return;
        }
        if(index>0&&nums[index-1] ==nums[index]&&visit[index-1]==false){
            //排除01情况
            visit[index] = false;
            robot(index+1,nums);
        }else{
            //取还是不取，两种
            visit[index] = true;
            robot(index+1,nums);
            visit[index] = false;
            robot(index+1,nums);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.clear();
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (nums[i] > nums[j]){
                    int t = nums[i];
                    nums[i] =nums[j];
                    nums[j] = t;
                }
            }
        }
        robot(0,nums);
        return ans;

    }
}
public class dfs_90 {

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Solution solution = new Solution();
        solution.subsetsWithDup(nums);
    }

}
