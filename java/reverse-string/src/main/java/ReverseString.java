class ReverseString {

    String reverse(String inputString) {

        String res = "";

        for (int i = inputString.length(); i > 0; i--) {
            res += String.valueOf(inputString.charAt(i-1));
        }
        return res;

    }
  
}
