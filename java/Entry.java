import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Entry;

public final class Entry extends Message {
  public static final String DEFAULT_BITMAP_WH_RATIO = "";
  
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_ICON_TYPE;
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String bitmap_wh_ratio;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer icon_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(230508403, "Ltbclient/Entry;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(230508403, "Ltbclient/Entry;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_ICON_TYPE = integer;
  }
  
  public Entry(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str2 = paramBuilder.icon;
      if (str2 == null) {
        this.icon = "";
      } else {
        this.icon = str2;
      } 
      str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      Integer integer1 = paramBuilder.id;
      if (integer1 == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer1;
      } 
      String str1 = paramBuilder.bitmap_wh_ratio;
      if (str1 == null) {
        this.bitmap_wh_ratio = "";
      } else {
        this.bitmap_wh_ratio = str1;
      } 
      integer = paramBuilder.icon_type;
      if (integer == null) {
        this.icon_type = DEFAULT_ICON_TYPE;
      } else {
        this.icon_type = integer;
      } 
    } else {
      this.icon = ((Builder)integer).icon;
      this.name = ((Builder)integer).name;
      this.id = ((Builder)integer).id;
      this.bitmap_wh_ratio = ((Builder)integer).bitmap_wh_ratio;
      this.icon_type = ((Builder)integer).icon_type;
    } 
  }
}
