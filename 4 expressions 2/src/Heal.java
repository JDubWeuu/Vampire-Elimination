public class Heal {
    private int x_pos;
    private int y_pos;
    private boolean picked;
    
    public Heal(int x_pos, int y_pos) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        picked = false;
    }

    public int get_x() {
        return x_pos;
    }

    public int get_y() {
        return y_pos;
    }

    public boolean get_picked() {
        return picked;
    }

    public boolean pickedUp() {
        if (picked) {
            return true;
        }
        else {
            return false;
        }
    }   
}
