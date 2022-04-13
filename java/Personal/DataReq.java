package Personal;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  public static final Long DEFAULT_UID = Long.valueOf(0L);
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer q_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer scr_w;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long uid;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_Q_TYPE = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      Integer integer = paramBuilder.pn;
      if (integer == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer;
      } 
      integer = paramBuilder.scr_w;
      if (integer == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer;
      } 
      integer = paramBuilder.scr_h;
      if (integer == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer;
      } 
      integer = paramBuilder.q_type;
      if (integer == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer;
      } 
      double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
    } else {
      this.common = ((Builder)double_).common;
      this.uid = ((Builder)double_).uid;
      this.pn = ((Builder)double_).pn;
      this.scr_w = ((Builder)double_).scr_w;
      this.scr_h = ((Builder)double_).scr_h;
      this.q_type = ((Builder)double_).q_type;
      this.scr_dip = ((Builder)double_).scr_dip;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1290397300, "Ltbclient/Personal/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1290397300, "Ltbclient/Personal/DataReq;");
          return;
        } 
      } 
    } 
  }
}
