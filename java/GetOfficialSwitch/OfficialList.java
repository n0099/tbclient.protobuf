package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class OfficialList extends Message {
  public static final Integer DEFAULT_IS_ON;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_on;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long uid;
  
  static {
    DEFAULT_IS_ON = Integer.valueOf(0);
  }
  
  public OfficialList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      integer = paramBuilder.is_on;
      if (integer == null) {
        this.is_on = DEFAULT_IS_ON;
      } else {
        this.is_on = integer;
      } 
    } else {
      this.uid = ((Builder)integer).uid;
      this.name = ((Builder)integer).name;
      this.is_on = ((Builder)integer).is_on;
    } 
  }
  
  public OfficialList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<OfficialList> {
    public Integer is_on;
    
    public String name;
    
    public Long uid;
    
    public Builder() {}
    
    public Builder(OfficialList param1OfficialList) {
      super(param1OfficialList);
      if (param1OfficialList == null)
        return; 
      this.uid = param1OfficialList.uid;
      this.name = param1OfficialList.name;
      this.is_on = param1OfficialList.is_on;
    }
    
    public OfficialList build(boolean param1Boolean) {
      return new OfficialList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
