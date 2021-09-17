package fastcampus.spring.batch.part4;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;

    @Enumerated(EnumType.STRING)
    private Level level = Level.NORMAL;

    private int totalAmount;

    private LocalDate updateDate;

    @Builder
    private User(String username, int totalAmount) {
        this.username = username;
        this.totalAmount = totalAmount;
    }

    public enum Level {
        VIP(500000, null),
        GOLD(500000, VIP),
        SILVER(300000, GOLD),
        NORMAL(200000, SILVER);

        private final int nextAmount;
        private final Level nextLevel;

        Level(int nextAmount, Level nextLevel) {
            this.nextAmount = nextAmount;
            this.nextLevel = nextLevel;
        }
    }
}
