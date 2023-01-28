package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TailInfo extends Message {
  public static final String DEFAULT_FONTCOLOR = "";
  
  public static final String DEFAULT_FONTKEYNAME = "";
  
  public static final Integer DEFAULT_IS_SELECTED;
  
  public static final String DEFAULT_TAILCONTENT = "";
  
  public static final Integer DEFAULT_TAILID;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String fontColor;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String fontKeyName;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer is_selected;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tailContent;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer tailId;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAILID = integer;
    DEFAULT_IS_SELECTED = integer;
  }
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tailId;
      if (integer == null) {
        this.tailId = DEFAULT_TAILID;
      } else {
        this.tailId = integer;
      } 
      integer = paramBuilder.is_selected;
      if (integer == null) {
        this.is_selected = DEFAULT_IS_SELECTED;
      } else {
        this.is_selected = integer;
      } 
      String str1 = paramBuilder.tailContent;
      if (str1 == null) {
        this.tailContent = "";
      } else {
        this.tailContent = str1;
      } 
      str1 = paramBuilder.fontColor;
      if (str1 == null) {
        this.fontColor = "";
      } else {
        this.fontColor = str1;
      } 
      str = paramBuilder.fontKeyName;
      if (str == null) {
        this.fontKeyName = "";
      } else {
        this.fontKeyName = str;
      } 
    } else {
      this.tailId = ((Builder)str).tailId;
      this.is_selected = ((Builder)str).is_selected;
      this.tailContent = ((Builder)str).tailContent;
      this.fontColor = ((Builder)str).fontColor;
      this.fontKeyName = ((Builder)str).fontKeyName;
    } 
  }
  
  public TailInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TailInfo> {
    public String fontColor;
    
    public String fontKeyName;
    
    public Integer is_selected;
    
    public String tailContent;
    
    public Integer tailId;
    
    public Builder() {}
    
    public Builder(TailInfo param1TailInfo) {
      super(param1TailInfo);
      if (param1TailInfo == null)
        return; 
      this.tailId = param1TailInfo.tailId;
      this.is_selected = param1TailInfo.is_selected;
      this.tailContent = param1TailInfo.tailContent;
      this.fontColor = param1TailInfo.fontColor;
      this.fontKeyName = param1TailInfo.fontKeyName;
    }
    
    public TailInfo build(boolean param1Boolean) {
      return new TailInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
