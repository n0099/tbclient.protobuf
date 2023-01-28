package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_LINK_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer link_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      Integer integer = paramBuilder.link_num;
      if (integer == null) {
        this.link_num = DEFAULT_LINK_NUM;
      } else {
        this.link_num = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.forum_id = ((Builder)str).forum_id;
      this.link_num = ((Builder)str).link_num;
      this.url = ((Builder)str).url;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long forum_id;
    
    public Integer link_num;
    
    public String url;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.forum_id = param1DataReq.forum_id;
      this.link_num = param1DataReq.link_num;
      this.url = param1DataReq.url;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
