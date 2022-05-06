import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PresetMyGiftPage;

public final class PresetMyGiftPage extends Message {
  public static final Integer DEFAULT_CUR_PAGE;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final Integer DEFAULT_TOTAL;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer cur_page;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer total;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(734966759, "Ltbclient/PresetMyGiftPage;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(734966759, "Ltbclient/PresetMyGiftPage;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_CUR_PAGE = integer;
    DEFAULT_HAS_MORE = integer;
    DEFAULT_TOTAL = integer;
  }
  
  public PresetMyGiftPage(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.cur_page;
      if (integer1 == null) {
        this.cur_page = DEFAULT_CUR_PAGE;
      } else {
        this.cur_page = integer1;
      } 
      integer1 = paramBuilder.has_more;
      if (integer1 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer1;
      } 
      integer = paramBuilder.total;
      if (integer == null) {
        this.total = DEFAULT_TOTAL;
      } else {
        this.total = integer;
      } 
    } else {
      this.cur_page = ((Builder)integer).cur_page;
      this.has_more = ((Builder)integer).has_more;
      this.total = ((Builder)integer).total;
    } 
  }
}
