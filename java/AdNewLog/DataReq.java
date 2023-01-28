package tbclient.AdNewLog;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_DA_FROM = Integer.valueOf(0);
  
  public static final String DEFAULT_DA_LOCATE = "";
  
  public static final String DEFAULT_DA_TYPE = "";
  
  public static final String DEFAULT_EXTRA_PARAM = "";
  
  public static final String DEFAULT_ORDER_ID = "";
  
  public static final String DEFAULT_TOKEN = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer da_from;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String da_locate;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String da_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String extra_param;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String order_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String token;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str2 = paramBuilder.token;
      if (str2 == null) {
        this.token = "";
      } else {
        this.token = str2;
      } 
      str2 = paramBuilder.da_locate;
      if (str2 == null) {
        this.da_locate = "";
      } else {
        this.da_locate = str2;
      } 
      Integer integer = paramBuilder.da_from;
      if (integer == null) {
        this.da_from = DEFAULT_DA_FROM;
      } else {
        this.da_from = integer;
      } 
      String str1 = paramBuilder.extra_param;
      if (str1 == null) {
        this.extra_param = "";
      } else {
        this.extra_param = str1;
      } 
      str1 = paramBuilder.order_id;
      if (str1 == null) {
        this.order_id = "";
      } else {
        this.order_id = str1;
      } 
      str = paramBuilder.da_type;
      if (str == null) {
        this.da_type = "";
      } else {
        this.da_type = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.token = ((Builder)str).token;
      this.da_locate = ((Builder)str).da_locate;
      this.da_from = ((Builder)str).da_from;
      this.extra_param = ((Builder)str).extra_param;
      this.order_id = ((Builder)str).order_id;
      this.da_type = ((Builder)str).da_type;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public CommonReq common;
    
    public Integer da_from;
    
    public String da_locate;
    
    public String da_type;
    
    public String extra_param;
    
    public String order_id;
    
    public String token;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.token = param1DataReq.token;
      this.da_locate = param1DataReq.da_locate;
      this.da_from = param1DataReq.da_from;
      this.extra_param = param1DataReq.extra_param;
      this.order_id = param1DataReq.order_id;
      this.da_type = param1DataReq.da_type;
    }
    
    public DataReq build(boolean param1Boolean) {
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
