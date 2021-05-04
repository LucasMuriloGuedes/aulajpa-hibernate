import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Lucas Murilo", "lucas@yahoo.com");
        Pessoa p2 = new Pessoa(null, "Mara Stephanie", "mara@hotmail.com");
        Pessoa p3 = new Pessoa(null, "Lorenzo Reyes", "lorenzo@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);

        em.getTransaction().commit();
        System.out.println("Pronto!");

    }
}
