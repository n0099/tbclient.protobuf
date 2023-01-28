package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static final String DEFAULT_FONTCOLOR = "";
  
  public static final String DEFAULT_FONTKEYNAME = "";
  
  public static final String DEFAULT_TAILCONTENT = "";
  
  public static final Integer DEFAULT_TAILID = Integer.valueOf(0);
  
  @ProtoField(tag = 5)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String fontColor;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String fontKeyName;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tailContent;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer tailId;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str2 = paramBuilder.tailContent;
      if (str2 == null) {
        this.tailContent = "";
      } else {
        this.tailContent = str2;
      } 
      Integer integer = paramBuilder.tailId;
      if (integer == null) {
        this.tailId = DEFAULT_TAILID;
      } else {
        this.tailId = integer;
      } 
      String str1 = paramBuilder.fontColor;
      if (str1 == null) {
        this.fontColor = "";
      } else {
        this.fontColor = str1;
      } 
      str1 = paramBuilder.fontKeyName;
      if (str1 == null) {
        this.fontKeyName = "";
      } else {
        this.fontKeyName = str1;
      } 
      this.common = paramBuilder.common;
    } else {
      this.tailContent = paramBuilder.tailContent;
      this.tailId = paramBuilder.tailId;
      this.fontColor = paramBuilder.fontColor;
      this.fontKeyName = paramBuilder.fontKeyName;
      this.common = paramBuilder.common;
    } 
  }
  
  public ReqData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReqData> {
    public CommonReq common;
    
    public String fontColor;
    
    public String fontKeyName;
    
    public String tailContent;
    
    public Integer tailId;
    
    public Builder() {}
    
    public Builder(ReqData param1ReqData) {
      super(param1ReqData);
      if (param1ReqData == null)
        return; 
      this.tailContent = param1ReqData.tailContent;
      this.tailId = param1ReqData.tailId;
      this.fontColor = param1ReqData.fontColor;
      this.fontKeyName = param1ReqData.fontKeyName;
      this.common = param1ReqData.common;
    }
    
    public ReqData build(boolean param1Boolean) {
      return new ReqData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
