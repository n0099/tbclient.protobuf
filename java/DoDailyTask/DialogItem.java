package DoDailyTask;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.DoDailyTask.ButtonItem;

public final class DialogItem extends Message {
  public static final List<ButtonItem> DEFAULT_BUTTON = Collections.emptyList();
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ButtonItem> button;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public DialogItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      list = paramBuilder.button;
      if (list == null) {
        this.button = DEFAULT_BUTTON;
      } else {
        this.button = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.content = ((Builder)list).content;
      this.button = Message.immutableCopyOf(((Builder)list).button);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1355183686, "Ltbclient/DoDailyTask/DialogItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1355183686, "Ltbclient/DoDailyTask/DialogItem;");
          return;
        } 
      } 
    } 
  }
}
