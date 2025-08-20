class BankAccount {                          // BankAccount নামে একটি ক্লাস শুরু
    private String accountHolder;            // accountHolder ভেরিয়েবল: শুধু ক্লাসের ভেতরে দেখা যাবে (private)
    private double balance;                  // balance ভেরিয়েবল: অ্যাকাউন্টের টাকার পরিমাণ, এটাও private

    // Constructor: নতুন অবজেক্ট বানানোর সময় প্রাথমিক মান সেট করবে
    public BankAccount(String accountHolder, double balance) {  // কনস্ট্রাক্টর শুরু
        this.accountHolder = accountHolder;   // প্যারামিটারের মান ক্লাসের ফিল্ডে সেট করা
        this.balance = balance;               // শুরুর ব্যালেন্স সেট করা
    }                                         // কনস্ট্রাক্টর শেষ

    // Getter: accountHolder পড়ার উপায় (পড়তে পারবে, কিন্তু সরাসরি পরিবর্তন করতে পারবে না)
    public String getAccountHolder() {        // মেথড শুরু
        return accountHolder;                 // accountHolder এর মান রিটার্ন করছে
    }                                         // মেথড শেষ

    // Getter: balance পড়ার উপায়
    public double getBalance() {              // মেথড শুরু
        return balance;                       // বর্তমান ব্যালেন্স রিটার্ন করছে
    }                                         // মেথড শেষ

    // Setter-এর মতো কাজ: জমা দেওয়ার মাধ্যমে balance নিরাপদে পরিবর্তন
    public void deposit(double amount) {      // deposit মেথড: কত টাকা যোগ হবে
        if (amount > 0) {                     // ইনপুট পজিটিভ কি না চেক
            balance += amount;                // ব্যালেন্সে amount যোগ করা
            System.out.println(amount + " টাকা জমা হয়েছে।");  // সফল হলে মেসেজ
        } else {                              
            System.out.println("ভুল পরিমাণ!"); // নেগেটিভ/শূন্য হলে সতর্ক বার্তা
        }
    }                                         // deposit মেথড শেষ

    // Setter-এর মতো কাজ: উত্তোলনের মাধ্যমে balance নিরাপদে পরিবর্তন
    public void withdraw(double amount) {     // withdraw মেথড
        if (amount > 0 && amount <= balance) {// টাকাটা পজিটিভ এবং ব্যালেন্সের মধ্যে আছে?
            balance -= amount;                // ব্যালেন্স থেকে amount কমানো
            System.out.println(amount + " টাকা উত্তোলন হয়েছে।"); // সফল হলে মেসেজ
        } else {
            System.out.println("অপর্যাপ্ত ব্যালেন্স অথবা ভুল পরিমাণ!"); // শর্ত না মিললে বার্তা
        }
    }                                         // withdraw মেথড শেষ
}                                             // BankAccount ক্লাস শেষ

public class Main {                           // Main নামে আরেকটি public ক্লাস (প্রোগ্রামের এন্ট্রিপয়েন্ট)
    public static void main(String[] args) {  // main মেথড: প্রোগ্রাম এখান থেকেই রান হয়
        BankAccount account = new BankAccount("Rahim", 5000); // নতুন অ্যাকাউন্ট অবজেক্ট তৈরি, নাম Rahim, শুরু ব্যালেন্স 5000

        System.out.println("অ্যাকাউন্ট হোল্ডার: " + account.getAccountHolder()); // Getter দিয়ে নাম প্রিন্ট
        System.out.println("শুরু ব্যালেন্স: " + account.getBalance());          // Getter দিয়ে শুরুর ব্যালেন্স প্রিন্ট

        account.deposit(2000);               // 2000 টাকা জমা দেওয়া (balance = 5000 + 2000 = 7000)
        System.out.println("নতুন ব্যালেন্স: " + account.getBalance()); // জমার পর আপডেটেড ব্যালেন্স প্রিন্ট

        account.withdraw(3000);              // 3000 টাকা তোলা (balance = 7000 - 3000 = 4000)
        System.out.println("শেষ ব্যালেন্স: " + account.getBalance()); // চূড়ান্ত ব্যালেন্স প্রিন্ট
    }                                         // main মেথড শেষ
}                                             // Main ক্লাস শেষ
