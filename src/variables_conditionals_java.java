public class variables_conditionals_java {
    int age;
    boolean is_subscribed;
    public variables_conditionals_java(int user_age, boolean subscribed_or_not){
        age = user_age;
        is_subscribed = subscribed_or_not;
    }
    public String toString(){
        if(age > 18 && is_subscribed == false){
            return "user is older than 18 and not subscribed";
        } else if (age < 18 && is_subscribed == true){
            return "user is younger than 18 and subscribed";
        } else if (age > 18 && is_subscribed == true){
            return "user is older than 18 and subscribed";
        } else {
            return "user is younger than 18 and not subscribed";
        }
    }
    public static void main(String[] args){
    variables_conditionals_java user_one = new variables_conditionals_java(19,true);
    System.out.print(user_one);
    }
}
