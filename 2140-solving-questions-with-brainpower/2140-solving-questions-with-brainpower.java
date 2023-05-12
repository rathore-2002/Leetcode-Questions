class Solution {
	public long mostPoints(int[][] questions) {
		long[] mark = new long [questions.length+1];

		for(int i= questions.length-1; i>=0; i--){
			int future = questions[i][1] + i + 1;

			if(future > questions.length -1) mark[i] = questions[i][0];
			else mark[i] = questions[i][0] + mark[future];

			mark[i] = Math.max(mark[i], mark[i+1]);
		}
		return mark[0];
	}
}