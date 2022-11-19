package DTO;

public class RecordDTO {

	private String characterid;
    private String mapno;
    private int recordno;
    private int cleartime;
    
    public RecordDTO() {}
    
    public RecordDTO(String Characterid, String mapno,int recordno,int cleartime) {
        this.characterid=Characterid;
        this.mapno=mapno;
        this.recordno=recordno;
        this.cleartime=cleartime;
    }

	
    public String getCharacterid() {
    	return characterid;
    }
    
    public void setCharacterid(String characterid) {
    	this.characterid = characterid;
    }
    
    public String getMapno() {
    	return mapno;
    }
    
    public void setMapno(String mapno) {
    	this.mapno = mapno;
    }
    
    public int getRecordno() {
    	return recordno;
    }
    
    public void setRecordno(int recordno) {
    	this.recordno = recordno;
    }
    
    public int getCleartime() {
    	return cleartime;
    }
    
    public void setCleartime(int cleartime) {
    	this.cleartime = cleartime;
    }

    
}