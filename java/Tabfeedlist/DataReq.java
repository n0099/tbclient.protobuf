package tbclient.Tabfeedlist;

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
  
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  public static final Integer DEFAULT_SCR_D;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final String DEFAULT_TAB_CODE = "";
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer load_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer pn;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer rn;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer scr_d;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tab_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tab_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-653088593, "Ltbclient/Tabfeedlist/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-653088593, "Ltbclient/Tabfeedlist/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_LOAD_TYPE = integer;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_D = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str = paramBuilder.tab_name;
      if (str == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str;
      } 
      str = paramBuilder.tab_code;
      if (str == null) {
        this.tab_code = "";
      } else {
        this.tab_code = str;
      } 
      Integer integer1 = paramBuilder.load_type;
      if (integer1 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer1;
      } 
      integer1 = paramBuilder.pn;
      if (integer1 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer1;
      } 
      integer1 = paramBuilder.rn;
      if (integer1 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer1;
      } 
      integer1 = paramBuilder.scr_w;
      if (integer1 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer1;
      } 
      integer1 = paramBuilder.scr_h;
      if (integer1 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer1;
      } 
      integer = paramBuilder.scr_d;
      if (integer == null) {
        this.scr_d = DEFAULT_SCR_D;
      } else {
        this.scr_d = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.tab_name = ((Builder)integer).tab_name;
      this.tab_code = ((Builder)integer).tab_code;
      this.load_type = ((Builder)integer).load_type;
      this.pn = ((Builder)integer).pn;
      this.rn = ((Builder)integer).rn;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_d = ((Builder)integer).scr_d;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public Integer load_type;
    
    public Integer pn;
    
    public Integer rn;
    
    public Integer scr_d;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public String tab_code;
    
    public String tab_name;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.tab_name = param1DataReq.tab_name;
      this.tab_code = param1DataReq.tab_code;
      this.load_type = param1DataReq.load_type;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_d = param1DataReq.scr_d;
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
