class TwelveDays {

    final String[] day = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    final String[] item = {"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};

    private String makeVerse (int i) {
        String result = "On the " + day[i-1] + " day of Christmas my true love gave to me: ";
        if (i == 1) return result + item[0] + ".";
        else {
            for (int j = i-1; j > 0 ; j--) {
                result += item[j];
                if (j > 1) result += ", ";
            }
            return result + ", and " + item[0] + ".";
        }
    }

    String verse(int verseNumber) {
        return makeVerse(verseNumber) + "\n";
    }

    String verses(int startVerse, int endVerse) {
        String result = "";
        for (int i = startVerse; i <= endVerse; i++) {
            result += makeVerse(i) + "\n";
            if (i < endVerse) result += "\n";
        }
        return result;
    }
    
    String sing() {
        return verses(1, 12);
    }

}
