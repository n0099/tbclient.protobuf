package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class IconStampInfo extends Message {
  public static final String DEFAULT_STAMP_TEXT = "";
  
  public static final String DEFAULT_STAMP_TITLE = "";
  
  public static final Integer DEFAULT_STAMP_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String stamp_text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String stamp_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer stamp_type;
  
  public IconStampInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.stamp_title;
      if (str == null) {
        this.stamp_title = "";
      } else {
        this.stamp_title = str;
      } 
      str = paramBuilder.stamp_text;
      if (str == null) {
        this.stamp_text = "";
      } else {
        this.stamp_text = str;
      } 
      integer = paramBuilder.stamp_type;
      if (integer == null) {
        this.stamp_type = DEFAULT_STAMP_TYPE;
      } else {
        this.stamp_type = integer;
      } 
    } else {
      this.stamp_title = ((Builder)integer).stamp_title;
      this.stamp_text = ((Builder)integer).stamp_text;
      this.stamp_type = ((Builder)integer).stamp_type;
    } 
  }
  
  public IconStampInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<IconStampInfo> {
    public String stamp_text;
    
    public String stamp_title;
    
    public Integer stamp_type;
    
    public Builder() {}
    
    public Builder(IconStampInfo param1IconStampInfo) {
      super(param1IconStampInfo);
      if (param1IconStampInfo == null)
        return; 
      this.stamp_title = param1IconStampInfo.stamp_title;
      this.stamp_text = param1IconStampInfo.stamp_text;
      this.stamp_type = param1IconStampInfo.stamp_type;
    }
    
    public IconStampInfo build(boolean param1Boolean) {
      return new IconStampInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
