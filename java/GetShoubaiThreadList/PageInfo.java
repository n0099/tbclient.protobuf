package GetShoubaiThreadList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PageInfo extends Message {
  public static final Long DEFAULT_CURSOR;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_PAGE_SIZE;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long cursor;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer page_size;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1968152486, "Ltbclient/GetShoubaiThreadList/PageInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1968152486, "Ltbclient/GetShoubaiThreadList/PageInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PAGE_SIZE = integer;
    DEFAULT_CURSOR = Long.valueOf(0L);
    DEFAULT_HAS_MORE = integer;
  }
  
  public PageInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.page_size;
      if (integer1 == null) {
        this.page_size = DEFAULT_PAGE_SIZE;
      } else {
        this.page_size = integer1;
      } 
      Long long_ = paramBuilder.cursor;
      if (long_ == null) {
        this.cursor = DEFAULT_CURSOR;
      } else {
        this.cursor = long_;
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.page_size = ((Builder)integer).page_size;
      this.cursor = ((Builder)integer).cursor;
      this.has_more = ((Builder)integer).has_more;
    } 
  }
}
