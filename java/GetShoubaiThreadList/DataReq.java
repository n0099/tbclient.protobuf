package GetShoubaiThreadList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_CURSOR;
  
  public static final Integer DEFAULT_PAGE_SIZE;
  
  public static final Long DEFAULT_UID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long cursor;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer page_size;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long uid;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1697652299, "Ltbclient/GetShoubaiThreadList/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1697652299, "Ltbclient/GetShoubaiThreadList/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    DEFAULT_CURSOR = long_;
    DEFAULT_PAGE_SIZE = Integer.valueOf(0);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.uid;
      if (long_ == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_;
      } 
      long_ = paramBuilder.cursor;
      if (long_ == null) {
        this.cursor = DEFAULT_CURSOR;
      } else {
        this.cursor = long_;
      } 
      integer = paramBuilder.page_size;
      if (integer == null) {
        this.page_size = DEFAULT_PAGE_SIZE;
      } else {
        this.page_size = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.uid = ((Builder)integer).uid;
      this.cursor = ((Builder)integer).cursor;
      this.page_size = ((Builder)integer).page_size;
    } 
  }
}
