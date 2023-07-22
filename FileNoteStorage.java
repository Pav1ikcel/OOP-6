import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileNoteStorage implements NoteStorage {
    private String filePath;

    public FileNoteStorage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(Note note) {
        // Реализация сохранения записи в файл
    }

    @Override
    public void update(Note note) {
        // Реализация обновления записи в файле
    }

    @Override
    public void delete(int id) {
        // Реализация удаления записи из файла
    }

    @Override
    public List<Note> getAll() {
        // Реализация получения всех записей из файла
        return new ArrayList<>();
    }

    @Override
    public Note getById(int id) {
        // Реализация получения записи по Id из файла
        return null;
    }
}
