package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

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
    Integer integer = Integer.valueOf(0);
    DEFAULT_WEIGHT = integer;
    DEFAULT_VALUE = integer;
    DEFAULT_SPRITE_INFO = Collections.emptyList();
  }
  
  public Icon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
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
  
  public Icon(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Icon> {
    public String icon;
    
    public String name;
    
    public Position position;
    
    public List<String> sprite_info;
    
    public Terminal terminal;
    
    public String url;
    
    public Integer value;
    
    public Integer weight;
    
    public Builder() {}
    
    public Builder(Icon param1Icon) {
      super(param1Icon);
      if (param1Icon == null)
        return; 
      this.name = param1Icon.name;
      this.weight = param1Icon.weight;
      this.url = param1Icon.url;
      this.icon = param1Icon.icon;
      this.value = param1Icon.value;
      this.terminal = param1Icon.terminal;
      this.position = param1Icon.position;
      this.sprite_info = Message.copyOf(param1Icon.sprite_info);
    }
    
    public Icon build(boolean param1Boolean) {
      return new Icon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
