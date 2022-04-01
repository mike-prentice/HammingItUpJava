package zipcode;

public class Hamming {
    String str2 = "";
    String str3 = "";

    public Hamming(String s, String s1) {
      str2 = s;
      str3 = s1;
        if (str2.length() != str3.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance()  {
        int i = 0;
        int hammingDist = 0;

            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) != str3.charAt(j)) {
                    hammingDist++;
                }
            } return hammingDist;
        }

}
