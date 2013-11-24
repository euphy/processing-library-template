package polargraph.queue;

import polargraph.comms.Command;

public class QueuedCommand extends Command {
	private Boolean priority = false;
	public QueuedCommand(Command c) {
		super(c);
	}
	public QueuedCommand promote() {
		this.priority = true;
		return this;
	}
	public Boolean isPriority() {
		return this.isPriority();
	}
	public int compareTo(Object o) {
		try {
			QueuedCommand c = (QueuedCommand) o;
			return this.isPriority().compareTo(c.isPriority());
		}
		catch (Exception e) {
			return 1;
		}
	}
}
