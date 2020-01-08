package memento;

public class Editor {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String undo(Editor edx) {
		if(edx.getContent() != null) {
			edx.setContent("");
		}
		return edx.getContent();
	}
}
