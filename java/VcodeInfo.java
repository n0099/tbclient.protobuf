package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VcodeInfo extends Message {
  public static final String DEFAULT_VCODE_MD5 = "";
  
  public static final String DEFAULT_VCODE_PIC_URL = "";
  
  public static final String DEFAULT_VCODE_TYPE = "";
  
  @ProtoField(tag = 4)
  public final VcodeExtra vcode_extra;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String vcode_md5;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String vcode_pic_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String vcode_type;
  
  public VcodeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.vcode_md5;
      if (str == null) {
        this.vcode_md5 = "";
      } else {
        this.vcode_md5 = str;
      } 
      str = paramBuilder.vcode_pic_url;
      if (str == null) {
        this.vcode_pic_url = "";
      } else {
        this.vcode_pic_url = str;
      } 
      str = paramBuilder.vcode_type;
      if (str == null) {
        this.vcode_type = "";
      } else {
        this.vcode_type = str;
      } 
      this.vcode_extra = paramBuilder.vcode_extra;
    } else {
      this.vcode_md5 = paramBuilder.vcode_md5;
      this.vcode_pic_url = paramBuilder.vcode_pic_url;
      this.vcode_type = paramBuilder.vcode_type;
      this.vcode_extra = paramBuilder.vcode_extra;
    } 
  }
  
  public VcodeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VcodeInfo> {
    public VcodeExtra vcode_extra;
    
    public String vcode_md5;
    
    public String vcode_pic_url;
    
    public String vcode_type;
    
    public Builder() {}
    
    public Builder(VcodeInfo param1VcodeInfo) {
      super(param1VcodeInfo);
      if (param1VcodeInfo == null)
        return; 
      this.vcode_md5 = param1VcodeInfo.vcode_md5;
      this.vcode_pic_url = param1VcodeInfo.vcode_pic_url;
      this.vcode_type = param1VcodeInfo.vcode_type;
      this.vcode_extra = param1VcodeInfo.vcode_extra;
    }
    
    public VcodeInfo build(boolean param1Boolean) {
      return new VcodeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
