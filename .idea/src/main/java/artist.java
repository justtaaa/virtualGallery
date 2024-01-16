@Entity
public class artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    // other fields, constructors, getters, and setters
}
