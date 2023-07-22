import java.util.List;

public interface NoteStorage {
    void save(Note note);
    void update(Note note);
    void delete(int id);
    List<Note> getAll();
    Note getById(int id);
}
