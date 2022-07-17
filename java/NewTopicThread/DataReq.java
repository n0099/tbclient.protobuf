package tbclient.NewTopicThread;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CALL_FROM = "";
  
  public static final Long DEFAULT_LAST_FEED_ID;
  
  public static final Long DEFAULT_PAGE_NO;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT64)
  public final Long last_feed_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long page_no;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long topic_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(529404179, "Ltbclient/NewTopicThread/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(529404179, "Ltbclient/NewTopicThread/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TOPIC_ID = long_;
    DEFAULT_PAGE_NO = long_;
    DEFAULT_LAST_FEED_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.topic_id;
      if (long_1 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_1;
      } 
      long_1 = paramBuilder.page_no;
      if (long_1 == null) {
        this.page_no = DEFAULT_PAGE_NO;
      } else {
        this.page_no = long_1;
      } 
      String str = paramBuilder.call_from;
      if (str == null) {
        this.call_from = "";
      } else {
        this.call_from = str;
      } 
      long_ = paramBuilder.last_feed_id;
      if (long_ == null) {
        this.last_feed_id = DEFAULT_LAST_FEED_ID;
      } else {
        this.last_feed_id = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.topic_id = ((Builder)long_).topic_id;
      this.page_no = ((Builder)long_).page_no;
      this.call_from = ((Builder)long_).call_from;
      this.last_feed_id = ((Builder)long_).last_feed_id;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String call_from;
    
    public CommonReq common;
    
    public Long last_feed_id;
    
    public Long page_no;
    
    public Long topic_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.topic_id = param1DataReq.topic_id;
      this.page_no = param1DataReq.page_no;
      this.call_from = param1DataReq.call_from;
      this.last_feed_id = param1DataReq.last_feed_id;
    }
    
    public DataReq build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataReq)interceptResult.objValue; 
      } 
      return new DataReq(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
