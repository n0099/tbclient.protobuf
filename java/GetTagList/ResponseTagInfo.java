package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResponseTagInfo extends Message {
  public static final Integer DEFAULT_IS_FOLLOWED;
  
  public static final Integer DEFAULT_TAG_ID;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer is_followed;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer tag_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tag_name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG_ID = integer;
    DEFAULT_IS_FOLLOWED = integer;
  }
  
  public ResponseTagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.tag_id;
      if (integer1 == null) {
        this.tag_id = DEFAULT_TAG_ID;
      } else {
        this.tag_id = integer1;
      } 
      String str = paramBuilder.tag_name;
      if (str == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str;
      } 
      integer = paramBuilder.is_followed;
      if (integer == null) {
        this.is_followed = DEFAULT_IS_FOLLOWED;
      } else {
        this.is_followed = integer;
      } 
    } else {
      this.tag_id = ((Builder)integer).tag_id;
      this.tag_name = ((Builder)integer).tag_name;
      this.is_followed = ((Builder)integer).is_followed;
    } 
  }
  
  public ResponseTagInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ResponseTagInfo> {
    public Integer is_followed;
    
    public Integer tag_id;
    
    public String tag_name;
    
    public Builder() {}
    
    public Builder(ResponseTagInfo param1ResponseTagInfo) {
      super(param1ResponseTagInfo);
      if (param1ResponseTagInfo == null)
        return; 
      this.tag_id = param1ResponseTagInfo.tag_id;
      this.tag_name = param1ResponseTagInfo.tag_name;
      this.is_followed = param1ResponseTagInfo.is_followed;
    }
    
    public ResponseTagInfo build(boolean param1Boolean) {
      return new ResponseTagInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
