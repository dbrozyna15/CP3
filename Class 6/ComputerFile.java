public class ComputerFile
{
    static int classId = 0;
    
    boolean isInBin = false;
    private int id;
    private int size = 0;
    private String name;
    private String extension;
    private String location;
    private String type;
    private String content;
    
    public String toString() {
        return (
            "-------------------------\n" +
            getName() + getExtension() + "\n" + getDetails() +
            "\n-------------------------"
        );
    }
    
    public String getDetails() {
        return (
            "- ID: " + getId() + "\n" +
            "- Type: " + getType() + "\n" +
            "- Size: " + getSize() + " bytes\n" +
            "- Location: " + getLocation()
        );
    }
    
    public ComputerFile(
            String name,
            String extension,
            String location
        ) {
            
            setId();
            setName(name);
            setExtension(extension);
            setLocation(location);
            setType(ComputerFile.getTypeByExtension(extension));
    }
    
    public ComputerFile(
            String name,
            String extension
        ) {
            
            
            setId();
            setName(name);
            setExtension(extension);
            setLocation("\\");
            setType(ComputerFile.getTypeByExtension(getExtension()));
    }
    
    // Id
    public int getId() {
        return this.id;
    }
    
    public void setId() {
        ComputerFile.classId += 1;
        this.id = ComputerFile.classId;
    }
    
    // Name
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        if (newName.length() < 15) {
            this.name = newName;
        }
    }
    
    // Content
    public String getContent() {
        return this.content;
    }
    
    public String setContent(String newContent) {
        setSize(newContent.length());
        return this.content = newContent;
    }
    
    // Location
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String newLocation) {
        this.location = newLocation;
    }
    
    // Extension
    public String getExtension() {
        return this.extension;
    }
    
    public void setExtension(String newExtension) {
        this.extension = newExtension;
    }
    
    // Type
    public String getType() {
        return this.type;
    }
    
    public void setType(String newType) {
        this.type = newType;
    }
    
    // Size
    public int getSize() {
        return this.size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    // Other Methods
    public void moveToBin() {
        System.out.println("> Moving the file " + getName() + getExtension() + " to a bin...");
        setLocation("\\bin");
    }
    
    public boolean isInBin() {
        return getLocation() == "\\bin";
    }
    
    public ComputerFile createShortcut() {
        System.out.println("> Creating a shortcut of " + getName() + getExtension());
        return new ComputerFile(getName() + " - Copy", getExtension(), getLocation());
    }
    
    public void rename(String newName) {
        setName(newName);
        System.out.println(
            "> A file " + getName() + getExtension() +
            " has changed its name to " + newName + getExtension()
            );
    }
    
    public void open() {
        System.out.println(
            "> Opening the file...\n\n" + getContent() + "\n"
        );
    }
    
    public void close() {
        System.out.println("> Closing the file...");
    }
    
    public static String getTypeByExtension(String ext) {
        if (ext == ".txt") {
            return "Text Document";
        }
        
        if (ext == ".html" || ext == ".htm") {
            return "HTML Document";
        }
        
        if (ext == ".exe") {
            return "Application";
        }
        
        throw new java.lang.RuntimeException("We don't have such an extension!");
    }
    
    public static void main(String[] args) {
        ComputerFile f1 = new ComputerFile("MyDoc1", ".txt", "\\Desktop");
        System.out.println(f1);
        
        ComputerFile cloneF1 = f1.createShortcut();
        System.out.println(cloneF1);
        
        cloneF1.moveToBin();
        System.out.println(cloneF1);
        
        ComputerFile f2 = new ComputerFile("MYAPP", ".exe");
        System.out.println(f2);
        
        f1.rename("English_Assignment");
        f1.setLocation("\\Desktop\\Assignments");
        f1.setContent("Lorem ipsum dolor sit \namet consectetur adipiscing elit");
        f1.open();
        f1.close();
        System.out.println(f1);
    }
}
