class Solution {

		public int[] sortArray(int[] nums) {
			mergeSort(nums, 0, nums.length - 1);
			return nums;
		}

		public void mergeSort(int[] nums, int start, int end) {
			if (start >= end) {
				return;
			}
			int mid = start + (end - start) / 2;
			mergeSort(nums, start, mid);
			mergeSort(nums, mid + 1, end);
			merge(nums, start, end);
		}

		public void merge(int[] nums, int start, int end) {
			int mid = start + (end - start) / 2;
			int[] temp = new int[end - start + 1];
			int leftStart = start;
			int leftEnd = mid;
			int rightStart = mid + 1;
			int rightEnd = end;
			int i = 0;
			while (leftStart <= leftEnd && rightStart <= rightEnd) {
				if (nums[leftStart] <= nums[rightStart]) {
					temp[i] = nums[leftStart];
					leftStart++;
				} else {
					temp[i] = nums[rightStart];
					rightStart++;
				}
				i++;
			}
			while (leftStart <= leftEnd) {
				temp[i] = nums[leftStart];
				leftStart++;
				i++;
			}
			while (rightStart <= rightEnd) {
				temp[i] = nums[rightStart];
				rightStart++;
				i++;
			}
			for (int j = 0; j < i; j++) {
				nums[start + j] = temp[j];
			}
		}

		private void swap(int[] nums, int i, int j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

	}