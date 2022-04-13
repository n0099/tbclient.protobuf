package ReplyMe;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_IDS = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  @ProtoField(tag = 3)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ids;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1022369666, "Ltbclient/ReplyMe/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1022369666, "Ltbclient/ReplyMe/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_Q_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.pn;
      if (integer2 == null) {
        this.pn = DEFAULT_PN;
      } else {
        this.pn = integer2;
      } 
      String str = paramBuilder.ids;
      if (str == null) {
        this.ids = "";
      } else {
        this.ids = str;
      } 
      this.common = paramBuilder.common;
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
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      integer = paramBuilder.q_type;
      if (integer == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer;
      } 
    } else {
      this.pn = ((Builder)integer).pn;
      this.ids = ((Builder)integer).ids;
      this.common = ((Builder)integer).common;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
    } 
  }
}
