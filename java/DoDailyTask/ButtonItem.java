package tbclient.DoDailyTask;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ButtonItem extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public ButtonItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.url = ((Builder)str).url;
    } 
  }
  
  public ButtonItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ButtonItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ButtonItem param1ButtonItem) {
      super(param1ButtonItem);
      if (param1ButtonItem == null)
        return; 
      this.title = param1ButtonItem.title;
      this.url = param1ButtonItem.url;
    }
    
    public ButtonItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ButtonItem)interceptResult.objValue; 
      } 
      return new ButtonItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
