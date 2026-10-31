import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    List<T> pipes;

    public Pipe() {
        this.pipes = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }

    public T takeFromPipe() {
        if (this.pipes.isEmpty()) {
            return null;
        }

        T result = this.pipes.remove(0);
        return result;
    }

    public boolean isInPipe() {
        if (this.pipes.isEmpty()) {
            return false;
        }
        return true;
    }
}
