package ie.atu.week6_lab4;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @PositiveOrZero(message = "id is invalid")
    private int id;
    @PositiveOrZero(message = "invalid price entered")
    private double price;
}
