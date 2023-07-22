public class Main {
    public static void main(String[] args) {
        NoteStorage noteStorage = new FileNoteStorage("notes.txt");
        NoteBook noteBook = new NoteBook(noteStorage);

        // Здесь можно реализовать меню и обработку команд пользователя
        // Пример:
        noteBook.createNote();
        noteBook.editNote();
        noteBook.deleteNote();
        noteBook.viewAllNotes();
        noteBook.viewNoteById();
    }
}

