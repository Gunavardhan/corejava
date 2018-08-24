package com.customize.equalsandhascode;

public class ReportCard {
	private String weekReport;
	private int stdMathsmarks;
	public ReportCard(String weekReport, int stdMathsmarks){
		//this.stdMathsmarks = (int) (Math.random()*105+1);
		this.stdMathsmarks = stdMathsmarks;
		this.weekReport = weekReport;
	}
	public int getStdMathsmarks() {
		return stdMathsmarks;
	}
	public void setStdMathsmarks(int stdMathsmarks) {
		this.stdMathsmarks = stdMathsmarks;
	}
	
	public String getWeekReport() {
		return weekReport;
	}
	public void setWeekReport(String weekReport) {
		this.weekReport = weekReport;
	}
	@Override
	public String toString() {
		return "ReportCard [stdMathsmarks=" + stdMathsmarks + "]";
	}
	
}
