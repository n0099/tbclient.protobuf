package RecomVideo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_LOAD_TYPE;
  
  public static final Integer DEFAULT_NEW_NET_TYPE;
  
  public static final Integer DEFAULT_PAGE_THREAD_COUNT;
  
  public static final Double DEFAULT_SCR_DIP;
  
  public static final Integer DEFAULT_SCR_H;
  
  public static final Integer DEFAULT_SCR_W;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer load_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer new_net_type;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer page_thread_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
  public final Double scr_dip;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer scr_h;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer scr_w;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(836048447, "Ltbclient/RecomVideo/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(836048447, "Ltbclient/RecomVideo/DataReq;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCR_W = integer;
    DEFAULT_SCR_H = integer;
    DEFAULT_SCR_DIP = Double.valueOf(0.0D);
    DEFAULT_NEW_NET_TYPE = integer;
    DEFAULT_LOAD_TYPE = integer;
    DEFAULT_PAGE_THREAD_COUNT = integer;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Integer integer2 = paramBuilder.scr_w;
      if (integer2 == null) {
        this.scr_w = DEFAULT_SCR_W;
      } else {
        this.scr_w = integer2;
      } 
      integer2 = paramBuilder.scr_h;
      if (integer2 == null) {
        this.scr_h = DEFAULT_SCR_H;
      } else {
        this.scr_h = integer2;
      } 
      Double double_ = paramBuilder.scr_dip;
      if (double_ == null) {
        this.scr_dip = DEFAULT_SCR_DIP;
      } else {
        this.scr_dip = double_;
      } 
      Integer integer1 = paramBuilder.new_net_type;
      if (integer1 == null) {
        this.new_net_type = DEFAULT_NEW_NET_TYPE;
      } else {
        this.new_net_type = integer1;
      } 
      integer1 = paramBuilder.load_type;
      if (integer1 == null) {
        this.load_type = DEFAULT_LOAD_TYPE;
      } else {
        this.load_type = integer1;
      } 
      integer = paramBuilder.page_thread_count;
      if (integer == null) {
        this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
      } else {
        this.page_thread_count = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.scr_w = ((Builder)integer).scr_w;
      this.scr_h = ((Builder)integer).scr_h;
      this.scr_dip = ((Builder)integer).scr_dip;
      this.new_net_type = ((Builder)integer).new_net_type;
      this.load_type = ((Builder)integer).load_type;
      this.page_thread_count = ((Builder)integer).page_thread_count;
    } 
  }
}
