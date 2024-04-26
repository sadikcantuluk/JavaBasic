package GenericUse;

public interface IEntityRepository<T extends IEntity> {
    void Add(T entity);
    void Delete(T entity);
    void Update(T entity);
    void Read(T entity);
}
