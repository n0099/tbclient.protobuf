package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SportPageHeadInfo extends Message {
  public static final String DEFAULT_HEAD_URL = "";
  
  public static final Integer DEFAULT_IS_AD = Integer.valueOf(0);
  
  public static final String DEFAULT_JUMP_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String head_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_ad;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String jump_url;
  
  public SportPageHeadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.head_url;
      if (str1 == null) {
        this.head_url = "";
      } else {
        this.head_url = str1;
      } 
      Integer integer = paramBuilder.is_ad;
      if (integer == null) {
        this.is_ad = DEFAULT_IS_AD;
      } else {
        this.is_ad = integer;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.head_url = ((Builder)str).head_url;
      this.is_ad = ((Builder)str).is_ad;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public SportPageHeadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SportPageHeadInfo> {
    public String head_url;
    
    public Integer is_ad;
    
    public String jump_url;
    
    public Builder() {}
    
    public Builder(SportPageHeadInfo param1SportPageHeadInfo) {
      super(param1SportPageHeadInfo);
      if (param1SportPageHeadInfo == null)
        return; 
      this.head_url = param1SportPageHeadInfo.head_url;
      this.is_ad = param1SportPageHeadInfo.is_ad;
      this.jump_url = param1SportPageHeadInfo.jump_url;
    }
    
    public SportPageHeadInfo build(boolean param1Boolean) {
      return new SportPageHeadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
