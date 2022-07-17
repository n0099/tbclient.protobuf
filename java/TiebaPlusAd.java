package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TiebaPlusAd extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AD_SOURCE = "";
  
  public static final String DEFAULT_COST_URL = "";
  
  public static final String DEFAULT_SHOW_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ad_source;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String cost_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String show_url;
  
  public TiebaPlusAd(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.cost_url;
      if (str1 == null) {
        this.cost_url = "";
      } else {
        this.cost_url = str1;
      } 
      str1 = paramBuilder.show_url;
      if (str1 == null) {
        this.show_url = "";
      } else {
        this.show_url = str1;
      } 
      str = paramBuilder.ad_source;
      if (str == null) {
        this.ad_source = "";
      } else {
        this.ad_source = str;
      } 
    } else {
      this.cost_url = ((Builder)str).cost_url;
      this.show_url = ((Builder)str).show_url;
      this.ad_source = ((Builder)str).ad_source;
    } 
  }
  
  public TiebaPlusAd(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TiebaPlusAd> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String ad_source;
    
    public String cost_url;
    
    public String show_url;
    
    public Builder() {}
    
    public Builder(TiebaPlusAd param1TiebaPlusAd) {
      super(param1TiebaPlusAd);
      if (param1TiebaPlusAd == null)
        return; 
      this.cost_url = param1TiebaPlusAd.cost_url;
      this.show_url = param1TiebaPlusAd.show_url;
      this.ad_source = param1TiebaPlusAd.ad_source;
    }
    
    public TiebaPlusAd build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TiebaPlusAd)interceptResult.objValue; 
      } 
      return new TiebaPlusAd(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
