package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NovelFansInfo extends Message {
  public static final Integer DEFAULT_LEVEL = Integer.valueOf(0);
  
  public static final String DEFAULT_LEVEL_ICON = "";
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String level_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String level_name;
  
  public NovelFansInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.level;
      if (integer == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer;
      } 
      String str1 = paramBuilder.level_name;
      if (str1 == null) {
        this.level_name = "";
      } else {
        this.level_name = str1;
      } 
      str = paramBuilder.level_icon;
      if (str == null) {
        this.level_icon = "";
      } else {
        this.level_icon = str;
      } 
    } else {
      this.level = ((Builder)str).level;
      this.level_name = ((Builder)str).level_name;
      this.level_icon = ((Builder)str).level_icon;
    } 
  }
  
  public NovelFansInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NovelFansInfo> {
    public Integer level;
    
    public String level_icon;
    
    public String level_name;
    
    public Builder() {}
    
    public Builder(NovelFansInfo param1NovelFansInfo) {
      super(param1NovelFansInfo);
      if (param1NovelFansInfo == null)
        return; 
      this.level = param1NovelFansInfo.level;
      this.level_name = param1NovelFansInfo.level_name;
      this.level_icon = param1NovelFansInfo.level_icon;
    }
    
    public NovelFansInfo build(boolean param1Boolean) {
      return new NovelFansInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
