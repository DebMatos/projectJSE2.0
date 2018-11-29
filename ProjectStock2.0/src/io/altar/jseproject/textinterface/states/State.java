package io.altar.jseproject.textinterface.states;

import io.altar.jseproject.textinterface.utils.ScannerUtils;

public interface State {
	public static final ScannerUtils scannerUtils = new ScannerUtils();

	public int execute();
}
