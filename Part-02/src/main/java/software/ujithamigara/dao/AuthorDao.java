package software.ujithamigara.dao;

import software.ujithamigara.entity.Author;

public interface AuthorDao {
    public boolean saveAuthor(Author author);
    public Author searchBook(int id);
    public boolean updateBook(Author author);
    public boolean deleteBook(Author author);
}
