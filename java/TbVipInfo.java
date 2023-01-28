package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TbVipInfo extends Message {
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_V_DETAIL = "";
  
  public static final String DEFAULT_V_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String v_detail;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String v_url;
  
  public TbVipInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.intro;
      if (str1 == null) {
        this.intro = "";
      } else {
        this.intro = str1;
      } 
      str1 = paramBuilder.v_url;
      if (str1 == null) {
        this.v_url = "";
      } else {
        this.v_url = str1;
      } 
      str = paramBuilder.v_detail;
      if (str == null) {
        this.v_detail = "";
      } else {
        this.v_detail = str;
      } 
    } else {
      this.intro = ((Builder)str).intro;
      this.v_url = ((Builder)str).v_url;
      this.v_detail = ((Builder)str).v_detail;
    } 
  }
  
  public TbVipInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TbVipInfo> {
    public String intro;
    
    public String v_detail;
    
    public String v_url;
    
    public Builder() {}
    
    public Builder(TbVipInfo param1TbVipInfo) {
      super(param1TbVipInfo);
      if (param1TbVipInfo == null)
        return; 
      this.intro = param1TbVipInfo.intro;
      this.v_url = param1TbVipInfo.v_url;
      this.v_detail = param1TbVipInfo.v_detail;
    }
    
    public TbVipInfo build(boolean param1Boolean) {
      return new TbVipInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
