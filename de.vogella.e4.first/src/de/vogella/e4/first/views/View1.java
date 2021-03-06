package de.vogella.e4.first.views;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.services.IDisposable;

public class View1 implements IDisposable {

	public View1(Composite parent, final IEclipseContext outputContext) {
		Label label = new Label(parent, SWT.NONE);
		label.setText("E4 is new");
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
		gridData.horizontalIndent = 20;
		label.setLayoutData(gridData);
		Text text = new Text(parent, SWT.NONE);
		text.setText("and different");
		GridLayoutFactory.fillDefaults().generateLayout(parent);
	}

	public void dispose() {

	}

}
