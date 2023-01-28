package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarSchedule extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_TIME = Integer.valueOf(0);
  
  public static final String DEFAULT_TYPE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public StarSchedule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.time;
      if (integer == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer;
      } 
      String str1 = paramBuilder.type;
      if (str1 == null) {
        this.type = "";
      } else {
        this.type = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.time = ((Builder)str).time;
      this.type = ((Builder)str).type;
      this.desc = ((Builder)str).desc;
      this.url = ((Builder)str).url;
    } 
  }
  
  public StarSchedule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarSchedule> {
    public String desc;
    
    public Integer time;
    
    public String type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(StarSchedule param1StarSchedule) {
      super(param1StarSchedule);
      if (param1StarSchedule == null)
        return; 
      this.time = param1StarSchedule.time;
      this.type = param1StarSchedule.type;
      this.desc = param1StarSchedule.desc;
      this.url = param1StarSchedule.url;
    }
    
    public StarSchedule build(boolean param1Boolean) {
      return new StarSchedule(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
