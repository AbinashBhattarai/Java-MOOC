public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return false;
        }
        if(!(obj instanceof Archive)) {
            return false;
        }

        Archive compareArchive = (Archive) obj;
        return this.identifier.equals(compareArchive.identifier);
    }

    @Override 
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
