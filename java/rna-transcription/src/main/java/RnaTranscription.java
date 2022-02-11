class RnaTranscription {

    String transcribe(String dnaStrand) {

        String res = "";

        for (int i = 0; i < dnaStrand.length(); i++) {
            switch (dnaStrand.charAt(i)) {
                case 'G':
                    res += "C";
                    break;
                case 'C':
                    res += "G";
                    break;
                case 'T':
                    res += "A";
                    break;
                case 'A':
                    res += "U";
                    break;
                default:
                    res += String.valueOf(dnaStrand.charAt(i));
                    break;
            }
        }

        return res;

    }

}
