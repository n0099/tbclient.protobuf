package tbclient.GetMyGift;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class presentMoneyTxt extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TXT = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String txt;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public presentMoneyTxt(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.txt;
      if (str1 == null) {
        this.txt = "";
      } else {
        this.txt = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.txt = ((Builder)str).txt;
      this.url = ((Builder)str).url;
    } 
  }
  
  public presentMoneyTxt(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<presentMoneyTxt> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String txt;
    
    public String url;
    
    public Builder() {}
    
    public Builder(presentMoneyTxt param1presentMoneyTxt) {
      super(param1presentMoneyTxt);
      if (param1presentMoneyTxt == null)
        return; 
      this.txt = param1presentMoneyTxt.txt;
      this.url = param1presentMoneyTxt.url;
    }
    
    public presentMoneyTxt build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (presentMoneyTxt)interceptResult.objValue; 
      } 
      return new presentMoneyTxt(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
