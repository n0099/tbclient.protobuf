package tbclient.Userlike;

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
  
  public static final String DEFAULT_AD_EXT_PARAMS = "";
  
  public static final Integer DEFAULT_FOLLOW_TYPE;
  
  public static final Long DEFAULT_LAST_REQ_UNIX = Long.valueOf(0L);
  
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final String DEFAULT_PAGE_TAG = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String ad_ext_params;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer follow_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long last_req_unix;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer load_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String page_tag;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_FOLLOW_TYPE = integer;
    DEFAULT_LOAD_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.page_tag;
      if (str1 == null) {
        this.page_tag = "";
      } else {
        this.page_tag = str1;
      } 
      Long long_ = paramBuilder.last_req_unix;
      if (long_ == null) {
        this.last_req_unix = DEFAULT_LAST_REQ_UNIX;
      } else {
        this.last_req_unix = long_;
      } 
      Integer integer = paramBuilder.follow_type;
      if (integer == null) {
        this.follow_type = DEFAULT_FOLLOW_TYPE;
      } else {
        this.follow_type = integer;
      } 
      integer = paramBuilder.load_type;
      if (integer == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer;
      } 
      str = paramBuilder.ad_ext_params;
      if (str == null) {
        this.ad_ext_params = "";
      } else {
        this.ad_ext_params = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.page_tag = ((Builder)str).page_tag;
      this.last_req_unix = ((Builder)str).last_req_unix;
      this.follow_type = ((Builder)str).follow_type;
      this.load_type = ((Builder)str).load_type;
      this.ad_ext_params = ((Builder)str).ad_ext_params;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1531639850, "Ltbclient/Userlike/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1531639850, "Ltbclient/Userlike/DataReq;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String ad_ext_params;
    
    public CommonReq common;
    
    public Integer follow_type;
    
    public Long last_req_unix;
    
    public Integer load_type;
    
    public String page_tag;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.page_tag = param1DataReq.page_tag;
      this.last_req_unix = param1DataReq.last_req_unix;
      this.follow_type = param1DataReq.follow_type;
      this.load_type = param1DataReq.load_type;
      this.ad_ext_params = param1DataReq.ad_ext_params;
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
