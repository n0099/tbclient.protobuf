package tbclient.RelateRecThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_EQID = "";
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_SOURCE_FROM;
  
  public static final Integer DEFAULT_SOURCE_TYPE;
  
  public static final Long DEFAULT_THREAD_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String eqid;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer source_from;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer source_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long thread_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_THREAD_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_SOURCE_TYPE = integer;
    DEFAULT_SOURCE_FROM = integer;
  }
  
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
      long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
      Integer integer = paramBuilder.source_type;
      if (integer == null) {
        this.source_type = DEFAULT_SOURCE_TYPE;
      } else {
        this.source_type = integer;
      } 
      integer = paramBuilder.source_from;
      if (integer == null) {
        this.source_from = DEFAULT_SOURCE_FROM;
      } else {
        this.source_from = integer;
      } 
      str = paramBuilder.eqid;
      if (str == null) {
        this.eqid = "";
      } else {
        this.eqid = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.forum_id = ((Builder)str).forum_id;
      this.thread_id = ((Builder)str).thread_id;
      this.source_type = ((Builder)str).source_type;
      this.source_from = ((Builder)str).source_from;
      this.eqid = ((Builder)str).eqid;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public String eqid;
    
    public Long forum_id;
    
    public Integer source_from;
    
    public Integer source_type;
    
    public Long thread_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.forum_id = param1DataReq.forum_id;
      this.thread_id = param1DataReq.thread_id;
      this.source_type = param1DataReq.source_type;
      this.source_from = param1DataReq.source_from;
      this.eqid = param1DataReq.eqid;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
