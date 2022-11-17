package pb402;

public class Button {
	OnClickListener listener;
	

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}


	interface OnClickListener{
		void onClick();
	}
}
