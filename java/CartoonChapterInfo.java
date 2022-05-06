import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CartoonChapterInfo;

public final class CartoonChapterInfo extends Message {
  public static final Integer DEFAULT_CHAPTER_ID;
  
  public static final Integer DEFAULT_CHAPTER_VIP;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer chapter_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer chapter_vip;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-225196444, "Ltbclient/CartoonChapterInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-225196444, "Ltbclient/CartoonChapterInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_CHAPTER_ID = integer;
    DEFAULT_CHAPTER_VIP = integer;
  }
  
  public CartoonChapterInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.chapter_id;
      if (integer1 == null) {
        this.chapter_id = DEFAULT_CHAPTER_ID;
      } else {
        this.chapter_id = integer1;
      } 
      integer = paramBuilder.chapter_vip;
      if (integer == null) {
        this.chapter_vip = DEFAULT_CHAPTER_VIP;
      } else {
        this.chapter_vip = integer;
      } 
    } else {
      this.chapter_id = ((Builder)integer).chapter_id;
      this.chapter_vip = ((Builder)integer).chapter_vip;
    } 
  }
}
