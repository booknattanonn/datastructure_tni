
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 23, 67, 8, 91, 45, 12, 78};
		
		System.out.println("Length = " + nums.length);
		System.out.println("The firth element = " + nums[0]);
		System.out.println("The last element = " + nums[nums.length-1]);
		System.out.println("The middle element = " + nums[nums.length/2]);
		
		System.out.println("\nDisplay all elements:");
		boolean fisrt_element =true;
		for(int num : nums) {
//			if (fisrt_element == false) {
//				System.out.print(",");
//			}
			System.out.print((fisrt_element  ? "," : "") + num);
			fisrt_element = false;
		}
	}

}
