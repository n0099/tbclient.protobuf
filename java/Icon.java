import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Icon;
import tbclient.Position;
import tbclient.Terminal;

public final class Icon extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final List<String> DEFAULT_SPRITE_INFO;
  
  public static final String DEFAULT_URL = "";
  
  public static final Integer DEFAULT_VALUE;
  
  public static final Integer DEFAULT_WEIGHT;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 7)
  public final Position position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
  public final List<String> sprite_info;
  
  @ProtoField(tag = 6)
  public final Terminal terminal;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer value;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer weight;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1097581512, "Ltbclient/Icon;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1097581512, "Ltbclient/Icon;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_WEIGHT = integer;
    DEFAULT_VALUE = integer;
    DEFAULT_SPRITE_INFO = Collections.emptyList();
  }
  
  public Icon(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str2 = paramBuilder.name;
      if (str2 == null) {
        this.name = "";
      } else {
        this.name = str2;
      } 
      Integer integer2 = paramBuilder.weight;
      if (integer2 == null) {
        this.weight = DEFAULT_WEIGHT;
      } else {
        this.weight = integer2;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      Integer integer1 = paramBuilder.value;
      if (integer1 == null) {
        this.value = DEFAULT_VALUE;
      } else {
        this.value = integer1;
      } 
      this.terminal = paramBuilder.terminal;
      this.position = paramBuilder.position;
      list = paramBuilder.sprite_info;
      if (list == null) {
        this.sprite_info = DEFAULT_SPRITE_INFO;
      } else {
        this.sprite_info = Message.immutableCopyOf(list);
      } 
    } else {
      this.name = ((Builder)list).name;
      this.weight = ((Builder)list).weight;
      this.url = ((Builder)list).url;
      this.icon = ((Builder)list).icon;
      this.value = ((Builder)list).value;
      this.terminal = ((Builder)list).terminal;
      this.position = ((Builder)list).position;
      this.sprite_info = Message.immutableCopyOf(((Builder)list).sprite_info);
    } 
  }
}
