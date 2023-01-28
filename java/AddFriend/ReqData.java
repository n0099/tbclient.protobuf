package tbclient.AddFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static final Long DEFAULT_FRIEND_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final String DEFAULT_ST_TYPE = "";
  
  @ProtoField(tag = 4)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long friend_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String st_type;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.friend_id;
      if (long_ == null) {
        this.friend_id = DEFAULT_FRIEND_ID;
      } else {
        this.friend_id = long_;
      } 
      String str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
      str = paramBuilder.st_type;
      if (str == null) {
        this.st_type = "";
      } else {
        this.st_type = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.friend_id = paramBuilder.friend_id;
      this.message = paramBuilder.message;
      this.st_type = paramBuilder.st_type;
      this.common = paramBuilder.common;
    } 
  }
  
  public ReqData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReqData> {
    public CommonReq common;
    
    public Long friend_id;
    
    public String message;
    
    public String st_type;
    
    public Builder() {}
    
    public Builder(ReqData param1ReqData) {
      super(param1ReqData);
      if (param1ReqData == null)
        return; 
      this.friend_id = param1ReqData.friend_id;
      this.message = param1ReqData.message;
      this.st_type = param1ReqData.st_type;
      this.common = param1ReqData.common;
    }
    
    public ReqData build(boolean param1Boolean) {
      return new ReqData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
