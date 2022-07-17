package tbclient.TopicList;

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
  
  public static final Long DEFAULT_FID = Long.valueOf(0L);
  
  public static final String DEFAULT_LIST_TYPE = "";
  
  public static final String DEFAULT_NEED_TAB_LIST = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long fid;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String list_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String need_tab_list;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str = paramBuilder.call_from;
      if (str == null) {
        this.call_from = "";
      } else {
        this.call_from = str;
      } 
      str = paramBuilder.list_type;
      if (str == null) {
        this.list_type = "";
      } else {
        this.list_type = str;
      } 
      str = paramBuilder.need_tab_list;
      if (str == null) {
        this.need_tab_list = "";
      } else {
        this.need_tab_list = str;
      } 
      long_ = paramBuilder.fid;
      if (long_ == null) {
        this.fid = DEFAULT_FID;
      } else {
        this.fid = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.call_from = ((Builder)long_).call_from;
      this.list_type = ((Builder)long_).list_type;
      this.need_tab_list = ((Builder)long_).need_tab_list;
      this.fid = ((Builder)long_).fid;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-860898797, "Ltbclient/TopicList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-860898797, "Ltbclient/TopicList/DataReq;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String call_from;
    
    public CommonReq common;
    
    public Long fid;
    
    public String list_type;
    
    public String need_tab_list;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.call_from = param1DataReq.call_from;
      this.list_type = param1DataReq.list_type;
      this.need_tab_list = param1DataReq.need_tab_list;
      this.fid = param1DataReq.fid;
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
