enum Color {
    GREEN, RED, YELLOW, BLUE, UNKNOWN
}

enum Type {
    FLOWER, TREE, SHRUB, UNKNOWN
}

class ColorException extends Exception {
    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {
    public TypeException(String message) {
        super(message);
    }
}

class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        verifySize(size);
        verifyColorAndType(color, type);

        this.size = size;
        this.color = color;
        this.type = type;
    }

    private void verifySize(int size) throws IllegalArgumentException {
        if (size < 1 || size > 300) {
            throw new IllegalArgumentException("Size of the plant must be between 1 and 300.");
        }
    }

    private void verifyColorAndType(Color color, Type type) throws ColorException, TypeException {
        if (color == Color.UNKNOWN) {
            throw new ColorException("Invalid color for the plant.");
        }
        if (type == Type.UNKNOWN) {
            throw new TypeException("Invalid type for the plant.");
        }
    }

    @Override
    public String toString() {
        return "Plant { size=" + size + ", color=" + color + ", type=" + type + " }";
    }
}

public class pr2_lesson12 {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        try {
            plants[0] = new Plant(100, Color.RED, Type.FLOWER);
            plants[1] = new Plant(150, Color.GREEN, Type.TREE);
            plants[2] = new Plant(50, Color.YELLOW, Type.SHRUB);
            plants[3] = new Plant(250, Color.BLUE, Type.FLOWER);
            plants[4] = new Plant(10, Color.UNKNOWN, Type.TREE);

        } catch (ColorException | TypeException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Plant plant : plants) {
            if (plant != null) {
                System.out.println(plant);
            }
        }
    }
}
