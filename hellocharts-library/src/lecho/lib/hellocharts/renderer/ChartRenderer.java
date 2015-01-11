package lecho.lib.hellocharts.renderer;

import lecho.lib.hellocharts.model.SelectedValue;
import lecho.lib.hellocharts.model.Viewport;
import android.graphics.Canvas;

/**
 * Interface for all chart renderer.
 */
public interface ChartRenderer {

	public void onChartSizeChanged();
	public void onChartDataChanged();
	public void onChartViewportChanged();

	/**
	 * Draw chart data.
	 */
	public void draw(Canvas canvas);

	/**
	 * Draw chart data that should not be clipped to contentRectMinusAllMargins area.
	 */
	public void drawUnclipped(Canvas canvas);

	/**
	 * Checks if given pixel coordinates corresponds to any chart value. If yes return true and set selectedValue, if
	 * not selectedValue should be *cleared* and method should return false.
	 */
	public boolean checkTouch(float touchX, float touchY);

	/**
	 * Returns true if there is value selected.
	 */
	public boolean isTouched();

	/**
	 * Clear value selection.
	 */
	public void clearTouch();

	public void setMaximumViewport(Viewport maxViewport);

	public Viewport getMaximumViewport();

	public void setCurrentViewport(Viewport viewport);

	public Viewport getCurrentViewport();

	public boolean isViewportCalculationEnabled();

	public void setViewportCalculationEnabled(boolean isEnabled);

	public void selectValue(SelectedValue selectedValue);

	public SelectedValue getSelectedValue();

}
