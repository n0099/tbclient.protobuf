package tbclient.VideoRedIcon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;

public final class RedIcon extends Message {
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    DEFAULT_THREAD_LIST = Collections.emptyList();
  }
  
  public RedIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      str = paramBuilder.image;
      if (str == null) {
        this.image = "";
      } else {
        this.image = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.text = ((Builder)list).text;
      this.image = ((Builder)list).image;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public RedIcon(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RedIcon> {
    public String image;
    
    public String text;
    
    public List<ThreadInfo> thread_list;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(RedIcon param1RedIcon) {
      super(param1RedIcon);
      if (param1RedIcon == null)
        return; 
      this.type = param1RedIcon.type;
      this.text = param1RedIcon.text;
      this.image = param1RedIcon.image;
      this.thread_list = Message.copyOf(param1RedIcon.thread_list);
    }
    
    public RedIcon build(boolean param1Boolean) {
      return new RedIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
