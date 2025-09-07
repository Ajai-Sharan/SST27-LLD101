import java.nio.file.Path;
import java.util.List;

public class CsvProfileImporter implements ProfileImporter {

    private final NaiveCsvReader naiveCsvReader;
    private final ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader naiveCsvReader, ProfileService profileService) {
        this.naiveCsvReader = naiveCsvReader;
        this.profileService = profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = naiveCsvReader.read(csvFile);
        if (rows.isEmpty()) return 0;

        // assume first row is header
        int count = 0;
        for (int i = 1; i < rows.size(); i++) {
            String[] row = rows.get(i);
            if (row.length < 2) continue; // must have id + email

            String id = row[0].trim();
            String email = row[1].trim();
            String displayName = row.length > 2 ? row[2].trim() : "";

            if (id.isEmpty() || email.isEmpty()) continue; // skip invalid

            try {
                profileService.createProfile(id, email, displayName);
                count++;
            } catch (IllegalArgumentException e) {
                // bad email, skip
            }
        }
        return count;
    }
}
