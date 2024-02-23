package AccesSpecifier;

public class AccesSpecifier {
    public static void main(String[] args) {
        AccesSpecifier accessLevel = new AccesSpecifier();
        System.out.println(accessLevel.publicString());
        System.out.println(accessLevel.defaultString());
        System.out.println(accessLevel.protectedString());
        System.out.println(accessLevel.privateString());

    }
    public String publicString() {
        return "public string";
    }
    private String privateString()
    {
        return "private string";
    }
    protected String protectedString() {
        return "protected string";
    }
    String defaultString() {
        return "default string";
    }
}
