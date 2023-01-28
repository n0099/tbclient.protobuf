package tbclient.GetForumBroadcastList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final List<Long> DEFAULT_BCAST_IDS;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_NEED_CNT;
  
  public static final Integer DEFAULT_QUERY_TYPE;
  
  public static final Integer DEFAULT_STAFF_ID;
  
  public static final Long DEFAULT_STAFF_ID64;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 6, type = Message.Datatype.INT64)
  public final List<Long> bcast_ids;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer need_cnt;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer query_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer staff_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT64)
  public final Long staff_id64;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_QUERY_TYPE = integer;
    DEFAULT_STAFF_ID = integer;
    DEFAULT_NEED_CNT = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM_ID = long_;
    DEFAULT_BCAST_IDS = Collections.emptyList();
    DEFAULT_STAFF_ID64 = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer = paramBuilder.query_type;
      if (integer == null) {
        this.query_type = DEFAULT_QUERY_TYPE;
      } else {
        this.query_type = integer;
      } 
      integer = paramBuilder.staff_id;
      if (integer == null) {
        this.staff_id = DEFAULT_STAFF_ID;
      } else {
        this.staff_id = integer;
      } 
      integer = paramBuilder.need_cnt;
      if (integer == null) {
        this.need_cnt = DEFAULT_NEED_CNT;
      } else {
        this.need_cnt = integer;
      } 
      Long long_1 = paramBuilder.forum_id;
      if (long_1 == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_1;
      } 
      List<Long> list = paramBuilder.bcast_ids;
      if (list == null) {
        this.bcast_ids = DEFAULT_BCAST_IDS;
      } else {
        this.bcast_ids = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.staff_id64;
      if (long_ == null) {
        this.staff_id64 = DEFAULT_STAFF_ID64;
      } else {
        this.staff_id64 = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.query_type = ((Builder)long_).query_type;
      this.staff_id = ((Builder)long_).staff_id;
      this.need_cnt = ((Builder)long_).need_cnt;
      this.forum_id = ((Builder)long_).forum_id;
      this.bcast_ids = Message.immutableCopyOf(((Builder)long_).bcast_ids);
      this.staff_id64 = ((Builder)long_).staff_id64;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public List<Long> bcast_ids;
    
    public CommonReq common;
    
    public Long forum_id;
    
    public Integer need_cnt;
    
    public Integer query_type;
    
    public Integer staff_id;
    
    public Long staff_id64;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.query_type = param1DataReq.query_type;
      this.staff_id = param1DataReq.staff_id;
      this.need_cnt = param1DataReq.need_cnt;
      this.forum_id = param1DataReq.forum_id;
      this.bcast_ids = Message.copyOf(param1DataReq.bcast_ids);
      this.staff_id64 = param1DataReq.staff_id64;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
