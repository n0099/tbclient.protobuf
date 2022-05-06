import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CartoonThread;

public final class CartoonThread extends Message {
  public static final Long DEFAULT_CARTOON_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_CHAPTER_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long cartoon_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer chapter_id;
  
  public CartoonThread(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.cartoon_id;
      if (long_ == null) {
        this.cartoon_id = DEFAULT_CARTOON_ID;
      } else {
        this.cartoon_id = long_;
      } 
      integer = paramBuilder.chapter_id;
      if (integer == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = integer;
      } 
    } else {
      this.cartoon_id = ((Builder)integer).cartoon_id;
      this.chapter_id = ((Builder)integer).chapter_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(428477325, "Ltbclient/CartoonThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(428477325, "Ltbclient/CartoonThread;");
          return;
        } 
      } 
    } 
  }
}
