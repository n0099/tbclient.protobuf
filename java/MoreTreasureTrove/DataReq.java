package tbclient.MoreTreasureTrove;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppPosInfo;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_LF_USER = "";
  
  public static final String DEFAULT_LF_USER_TASKID = "";
  
  public static final String DEFAULT_TAB_CODE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5)
  public final AppPosInfo app_pos;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String lf_user;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String lf_user_taskid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tab_code;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str = paramBuilder.tab_code;
      if (str == null) {
        this.tab_code = "";
      } else {
        this.tab_code = str;
      } 
      str = paramBuilder.lf_user;
      if (str == null) {
        this.lf_user = "";
      } else {
        this.lf_user = str;
      } 
      str = paramBuilder.lf_user_taskid;
      if (str == null) {
        this.lf_user_taskid = "";
      } else {
        this.lf_user_taskid = str;
      } 
      this.app_pos = paramBuilder.app_pos;
    } else {
      this.common = paramBuilder.common;
      this.tab_code = paramBuilder.tab_code;
      this.lf_user = paramBuilder.lf_user;
      this.lf_user_taskid = paramBuilder.lf_user_taskid;
      this.app_pos = paramBuilder.app_pos;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public AppPosInfo app_pos;
    
    public CommonReq common;
    
    public String lf_user;
    
    public String lf_user_taskid;
    
    public String tab_code;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tab_code = param1DataReq.tab_code;
      this.lf_user = param1DataReq.lf_user;
      this.lf_user_taskid = param1DataReq.lf_user_taskid;
      this.app_pos = param1DataReq.app_pos;
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
