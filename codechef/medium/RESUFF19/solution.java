class Codechef {
    public static void main(String[] args) {
        String password = "mypass123";
        
        // Use a ternary operator to check the password strength
        String strength;
        int count = 0;
        for(int i = 0 ; i<=password.length() ; i++){
            count += 1;
        }
        strength = (count < 8)?"Weak":"Strong";
        System.out.println("Password strength: " + strength);
    }
}
