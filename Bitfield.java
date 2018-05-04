// WIP Chris V.
public class Bitfield {


	public static enum Flag {
	
	}




}

public boolean isEnabled(final int flag) {
	        return (current & flag) == flag;
			    }

    public int current() {
		        return current;
				    }

    public void enable(final int flag) {
		        current |= flag;
				    }

    public void delete(final int flag) {
		        current &= ~flag;
				    }

    public void toggle(final int flag) {
		        current ^= flag;
				    }

