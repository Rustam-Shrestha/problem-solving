public class ProductExceptSelfUsingDynamicPrograming {
        public int[] productExceptSelf(int[] nums) {
            int[] prefixProduct = new int[nums.length];
            prefixProduct[0] = 1;

            // Build prefix product
            for (int i = 1; i < nums.length; i++) {
                prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
            }

            int suffixProduct = 1;

            // Multiply by suffix product in reverse
            for (int i = nums.length - 1; i >= 0; i--) {
                prefixProduct[i] = prefixProduct[i] * suffixProduct;
                suffixProduct = suffixProduct * nums[i];
            }

            return prefixProduct;
        }

}
