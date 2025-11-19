package Java_8;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestSpent {
    record Transaction(String id, LocalDate loacalDate,int amount){}

    public static void main(String[] args) {
        List<Transaction> transactions=List.of(
                new Transaction("T1", LocalDate.of(2024,1,1),300),
                new Transaction("T2",LocalDate.of(2024,1,1),200),
                new Transaction("T3",LocalDate.of(2024,1,2),400),
                new Transaction("T4",LocalDate.of(2024,1,3),300),
                new Transaction("T5",LocalDate.of(2024,1,3),100)

        );
        System.out.println(transactions);
        LocalDate date=transactions.stream().collect(Collectors.groupingBy(i->i.loacalDate, LinkedHashMap::new,Collectors.summingInt(i->i.amount))).entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        System.out.println(date);
    }
}
