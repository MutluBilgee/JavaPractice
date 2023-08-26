package Tasks;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {
        //1- Find all transactions in 2011 and sort by value
        System.out.println("------------task1-------------");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);


        //2-What are all the unique cities where the traders work?
        System.out.println("------------task2-------------");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name
        System.out.println("------------task3-------------");
        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //4- Return a string of all trader's names sorted alphabetically
        System.out.println("------------task4-------------");
       String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2)->name1+name2+ " ");
        System.out.println(result);


        //5- Are any traders based in Milan?
        //6- Print the values of all transactions from the traders living in Cambridge
        //7 - What is the highest value of all the transactions
        //8-Find the transaction with the smallest value
    }
}
