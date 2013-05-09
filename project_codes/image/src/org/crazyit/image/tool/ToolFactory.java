package org.crazyit.image.tool;

import org.crazyit.image.ImageFrame;
import java.util.Map;
import java.util.HashMap;

/**
 * ���湤�ߵĹ�������
 * 
 * @author yangenxiong yangenxiong2009@gmail.com
 * @author Kelvin Mak kelvin.mak125@gmail.com
 * @version  1.0
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br>Copyright (C), 2009-2010, yangenxiong
 * <br>This program is protected by copyright laws.
 */
public class ToolFactory {

	private static Map<String, Tool> toolMap = null;

	/**
	 * ��ȡ������ʵ��
	 * 
	 * @param type
	 *            String ��������
	 * @return Tool ���ع�����ʵ��
	 */
	public static Tool getToolInstance(ImageFrame frame, String type) {
		if (toolMap == null) {
			toolMap = new HashMap<String, Tool>();
			toolMap.put(Tool.PENCIL_TOOL, PencilTool.getInstance(frame));
			toolMap.put(Tool.BRUSH_TOOL, BrushTool.getInstance(frame));
			toolMap.put(Tool.ERASER_TOOL, EraserTool.getInstance(frame));
			toolMap.put(Tool.LINE_TOOL, LineTool.getInstance(frame));
			toolMap.put(Tool.RECT_TOOL, RectTool.getInstance(frame));
			toolMap.put(Tool.POLYGON_TOOL, PolygonTool.getInstance(frame));
			toolMap.put(Tool.ROUND_TOOL, RoundTool.getInstance(frame));
			toolMap.put(Tool.ROUNDRECT_TOOL, RoundRectTool.getInstance(frame));
			toolMap.put(Tool.ATOMIZER_TOOL, AtomizerTool.getInstance(frame));
			toolMap.put(Tool.COLORPICKED_TOOL, ColorPickedTool
					.getInstance(frame));
		}
		return (Tool) toolMap.get(type);
	}
}
