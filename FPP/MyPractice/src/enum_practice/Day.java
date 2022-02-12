package enum_practice;

public enum Day {
	
        MONDAY("Monday"), TUESDAY("Tuesday"), OTHERS("others");

        String key;

        Day(String str) {
            key = str;
        }

        public String value() {
            return this.key;
        }
    
}
