package ifgram.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
  @Table(name = "usuarios")

  public class User {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

      @Column(nullable = false, length = 120)
    private String nome;

      @Column(nullable = false, unique = true)
    private String email;

    public User(@NotBlank String nome, @Email String email) {
    }

    public String getEmail() {
        return "";
    }
}
