package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_NEED_TAB_STUCT;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_PS;
  
  public static final Integer DEFAULT_SUB_LABEL_ID;
  
  public static final Integer DEFAULT_SUB_TAB_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer need_tab_stuct;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer ps;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer sub_label_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer sub_tab_id;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_PS = integer;
    DEFAULT_FORUM_ID = Long.valueOf(0L);
    DEFAULT_SUB_TAB_ID = integer;
    DEFAULT_SUB_LABEL_ID = integer;
    DEFAULT_NEED_TAB_STUCT = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer2 = paramBuilder.pn;
      if (integer2 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer2;
      } 
      integer2 = paramBuilder.ps;
      if (integer2 == null) {
        this.ps = DEFAULT_PS;
      } else {
        this.ps = integer2;
      } 
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      Integer integer1 = paramBuilder.sub_tab_id;
      if (integer1 == null) {
        this.sub_tab_id = DEFAULT_SUB_TAB_ID;
      } else {
        this.sub_tab_id = integer1;
      } 
      integer1 = paramBuilder.sub_label_id;
      if (integer1 == null) {
        this.sub_label_id = DEFAULT_SUB_LABEL_ID;
      } else {
        this.sub_label_id = integer1;
      } 
      integer = paramBuilder.need_tab_stuct;
      if (integer == null) {
        this.need_tab_stuct = DEFAULT_NEED_TAB_STUCT;
      } else {
        this.need_tab_stuct = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.pn = ((Builder)integer).pn;
      this.ps = ((Builder)integer).ps;
      this.forum_id = ((Builder)integer).forum_id;
      this.sub_tab_id = ((Builder)integer).sub_tab_id;
      this.sub_label_id = ((Builder)integer).sub_label_id;
      this.need_tab_stuct = ((Builder)integer).need_tab_stuct;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Long forum_id;
    
    public Integer need_tab_stuct;
    
    public Integer pn;
    
    public Integer ps;
    
    public Integer sub_label_id;
    
    public Integer sub_tab_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.pn = param1DataReq.pn;
      this.ps = param1DataReq.ps;
      this.forum_id = param1DataReq.forum_id;
      this.sub_tab_id = param1DataReq.sub_tab_id;
      this.sub_label_id = param1DataReq.sub_label_id;
      this.need_tab_stuct = param1DataReq.need_tab_stuct;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
