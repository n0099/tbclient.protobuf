package tbclient.Lego;

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
  
  public static final String DEFAULT_FLIP_ID = "";
  
  public static final String DEFAULT_ITEM_ID = "";
  
  public static final Long DEFAULT_PAGE_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_PAGE_TYPE;
  
  public static final String DEFAULT_PARAMS = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_RN;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String flip_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String item_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long page_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer page_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String params;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 11, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PAGE_TYPE = integer;
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.page_id;
      if (long_ == null) {
        this.page_id = DEFAULT_PAGE_ID;
      } else {
        this.page_id = long_;
      } 
      Integer integer2 = paramBuilder.page_type;
      if (integer2 == null) {
        this.page_type = DEFAULT_PAGE_TYPE;
      } else {
        this.page_type = integer2;
      } 
      integer2 = paramBuilder.pn;
      if (integer2 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer2;
      } 
      integer2 = paramBuilder.rn;
      if (integer2 == null) {
        this.rn = DEFAULT_RN;
      } else {
        this.rn = integer2;
      } 
      String str = paramBuilder.flip_id;
      if (str == null) {
        this.flip_id = "";
      } else {
        this.flip_id = str;
      } 
      str = paramBuilder.item_id;
      if (str == null) {
        this.item_id = "";
      } else {
        this.item_id = str;
      } 
      str = paramBuilder.params;
      if (str == null) {
        this.params = "";
      } else {
        this.params = str;
      } 
      Integer integer1 = paramBuilder.scr_w;
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
      double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
    } else {
      this.common = ((Builder)double_).common;
      this.page_id = ((Builder)double_).page_id;
      this.page_type = ((Builder)double_).page_type;
      this.pn = ((Builder)double_).pn;
      this.rn = ((Builder)double_).rn;
      this.flip_id = ((Builder)double_).flip_id;
      this.item_id = ((Builder)double_).item_id;
      this.params = ((Builder)double_).params;
      this.scr_w = ((Builder)double_).scr_w;
      this.scr_h = ((Builder)double_).scr_h;
      this.scr_dip = ((Builder)double_).scr_dip;
    } 
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(115853259, "Ltbclient/Lego/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(115853259, "Ltbclient/Lego/DataReq;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataReq> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public String flip_id;
    
    public String item_id;
    
    public Long page_id;
    
    public Integer page_type;
    
    public String params;
    
    public Integer pn;
    
    public Integer rn;
    
    public Double scr_dip;
    
    public Integer scr_h;
    
    public Integer scr_w;
    
    public Builder() {}
    
    public Builder(DataReq param1DataReq) {
      super(param1DataReq);
      if (param1DataReq == null)
        return; 
      this.common = param1DataReq.common;
      this.page_id = param1DataReq.page_id;
      this.page_type = param1DataReq.page_type;
      this.pn = param1DataReq.pn;
      this.rn = param1DataReq.rn;
      this.flip_id = param1DataReq.flip_id;
      this.item_id = param1DataReq.item_id;
      this.params = param1DataReq.params;
      this.scr_w = param1DataReq.scr_w;
      this.scr_h = param1DataReq.scr_h;
      this.scr_dip = param1DataReq.scr_dip;
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
