package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_COOKIE = "";
  
  public static final Integer DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_ST_PARAM;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 5)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String cookie;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer st_param;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_FORUM_ID = integer;
    DEFAULT_ST_PARAM = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.update_time;
      if (integer == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer;
      } 
      integer = paramBuilder.forum_id;
      if (integer == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = integer;
      } 
      integer = paramBuilder.st_param;
      if (integer == null) {
        this.st_param = DEFAULT_ST_PARAM;
      } else {
        this.st_param = integer;
      } 
      String str = paramBuilder.cookie;
      if (str == null) {
        this.cookie = "";
      } else {
        this.cookie = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.update_time = paramBuilder.update_time;
      this.forum_id = paramBuilder.forum_id;
      this.st_param = paramBuilder.st_param;
      this.cookie = paramBuilder.cookie;
      this.common = paramBuilder.common;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public String cookie;
    
    public Integer forum_id;
    
    public Integer st_param;
    
    public Integer update_time;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.update_time = param1DataReq.update_time;
      this.forum_id = param1DataReq.forum_id;
      this.st_param = param1DataReq.st_param;
      this.cookie = param1DataReq.cookie;
      this.common = param1DataReq.common;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
