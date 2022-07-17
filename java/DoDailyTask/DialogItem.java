package tbclient.DoDailyTask;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DialogItem extends Message {
  public static Interceptable $ic;
  
  public static final List<ButtonItem> DEFAULT_BUTTON = Collections.emptyList();
  
  public static final String DEFAULT_CONTENT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ButtonItem> button;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public DialogItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ButtonItem> list;
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
  
  public DialogItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<DialogItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ButtonItem> button;
    
    public String content;
    
    public String title;
    
    public Builder() {}
    
    public Builder(DialogItem param1DialogItem) {
      super(param1DialogItem);
      if (param1DialogItem == null)
        return; 
      this.title = param1DialogItem.title;
      this.content = param1DialogItem.content;
      this.button = Message.copyOf(param1DialogItem.button);
    }
    
    public DialogItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DialogItem)interceptResult.objValue; 
      } 
      return new DialogItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
