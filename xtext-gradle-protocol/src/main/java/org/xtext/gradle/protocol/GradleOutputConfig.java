package org.xtext.gradle.protocol;

import java.io.File;

public class GradleOutputConfig {
	private String outletName;
	private File target;
	private boolean cleanAutomatically;
	private boolean overrideExistingResources;

	public String getOutletName() {
		return outletName;
	}

	public void setOutletName(String outletName) {
		this.outletName = outletName;
	}

	public File getTarget() {
		return target;
	}

	public void setTarget(File target) {
		this.target = target;
	}
	
	public boolean isCleanAutomatically() {
		return cleanAutomatically;
	}
	
	public void setCleanAutomatically(boolean cleanAutomatically) {
		this.cleanAutomatically = cleanAutomatically;
	}

	public boolean isOverrideExistingResources() {
		return overrideExistingResources;
	}

	public void setOverrideExistingResources(boolean overrideExistingResources) {
		this.overrideExistingResources = overrideExistingResources;
	}
	
}
