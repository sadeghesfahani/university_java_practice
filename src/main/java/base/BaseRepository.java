package base;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
public abstract class BaseRepository<T extends BaseEntity> {

    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> entityClass;

    public BaseRepository(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public T find(Long id) {
        return entityManager.find(entityClass, id);
    }

    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }

    public T update(T entity) {
        return entityManager.merge(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }
}