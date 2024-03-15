package kodlama.io.rentACar.business.ruquests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRuquest {
    @NotBlank
    @Size(min = 3,max = 20)
    private String name;
}
