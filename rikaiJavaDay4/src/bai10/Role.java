package bai10;

public enum Role {

    ADMIN("admin", 4, true),
    STUDENT("student", 1, false);

    private final String label;
    private final int level;
    private final boolean canEdit;

    Role(String label, int level, boolean canEdit) {
        this.label = label;
        this.level = level;
        this.canEdit = canEdit;
    }

    public String getLabel() {
        return label;
    }

    public int getLevel() {
        return level;
    }

    public boolean canEdit() {
        return canEdit;
    }

    public static Role getByLabel(String label) {
        for (Role role : values()) {
            if (role.label.equalsIgnoreCase(label)) {
                return role;
            }
        }
        return null;
    }

    public static Role getByLevel(int level) {
        for (Role role : values()) {
            if (role.level == level) {
                return role;
            }
        }
        return null;
    }
}