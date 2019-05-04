package com.sub.array.sum.equal.given.value;

public class Main {

	public static void main(String[] args) {
		int[] input = {
			1, 2, 5, 5, 7
		};
		final int SUM_TO_MATCH = 12;
		SubArraySumEqualGivenValue solution = new SubArraySumEqualGivenValue();
		solution.findSubArray(input, 0, 0, SUM_TO_MATCH, 0);
		solution.findSubArray2(input,SUM_TO_MATCH);
	}
}

class SubArraySumEqualGivenValue {
	public void findSubArray2(int [] input,int targetSum) {
		int start=0,end=0;
		int sum = input[start];
		
		while(sum != targetSum) {
			if(sum < targetSum) sum += input[++end];
			else if(sum > targetSum) sum -=input[start++];
		}
		System.out.println(start +" " + end);
	}
	public void findSubArray(int[] input,int start, int end, int sumToMatch, int sum) {
		Result result = new Result();
		sum = input[start];
		while(sum != 12) {
			if(sum < sumToMatch) {
				end = end + 1;
				if(start == input.length || end == input.length) {
					result.setEnd(end);
					result.setStart(start);
					result.setSum(sum);
					System.out.println(result.toString());
					break;
				}
				sum = sum + input[end];
			} else if(sum > sumToMatch) {
				sum = sum - input[start];
				start = start + 1;
				if(start == input.length || end == input.length) {
					result.setEnd(end);
					result.setStart(start);
					result.setSum(sum);
					System.out.println(result.toString());
					break;
				}
			}
		}
		if(sum == sumToMatch) {
			result.setEnd(end);
			result.setStart(start);
			result.setSum(sum);
			System.out.println(result.toString());
		} else {
			result.setEnd(-1);
			result.setStart(-1);
			result.setSum(sum);
			System.out.println(result.toString());
		}
	}
	
} 

class Result {
	
	private int start;
	private int end;
	private int sum;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getSum() {
		return sum;
	}
	@Override
	public String toString() {
		return "Result [start=" + start + ", end=" + end + ", sum=" + sum + "]";
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
}