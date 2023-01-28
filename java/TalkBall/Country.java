package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Country extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  public Country(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.name = ((Builder)str).name;
    } 
  }
  
  public Country(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Country> {
    public String icon;
    
    public String name;
    
    public Builder() {}
    
    public Builder(Country param1Country) {
      super(param1Country);
      if (param1Country == null)
        return; 
      this.icon = param1Country.icon;
      this.name = param1Country.name;
    }
    
    public Country build(boolean param1Boolean) {
      return new Country(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
