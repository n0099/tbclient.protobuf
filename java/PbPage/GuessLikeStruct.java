package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GuessLikeThreadInfo;

public final class GuessLikeStruct extends Message {
  public static final List<GuessLikeThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GuessLikeThreadInfo> thread_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public GuessLikeStruct(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<GuessLikeThreadInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public GuessLikeStruct(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GuessLikeStruct> {
    public List<GuessLikeThreadInfo> thread_list;
    
    public String title;
    
    public Builder() {}
    
    public Builder(GuessLikeStruct param1GuessLikeStruct) {
      super(param1GuessLikeStruct);
      if (param1GuessLikeStruct == null)
        return; 
      this.title = param1GuessLikeStruct.title;
      this.thread_list = Message.copyOf(param1GuessLikeStruct.thread_list);
    }
    
    public GuessLikeStruct build(boolean param1Boolean) {
      return new GuessLikeStruct(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
