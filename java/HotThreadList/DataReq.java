package tbclient.HotThreadList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TAB_CODE = "";
  
  public static final String DEFAULT_TAB_ID = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tab_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tab_id;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.tab_id;
      if (str1 == null) {
        this.tab_id = "";
      } else {
        this.tab_id = str1;
      } 
      str = paramBuilder.tab_code;
      if (str == null) {
        this.tab_code = "";
      } else {
        this.tab_code = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.tab_id = ((Builder)str).tab_id;
      this.tab_code = ((Builder)str).tab_code;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public String tab_code;
    
    public String tab_id;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tab_id = param1DataReq.tab_id;
      this.tab_code = param1DataReq.tab_code;
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
