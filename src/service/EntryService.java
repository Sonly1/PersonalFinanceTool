package service;

import model.Entry;
import java.util.ArrayList;
import java.util.List;

public class EntryService {
    private List<Entry> entries;

    public EntryService() {
        entries = new ArrayList<>();
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public void removeEntry(Entry entry) {
        entries.remove(entry);
    }

    public List<Entry> getAllEntries() {
        return entries;
    }
}
