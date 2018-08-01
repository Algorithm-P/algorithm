class Solution {
  public int[] solution(long n) {
      int[] answer = {};
      String num = Long.toString(n);
      answer = new int[num.length()];
      for(int i=0; i<num.length(); i++){
          answer[i] = num.charAt(num.length()-i-1)-48;
      }
      return answer;
  }
}
