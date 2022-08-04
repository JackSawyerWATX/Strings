class Main {
    public static void main (String[] args){
        String str1 = "Hi! Nice to meet you! ";

        String str2 = new String("Welcome to Java!");

        System.out.println(str1.toUpperCase());

        System.out.println(str2.toLowerCase());

        System.out.println(str1.length());

        System.out.println(str1+str2);

        System.out.println(str1.concat(str2));

        System.out.println(str1.charAt(4));

        System.out.println(str1.substring(4,8)+str1.charAt(2));
    }
}