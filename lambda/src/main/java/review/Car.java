package review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@EqualsAndHashCode
//@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
//@Data
//@Builder
public class Car {

    private String make;
    private int topSpeed;
    private int year;

//    static {
//        year = 2020;
//    }

//    Car(int year) {
//        this.year = year;
//    }

}
