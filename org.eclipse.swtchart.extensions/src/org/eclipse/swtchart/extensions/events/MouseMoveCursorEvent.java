/*******************************************************************************
 * Copyright (c) 2017, 2020 Lablicate GmbH.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 * Frank Buloup - Internationalization
 *******************************************************************************/
package org.eclipse.swtchart.extensions.events;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ToolTip;
import org.eclipse.swtchart.extensions.core.BaseChart;
import org.eclipse.swtchart.extensions.core.IMouseSupport;
import org.eclipse.swtchart.extensions.core.ISeriesSettings;

public class MouseMoveCursorEvent extends AbstractHandledEventProcessor implements IHandledEventProcessor {

	private Cursor defaultCursor = null;
	private ToolTip tooltip = null;

	@Override
	public int getEvent() {

		return IMouseSupport.EVENT_MOUSE_MOVE;
	}

	@Override
	public int getStateMask() {

		return SWT.NONE;
	}

	@Override
	public void handleEvent(BaseChart baseChart, Event event) {

		Display display = baseChart.getDisplay();
		if(baseChart.getChartSettings().isEnableTooltips()) {
			if(defaultCursor == null) {
				defaultCursor = display.getSystemCursor(SWT.CURSOR_ARROW);
			}
			//
			if(tooltip == null) {
				tooltip = new ToolTip(display.getActiveShell(), SWT.NONE);
			}
			//
			String selectedSeriesId = baseChart.getSelectedseriesId(event);
			if(selectedSeriesId.equals("")) { //$NON-NLS-1$
				baseChart.setCursor(defaultCursor);
				tooltip.setVisible(false);
			} else {
				ISeriesSettings seriesSettings = baseChart.getSeriesSettings(selectedSeriesId);
				baseChart.setCursor(display.getSystemCursor(SWT.CURSOR_HAND));
				tooltip.setMessage(seriesSettings.getDescription());
				tooltip.setVisible(true);
				tooltip.setAutoHide(false);
			}
		}
	}
}
