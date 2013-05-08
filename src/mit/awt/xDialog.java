package mit.awt;

public class xDialog extends java.awt.Dialog implements mit.awt.event.ComponentRaiser, mit.awt.event.ContainerRaiser, mit.awt.event.FocusRaiser, mit.awt.event.KeyRaiser, mit.awt.event.MouseRaiser, mit.awt.event.WindowRaiser
{
	private static final long serialVersionUID = 1L;
	private star.event.Adapter adapter = new star.event.Adapter(this);

	public star.event.Adapter getAdapter()
	{
		return this.adapter;
	}

	public java.awt.event.ComponentEvent getComponentEvent()
	{
		return component.getComponentEvent();
	}

	public java.awt.event.ContainerEvent getContainerEvent()
	{
		return container.getContainerEvent();
	}

	public java.awt.event.FocusEvent getFocusEvent()
	{
		return focus.getFocusEvent();
	}

	public java.awt.event.KeyEvent getKeyEvent()
	{
		return key.getKeyEvent();
	}

	public java.awt.event.MouseEvent getMouseEvent()
	{
		return mouse.getMouseEvent();
	}

	public java.awt.event.WindowEvent getWindowEvent()
	{
		return window.getWindowEvent();
	}

	protected mit.awt.event.ComponentAdapter component = new mit.awt.event.ComponentAdapter(this);
	protected mit.awt.event.ContainerAdapter container = new mit.awt.event.ContainerAdapter(this);
	protected mit.awt.event.FocusAdapter focus = new mit.awt.event.FocusAdapter(this);
	protected mit.awt.event.KeyAdapter key = new mit.awt.event.KeyAdapter(this);
	protected mit.awt.event.MouseAdapter mouse = new mit.awt.event.MouseAdapter(this);
	protected mit.awt.event.WindowAdapter window = new mit.awt.event.WindowAdapter(this);

	private java.awt.Container owner = null;

	public java.awt.Container getParent()
	{
		return this.owner;
	}

	public xDialog(java.awt.Container owner, java.awt.Frame frame)
	{
		super(frame);
		this.owner = owner;
	}

	public xDialog(java.awt.Container owner, java.awt.Frame frame, boolean modal)
	{
		super(frame, modal);
		this.owner = owner;
	}

	public xDialog(java.awt.Container owner, java.awt.Frame frame, String title)
	{
		super(frame, title);
		this.owner = owner;
	}

	public xDialog(java.awt.Container owner, java.awt.Frame frame, String title, boolean modal)
	{
		super(frame, title, modal);
		this.owner = owner;
	}

}