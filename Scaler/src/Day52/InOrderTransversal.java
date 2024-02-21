package Day52;

import java.util.ArrayList;

public class InOrderTransversal {

	static ArrayList<Integer> ans = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static ArrayList<Integer> preOrderTransversal(TreeNode A) {
		if(A==null){
            return ans;
        }

		preOrderTransversal(A.left);
		ans.add(A.data);
		preOrderTransversal(A.right);
		
		return ans;
	}
}
