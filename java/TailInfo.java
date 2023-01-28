package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TailInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_ICON_LINK = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final Integer DEFAULT_TAIL_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer tail_type;
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tail_type;
      if (integer == null) {
        this.tail_type = DEFAULT_TAIL_TYPE;
      } else {
        this.tail_type = integer;
      } 
      String str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      str1 = paramBuilder.icon_link;
      if (str1 == null) {
        this.icon_link = "";
      } else {
        this.icon_link = str1;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.tail_type = ((Builder)str).tail_type;
      this.icon_url = ((Builder)str).icon_url;
      this.icon_link = ((Builder)str).icon_link;
      this.content = ((Builder)str).content;
    } 
  }
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TailInfo> {
    public String content;
    
    public String icon_link;
    
    public String icon_url;
    
    public Integer tail_type;
    
    public Builder() {}
    
    public Builder(TailInfo param1TailInfo) {
      super(param1TailInfo);
      if (param1TailInfo == null)
        return; 
      this.tail_type = param1TailInfo.tail_type;
      this.icon_url = param1TailInfo.icon_url;
      this.icon_link = param1TailInfo.icon_link;
      this.content = param1TailInfo.content;
    }
    
    public TailInfo build(boolean param1Boolean) {
      return new TailInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
