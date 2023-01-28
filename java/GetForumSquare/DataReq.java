package tbclient.GetForumSquare;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  public static final String DEFAULT_SECOND_CLASS_NAME = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String second_class_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long user_id;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.class_name;
      if (str1 == null) {
        this.class_name = "";
      } else {
        this.class_name = str1;
      } 
      Integer integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
      integer = paramBuilder.rn;
      if (integer == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer;
      } 
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      str = paramBuilder.second_class_name;
      if (str == null) {
        this.second_class_name = "";
      } else {
        this.second_class_name = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.class_name = ((Builder)str).class_name;
      this.pn = ((Builder)str).pn;
      this.rn = ((Builder)str).rn;
      this.user_id = ((Builder)str).user_id;
      this.second_class_name = ((Builder)str).second_class_name;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public String class_name;
    
    public CommonReq common;
    
    public Integer pn;
    
    public Integer rn;
    
    public String second_class_name;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.class_name = param1DataReq.class_name;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
      this.user_id = param1DataReq.user_id;
      this.second_class_name = param1DataReq.second_class_name;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
