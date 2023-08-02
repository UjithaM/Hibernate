package software.ujithamigara.OneToMany.dao.impl;

import software.ujithamigara.OneToMany.dao.AuthorDao;
import software.ujithamigara.OneToMany.entity.Author;

public class AuthorDaoImpl implements AuthorDao {
    @Override
    public boolean saveAuthor(Author author) {
        return false;
    }

    @Override
    public Author searchBook(int id) {
        return null;
    }

    @Override
    public boolean updateBook(Author author) {
        return false;
    }

    @Override
    public boolean deleteBook(Author author) {
        return false;
    }
}
