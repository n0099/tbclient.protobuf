package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarContriRecord extends Message {
  public static final String DEFAULT_RECORD_NOTICE = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String record_notice;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  public StarContriRecord(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str = paramBuilder.record_notice;
      if (str == null) {
        this.record_notice = "";
      } else {
        this.record_notice = str;
      } 
    } else {
      this.user_id = ((Builder)str).user_id;
      this.user_name = ((Builder)str).user_name;
      this.record_notice = ((Builder)str).record_notice;
    } 
  }
  
  public StarContriRecord(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarContriRecord> {
    public String record_notice;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(StarContriRecord param1StarContriRecord) {
      super(param1StarContriRecord);
      if (param1StarContriRecord == null)
        return; 
      this.user_id = param1StarContriRecord.user_id;
      this.user_name = param1StarContriRecord.user_name;
      this.record_notice = param1StarContriRecord.record_notice;
    }
    
    public StarContriRecord build(boolean param1Boolean) {
      return new StarContriRecord(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
