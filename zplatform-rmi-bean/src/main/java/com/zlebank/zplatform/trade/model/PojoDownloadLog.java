package com.zlebank.zplatform.trade.model;
// Generated 2015-11-4 13:14:53 by Hibernate Tools 4.0.0


/**
 * TDownloadLog generated by hbm2java
 */

public class PojoDownloadLog implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5384521986238919632L;
	private long logid;
    private String filename;
    private Integer downloadcount;
    private String caid;
    private String downloadtime;
    private String caname;
    private long downloaderid;
    private String downloadername;
    private String recode;
    private String notes;
    private String remarks;
    private String fileurl;

    public PojoDownloadLog() {
    }

	/**
	 * @return the logid
	 */
	public long getLogid() {
		return logid;
	}

	/**
	 * @param logid the logid to set
	 */
	public void setLogid(long logid) {
		this.logid = logid;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * @return the downloadcount
	 */
	public Integer getDownloadcount() {
		return downloadcount;
	}

	/**
	 * @param downloadcount the downloadcount to set
	 */
	public void setDownloadcount(Integer downloadcount) {
		this.downloadcount = downloadcount;
	}

	/**
	 * @return the caid
	 */
	public String getCaid() {
		return caid;
	}

	/**
	 * @param caid the caid to set
	 */
	public void setCaid(String caid) {
		this.caid = caid;
	}

	/**
	 * @return the downloadtime
	 */
	public String getDownloadtime() {
		return downloadtime;
	}

	/**
	 * @param downloadtime the downloadtime to set
	 */
	public void setDownloadtime(String downloadtime) {
		this.downloadtime = downloadtime;
	}

	/**
	 * @return the caname
	 */
	public String getCaname() {
		return caname;
	}

	/**
	 * @param caname the caname to set
	 */
	public void setCaname(String caname) {
		this.caname = caname;
	}

	/**
	 * @return the downloaderid
	 */
	public long getDownloaderid() {
		return downloaderid;
	}

	/**
	 * @param downloaderid the downloaderid to set
	 */
	public void setDownloaderid(long downloaderid) {
		this.downloaderid = downloaderid;
	}

	/**
	 * @return the downloadername
	 */
	public String getDownloadername() {
		return downloadername;
	}

	/**
	 * @param downloadername the downloadername to set
	 */
	public void setDownloadername(String downloadername) {
		this.downloadername = downloadername;
	}

	/**
	 * @return the recode
	 */
	public String getRecode() {
		return recode;
	}

	/**
	 * @param recode the recode to set
	 */
	public void setRecode(String recode) {
		this.recode = recode;
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the fileurl
	 */
	public String getFileurl() {
		return fileurl;
	}

	/**
	 * @param fileurl the fileurl to set
	 */
	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

    
}
