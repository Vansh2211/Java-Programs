public class StringManipulation {
    public static void main(String[] args) {
        
        String str = " Today is a very good day ";
        System.out.println(str.length());
        System.out.println(str.charAt(12));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("z"));

        //String comparison
        String str2 = "today is a Very Good Day";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

        //substring
        System.out.println(str.substring(1,12));

        //trim - used to remove spaces
        System.out.println(str.trim());

        //replace
        System.out.println(str2.replace("", "-"));
        String date = "22-11-2002";
        System.out.println(date.replace("-", "/"));

        //split
        String newStr = "Today-is-a-good-day";
        System.out.println(str.split("-"));
    }
}
