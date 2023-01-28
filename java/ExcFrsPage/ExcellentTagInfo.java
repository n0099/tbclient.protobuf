package tbclient.ExcFrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExcellentTagInfo extends Message {
  public static final Long DEFAULT_TAG_CODE = Long.valueOf(0L);
  
  public static final String DEFAULT_TAG_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tag_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tag_name;
  
  public ExcellentTagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tag_code;
      if (long_ == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = long_;
      } 
      str = paramBuilder.tag_name;
      if (str == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str;
      } 
    } else {
      this.tag_code = ((Builder)str).tag_code;
      this.tag_name = ((Builder)str).tag_name;
    } 
  }
  
  public ExcellentTagInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ExcellentTagInfo> {
    public Long tag_code;
    
    public String tag_name;
    
    public Builder() {}
    
    public Builder(ExcellentTagInfo param1ExcellentTagInfo) {
      super(param1ExcellentTagInfo);
      if (param1ExcellentTagInfo == null)
        return; 
      this.tag_code = param1ExcellentTagInfo.tag_code;
      this.tag_name = param1ExcellentTagInfo.tag_name;
    }
    
    public ExcellentTagInfo build(boolean param1Boolean) {
      return new ExcellentTagInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
