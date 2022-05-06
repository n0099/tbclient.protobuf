package TestClose;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FROM_PAGE;
  
  public static final Long DEFAULT_TEST_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long from_page;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long test_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1716251622, "Ltbclient/TestClose/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1716251622, "Ltbclient/TestClose/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TEST_ID = long_;
    DEFAULT_FROM_PAGE = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.test_id;
      if (long_1 == null) {
        this.test_id = DEFAULT_TEST_ID;
      } else {
        this.test_id = long_1;
      } 
      long_ = paramBuilder.from_page;
      if (long_ == null) {
        this.from_page = DEFAULT_FROM_PAGE;
      } else {
        this.from_page = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.test_id = ((Builder)long_).test_id;
      this.from_page = ((Builder)long_).from_page;
    } 
  }
}
