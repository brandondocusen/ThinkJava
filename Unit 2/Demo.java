class Demo {
    public static void main(String ar[]) {
        Account usAccount = new Account("US account", 100.00);
        System.out.println("Intial state");
        System.out.println(usAccount.name + " " + usAccount.Balance());
        usAccount.Deposit(20);
        System.out.println("The balance of the US account is now: " + usAccount.Balance());
        System.out.println("Ending balance");
        System.out.println(usAccount.name + " " + usAccount.Balance());
    }
}