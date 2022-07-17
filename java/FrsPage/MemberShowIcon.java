package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MemberShowIcon extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public MemberShowIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.name = ((Builder)str).name;
      this.url = ((Builder)str).url;
    } 
  }
  
  public MemberShowIcon(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MemberShowIcon> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String icon;
    
    public String name;
    
    public String url;
    
    public Builder() {}
    
    public Builder(MemberShowIcon param1MemberShowIcon) {
      super(param1MemberShowIcon);
      if (param1MemberShowIcon == null)
        return; 
      this.icon = param1MemberShowIcon.icon;
      this.name = param1MemberShowIcon.name;
      this.url = param1MemberShowIcon.url;
    }
    
    public MemberShowIcon build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MemberShowIcon)interceptResult.objValue; 
      } 
      return new MemberShowIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
