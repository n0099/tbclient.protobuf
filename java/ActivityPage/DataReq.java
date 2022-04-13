package ActivityPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_ACTIVITY_NAME = "";
  
  public static final Integer DEFAULT_PN;
  
  public static final Integer DEFAULT_Q_TYPE;
  
  public static final Integer DEFAULT_RN;
  
  public static final Integer DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String activity_name;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer pn;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer q_type;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer rn;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer scr_dip;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1291720782, "Ltbclient/ActivityPage/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1291720782, "Ltbclient/ActivityPage/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PN = integer;
    DEFAULT_RN = integer;
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = integer;
    DEFAULT_Q_TYPE = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str = paramBuilder.activity_name;
      if (str == null) {
        this.activity_name = "";
      } else {
        this.activity_name = str;
      } 
      Integer integer1 = paramBuilder.pn;
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
      integer1 = paramBuilder.scr_dip;
      if (integer1 == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = integer1;
      } 
      integer = paramBuilder.q_type;
      if (integer == null) {
        this.q_type = DEFAULT_Q_TYPE;
      } else {
        this.q_type = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.activity_name = ((Builder)integer).activity_name;
      this.pn = ((Builder)integer).pn;
      this.rn = ((Builder)integer).rn;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.q_type = ((Builder)integer).q_type;
    } 
  }
}
