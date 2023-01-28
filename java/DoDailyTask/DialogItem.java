package tbclient.DoDailyTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

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
  
  public static final class Builder extends Message.Builder<DialogItem> {
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
      return new DialogItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
