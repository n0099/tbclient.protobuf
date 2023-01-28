package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PresentNumInfo extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer num;
  
  public PresentNumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
    } else {
      this.num = ((Builder)str).num;
      this.name = ((Builder)str).name;
    } 
  }
  
  public PresentNumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PresentNumInfo> {
    public String name;
    
    public Integer num;
    
    public Builder() {}
    
    public Builder(PresentNumInfo param1PresentNumInfo) {
      super(param1PresentNumInfo);
      if (param1PresentNumInfo == null)
        return; 
      this.num = param1PresentNumInfo.num;
      this.name = param1PresentNumInfo.name;
    }
    
    public PresentNumInfo build(boolean param1Boolean) {
      return new PresentNumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
