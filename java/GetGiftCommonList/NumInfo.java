package tbclient.GetGiftCommonList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NumInfo extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer num;
  
  public NumInfo(Builder paramBuilder, boolean paramBoolean) {
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
  
  public NumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NumInfo> {
    public String name;
    
    public Integer num;
    
    public Builder() {}
    
    public Builder(NumInfo param1NumInfo) {
      super(param1NumInfo);
      if (param1NumInfo == null)
        return; 
      this.num = param1NumInfo.num;
      this.name = param1NumInfo.name;
    }
    
    public NumInfo build(boolean param1Boolean) {
      return new NumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
